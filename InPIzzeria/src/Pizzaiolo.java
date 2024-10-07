public class Pizzaiolo implements Runnable{
    private BufferPizze LeggeCameriere;
    private BufferPizze ScriveCameriere;
    public Pizzaiolo(BufferPizze a, BufferPizze b){
        LeggeCameriere = a;
        ScriveCameriere = b;
    }
    public void run(){
        //produce le pizze
        Ordine a = LeggeCameriere.getOrder();
        try{
            Thread.sleep(2500);
        } catch (InterruptedException e){}
        ScriveCameriere.pushOrder(a);
    }
    //produce le pizze
    //il pizzaiolo consuma gli ordini, produce le pizze, le da al cameriere che poi
    //da un altro buffer lo ripassa ai tavoli
}
