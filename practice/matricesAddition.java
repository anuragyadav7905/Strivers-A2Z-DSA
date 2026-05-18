import java.util.*;
public class matricesAddition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        
        int[][] mat1=new int[row][col];
        int[][] mat2=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        sc.close();

        int[][] mat=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}