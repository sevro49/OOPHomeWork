public abstract class Yiyecek {

    private String isim;
    private String renk;
    private String yetistigiYer;

    // constructor
    public Yiyecek(String i, String r, String yy) {
        this.isim = i;
        this.renk = r;
        this.yetistigiYer = yy;
    }

    public abstract void YiyecekTuru();

    // getters and setters
    public void setParameters(String isim, String renk, String yetistigiYer) {
        this.isim = isim;
        this.renk = renk;
        this.yetistigiYer = yetistigiYer;
    }

    public void setNameColor(String isim, String renk) {
        this.isim = isim;
        this.renk = renk;
    }

    public String getIsim() {
        return isim;
    }

    public String getRenk() {
        return renk;
    }

    public String getYetistigiYer() {
        return yetistigiYer;
    }

}

class Sebze extends Yiyecek {

    // constructor
    Sebze(String i, String r) {
        super("", "", "Toprak");
        // TODO Auto-generated constructor stub
    }

    public void YiyecekTuru() {
        System.out.println("sebze");
    }

}

class Meyve extends Yiyecek {

    // constructor
    Meyve(String i, String r) {
        super("", "", "Ağaç");
        // TODO Auto-generated constructor stub
    }

    public void YiyecekTuru() {
        System.out.println("meyve");
    }

}

class YiyecekMain {

    public static void main(String[] args) {

        Sebze kirmiziLahana = new Sebze("Kırmızı Lahana", "Mor");
        Meyve yesilElma = new Meyve("Yeşil Elma", "Yeşil");

        System.out.println(kirmiziLahana.getYetistigiYer()); // nesneni nerede yetiştiğini gösteren kod
        System.out.println(yesilElma.getYetistigiYer()); // nesneni nerede yetiştiğini gösteren kod

    }
}


