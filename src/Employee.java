public class Employee {
    public int id;
    public String name;
    private double salario;

    public Employee(int id, String name, double salario){
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double porcentagem){
        this.salario += salario * porcentagem / 100;
    }


    

}
