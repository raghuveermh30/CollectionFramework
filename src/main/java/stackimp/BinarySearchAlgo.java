package stackimp;

public class BinarySearchAlgo {

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int x = 8;
      int result=  binarySearch(arr, x, 0, n-1);
      if(result==-1){
          System.out.println("The Element is not found");
      }
      else{
          System.out.println("Element is found at " +result);
      }
    }

    public static int binarySearch(int arr[], int x, int low, int high) {

        while (low <= high) {
            int mid =(high+low)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
