public class Chair {
    String Color;
    String Brand;
    int size;
    double price;
    int modelYear;

    public Chair()
    {
        System.out.println("This is default constructor");
    }

    public void displayChairInfo()
    {
//        String Color = "black";
        System.out.println("Color: " + Color);
        System.out.println("Brand: " + Brand);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("ModelYear: " + modelYear);
    }
}
