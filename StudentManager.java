class StudentManager{
    InputHandler get = new InputHandler();

    public StudentNode add(){

        String name = get.getName();
        int marks = get.getMark();
        int regNum = get.getRegNum();

        StudentNode curr = new StudentNode(name,regNum,marks);
        return curr;
        
    }

    public void find(StudentNode head){

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
        if(head == null){
            System.out.println("No Student avaliable");
            return;
        }
        System.out.println("Name | Registration Number | Marks");
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " | " + temp.RegNum + " | " + temp.Marks);
            temp = temp.next;
        }
    }
}
