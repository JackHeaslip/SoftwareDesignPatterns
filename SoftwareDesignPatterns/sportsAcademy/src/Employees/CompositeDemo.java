package Employees;

public class CompositeDemo {
    public static void main(String[] args) {

        Employee Manager = new Employee("John","Management");

        Employee gymManager = new Employee("Robert","GymManagement");
        Employee gymstaff = new Employee("Michel","Gym");

        Employee PoolManager = new Employee("Laura","officeManagement");
        Employee poolStaff = new Employee("Bob","office");

        Manager.add(gymManager);
        Manager.add(PoolManager);

        gymManager.add(gymstaff);

        PoolManager.add(poolStaff);

        //print all employees of the organization
        System.out.println(Manager);

        for (Employee headEmployee : Manager.getcolleagues()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getcolleagues()) {
                System.out.println(employee);
            }
        }
    }
}
