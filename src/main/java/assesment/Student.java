package assesment;

public class Student extends Customer implements Discountable{
    private long studentID;
    private  final double DISCOUNT =.5;
    public double calculateDiscount(){
        return 0;
    }
}
