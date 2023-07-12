import java.util.*;
import java.text.*;

public class Gewichtsbestimmung{
  
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] agrs){
    
    System.out.print("Geben sie Ihre Koerpergroesse <in cm> ein: ");
    int bodyHeight = sc.nextInt();
    System.out.print("\nGeben Sie ihr Geschlecht <m/w> ein: ");
    char gender = sc.next().charAt(0);
    
    double ergebnis[] = berechnungDerGewichte(bodyHeight, gender);
    
    System.out.println("\n\nAuswertung:\n");
    System.out.println("Normalgewicht: " + ergebnis[0] + " kg");
    System.out.println("Idealgewicht: " + ergebnis[1] + " kg");
    System.out.println("Uebergewicht: " + ergebnis[2] + " kg");
    }
  
  public static double[] berechnungDerGewichte(int bodyHeight,char gender){
    
  double gewichte[] = new double[3];  
  
    if (gender == 'w') {
      gewichte[0] = bodyHeight - 100;
      gewichte[1] = gewichte[0] - ((gewichte[0]/100)*15);
      gewichte[2] = gewichte[0] + ((gewichte[0]/100)*12);
      return gewichte;
    }else{
      gewichte[0] = bodyHeight - 100;
      gewichte[1] = gewichte[0] - ((gewichte[0]/100)*10);
      gewichte[2] = gewichte[0] + ((gewichte[0]/100)*12);
      return gewichte;
      }
    
         }
  }
  
