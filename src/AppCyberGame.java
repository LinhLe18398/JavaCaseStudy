public class AppCyberGame {
    public static void main(String[] args) {
        Computer [] computers = new Computer[100];
//        Computer MT1 ;
//        Computer MT2 ;
        CyberGame cyberGameKow = new CyberGame();
        Computer MT3 = new Computer("MS003","PC");
        Computer MT4 = new Computer("MS004","PC");
        cyberGameKow.addComputer(MT3);
        cyberGameKow.addComputer(MT4);
        System.out.println(cyberGameKow.getCountComputer());
//        for (int i = 0; i < 20; i++){
//        MT1 =    new Computer(8,128,"i3");
//cyberGameKow.addComputer(MT1);
//        }
//        for (int i = 0; i < 20; i++){
//            MT2 = new Computer(8,256,"i5");
//            cyberGameKow.addComputer(MT2);
//        }
//        cyberGameKow.getComputers()[0].setRam(16);
//        System.out.println(cyberGameKow.getCountComputer());
//        cyberGameKow.Revenue();
//        System.out.println("tien net 40 may la: "+cyberGameKow.getRevenue());

        cyberGameKow.deleteComputer(MT3);
        System.out.println(cyberGameKow.getCountComputer());
    }
}
