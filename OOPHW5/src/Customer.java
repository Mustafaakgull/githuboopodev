public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender){
        this.id=id;
        this.name=name;
        if(gender=='f' || gender=='m'){
            this.gender=gender;
        }
        else{
            System.out.println("Invalid gender type.");
        }
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }

    public String toString(){
        return name + "(" + id + ")";
    }

}
