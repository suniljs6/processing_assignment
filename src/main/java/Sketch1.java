import processing.core.PApplet;

public class Sketch1 extends PApplet {

    public static void main(String[] args){
        PApplet.main("Sketch1", args);
    }

    @Override
    public void settings() {
        size(800,800);
    }

    @Override
    public void draw() {

        //face
        rect(280,100,250,200);

        //left eye
        ellipse(340,150,30,30);
        //pupil
        ellipse(341,150,10,10);

        //right eye
        ellipse(480,150,30,30);
        //pupil
        ellipse(481,150,10,10);

        //nose
        ellipse(410,200,20,50);

        //mouth
        ellipse(410,270,150,20);

        //teeth
        rect(365,265,2,5);
        rect(370,270,2,5);
        rect(375,265,2,5);
        rect(380,270,2,5);
        rect(385,265,2,5);
        rect(390,270,2,5);
        rect(395,265,2,5);
        rect(400,270,2,5);
        rect(405,265,2,5);
        rect(410,270,2,5);
        rect(415,265,2,5);
        rect(420,270,2,5);
        rect(425,265,2,5);
        rect(430,270,2,5);
        rect(435,265,2,5);
        rect(440,270,2,5);
        rect(445,265,2,5);
        rect(450,270,2,5);
        rect(455,265,2,5);
        rect(460,270,2,5);

        //body
        rect(330,300,150,200);

        //hands

            //left-hand
            line(330,310,250,370);
            //left-wrist
            ellipse(250,370,10,10);

            //right-hand
            line(480,310,560,370);
            //right-wrist
            ellipse(560,370,10,10);

        //legs
        rect(350,500,10,60);
        rect(450,500,10,60);

        //foot
        ellipse(350,560,40,5);
        ellipse(450,560,40,5);

    }
}
