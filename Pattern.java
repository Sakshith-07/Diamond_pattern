import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        int row,i,j,s=1;
        System.out.println("Enter the no.of rows to print:");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        s=row-1;
        for(j=1;j<=row;j++){
            for(i=1;i<=s;i++){
                System.out.print(" ");
            }
            s--;
            for(i=1;i<=2*j-1;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        s=1;
        for(j=1;j<=row-1;j++){
            for(i=1;i<=s;i++){
                System.out.print(" ");
            }
            s++;
            for(i=1;i<=2*(row-j)-1;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
