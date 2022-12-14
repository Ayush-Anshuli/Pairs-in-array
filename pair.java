import java.util.*;
public class pair {
    public static void pair(int n, int arr[]){
        for(int i=0; i<n; i++){
            int curr = arr[i];
            for(int j=i+1; j<n; j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        pair(n, arr);
    }
}
