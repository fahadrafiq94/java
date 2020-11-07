import java.util.Scanner;


class BubbleSort {
    void bubblesort(int arr[],int n)
     {
         //this loop is responsible to access all the value in the array 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++) //after its 1st iteration we have our maximum value sorted
            {
                if(arr[j]>arr[j+1]) // if value at present index is > the next index value then its swap the value 
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String [] args )
    {        
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the length od the array:");
        int n =inp.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the" +i+ "index Value: ");
            a[i]=inp.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Unsorted Array="+a[i]); 
        }
        BubbleSort obj=new BubbleSort();
        obj.bubblesort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.println("Sorted Array="+a[i]);
        }
        
    }
}
         
