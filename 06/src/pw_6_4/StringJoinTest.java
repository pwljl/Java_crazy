package pw_6_4;

public class StringJoinTest {
    public static void main(String[] args)
    {
        var s1 = "疯狂java";
        var s2 = "疯狂" + "java";
        System.out.println(s1 == s2);

//        var str1 = "疯狂";
//        var str2 = "java";
        final var str1 = "疯狂";
        final var str2 = "java";
        var s3 = str1 + str2;
        System.out.println(s1 == s3);

        final var s4 = new String("疯狂java");
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);
    }
}
