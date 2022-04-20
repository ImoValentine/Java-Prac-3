public class Sieve {

  public static void storeValues(int[] val){
        for (int i = 0; i < val.length; i++) {
            val[i] = i + 2;
        }
    }
    
  public static void replaceMultiplesWithZeros(int[] val2,int start,int jump){
        for (int indx = start; indx < val2.length; indx +=jump) {
            if (indx < val2.length) {
                if (indx != start) {
                    val2[indx] = 0;
                }
            }
        }
    }
    
  public static void performSiftingProcess(int[] val1){
        for (int indx = 0; indx < val1.length; indx++) {
            if (val1[indx] != 0) {
                replaceMultiplesWithZeros(val1, indx, val1[indx]);
            }
        }
    }
    
  public static void displayArray(int[] numbr){
        for (int i = 0; i < numbr.length; i++) {
            if (numbr[i] != 0) {
                System.out.println(numbr[i]);
            }
        }
    }
    
  public static void run(int n){
        int [] number = new int[n];
        storeValues(number);
        performSiftingProcess(number);
        displayArray(number);
    }
    
  public static void main(String[] args) {
        run(1000);
        // TODO code application logic here
    }
    
}
