public class Mainq4 {
    public static void main(String[] args) {
        double salario = 1500;
        if (salario == 900){
            System.out.println("Salario = "+salario);
            System.out.println("Isento");
        } else if (salario >= 901 && salario<= 1500){
            System.out.println("Salario = "+(salario-(salario*0.05)));
            System.out.println("Desconto de 5%");
        } else if (salario <= 2500){
            System.out.println("Salario = "+(salario-(salario*0.1)));
            System.out.println("Desconto de 10%");
        } else if (salario > 2500) {
            System.out.println("Salario = "+(salario-(salario*0.2)));
            System.out.println("Desconto de 20%");
        } else {
            System.out.println("Error");
        }
    }
}
