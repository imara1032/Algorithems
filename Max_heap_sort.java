import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        int[] A={1,2,3,3,4,5,6,7,10,13,14};
        Build_heap_sort(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
       
    }
    public static int PARENT(int i){
        if(i<2)
            return 0;
        return i/2;
    }
    public static int LEFT(int i){
        if(i<1)
            return 1;
        return i*2+1;
    }
    public static int RIGHT(int i){
        if(i==0)
            return 2;
        return 2*i+2;
    }
    public static int[] Build_heap_sort(int []A){
        for(int i=(A.length/2-1);i>=0;i--){
            A=Heap_Sort(A,i);
        }
        return A;
    }
    
    public static int[] Heap_Sort(int[] A, int i){
        int l=LEFT(i);
        int r=RIGHT(i);
        int largetest=i;
        if(l<A.length && A[l]>A[i])
            largetest=l;
        else largetest=i;
        if(r<A.length && A[r]>A[largetest])
            largetest=r;
        if (largetest!=i){
            int temp=A[i];
            A[i]=A[largetest];
            A[largetest]=temp;
        }
        
        return A;
    }
    
    
    
}