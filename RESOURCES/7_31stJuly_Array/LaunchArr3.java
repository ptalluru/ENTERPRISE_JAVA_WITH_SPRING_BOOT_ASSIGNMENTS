import java.util.Scanner;

public class LaunchArr3 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		
		int [][][]arr=new int[3][2][3];
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter marks of School "+ i +" class "+ j+" Student "+ k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
					
			}
				System.out.println();
		}
	}

	}}
