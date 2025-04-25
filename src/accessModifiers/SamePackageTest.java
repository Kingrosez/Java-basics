package accessModifiers;

public class SamePackageTest {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // System.out.println(obj.privateVar); ❌ Not accessible
        System.out.println(obj.defaultVar);   // ✅
        System.out.println(obj.protectedVar); // ✅
        System.out.println(obj.publicVar);    // ✅
    }
}
