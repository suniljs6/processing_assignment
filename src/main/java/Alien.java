import processing.core.PApplet;

class Alien {

    private PApplet sketch;

    public Alien(PApplet sketch){
        this.sketch = sketch;
    }

    public void draw(String choice,int [] x1,int [] y1,int [] x2,int [] y2) {

        if(choice == "face" || choice == "body") {
            sketch.rect(x1[0],y1[0],x2[0],y2[0]);
        } else if( choice == "eye" || choice == "pupil"){
            sketch.ellipse(x1[0],y1[0],x2[0],y2[0]);
            sketch.ellipse(x1[1],y1[1],x2[1],y2[1]);
        } else if( choice == "nose" || choice == "mouth" ) {
            sketch.ellipse(x1[0],y1[0],x2[0],y2[0]);
        } else if( choice == "teeth" ) {
            int flag = 0;
            int start = x1[0];
            while(start<=x1[1]){
                sketch.rect(start,y1[flag],x2[0],y2[0]);
                flag = 1- flag;
                start += 5;
            }
        } else if( choice == "hands" ) {
            sketch.line(x1[0],y1[0],x2[0],y2[0]);
            //left-wrist
            sketch.ellipse(x1[1],y1[1],x2[1],y2[1]);

            //right-hand
            sketch.line(x1[2],y1[0],x2[2],y2[0]);
            //right-wrist
            sketch.ellipse(x1[3],y1[1],x2[3],y2[1]);
        } else if( choice == "legs") {
            sketch.rect(x1[0],y1[0],x2[0],y2[0]);
            sketch.rect(x1[1],y1[0],x2[0],y2[0]);
            sketch.ellipse(x1[0],y1[1],x2[1],y2[1]);
            sketch.ellipse(x1[1],y1[1],x2[1],y2[1]);
        }



    }

}