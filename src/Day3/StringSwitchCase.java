package Day3;

public class StringSwitchCase {
    public static void main(String[] args) {
        String name = "Kiran";
        String greeting = "welcome to Java programing ";
        switch (name){
            case "Raji":
                System.out.println(greeting + name);
                break;
            case "Kiran":
                System.out.println(greeting + name);
                break;
            case "Sisira":
                System.out.println(greeting + name);
                break;
            default:
                System.out.println(" No match found");

        }
    }

}
