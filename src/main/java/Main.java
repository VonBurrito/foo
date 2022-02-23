public class Main {
    
    public static void main(String[] args) {
        Enterprise enterprise = new EnterpriseBuilder().setAddress("15 elm street").setDirector(new Director("Foo", "Foo")).getEnterpris();
        Enterprise enterprise1 = new Enterprise(1L, "Oracle", "", new Director("Larry", "Ellison"));
        System.out.println(enterprise.toString());
        System.out.println(enterprise1.toString());
    }
}
