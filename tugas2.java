import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan bulat: ");
    int number = sc.nextInt();
    
    if (number % 2 == 0) {
        System.out.println(number + " adalah bilangan genap.");
    } else {
        System.out.println(number + " adalah bilangan ganjil.");
    }
    }
    
}

