public class AppMayTinh {
    public static void main(String[] args) {
        Computer objMT1 = new Computer();
        objMT1.setName("Dell");
        objMT1.setPrice(200000);
        System.out.println(objMT1.toString());

        Computer objMT2 = new Computer("MT0002", "Macbook", 1.4);
        objMT2.setRam(16);
        System.out.println(objMT2.toString());

        Computer objMT3 = new Computer(16,256,"i5");






    }
}
