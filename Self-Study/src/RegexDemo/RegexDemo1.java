package RegexDemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("a123b".matches(regex1));
    }
}
