public class Cameriere implements Runnable{
    private BufferPizze LeggereTavolo;
    private BufferPizze MandaPizzaiolo;
    private BufferPizze LeggerePizzaiolo;
    private BufferPizze MandaTavoli;
    public Cameriere(BufferPizze a, BufferPizze b, BufferPizze c, BufferPizze d){
        LeggereTavolo = a;
        MandaPizzaiolo = b;
        LeggerePizzaiolo = c;
        MandaTavoli = d;
    }
    public void run(){
        while(true){
            if(LeggereTavolo.isOrder()){
                Ordine order = LeggereTavolo.getOrder();
                try {
                    Thread.sleep(1400); //simulo la consegna della pizzaq
                } catch (InterruptedException e) {}

                MandaPizzaiolo.pushOrder(order);
                //consegna le pizze al pizzaiolo
            }
        }
    }
    //prende l'ordine e consegna le pizze ai tavoli
    //fra il cameriere e il pizzaiolo ci deve essere un buffer, per comuncare gli ordini che il
    //cameriere da al pizzaiolo
}
