
package atm.programı;

import java.util.Scanner;


public class ATMProgramı {

    public static void main(String[] args) {
        /* while ile atm programı yapma 
        işlem1= bakiye öğrenme
        işlem2=para çekme
        işlem3=para yatırma
        çıkış=q
        */
       Scanner m=new Scanner(System.in);
       
        int bakiye=1000;
      
       String işlemler = "1.işlem=bakiye öğrenme\n"
               + "işlem2=paraçekme\n"
               + "işlem3=para yatırma\n"
               + "çıkış için q ya basın";
       
       
        while (true){
            System.out.println("işlem seçiniz");
         String islem = m.nextLine();
            if (islem.equals("q") ){
                System.out.println("programdan çıkılıyor");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("bakiyeniz="+bakiye);
                
            }
            else if (islem.equals("2")) {
                System.out.println("çekilecek tutarı girin= ");
                int tutar=m.nextInt();
                   m.nextLine();
                 
                if (bakiye-tutar<0) {
                    System.out.println("yetersiz bakiye");
                  
                }
                else
                    bakiye-=tutar;
                System.out.println("kalan bakiye= " +bakiye);
                
                
            }
            else if (islem.equals("3")){
                System.out.println("yatırılacak tutarı girin=");
            int tutar=m.nextInt();
            m.nextLine();
            bakiye+=tutar;
            System.out.println("yeni bakiye= "+bakiye);
            
   }
        } 
    }
    
}
