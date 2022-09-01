package huelequemao;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), p="";
        String[] col = new String[255];
        col = s.split(" ");
        int por = sc.nextInt();
        for (int i = 0; i < 255; i++) {
            int t;
            if (col[i].equals("oscurecer")) {
                break;
            } else {
                if (col[i].equals("255")) {
                    t = 255;
                } else {
                    t = Integer.parseInt(col[i]) + (Integer.parseInt(col[i]) * por / 100);
                }
            }
            p += t + " ";
        }
        System.out.println(p);
    }
}
