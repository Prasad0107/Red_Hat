import java.util.Scanner;

public class Transpose_Matrix {
	
	int matrix(int[][] a,int[][] b,int n) {
		System.out.println(n+"*"+n+" Transposed Matrix");
		int[][] z=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=a[j][i];
			}
		}
		//transposed matrix
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for (int k=0;k<n;k++)
                    z[i][j]+=a[i][k]*a[k][j];
			}
		}
		//multiplication of original and transposed matrix
		System.out.println("Multiplication of original and transposed matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(z[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
		int[][] a = {{1,2,3},
					 {1,2,3},
					 {1,2,3}};
		
		int[][] a1 = {{1,2,3,4},
				 	  {1,2,3,4},
				 	  {1,2,3,4},
				 	  {1,2,3,4}};
		
		int[][] b = new int[3][3];
		
		int[][] b1 = new int[4][4];
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
		Transpose_Matrix x = new Transpose_Matrix();
		// for 3*3 Matrix
		x.matrix(a, b, 3);
		
		// for 4*4 Matrix
		x.matrix(a1, b1, 4);
	}

}
