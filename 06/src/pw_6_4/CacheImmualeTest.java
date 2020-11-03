package pw_6_4;

class CacheImmutable {
    private static int MAX_SIZE = 10;
    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];
    private static int pos = 0;
    private final String name;

    //构造器定义为私有的，外部不可以实例化 ，只能通过该类提供的方法来获取实例
    private CacheImmutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //修饰符是static，说明这个方法是类方法，只能用类名来访问
    public static CacheImmutable valueOf(String name) {
        //遍历已缓存的对象
        for (var i = 0; i < MAX_SIZE; i++) {
            //如果已经有相同的实例，则直接返回该缓存的实例
            if (cache[i] != null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }
        //如果缓存池已满
        if (pos == MAX_SIZE) {
            cache[0] = new CacheImmutable(name);
            pos = 1;
        } else {
            //把新创建的对象缓存起来，pos加一
            cache[pos++] = new CacheImmutable(name);
        }
        return cache[pos - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == CacheImmutable.class) {
            var ci = (CacheImmutable) obj;
            return name.equals(ci.getName());
        }
        return false;
    }

    public int hashCode()
    {
        return name.hashCode();
    }
}

public class CacheImmualeTest {
    public static void main(String[] args)
    {
        var c1 = CacheImmutable.valueOf("hello");
        var c2 = CacheImmutable.valueOf("hello");
        System.out.println(c1 == c2);
    }

}
