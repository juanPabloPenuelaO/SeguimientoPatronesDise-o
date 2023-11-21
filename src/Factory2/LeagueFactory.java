package Factory2;

public class LeagueFactory {
    public static League getLeague(String type){
        if (type.equalsIgnoreCase("A")){
            return new LeagueA();
        }else if (type.equalsIgnoreCase("B")){
            return new LeagueB();
        }
        return null;
    }
}
