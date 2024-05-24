import java.util.Scanner;
public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i, total=0;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt(); 

        for(i=1; i<=numero; i++){
        total +=i;
        }
        
        System.out.println(total);

    }
    
}
