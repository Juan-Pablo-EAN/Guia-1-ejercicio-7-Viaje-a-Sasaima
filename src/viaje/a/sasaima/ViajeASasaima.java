package viaje.a.sasaima;
import java.util.Scanner;
public class ViajeASasaima {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double klc = 0;
        double klt = 0;
        double km = 0;
        double gas = 0;
        int price = 10000;
        
        System.out.println("----------------------------------------");
        System.out.println("Transporte de carga de Bogotá a Sasaima");
        System.out.println("----------------------------------------");
        System.out.println("¿Cual es la capacidad de carga del camión en kilos?");
        klc = entrada.nextInt();
        System.out.println("¿Cuantos kilos pesa la carga que se desea transportar?");
        klt = entrada.nextInt();
        System.out.println("¿Cuantos gal/km consume el camión?");
        gas = entrada.nextDouble();
        System.out.println("¿Cuantos kilometros se recorrerán hasta Sasaima?");
        km = entrada.nextInt();
        int gal = (int) ((int) km*gas);
        int viajes = (int) Math.round(klt/klc);
        int galt = gal*viajes;
        int pricet = (int) (galt*price);
        
        System.out.println("------------------------------------------");
        System.out.println("Viajes:" + " " + viajes);
        System.out.println("Galones por viaje:" + " " + gal);
        System.out.println("Galones totales:" + " " + galt);
        System.out.println("Costo de la gasolina:" + " " + "$" + pricet);
    }
    
}
