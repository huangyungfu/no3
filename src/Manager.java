public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public String AmbilNama()
    {
        return getName();
    }

    public Double AmbilGaji()
    {
        return getSalary();
    }

    public String AmbilDepartemen()
    {
        return this.department;
    }


}