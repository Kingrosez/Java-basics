/*

 */

package accessModifiers;

public class AccessModifiers {

    private String privateVar = "Private Variable";
    String defaultVar = "Default (Package-Private) Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    public void displayAll() {
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.displayAll();
    }
}
