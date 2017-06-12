/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridprob;

import java.util.Scanner;

/**
 *
 * @author Chotu
 */
public class GridProb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int m = sc.nextInt();
        int[][] matx = new int[n][m];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (i == 0) {
                    if (j == 0) {
                        matx[i][j] = 0;
                    } else {
                        matx[i][j] = 1;
                    }
                } else {
                    if (j == 0) {
                        matx[i][j] = 1;
                    } else {
                        matx[i][j] = matx[i][j-1] + matx[i-1][j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m ; j ++) {
                System.out.print(matx[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
