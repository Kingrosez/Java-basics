package other;

import accessModifiers.AccessModifiers;

public class DifferentPackageTest extends AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // System.out.println(obj.privateVar);   ❌
        // System.out.println(obj.defaultVar);   ❌
        // System.out.println(obj.protectedVar); ❌ (not accessible via object)
        System.out.println(obj.publicVar);      // ✅

        // But accessible via inheritance
        DifferentPackageTest dpt = new DifferentPackageTest();
        System.out.println(dpt.protectedVar);   // ✅ (via subclass reference)
    }
}
