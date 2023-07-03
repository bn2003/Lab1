
    import java.util.Scanner;
    public class Lab1 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            Movie m1 = new Movie();
            while (true) {
                System.out.println("Enter the name of a movie ");
                String title = scn.nextLine();
                m1.setTitle(title);
                System.out.println("Enter the rating of the movie");
                String rating = scn.nextLine();
                m1.setRating(rating);
                System.out.println("Enter the number of tickets sold for this movie");
                int soldTickets = Integer.parseInt(scn.nextLine());
                m1.setSoldTickets(soldTickets);
                System.out.println(m1.toString());
                System.out.println("Do you want to enter another? (y or n)");
                String option =scn.nextLine();
                if(option.equalsIgnoreCase("y"))
                  continue;
                else
                 break;
                }
                System.out.println("Goodbye");
                }

            }



