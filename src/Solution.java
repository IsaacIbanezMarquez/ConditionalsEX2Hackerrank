import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

/*  Pel nou curs escolar l'institut on estàs vol saber si podrà comptar amb suficient espai per fer les classes presencials. Així en una aula determinada hi caben N alumnes, i en cada planta hi caben A aules. L'institut té un nombre P de plantes i un nombre M de matriculats.

Input Format

N alumnes per aula A aules per planta P plantes totals que té l'institut M matriculats totals a l'institut

Constraints

Totes les dades d'entrada han de ser superiors a 0.

Output Format

Si els alumnes hi caben s'imprimirà un missatge: "A l'institut hi caben tots els alumnes, encara n'hi caben X"

En cas contrari s'imprimirà: "Calen X places per tots els alumnes que s'han matriculat"

Si hi ha alguna dada d'entrada que no sigui superior a 0: "Error dades introduïdes no vàlides"

Sample Input 0

20
4
8
620
Sample Output 0

A l'institut hi caben tots els alumnes, encara n'hi caben 20
Sample Input 1

0
5
8
700
Sample Output 1

Error dades introduides no valides
Sample Input 2

30
4
5
700
Sample Output 2

Calen 100 places per tots els alumnes que s'han matriculat
Sample Input 3

20
8
-50
700
Sample Output 3

Error dades introduides no valides

 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int P = sc.nextInt();
        int M = sc.nextInt();
        int totalPlazas = N*A*P;
        int residuo = totalPlazas - M;

        if ((N<=0) || (A<=0) || (P<=0))
        {
            System.out.println("Error dades introduides no valides");
        } else if (residuo > 0)
        {
            System.out.print("A l'institut hi caben tots els alumnes, encara n'hi caben " + residuo);
        }
        else
        {
            System.out.print("Calen " + Math.abs(residuo) + " places per tots els alumnes que s'han matriculat");
        }
    }


}
