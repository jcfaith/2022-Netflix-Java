import java.util.Arrays;
import java.util.List;

public class Movie {

    String actor1 = "John Smith";
    String actor2 = "Adam Smith";
    String actor3 = "Bob Smith";
    String crew1 = "David Crew";
    String crew2 = "Sarah Crew";
    String crew3 = "Daniel Crew";

    int actor1pay = 60000;
    int actor2pay = 60000;
    int actor3pay = 60000;
    int crew1pay = 50000;
    int crew2pay = 50000;
    int crew3pay = 50000;

    int actor1earned = 20000;
    int actor1earned = 20000;
    int actor2earned = 20000;
    int crew1earned = 10000;
    int crew2earned = 10000;
    int crew3earned = 10000;

    String genre = "Horror";
    String director = "Steven Spielberg";

    int budget = 10000000;
    int moneySpent = 500000;


    public static void main(String[] args) {
        List<String> actorList = Arrays.asList("John Smith", "Adam Smith", "Bob Smith");
        List<String> crewList = Arrays.asList("David Crew", "Sarah Crew", "Daniel Crew");

        Profit = Movie.budget - Movie.moneySpent;
        system.out.println(Profit);

    }

}
