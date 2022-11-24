package ExceptionDemo;

public class GirlFriends {
    private String name;
    private int age;


    public GirlFriends() {
    }

    public GirlFriends(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        int length = name.length();
        if (length < 3 || length > 10) {
            throw new NameFormatException(name + " 格式有误，长度应该为3-10位");
        }
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException(age + " 超出范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriends{name = " + name + ", age = " + age + "}";
    }
}
