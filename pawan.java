import java.util.Scanner;

/**
 * pawan
 */
public class pawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int arr1[] = new int[n], arr2[] = new int[m];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
        for (int i = 0; i < n; i++) System.out.print(arr1[i]+ " ");
        System.out.println();
        for (int i = 0; i < m; i++) System.out.print(arr2[i]+ " ");
        System.out.println();
        int i = 0, j = 0, prv = Integer.MIN_VALUE, cnt = 0;
        while(i < n && j < m){
            if(arr1[i] == arr2[j]){
                if(prv == arr1[i]){
                }
                else{
                    cnt++;
                    prv = arr1[i];
                }
                i++; j++;
            }
            else if(arr1[i] < arr2[j]){
                if(prv == arr1[i]) i++;
                else{
                    prv = arr1[i];
                    cnt++;
                }
            }
            else{
                if(prv == arr2[j]) j++;
                else{
                    prv = arr2[j];
                    cnt++;
                }
            }
        }
        if(i == n){
            while(j < m){
                if(prv == arr2[j]) j++;
                else{
                    prv = arr2[j];
                    cnt++;
                }
            }
        }
        if(j == m){
            while(i < n){
                if(prv == arr1[i]) i++;
                else{
                    prv = arr1[i];
                    cnt++;
                }
            }
        }
        System.err.println(cnt);
        int arr3[] = new int[cnt];
        prv = Integer.MIN_VALUE;
        i = 0; j = 0; int k = 0;
        while(i < n && j < m && k < cnt){
            if(arr1[i] == arr2[j]){
                if(prv == arr1[i]){
                }
                else{
                    prv = arr1[i];
                    arr3[k] = prv;
                    k++;
                }
                i++; j++;
            }
            else if(arr1[i] < arr2[j]){
                if(prv == arr1[i]) i++;
                else{
                    prv = arr1[i];
                    arr3[k] = prv;
                    k++;
                }
            }
            else{
                if(prv == arr2[j]) j++;
                else{
                    prv = arr2[j];
                    arr3[k] = prv;
                    k++;
                }
            }
        }
        if(i == n){
            while(j < m){
                if(prv == arr2[j]) j++;
                else{
                    prv = arr2[j];
                    arr3[k] = arr2[j];
                    k++;
                }
            }
        }
        if(j == m){
            while(i < n){
                if(prv == arr1[i]) i++;
                else{
                    prv = arr1[i];
                    arr3[k] = arr2[i];
                    k++;
                }
            }
        }
        for (int l = 0; l < cnt; l++) {
            System.out.print(arr3[l]+ " ");
        }
    }
}