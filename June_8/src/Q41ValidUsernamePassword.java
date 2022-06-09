import java.util.Scanner;

class InValidUsername extends Exception{
    public InValidUsername(String str){
        super(str);
    }
}
class InvalidPassword extends  Exception{
    public InvalidPassword(String str){
        super(str);
    }
}

public class Q41ValidUsernamePassword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String user = scan.next();

        try{
            if(!(user.length() >= 6 && user.length() <= 15)){
                throw new InValidUsername("Invalid Username");
            }
            if(!(Character.isUpperCase(user.charAt(0)))){
                throw new InValidUsername("First letter must be in Upper Case");
            }
            if(user.contains("{") || user.contains("}"))
                throw  new InValidUsername("Invalid Username: ");
            System.out.println("Enter the Password: ");
            String pass = scan.next();
            if(!(pass.length() >= 8 && pass.length() <= 256)){
                throw new InvalidPassword("Invalid Password: A password must of 8-256 characters");
            }
            if(pass.contains("{") || pass.contains("}")) {
                throw new InvalidPassword("Invalid Password:A Password should not contain parentheses ");
            }
            if(pass.contains(" ")){
                throw new InvalidPassword("Invalid Password: Password Must not contain space");
            }

            if((user.equals(pass))){
                throw new InValidUsername("Username and Password cannot be same");
            }
        }
        catch (InValidUsername e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidPassword e){
            System.out.println(e.getMessage());
        }


    }
}
