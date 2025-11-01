public class PrintStrAsCharArr {
    public static void main(String s[]) {
    String myStr = "Hello World!";
    char[] chrArr = myStr.toCharArray();
    for (int i=0;i<chrArr.length;i++) {
        System.out.print(chrArr[i]);
    }
}
}
