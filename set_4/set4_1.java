class parent{
public void parentprint(){
    System.out.println(" This is Parent Class ");
}
}
class child extends parent{
public void childprint(){
    System.out.println(" This is Child Class");
}
}
public class set4_1 {
public static void main(String[] args) {
    parent p=new parent();
    child c=new child();
    p.parentprint();
    c.parentprint();
}
}
