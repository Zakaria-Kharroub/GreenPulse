import java.util.HashMap;

public class UserManagement {
    private final HashMap<Integer,User> users=new HashMap<>();

    public void addUser(User user){
        users.put(user.getId(),user);
        System.out.println(user.getName() + " ajouter avec succes");
    }
    public boolean userExist(int id){
        return users.containsKey(id);
    }

    public void afficherUserById(int id){
        User user =users.get(id);
        if (user != null){
            System.out.println("--------------------------------------------");
            System.out.println("id :" +user.getId() + ", name :"+user.getName() + " ,age : "+user.getAge());
            System.out.println("--------------------------------------------");
        }else {
            System.out.println("utilisateur non trouver"+ id);
        }
    }

    public void afficherDetailUseConsomation(int id) {
        User user = users.get(id);
        if (user != null) {
            System.out.println("--------------------------------------------");
            System.out.println("id: " + user.getId() + ", name: " + user.getName() + ", age: " + user.getAge());
            System.out.println("--------------------------------------------");

            System.out.println("et ses consomations:");
            for (Consomation consomation : user.getConsomations()) {
                System.out.println(consomation.getDateDebut() + " => " +consomation.getDateFin() +" quantite : " + consomation.getQuantite());
                System.out.println("--------------------------------------------");
            }
        } else {
            System.out.println("utilisateur not found");
        }
    }

    public void afficherUser(){
        if (users.isEmpty()){
            System.out.println("aucun user");
        }else {
            for(User user:users.values()){
                System.out.println("--------------------------------------------");
                System.out.println("id :" +user.getId() + ", name :"+user.getName() + " ,age : "+user.getAge());
            }
        }
    }

    public void updateUser(int id,String nouvName,int nouvAge){
        User user = users.get(id);
        if(user != null){
            user.setName(nouvName);
            user.setAge(nouvAge);
            System.out.println("user update avec succes"+user.getName());
        }else {
            System.out.println("aucune utilisateur touver"+id);
        }
    }
    public void deleteUser(int id){
        if(users.containsKey(id)){
            users.remove(id);
            System.out.println("utilisateur delete avec succes ");
        }else{
            System.out.println("aucun user trouver");
        }
    }



    public void addConsomationToUser(int userId,Consomation consomation){
        User user = users.get(userId);
                if(user != null){
                    user.addConsomation(consomation);
                    System.out.println("consomation ajouter avec sucess");
                }else {
                    System.out.println("utilisateur not found");
                }
    }


    

}
