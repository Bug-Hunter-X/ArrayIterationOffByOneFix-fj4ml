public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) { //Error: accessing index out of bounds
            arr[i] = i * 2; 
        }
        System.out.println(arr[0]); // this will print 0
        System.out.println(arr[5]); //this will throw an exception
    }
}