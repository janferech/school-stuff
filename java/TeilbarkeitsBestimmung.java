import java.util.*;

public class TeilbarkeitsBestimmung{
  
  static int zahl;
  static int teiler;
  
  boolean wert;
  
  
  
  static Scanner sc = new Scanner(System.in);
  
  public static void eingabe() {
    System.out.println("Eingabe Zahl");
    zahl = sc.nextInt();
    System.out.println("Eingabe Teiler");
    teiler = sc.nextInt();
    }
     
     public static boolean teilbar(int z, int t) {
    boolean w;
    
     if (z % t == 0) {
         w = true;
        }else{
          w = false;
    }
    return w;
    }
  public static int[] verarbeitung(int zahl){
    
    int teilbareZahlen[] = new int[zahl];
    
    for (int i = 1 ;i < zahl ;i++ ) {
      if (zahl % i == 0) {
        teilbareZahlen[i] = i;
    } // end of for
    }
    return teilbareZahlen;
    }
  
   public void ausgabe() {
    
    wert = teilbar(zahl, teiler);
    
    System.out.println(wert);
    System.out.println();
    
    if (wert == true) {
      System.out.println("\nTestergebnis: " + zahl + " ist durch " + teiler + " glatt teilbar!");
    }else {
      System.out.println("\nTestergebnis: " + zahl + " ist durch " + teiler + " nicht glatt teilbar!");
      System.out.println("\nDie Zahl " + zahl + " ist durch folgende Zahlen teilbar: ");
      for (int i = 0;i < verarbeitung(zahl).length ;i++ ) {
        System.out.println(verarbeitung(zahl));
      } // end of for
      }
    
    }
  
  public static void main(String [] args) {
    
  TeilbarkeitsBestimmung teil = new TeilbarkeitsBestimmung();
    
    teil.eingabe();
    teil.ausgabe();
    
    }  
    }  

