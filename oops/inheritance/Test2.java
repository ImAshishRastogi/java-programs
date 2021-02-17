class Dada
{
    int x = 70;
}
class Base extends Dada
{
    int x = 50;
}
class Test2 extends Base
{
    int y =20;
    void show()
    {
        System.out.println(y);
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(((Dada)this).x);
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.show();
    }
}