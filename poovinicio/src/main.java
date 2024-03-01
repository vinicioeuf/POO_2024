
import java.util.Scanner;

/**
 * @author Vinicio Eufrazio
 * Github: https://github.com/vinicioeuf
 * Linkedin: https://br.linkedin.com/in/vinicio-eufrazio-8a64a61a3
 * Portfólio: https://vinicioeufrazio.herokuapp.com/
 */
public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        int cont = 0;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i;
        }
        System.out.print("Saída de dados: ");
        for(int i : numeros){
            if(i % 2 == 0){
                cont++;
                if(cont > 1){  // Verifica se não é o primeiro número par
                    System.out.print(", ");  // Se não for, imprime a vírgula antes
                }
                System.out.print(numeros[i]);  // Imprime o número par
            }
        }
        System.out.println("\nTemos " + cont + " números pares");
        
//        int[] numeros = new int[10];
//        
//        double[] precos = {9.99, 2.50, 3.15, 4.75};
//        
//        String[] nomes, disciplinas, cursos;
//        
//        nomes = new String[5];
//        disciplinas = new String[6];
//        cursos = new String[3];
//        
//        for(int i = 0; i < 10; i++){
//            numeros[i] = i;
//            System.out.println(numeros[i]);
//        }
//        Scanner s = new Scanner(System.in);;;;
//        double nota1, nota2, media;
//
//        System.out.print("Primeira nota: ");
//        nota1 = s.nextDouble();
//
//        System.out.print("Segunda nota: ");
//        nota2 = s.nextDouble();
//        media = (nota1 + nota2) / 2;
//
//        System.out.println("A média do aluno é: " + media);
//        if(media >= 7.0){
//            System.out.println("Aprovado!");
//        }else if(media >= 4.0 && media < 7){
//            System.out.println("Recuperação!");
//        }
//        else{
//            System.out.println("Reprovado!");
//        }
    }
    
}
