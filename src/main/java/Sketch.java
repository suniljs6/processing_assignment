import processing.core.PApplet;

public class Sketch extends PApplet {

    public static final int width = 800;
    public static final int height = 800;
    public static void main(String[] args){
        PApplet.main("Sketch", args);
    }

    @Override
    public void settings() {
        size(this.width,this.height);
    }


    @Override
    public void draw() {

        Alien alien_sketch = new Alien(this);

        alien_sketch.draw("face",new int[]{280},new int[] {100},new int[] {250},new int[]{200});

        alien_sketch.draw("eye",new int[] {340, 480},new int[] {150, 150},new int[] {30, 30},new int[] {30, 30});

        alien_sketch.draw("pupil",new int[]{341, 481},new int[]{150, 150},new int[]{10, 10},new int[]{10, 10});

        alien_sketch.draw("nose",new int[]{410},new int[]{200},new int[]{20},new int[]{50});

        alien_sketch.draw("mouth",new int[]{410},new int[]{270},new int[]{150},new int[]{20});

        alien_sketch.draw("teeth",new int[] {365, 460},new int[] {265, 270},new int[] {2},new int[] {5});

        alien_sketch.draw("body",new int[] {330},new int[] {300},new int[] {150},new int[] {200});

        alien_sketch.draw("hands",new int[] {330, 250, 480, 560},new int[] {310,370},new int[] {250,10,560,10},new int[] {370,10});

        alien_sketch.draw("legs",new int[] {350,450},new int[] {500,560},new int[] {10,40},new int[] {60,5});

    }


}