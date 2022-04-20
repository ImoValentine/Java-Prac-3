
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Merger {

    public static void main(String[] args) {
run();
    }
    public static void run(){
        System.out.println("Enter length of Lists");
        Scanner input = new Scanner(System.in);
        int Arrlen = input.nextInt();
        int[] arr1 = CA(Arrlen);
        int[] arr2 = CA(Arrlen);
        int[] indx1 = CAS(Arrlen);
        int[] indx2 = CAS(Arrlen);
        indx1 = SAS(arr1, indx1);
        indx2 = SAS(arr1, indx2);    
        int[] arc1 = SA(arr1);
        int[] arc2 = SA(arr2);
        int[] arr3 = new int[10];
        arr3 = AA3(arr1,arr2, Arrlen);
        int[] indx3 = CAS(Arrlen + Arrlen);
        indx3 = SAS(arr3, indx3); 
        int[] arc3 = SA(arr3);
        System.out.println("List 1:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("List 1 index order after sorting:");
        System.out.println(Arrays.toString(indx1));
        System.out.println("List 1 final order");
        System.out.println(Arrays.toString(arc1));
        System.out.println("List 2:");
        System.out.println(Arrays.toString(arr2));
        System.out.println("List 2 index order after sorting:");
        System.out.println(Arrays.toString(indx2));
        System.out.println("List 2 final order");
        System.out.println(Arrays.toString(arc2));
        System.out.println("List 3:");
        System.out.println(Arrays.toString(arr3));
        System.out.println("List 3 index order after sorting:");
        System.out.println(Arrays.toString(indx3));
        System.out.println("List 3 final order");
        System.out.println(Arrays.toString(arc3));
    }
    public static int[] CAS(int Arrlen){
        int[] num = new int[Arrlen];
        for (int j=0; j<Arrlen; j++){
            num[j] = j;
        }
    return num;}
    public static int[] CA(int Arrlen){
        int[] arr1 = new int[Arrlen];
        for (int i=0; i< Arrlen; i++){
            Random s = new Random();
            arr1[i] = s.nextInt(100);        }
    return arr1;}
    public static int[] SA(int[] arr){
        int rep = 0;
        for (int j = 0; j< (arr.length-1); j++){
        for (int i = 0; i< (arr.length-1); i++){
            if (arr[i] < arr[i+1]){
               rep = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = rep;
            }
        }
        }
    return arr;}
    public static int[] SAS(int[] arr, int[] indx1){
        int rep, red = 0;
        for (int j = 0; j< (arr.length-1); j++){
        for (int i = 0; i< (arr.length-1); i++){
            if (arr[i] < arr[i+1]){
               rep = arr[i];
               red = indx1[i];
               arr[i] = arr[i+1];
               indx1[i] = indx1[i+1];
               arr[i+1] = rep;
               indx1[i+1] = red;
            }
        }
    return indx1;}
        return null;
}
    public static int[] AA3(int[] arr1, int[] arr2, int Arrlen){
	int NL = Arrlen * 2;
        int[] arr3 = new int[NL];
        for (int p = 0; p<Arrlen; p++){
            arr3[p] = arr1[p];
            arr3[p+Arrlen] = arr2[p];
        }
    return arr3;}
}
