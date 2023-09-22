package assesment;

public class Employee extends Customer implements Discountable{
   private  final double DISCOUNT =.10;
   public void PrintEmployeePriceAfterDiscount(String Clothing){
       System.out.println(Clothing);

   }
    public double calculateDiscount(){
        return 0;
    }
}
