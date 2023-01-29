/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contcaractere;

import java.util.Scanner;

public class ContCaractere {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        int i, c = 0;
        System.out.println("Insira uma frase:");
        frase = ler.nextLine().toLowerCase();

        System.out.print("Informe uma letra:");
        char x = ler.next().toLowerCase().charAt(0);

        char letra[] = frase.toCharArray();
        for (i = 0; i < letra.length; i++) {
            if (x == letra[i]) {
                c += 1;
            }
        }
        System.out.printf("A letra %c aparece %d veze(s).\n", x, c);
    }

}
