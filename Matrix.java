import java.util.*;
public class Matrix
{
private int n, m;                 // n = row, m = column
private float data[][] = new float[100][100];
public   Matrix()               //Construcror allows user to enter values for a matrix from keyboard
{
System.out.println("Enter your matrix size: \nRow:     n= ");

Scanner keyboard = new Scanner(System.in);
n=keyboard.nextInt();

System.out.println("Column:  m=");
m=keyboard.nextInt();


for (int i=0;i<n;i++)
   for(int j=0; j<m; j++)
      {
           System.out.print("data["+i+"]["+j+"]= ");
           data[i][j]=keyboard.nextFloat();
       }
}
public Matrix(int N, int M)
{
n=N; m=M;
 for (int i=0;i<n;i++)
   for(int j=0; j<m; j++)
      data[i][j]=0;
}

        Matrix add(Matrix B) // Addition of two Matrices
         {
        Matrix temp = new Matrix(B.n, B.m);
         temp.n = B.n; temp.m = B.m;
            for (int k=0; k<B.n;k++)
             for (int j=0; j<B.m; j++)
                temp.data[k][j] = data[k][j] + B.data[k][j];
             return (temp);
         }
        Matrix sub(Matrix B) // Subtraction of two Matrices
         {
        Matrix temp = new Matrix(B.n, B.m);
         temp.n = B.n; temp.m = B.m;
            for (int k=0; k<B.n;k++)
             for (int j=0; j<B.m; j++)
                temp.data[k][j] = data[k][j] - B.data[k][j];
             return (temp);
         }
        Matrix mul(Matrix B) // Multyply of two Matrices
         {
        Matrix temp = new Matrix(B.n, B.m);
         temp.n = B.n; temp.m = B.m;
            for (int k=0; k<B.n;k++)
             for (int j=0; j<B.m; j++)
                temp.data[k][j] = data[k][j] * B.data[k][j];
             return (temp);
         }
          void display()
          {
         for (int i=0; i<n; i++)
              {  
         for (int j=0; j<m; j++)
             System.out.print(data[i][j] * " ");
                   
                    System.out.println("");
              }        
          }
public static void main(String a[])
{
  Matrix A = new Matrix();
  System.out.println("\nMatrix A:");
  A.display();
  Matrix B = new Matrix();
  System.out.println("\nMatrix B:");
  B.display();
  Matrix C= A.add(B);
  System.out.println("\nMatrix C = A + B:\n");
  C.display();
  Matrix D= A-B;
  System.out.println("\nMatrix D = A - B:\n");
  D.display();
Matrix E= A*B;
  System.out.println("\nMatrix E = A * B:\n");
  E.display();
}
}