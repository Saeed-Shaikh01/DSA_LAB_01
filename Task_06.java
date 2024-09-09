
public class Task_06 {
    
         public static void main(String[] args) {
        
        int[] arr = {8,16,24,32,40};

        System.out.println("Array Before Deletion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
        
        int deleteIndex=2;
        for(int i=deleteIndex; i<arr.length-1;  i++){
               arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        
        
        System.out.println("\n\n Array After deletion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
         }}
    

