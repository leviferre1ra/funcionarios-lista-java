import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Quantos funcionários vão ser registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Funcionário #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Employee emp = new Employee(id, nome, salario);
            list.add(emp);
        }

        System.out.println("Qual o Id do funcionário que receberá o aumento? ");
        int idAumento = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

        if(emp == null){
            System.out.println("Esse Id não existe!");
        } else {
            System.out.println("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
        }

        sc.close();
    }



}
