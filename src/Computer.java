public class Computer {
    private String Id;
    private String name;
    private double Weight;
    private int Ram;
    private String Cpu;
    private String Os;
    private int Rom;
    private int Price;

    public Computer() {
        this.Id = "MT0001";
        this.name = "May tinh mac dinh";
        this.Weight = 2;
        this.Ram = 8;
        this.Cpu = "i3 9100f";
        this.Os = "Window";
        this.Rom = 128;
        this.Price = 100000;
    }

    public  Computer(int Ram, int Rom, String Cpu){
        this.Ram = Ram;
        this.Rom = Rom;
        this.Cpu = Cpu;
    }
    public Computer(String Id) {
        this.Id = Id;
    }

    public Computer(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public Computer(String Id, String name, double Weight) {
        this.Id = Id;
        this.name = name;
        this.Weight = Weight;
    }

    public Computer(String Id, String name, double Weight, int Ram) {
        this.Id = Id;
        this.name = name;
        this.Weight = Weight;
        this.Ram = Ram;
    }

    public Computer(String Id, String name, double Weight, int Ram, int Rom) {
        this.Id = Id;
        this.name = name;
        this.Weight = Weight;
        this.Ram = Ram;
        this.Rom = Rom;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }

    public String getOs() {
        return Os;
    }

    public void setOs(String os) {
        Os = os;
    }

    public int getRom() {
        return Rom;
    }

    public void setRom(int rom) {
        Rom = rom;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Computer(String id, String name, double weight, int ram, String cpu, String os, int rom, int price) {
        Id = id;
        this.name = name;
        Weight = weight;
        Ram = ram;
        Cpu = cpu;
        Os = os;
        Rom = rom;
        Price = price;
    }

    public Computer(String Id, String name, double Weight, int Ram, int Rom, String Cpu) {
        this.Id = Id;
        this.name = name;
        this.Weight = Weight;
        this.Ram = Ram;
        this.Rom = Rom;
        this.Cpu = Cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", Weight=" + Weight +
                ", Ram=" + Ram +
                ", Cpu='" + Cpu + '\'' +
                ", Os='" + Os + '\'' +
                ", Rom=" + Rom +
                ", Price=" + Price +
                '}';
    }

    private boolean isConfigOne(){
        return this.Ram == 8 && this.Rom == 128 && this.Cpu.equals("i3");
    }

    private boolean isConfigTwo(){
        return this.Ram == 8 && this.Rom == 256 && this.Cpu.equals("i5");
    }
    private boolean isConfigThree(){
        return this.Ram == 16 && this.Rom == 256 && this.Cpu.equals("i5");
    }

    private boolean isConfigFour(){
        return this.Ram == 16 && this.Rom == 512 && this.Cpu.equals("i7");
    }

    private boolean isConfigFive(){
        return this.Ram == 32 && this.Rom == 1024 && this.Cpu.equals("i9");
    }

    public int getConfig(){
        int config = -1;
        if (isConfigOne()){
            config = ConfigComputer.CONFIG_ONE;
        }

        if (isConfigTwo()){
            config = ConfigComputer.CONFIG_TWO;
        }

        if (isConfigThree()){
            config = ConfigComputer.CONFIG_THREE;
        }
        if (isConfigFour()){
            config = ConfigComputer.CONFIG_FOUR;
        }
        if (isConfigFive()){
            config = ConfigComputer.CONFIG_FIVE;
        }
        return config;
    }
}
