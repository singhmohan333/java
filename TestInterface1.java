interface Drawable{
void draw();
}

class Rectangle implements Drawable{
public void draw(){System.out.println("drwing rectangle");}

}


class Cirlce implements Drawable{
public void draw(){System.out.println("drawing circle");}


class TestInterface1{
public static void main(String args[]){
Drawable d = new Cirlce();
d.draw();
}
}