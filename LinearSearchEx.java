package ArrayEx;
public class LinearSearchEx {
    public static int linearSearchMethod (int arr[],int key)
    {
        for ( int i=0;i<arr.length;i++){
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={10,20,80,60,70};
        int key = 60;
        System.out.println("key element ids found at index: " + key);
        linearSearchMethod(arr,key);
    }
}
