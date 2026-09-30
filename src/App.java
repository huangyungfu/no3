public class App {
    public static void main(String[] args) throws Exception {
        Manager manager_1 = new Manager("Mike",15000000,"IT");
        System.out.println("Name: " +manager_1.AmbilNama());
        System.out.printf("Salary: %.0f\n", manager_1.AmbilGaji());
        System.out.println("Department: " + manager_1.AmbilDepartemen());
    }
}
