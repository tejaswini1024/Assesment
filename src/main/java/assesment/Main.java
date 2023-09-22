package assesment;

public class Main {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.MEDIUM);
        Clothing tShirt = new Clothing("White T Shirt", 5.0,Size.SMALL);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.LARGE);

        Clothing[] managerCart={jeans,tShirt,buttonUp};
        Manager manager = new Manager(Size.SMALL);
        Clothing[] hourlyEmployeeCart  ={jeans,tShirt,buttonUp};
        //HourlyEmployee hourlyEmployee = new HourlyEmployee(Size.LARGE);
    }
}
