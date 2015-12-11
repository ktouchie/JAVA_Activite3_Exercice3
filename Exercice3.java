import java.util.Scanner;
class Exercice3 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int total = 0;
        while (num>=1) {            
            System.out.println("Veuillez saisir un nombre entier positif:");
            num = sc.nextInt();
            if ((num%3)==0) {
                System.out.println(num + " est multiple de 3.");
                total = (total+1);
            }
        }
        
        System.out.println("Vous avez saisi " + total + " multiple(s) de 3 en total.");               
    }
}