public class Main {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(25);
        tree.add(20);
        tree.add(36);
        tree.add(10);
        tree.add(22);
        tree.add(30);
        tree.add(40);
        tree.print();
        System.out.println("is [poggers] a palindrome? "+palindrome("poggers"));
        System.out.println("is [tacocat] a palindrome? "+palindrome("tacocat"));
        System.out.println("Factorial of 5: "+factorial(5));
    }
    public static boolean palindrome(String s)
    {
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(s.length() - 1)!=s.charAt(0)){
            return false;
        }
        return palindrome(s.substring(1, s.length() - 1));
    }
    public static int factorial(int i){
        if(i>0){
            return i*factorial(i-1);
        }
        else{
            return 1;
        }
    }
}
