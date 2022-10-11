package beans;
public class User {
//    private User(){
//
//    }
////    best singleton pattern
//    private static User user=null;
//    static {
//        user=new User();
//    }
//    public static User instance(){
//        return user;
//    }
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public void printHello(){


        System.out.println("salam"+name);
    }
}
