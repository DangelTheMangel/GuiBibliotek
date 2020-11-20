import processing.core.PApplet;

import java.util.ArrayList;

public class GuiHandler {
    PApplet p;
    ArrayList<Button> btnList = new ArrayList<Button>();

    GuiHandler(PApplet p){
        this.p = p;
    }

    void creatBtn(float x, float y,float w,float h,String text,Action a ){
        btnList.add(new Button(x, y, w, h, text,p));
        btnList.get(btnList.size()-1).addAction(a);
    }



    void displayAllBtn(){
        for(int i=0;  i<btnList.size();++i){
            btnList.get(i).display();
        }
    }

    void clickAllBtn(float mx, float my){
        for(int i=0;  i<btnList.size();++i){
            btnList.get(i).click(mx,my);
        }
    }

}
