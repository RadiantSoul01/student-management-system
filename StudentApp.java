import java.util.Scanner;

class StudentApp{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StudentManager id = new StudentManager();
        int n = 0;
        StudentNode head = null;
        StudentNode tail = null;
        int size = 0;


        System.out.println("\n===== Student Management System =====");

        do{
            System.out.println("1. Add Student");
            System.out.println("2. Find Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");


            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1://add

                    StudentNode currNode = id.add();

                    if(head == null){
                        head = currNode;
                        tail = currNode;
                    }else{
                        tail.next = currNode;
                        tail = tail.next;
                    }
                    break;

                case 2:
                    id.find(head);
                    break;
                
                case 3:
                    id.getAll(head);
                    break;
                case 4:
                    head = id.remove(head);
                    break;
                default:
                    System.out.println("please enter the correct choice!!");
                    break;
            }
        }while(n != 8);
    }
}
