package facade;

public class carShop {

    private carGallery bmw;
    private carGallery audi;

    public carShop()
    {
        this.bmw = new BMW();
        this.audi = new Audi();

    }

    public void BMwcarSale()
    {
        bmw.carModel();
        bmw.carprice();
    }

    public void AudiCarSale()
    {
        audi.carModel();
        audi.carprice();
    }
    
}
