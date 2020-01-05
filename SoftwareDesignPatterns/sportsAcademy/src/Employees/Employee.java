package Employees;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String team;
    private List<Employee> colleagues;

    // constructor
    public Employee(String name,String team) {
        this.name = name;
        this.team = team;
        colleagues = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        colleagues.add(e);
    }

    public void remove(Employee e) {
        colleagues.remove(e);
    }

    public List<Employee> getcolleagues(){
        return colleagues;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", Team : " + team + " ]");
    }

}
