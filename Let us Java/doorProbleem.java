import java.util.*;

public class doorProbleem
{
	public static void main(String[] args) 
	{
	    int inner_var = 0;
	    int outer_var = 0;
	    int close = 0;
	    int open = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of lockers: ");
		int num = sc.nextInt();
		String arr[] = new String[num];
		for(int i=0; i<num; i++)
		{
		    arr[i]="closed";
		}
		for (int j=0; j<num; j++)
		{
		    inner_var=0;
            while(inner_var<num)
            {
                if(arr[inner_var]=="closed")
                {
                    arr[inner_var]="open";    
                }
                else if (arr[inner_var]=="open")
                {
                    arr[inner_var]="closed";    
                }
                inner_var=inner_var+1+j;
            }
		}
		for (int k=0; k<num; k++)
		{
		    if (arr[k]=="closed")
		    {
                close = close + 1;
		    }
		    else if (arr[k]=="open")
		    {
		        open = open + 1;    
		    } 
		}
		System.out.println("Number of closed lockers are: "+close);
		System.out.println("Number of open lockers are: "+open);
	}
}