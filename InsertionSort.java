import java.util.Scanner;


class InsertionSort {
    void insertionsort(int arr[],int n)
     { 
        //insertion start with index one and if key value has less than previous value then its swap otherwise its skip this step 
        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--) // this run whwn value of j is > 0 because we have to check all the value on the left side of the key
            {
                if(arr[j]<arr[j-1]) /// if the index 1 value is < the previous value than its swap the values
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
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
        InsertionSort obj=new InsertionSort();
        obj.insertionsort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.println("Sorted Array="+a[i]);
        }
        
    }
}
         
