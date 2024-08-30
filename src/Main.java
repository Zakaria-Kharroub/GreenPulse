import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        UserManagement userManagement =new UserManagement();
//        LocalDate thdate = LocalDate.now();
//        System.out.println( "date now :" + thdate);

        Scanner inp = new Scanner(System.in);

        System.out.println("bienvenue dans notre application");
        System.out.println("----------------------------------");

        int choix;
        do {
            System.out.println("1 - ajouter utilisateur");
            System.out.println("2 - afficher un utilisateur");
            System.out.println("3 - afficher tous les utilisateurs");
            System.out.println("4 - update utilisateur");
            System.out.println("5 - supprimer utilisateur");
            System.out.println("6 - exit");

            choix = inp.nextInt();
            inp.nextLine();

            switch (choix){
                case 1:
                    System.out.println("entrez id user");
                    int id = inp.nextInt();
                    inp.nextLine();

                    System.out.println("entrez name user");
                    String name = inp.nextLine();

                    System.out.println("entrez age age");
                    int age =inp.nextInt();
                    inp.nextLine();
                    User nouvUser = new User(id,name,age);
                    userManagement.addUser(nouvUser);

                    break;

                case 2:
                    System.out.println("entrez id d'utilisateur vous voulez afficher");
                    int idAffiche = inp.nextInt();
                    inp.nextLine();
                    userManagement.afficherUserById(idAffiche);
                    break;
                case 3:
                    System.out.println("voici la listes des users");
                    userManagement.afficherUser();
                    System.out.println("--------------------------------------------");
                    break;
                case 4:

                    System.out.println("enterez id user vous voulez modifier");
                    int idUpdate = inp.nextInt();
                    inp.nextLine();

                    System.out.println("entrez nouveau name");
                    String nouvName=inp.nextLine();

                    System.out.println("entrez nouv age");
                    int nouvAge = inp.nextInt();
                    inp.nextLine();
                    userManagement.updateUser(idUpdate,nouvName,nouvAge);




                    break;
                case 5:
                    System.out.println("entrez id user vous voulez supprimer");
                    int idDelete = inp.nextInt();
                    inp.nextLine();
                    break;
                case 6:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("choix invalid");
                    break;



            }
        }while (choix !=6);


    }
}