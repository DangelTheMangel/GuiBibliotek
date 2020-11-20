import processing.core.PApplet;

public class Taering {
    int terningeKastThis;
    PApplet p;
    Taering(PApplet p){
        this.p = p;
    }

    int terningenRoll(int fra,int til, int sum){
        terningeKastThis = (int)p.random(fra, til+1);

        return  sum+terningeKastThis;
    }

    int getAntal(){
        return terningeKastThis;
    }
}
