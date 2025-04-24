package strings;

public class StringBuilderAndStringBuffer {
	public static void main(String[] args) {
		StringBuffer sbff= new StringBuffer("hello");
		StringBuilder sbd= new StringBuilder("good");
		// mthodes of StringBuilderAndStringBuffer
		//1 append(String) | Adds string to the end
        sbff.append(" World");
        System.out.println("After append: " + sbff); // Hello World

        sbd.append(" Morning");
        System.out.println("After append: " + sbd); // Good Morning
        
        //insert(int, str) | Inserts string at given index
        sbff.insert(6, "Java ");
        System.out.println("After insert: " + sbff); // Hello Java World
        
        sbd.insert(5, "Java ");
        System.out.println("After insert: " + sbd); // Good Java Morning
        
        //replace(int, int, str) | Replaces characters between index

        sbff.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + sbff); // Hello Beautiful World
        
        sbd.replace(5, 9, "Beautiful");
        System.out.println("After replace: " + sbd); // Good Beautiful Morning
        
        //delete(int, int) | Deletes characters between index
        
        sbff.delete(5, 15);
        System.out.println("After delete: " + sbff); // Hello World
        
        sbd.delete(4, 14);
        System.out.println("After delete: " + sbd); // Good Morning
        
        //reverse() | Reverses the content

        sbff.reverse();
        System.out.println("After reverse: " + sbff); // dlroW olleH
		
        sbd.reverse();
        System.out.println("After reverse: " + sbd); // gninroM dooG
		
		
		//length() | Returns length of string
        System.out.println("Length of the String is "+sbff.length());
        
        System.out.println("Length of the String is "+sbd.length());
        
		//capacity() | Returns current capacity of the buffer
        System.out.println("Capacity of buffer is "+sbff.capacity());
        
        
		//ensureCapacity(int) | Ensures minimum capacity
        sbff.ensureCapacity(50); // increases internal buffer if it's less than 50
        System.out.println("Capacity of buffer is "+sbff.capacity());
        
        
		// charAt(int) | Returns character at specific index
        System.out.println("Charector at given index is"+sbff.charAt(2));
        System.out.println("Charector at given index is"+sbd.charAt(2));
		 

       

      

     

       
	}

}
