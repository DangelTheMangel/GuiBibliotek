import processing.core.PApplet;

public class main extends PApplet {

    public static void main(String[] args) { PApplet.main("main"); }
    Taering taering = new Taering(this);
    GuiHandler gh;
   // Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!",this);
   // Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!",this);

    //Button buttonTerning69 = new Button(340, 70, 150, 50, "Slå med 69s terning!",this);
    //Button buttonTerning420 = new Button(10, 70, 150, 50, "Slå med 420s terning!",this);
    int sum;
    int terningeKast = 0;

    @Override
    public void settings() {
        size(500,300);
    }

    @Override
    public void setup() {

        gh = new GuiHandler(this);

        Action a = (new Action() {
            public void execute() {
                sum = taering.terningenRoll(1,11,sum);
                terningeKast = taering.getAntal();
            }
        });

        gh.creatBtn(10, 10, 150, 50, "Slå med 6s terning!",a);

         a = (new Action() {
            public void execute() {
                sum = taering.terningenRoll(1,69,sum);
                terningeKast= taering.getAntal();
            }
        });
        gh.creatBtn(340, 70, 150, 50, "Slå med 69s terning!",a);

        a = (new Action() {
            public void execute() {
                sum = taering.terningenRoll(1,420,sum);
                terningeKast= taering.getAntal();
            }
        });

        gh.creatBtn(10, 70, 150, 50, "Slå med 420s terning!",a);
        a = (new Action() {
            public void execute() {
                sum = taering.terningenRoll(1,10,sum);
                terningeKast= taering.getAntal();
            }
        });
        gh.creatBtn(340, 10, 150, 50, "Slå med 10s terning!",a);


    }

    @Override
    public void draw() {
        clear();
        gh.displayAllBtn();
        fill(255);
        textAlign(CENTER);
        text("Du har kastet " + terningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);

    }

    @Override
    public void mousePressed() {

            gh.clickAllBtn(mouseX,mouseY);


    }
}
