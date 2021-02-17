class Base
{
    private int x = 10;
    void show()
    {
        System.out.println(x);
    }
}
class Test1 extends Base
{
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show();
    }
}