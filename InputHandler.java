import java.util.Scanner;
class InputHandler{
    Scanner sc = new Scanner(System.in);

    public int getMark(){
        System.out.println("Enter the marks:");
        return Integer.parseInt(sc.nextLine());
    }

    public String getName(){
        System.out.println("Enter name:");
        return sc.nextLine();
    }
    
    public int getRegNum(){
        System.out.println("Enter the reg number:");
        return Integer.parseInt(sc.nextLine());
    }

    public void getData(StudentNode n){
        System.out.println("Name : " + n.name);
        System.out.println("Regestration number : " + n.RegNum);
        System.out.println("Marks : " + n.Marks);
    }
}