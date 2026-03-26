import java.util.Scanner;

class StudentApp{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StudentManager id = new StudentManager();
        int n = 0;
        StudentNode head = null;
        StudentNode tail = null;
        int size = 0;


        System.out.println("Welcome to the Student Data management system");

        do{
            System.out.println("1 : for adding student data");
            System.out.println("2: for finding student's data");
            System.out.println("3: for all the student's data");
            System.out.println("4: for deleting student's record");
            System.out.println("8: for exit");


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
