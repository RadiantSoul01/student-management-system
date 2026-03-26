class StudentManager{
    InputHandler get = new InputHandler();

    public StudentNode add(){
        //adding new student info
        String name = get.getName();
        int marks = get.getMark();
        int regNum = get.getRegNum();

        StudentNode curr = new StudentNode(name,regNum,marks);
        return curr;
        
    }

    public void find(StudentNode head){
        //finding student info
        if(head == null){
            System.out.println("No Student avaliable");
            return;
        }
        int reg = get.getRegNum();
        StudentNode temp = head;
        while(temp != null){
            if(reg == temp.RegNum){
                get.getData(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found!!");
    }

    public void getAll(StudentNode head){
        //displaying student info
        if(head == null){
            System.out.println("No Student avaliable");
            return;
        }
        System.out.printf("%-10s | %-20s | %-5s%n", "Name", "Registration Number", "Marks");
        StudentNode temp = head;
        while (temp != null) {
            System.out.printf("%-10s | %-20d | %-5d\n", temp.name, temp.RegNum, temp.Marks);
            temp = temp.next;
        }
    }

    public StudentNode remove(StudentNode head){
        //deleting student info
        if(head == null){
            System.out.println("No Student Available");
            return head;
        }
    
        int reg = get.getRegNum();
    
        // Case 1: head needs to be deleted
        if(head.RegNum == reg){
            System.out.println("Student info Deleted successfully");
            return head.next;
        }
    
        StudentNode prev = head;
        StudentNode curr = head.next;
    
        while(curr != null){
            if(curr.RegNum == reg){
                prev.next = curr.next;
                System.out.println("Student info Deleted successfully");
                return head;
            }
            prev = curr;
            curr = curr.next;
        }
    
        System.out.println("Student Not Found!!");
        return head;
    }
}
