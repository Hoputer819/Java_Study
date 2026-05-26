package day07_accessmodifier.Access;

public class AccessModifierMain {
    public static void main(String[] args){
        AccessModifier ae = new AccessModifier();
        ae.publicMethod();
        ae.protectedMethod();
        ae.defaultMethod();
        //ae.privateMethod();
    }
}
