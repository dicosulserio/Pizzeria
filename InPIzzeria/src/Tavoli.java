public class Tavoli implements Runnable{
    private int nTavolo;
    private int persone=5;
    private String[] menu = {"Margherita", "Diavola", "Marinara", "Salamino"};
    private String[] pizze;
    BufferPizze buffer;
    public Tavoli(BufferPizze a, int nTavolo) {
        buffer = a;
        this.nTavolo = nTavolo;  //per identificare il tavolo nell'ordine'
    }
    public void run(){
        while (true) {
            pizze = new String[persone];
            for (int i = 0; i < persone; i++) {
                pizze[i] = menu[(int) (Math.random() * 4)];
                //dico la pizza che voglio
            }
            Ordine ordine = new Ordine(pizze, nTavolo);
            buffer.pushOrder(ordine);
            // aspetta la pizza che voglio
        }
    }
    //creano gli ordini
    //invia al buffer gli ordini, che li consuma il cameriere
}
