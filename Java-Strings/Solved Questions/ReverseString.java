public class ReverseString {
    public static void main(String[] args) {
        String name = "abhishek";
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println("Reversed String : " + reversed);
    }
}
