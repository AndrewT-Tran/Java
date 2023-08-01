import java.util.ArrayList;

public class Developer {
    // Attributes
    public boolean canCode = true;
    public String name;
    public int age;
    public double salary;
    public ArrayList<String> languages;
    public ArrayList<Project> projects = new ArrayList<Project>();

    // this is one way to initialize a constructor
    // Setters
    public Developer() {
        this.languages = new ArrayList<>(languages);
        this.name = "no name";
    }

    // this is a constructor that will make developers
    public Developer(String name, int age, double salary) {
        this.languages = new ArrayList<String>();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setCanCode(boolean canCode) {
        this.canCode = canCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void displayStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Can code: " + this.canCode);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("Languages: " + this.languages);
        System.out.println("Projects: " + this.projects);
    }
}