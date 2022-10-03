import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        double media;
        double n1, n2, n3, n4;

        System.out.println("Digite as 4 notas bimestrais ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();  
        n3 = entrada.nextInt();  
        n4 = entrada.nextInt();      

        media = (n1+n2+n3+n4) /4;

        System.out.println("A media das notas bimestrais é  " + media);

    }
}