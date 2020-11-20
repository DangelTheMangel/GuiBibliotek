import processing.core.PApplet;

public class main extends PApplet {

    public static void main(String[] args) { PApplet.main("main"); }

    Taering taering = new Taering(this);
    Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!",this);
    Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!",this);

    Button buttonTerning69 = new Button(340, 70, 150, 50, "Slå med 69s terning!",this);
    Button buttonTerning420 = new Button(10, 70, 150, 50, "Slå med 420s terning!",this);
    int sum;
    int terningeKast = 0;

    @Override
    public void settings() {
        size(500,300);
    }

    @Override
    public void setup() {
        buttonTerning6.addAction(new Action() {
                                     public void execute() {
                                         sum = taering.terningenRoll(1,6,sum);
                                         terningeKast= taering.getAntal();
                                     }
                                 }
        );

        buttonTerning10.addAction(new Action() {
                                      public void execute() {
                                          sum = taering.terningenRoll(1,11,sum);
                                          terningeKast = taering.getAntal();
                                      }
                                  }
        );

        buttonTerning69.addAction(new Action() {
                                      public void execute() {
                                          sum = taering.terningenRoll(1,69,sum);
                                          terningeKast= taering.getAntal();
                                      }
                                  }
        );

        buttonTerning420.addAction(new Action() {
                                       public void execute() {
                                           sum = taering.terningenRoll(1,420,sum);
                                           terningeKast= taering.getAntal();

                                       }
                                   }
        );



    }

    @Override
    public void draw() {
        clear();
        buttonTerning6.display();
        buttonTerning10.display();
        buttonTerning69.display();
        buttonTerning420.display();
        fill(255);
        textAlign(CENTER);
        text("Du har kastet " + terningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);

    }

    @Override
    public void mousePressed() {

        buttonTerning6.click(mouseX,mouseY);
        buttonTerning10.click(mouseX,mouseY);
        buttonTerning420.click(mouseX,mouseY);
        buttonTerning69.click(mouseX,mouseY);


    }
}
