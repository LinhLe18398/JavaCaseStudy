public class CyberGame {
    private String IdCyberGame;
    private String NameCyberGame;
    private String Adress;
    private Computer[] computers;
    private int CountComputer;
    private double Revenue;

    public CyberGame() {
        this.IdCyberGame = "CBG0001";
        this.NameCyberGame = "CyberGame mac dinh";
        this.Adress = "Ha Noi";
        this.computers = new Computer[200];
        this.CountComputer = 0;
        this.Revenue = 0;

    }


    public CyberGame(Computer[] computers) {
        this.computers = computers;
    }

    public boolean addComputer(Computer add) {
        if (CountComputer > 200) {
            System.out.println("Kho da day");
            return false;
        } else {
            this.computers[CountComputer++] = add;
            System.out.println("Them dien thoai thanh cong");
            return true;
        }
    }

    public boolean deleteComputer(Computer computer) {
        int indexToDelete = -1;
        for (int i = 0; i < this.computers.length; i++) {
            if (computers[i] != null && computers[i].equals(computer)) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete >= 0) {
            for (int i = indexToDelete; i < this.computers.length - 1; i++) {
                this.computers[i] = this.computers[i + 1];

            }

            this.computers[this.computers.length - 1] = null;
            this.CountComputer--;

            System.out.println("Da xoa may tinh thanh cong ");
            return true;
        }
        return false;
    }


    public void Revenue() {
        for (int i = 0; i < CountComputer; i++) {
            int config = this.computers[i].getConfig();
            switch (config) {
                case ConfigComputer.CONFIG_ONE:
                    this.Revenue += 5000;
                    break;
                case ConfigComputer.CONFIG_TWO:
                    this.Revenue += 8000;
                    break;
                case ConfigComputer.CONFIG_THREE:
                    this.Revenue += 10000;
                    break;
                case ConfigComputer.CONFIG_FOUR:
                    this.Revenue += 15000;
                    break;
                case ConfigComputer.CONFIG_FIVE:
                    this.Revenue += 20000;
                    break;
            }
        }
    }


    public String getIdCyberGame() {
        return IdCyberGame;
    }

    public void setIdCyberGame(String idCyberGame) {
        IdCyberGame = idCyberGame;
    }

    public String getNameCyberGame() {
        return NameCyberGame;
    }

    public void setNameCyberGame(String nameCyberGame) {
        NameCyberGame = nameCyberGame;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getCountComputer() {
        return CountComputer;
    }

    public void setCountComputer(int countComputer) {
        CountComputer = countComputer;
    }

    public double getRevenue() {
        return Revenue;
    }

    public void setRevenue(double revenue) {
        Revenue = revenue;
    }


}
