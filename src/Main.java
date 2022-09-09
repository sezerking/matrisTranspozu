import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void transpose(int[][] arr,int row,int col){
        System.out.println("");
        int[][] transpose=new int[col][row];
        for (int i=0;i< transpose.length;i++){
            int j=0;
            do{
                transpose[i][j]=arr[j][i];

                j++;
            }while (j<transpose[i].length);
        }
        System.out.println("Transpozu alınmış matrix: ");
        for (int[] i:transpose) {
            for (int j:i) {
                System.out.printf("%d\t",j);

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz: ");
        int row=scanner.nextInt();
        System.out.println("Sütun sayısını giriniz: ");
        int col=scanner.nextInt();

        int[][] matrix=new int[row][col];
        for (int i=0;i< matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(i+","+j+" elemanını giriniz");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Matrixiniz: ");
        for (int[] i:matrix) {
            for (int j:i) {
                System.out.printf("%d\t",j);

            }
            System.out.println("");
        }


        transpose(matrix,row,col);



    }
}
