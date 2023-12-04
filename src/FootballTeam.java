public class FootballTeam {

    public String name;

    public String Country;

    public String[] players = new String[11];

    public int ranking;

    public FootballTeam(String name, String Country, String[] players, int ranking){
        this.name = name;
        this.Country = Country;
        this.players = players;
        this.ranking = ranking;
    }

    public void changeRanking(int newRanking){
        this.ranking = newRanking;
    }

    public void replacePlayer(String oldPlayer, String newPlayer){
        for (int i = 0; i < this.players.length; i++){
            if (this.players[i] == oldPlayer){
                this.players[i] = newPlayer;
            }
        }
    }

}
