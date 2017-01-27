
import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] A={1,3,2,5,3,7,9};
        A=MergeSort(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void Merge(int[] L, int [] R, int [] A){
        int nL=L.length;
        int nR=R.length;
        int i=0; int j=0;int k=0;
        while(i<nL && j<nR){
            if(L[i]<=R[j]){
                A[k]=L[i];
                k++;
                i++;
            }else{
                A[k]=R[j];
                k++;
                j++;
            }
            while(i<nL){
                A[k]=L[i];
                k++; i++;
            }
            while(j<nR){
                A[k]=R[j];
                k++; j++;
                    
            }
        }
        
    }
    
    public static int[] MergeSort(int[] A){
        int n=A.length;
        if(n<2)
            return A;
        int mid=n/2;
        int[] L= new int[A.length/2];
        int[] R=new int[A.length-A.length/2];
        for(int i=0; i<mid;i++){
            L[i]=A[i];
        }
        int j=0;
        for(int k=mid; k<n;k++){
            R[j]=A[k];
            j++;
        }
        MergeSort(L);
        MergeSort(R);
        Merge(L,R,A);
        return A;
    }
    
}
