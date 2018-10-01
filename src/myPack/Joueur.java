package myPack;

public class Joueur {
    private int Score =0,TotalScore=0;
    private String name;

    public Joueur(){

    }

    public Joueur(String name){
        this.name=name;
    }
    De de = new De();
    public void play(){
      this.Score = de.lancer_de();
      TotalScore= Score+TotalScore;

    }
    public int Winner(Joueur tab[]){
        int max=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i].getTotalScore() > max){
                max = tab[i].getTotalScore();
            }
        }
        return max;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalScore() {
        return TotalScore;
    }

    public void setTotalScore(int totalScore) {
        TotalScore = totalScore;
    }
}
