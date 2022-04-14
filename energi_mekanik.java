import java.util.Scanner;
public class energi_mekanik {
    
    public static void main(String[] args) {
        double m, h, v, Ep, Ek, Em;
        final double g = 10;
        
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan massa benda (m): ");
        m = input.nextDouble();
        
        System.out.print("Masukkan tinggi benda dari permukaan tanah (h: ");
        h = input.nextDouble();
        
        System.out.print("kecepatan benda (v): ");
        v = input.nextDouble();
        
        //proses
        Ep = m * g * h;
        Ek = 0.5 * m * Math.pow(v, 2);
        Em = Ep + Ek;
        
        //output
        System.out.println("Besar nilai energi potensial adalah: "+ String.format("%.1f", Ep) + " J");
        System.out.println("Besar nilai energi kinetik adalah: "+ String.format("%.1f", Ek)+ " J");
        System.out.println("Besar nilai energi mekanik adalah: "+ String.format("%.1f", Em)+ " J");
    }
}
