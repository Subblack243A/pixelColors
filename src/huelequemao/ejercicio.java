
package huelequemao;

import java.util.Scanner;



public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="", col[]=new String[255], sal="";
        int por=0, con=0;
        do {            
            s=sc.next();
            if (s.equals("oscurecer")) {
               por=sc.nextInt();
               break;
            }else{
                col[con]=s;
                con++;
            }
        } while (s!="oscurecer");
        for (int i = 0; i < con; i++) {
            int t;
            if (col[i].equals("255")) {
                t=255;
            }else{
               t= Integer.parseInt(col[i])+(Integer.parseInt(col[i])*por/100);
            }
            System.out.print(t+" ");
        }
        System.out.println();
    }
}
