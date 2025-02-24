public class Mainq3 {
    public static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 9;
        double nota3 = 3;
        double media = (nota1+nota2+nota3)/3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 3.9) {
            System.out.println("Prova final");
        } else{
            System.out.println("Reprovado");
        }
    }
}
