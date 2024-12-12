import java.util.*;
interface outm
{
    void outm();
    interface in 
    {
        void innm();
    }
}
class Main implements outm
{
    public void innm() 
    {
        System.out.println("Hlo i'm Mahamood");
    }
    public static void main(String args[]) 
    {
    Main h = new Main();
    h.innm();
    }
}