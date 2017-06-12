import java.util.*;
    
    public class inverse_matrix {
        public static void main(String[] args) {
            char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            Scanner inp = new Scanner(System.in);
            // System.out.print("Enter order of matrix:");
            int n = inp.nextInt();inp.nextLine();
            Double matrix[][] = new Double[n][n];
            
            // user input for matrix elements
            // System.out.println("Enter matrix elements:");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j] = inp.nextDouble();
                }inp.nextLine();
            }
            Double det = determinant(matrix,n);
            // System.out.println("Determinant "+det);
            if(det==0){
                System.exit(0);
            }
            Double transpose_matrix[][] = transpose(matrix,n);
            Double adjacent_matrix[][] = adjacent(transpose_matrix,n);
            Double inverse_matrix[][] = inverse(adjacent_matrix,n,det);
            // print_matrix1(inverse_matrix, n);
            Double final_arr2[][] = transpose(inverse_matrix,n);
            // print_matrix1(final_arr2,n);
            char[][] ch_arr = new char[n][n];
            String res = "";
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n; j ++) {
                    // int temp = (int)final_arr2[i][j];
                    Integer temp = final_arr2[i][j].intValue();

                    ch_arr[i][j] = alpha[((int)temp)-1];
                    // System.out.println(ch_arr[i][j]);
                    res += ch_arr[i][j];
                }
            }
            // print_char_matrix(ch_arr,n);
            // System.out.println(res);
            ArrayList<String> list = new ArrayList();
            list.add(res);
            for(int i = res.length()-1; i >=0 ; i --) {
                if (res.substring(i,i+1).equals(res.substring(i-1,i))) {
                    res = res.substring(0,i);
                    list.add(res);
                }else {
                    break;
                }
            }
            // System.out.println(list);
            for (int i = list.size()-1; i >= 0; i --) {
                if (i > 0){
                    System.out.print(list.get(i)+" ");
                } else if (i == 0) {
                    System.out.print(list.get(i));
                }
            }
            // while (res.substring(res.length()-2,))

        }
        // static void print_matrix1(Double a[][], int m){
        //     for(int i=0;i<m;i++){
        //         for(int j=0;j<m;j++){
        //             System.out.print(a[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
     
        // }
        // static void print_char_matrix(char[][] ch, int m) {
        //     for(int i=0;i<m;i++){
        //         for(int j=0;j<m;j++){
        //             System.out.print(ch[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
        // }
        static Double[][] transpose(Double a[][],int m){
            Double b[][] = new Double[m][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    b[i][j] = a[j][i];
                }
            }
            return b;
        }
        static Double[][] inverse(Double a[][],int m,double det){
            Double output[][] = new Double[m][m];
            Double[][] final_arr = new Double[m][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    output[i][j] = a[i][j]/det;
                    final_arr[i][j] = (double)Math.round(output[i][j]);
                }
            }
            return final_arr;
        }
        static Double[][] adjacent(Double a[][],int m){
            Double output[][] = new Double[m][m];
            int det = 0,s=0,t=0;
            for (int z=0;z<m;z++){
                for (int i=0;i<m;i++){
                    Double b[][] = new Double[m-1][m-1];
                    for(int j=0;j<m;j++){
                        if(j!=z){
                            for(int k=0;k<m;k++){
                                if(k!=i){
                                    b[s][t] = a[j][k];    
                                    t++;
                                }
                            }
                            s++;
                        }
                        t = 0;
                    }
                    s = 0;
                    output[z][i] = (int)Math.pow(-1,i+z)*determinant(b,m-1);
                } 
            }
            return output;
        }
        static Double determinant(Double a[][],int m){
            if(m==1){
                return a[0][0];
            }
            else if(m==2){
                return a[0][0]*a[1][1]-a[0][1]*a[1][0];
            }
            else{
                int s=0,t=0;
                Double det = 0.0;
                for (int i=0;i<m;i++){
                    Double b[][] = new Double[m-1][m-1];
                    for(int j=0;j<m;j++){
                        if(j!=0){
                            for(int k=0;k<m;k++){
                                if(k!=i){
                                    b[s][t] = a[j][k];    
                                    t++;
                                }
                            }
                            s++;
                        }
                        t = 0;
                    }
                    s = 0;
                    det = det+(int)Math.pow(-1,i)*a[0][i]*determinant(b,m-1);
                } 
                return det;
            }
        }
    }
        
    /*
    3
    -0.78378378378 0.18918918919 0.70270270270
    -0.11850311850 0.07900207900 0.09563409563
    0.87733887734 -0.25155925156 -0.72557172557 


2
0.06666666667 -0.06666666667
-0.00350877193 0.05614035088 

    */