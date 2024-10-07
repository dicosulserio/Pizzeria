public class BufferPizze {
    private String[] menu = {"Margherita", "Diavola", "Marinara", "Salamino"};
    private Ordine[] order;
    private int i = 0;
    public BufferPizze() {
        Ordine[] order = new Ordine[20];
    }
    public synchronized void pushOrder(Ordine order) {
        this.order[i] = order;
        i++;

    }
    public synchronized boolean isOrder() {
        return i<0;  //se order non è null, c'è un ordine nel buffer.'
    }
    public synchronized Ordine getOrder() {
        Ordine dalevare = order[i];
        order[i] = null;
        i--;

        return dalevare;
    }
}
