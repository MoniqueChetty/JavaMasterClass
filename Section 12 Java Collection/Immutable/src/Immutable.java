final class A {
    private String s;

    public A(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }

    ;

    public void setA(String a) {
        this.s += a;
    }

    ;
}

public final class Immutable {
    private final A a;

    public Immutable(A a) {
        this.a = a;
    }

    public String toString() {
        return a.toString();
    }

    ;

    public static void main(String[] args) {

        A a = new A("Bye");
        Immutable im = new Immutable(a);
        System.out.print(im);

        a.setA(" bye");
        System.out.print(im);

        System.out.println(" ");

        String myString = "good";
        char[] charArray = {'g','o','o','d'};
        String newString="";

        for ( char ch:charArray){
            newString = newString+ch;
        }
        System.out.println(newString +" "+ myString);
        System.out.println((newString==myString) +" "+ (newString.equals(myString)));
    }

}
