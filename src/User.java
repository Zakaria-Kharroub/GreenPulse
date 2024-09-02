import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private  String name;
    private int age;
//    private final ArrayList<Consomation> consomations = new ArrayList<>();
    private List <Consomation> consomations;

    public User(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
        this.consomations=new ArrayList<>();
    }


    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void addConsomation(Consomation consomation) {
        this.consomations.add(consomation);
    }

    public List<Consomation> getConsomations() {
        return consomations;
    }


}
