package assesment;

public class Customer extends Person{
    public void printCustomerName(String Name){
        System.out.println(Name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "size=" + size +
                '}';
    }
}
