import java.util.Scanner;
class InputHandler{
    Scanner sc = new Scanner(System.in);

    public int getMark(){
        System.out.print("Enter the marks:");
        return Integer.parseInt(sc.nextLine());
    }

    public String getName(){
        System.out.print("Enter name:");
        return sc.nextLine();
    }
    
    public int getRegNum(){
        System.out.print("Enter the reg number:");
        return Integer.parseInt(sc.nextLine());
    }

    public void getData(StudentNode n){
        System.out.println("Name : " + n.name);
        System.out.println("Regestration number : " + n.RegNum);
        System.out.println("Marks : " + n.Marks);
    }
}
