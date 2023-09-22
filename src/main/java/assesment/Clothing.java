package assesment;

public class Clothing {
    private String description;
    private double price;
    Size size = Size.SMALL;
   public Clothing(String description,double price, Size size){
       this.description=description;
       this.price=price;
       this.size=size;

   }
    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}

