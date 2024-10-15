package polymorphism;
public class Polymorphism {
    public void render(){
        System.out.println("Rendering polygon...");
    }
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.render();
        Circle c1 = new Circle();
        c1.render();
    }
}
class Square extends Polymorphism{
    @Override
    public void render() {
        System.out.println("Rendering square...");
    }
}
class Circle extends Polymorphism{
    @Override
    public void render() {
        System.out.println("Rendering circle...");
    }
}
