public class Main {
    
    public static void main(String[] args) {
        Enterprise enterprise = new EnterpriseBuilder().setAddress("15 elm street").setDirector(new Director("Me", "he")).getEnterpris();

        System.out.println(enterprise.toString());
    }
}
