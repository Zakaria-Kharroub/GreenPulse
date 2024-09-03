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
        int choix;
        do {
            System.out.println("+------------------------------------------+");
            System.out.println("|                   Menu                   |");
            System.out.println("+------------------------------------------+");
            System.out.println("| 1 - ajouter utilisateur                  |");
            System.out.println("| 2 - afficher un utilisateur              |");
            System.out.println("| 3 - afficher tous les utilisateurs       |");
            System.out.println("| 4 - update utilisateur                   |");
            System.out.println("| 5 - supprimer utilisateur                |");
            System.out.println("| 6 - ajouter consomation Carbon           |");
            System.out.println("| 7 - afficher detail user with Consomation|");
            System.out.println("| 8 - rapport consomation DAILY            |");
            System.out.println("| 9 - rapport consomation WEEKLY           |");
            System.out.println("| 10 - rapport consomation MONTLY          |");
            System.out.println("| 11 - exit                                |");
            System.out.println("+------------------------------------------+");


            choix = inp.nextInt();
            inp.nextLine();

            switch (choix){
                case 1:
                    System.out.println("entrez id user");
                    int id = inp.nextInt();
                    inp.nextLine();

                    if(userManagement.userExist(id)){
                        System.out.println("user de id " + id + " deja existe");
                        break;
                    }

                    System.out.println("entrez name user");
                    String name = inp.nextLine();

                    System.out.println("entrez age");
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
                    userManagement.deleteUser(idDelete);
                    break;

                case 6:
                    System.out.println("entrez id de user");
                    int userId = inp.nextInt();
                    inp.nextLine();

                    if (!userManagement.userExist(userId)) {
                        System.out.println("user de id " + userId + " existe pas");
                        break;
                    }

                    System.out.println("enter quantite de consomation");
                    int quantite = inp.nextInt();
                    inp.nextLine();

                    System.out.println("enter date debut (YYYY-MM-DD)");
                    LocalDate dateDebut = LocalDate.parse(inp.nextLine());

                    System.out.println("enter date fin (YYYY-MM-DD)");
                    LocalDate dateFin = LocalDate.parse(inp.nextLine());

                    Consomation consomation = new Consomation(quantite, dateDebut, dateFin);
                    userManagement.addConsomationToUser(userId, consomation);
                    break;

                case 7:
                    System.out.println("entrez id de user vous voulez afficher detail consomation : ");
                    int userDetailId = inp.nextInt();
                    inp.nextLine();
                    userManagement.afficherDetailUserConsomation(userDetailId);

                    break;


                    case 8:
                        System.out.println("id de user pour generer rapport de consomation daily : ");
                        int userIdRapD = inp.nextInt();
                        inp.nextLine();
                        userManagement.rapportConsomationDaily(userIdRapD);
                        break;
                case 9:
                    System.out.println("id de user pour generer rapport de consomation daily : ");
                    int userIdRapW = inp.nextInt();
                    inp.nextLine();

                    break;
                case 10:
                    System.out.println("id de user pour generer rapport deconsomation weekly : ");
                    int userIdRapM=inp.nextInt();
                    break;


                case 11:
                    System.out.println("exit");
                    break;

                default:
                    System.out.println("choix invalid");
                    break;
            }
        }while (choix !=11);


    }
}