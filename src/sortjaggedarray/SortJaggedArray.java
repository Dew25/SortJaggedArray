/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortjaggedarray;

import java.util.Random;

/**
 *
 * @author melnikov
 */
public class SortJaggedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Unsorted jagged array");
        int[][] jagArr = new int[5][];
        for(int i = 0; i < jagArr.length; i++){
            jagArr[i] = new int[i+1];
            
        }
        for (int i = 0; i < jagArr.length; i++) {
            for (int j = 0; j < jagArr[i].length; j++) {
                jagArr[i][j] = random.nextInt(100);
                System.out.printf("%4d",jagArr[i][j]);
            }
            System.out.println();
        }
        // block sorted jagged array
        for (int i = 0; i < jagArr.length; i++) {
            for (int j = 0; j < jagArr[i].length; j++) {
                
                for(int k = 0; k<jagArr.length;k++){
                    for (int m = 0; m < jagArr[k].length; m++) {
                        
                       if(jagArr[i][j]<jagArr[k][m]){
                            jagArr[i][j]=jagArr[i][j] + jagArr[k][m];
                            jagArr[k][m]=jagArr[i][j] - jagArr[k][m];
                            jagArr[i][j] = jagArr[i][j] - jagArr[k][m];
                        }
                        
                    }
                    
                }
                
                
            }
        }
        System.out.println("sorted:");
        for (int i = 0; i < jagArr.length; i++) {
            for (int j = 0; j < jagArr[i].length; j++) {
                System.out.printf("%4d",jagArr[i][j]);
            }
            System.out.println();
            
        }
        
    }
    
}
