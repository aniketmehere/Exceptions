public class ExceptionExample {
    public static void main(String[] args) {
        // NullPointerException
        String str = null;
        try { 
            String a = null; 
            System.out.println(a.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println("NullPointerException.."); 
        } 

        // StringIndexOutOfBoundsException 
        try {
            String text = "Hello";
            char character = text.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Is Detected");
        }

        // NumberFormatException
        try {
            String numStr = "abc";
            int num = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Is Detected");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Is Detected");
        }

        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Is Detected");
        }
    }
}
