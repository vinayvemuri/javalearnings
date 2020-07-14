public class reverseString {
    public static void main(String [] args){
        int x = 152;
        int p;
        int reversed = 0;
        while(x!=0){
            p = x%10;
            x /=10;
            reversed = (reversed*10) + (p);

        }
        System.out.println(reversed);
    }
}
