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
        return;
    }

    public void getAll(StudentNode head){
        System.out.println("    Name    :   registration Number    :   Marks   ");
        StudentNode temp = head;
        while(temp != null){
            System.out.println("    " +  temp.name + "            " + temp.RegNum + "                    " + temp.Marks);
            temp = temp.next;
        }
    }
}
