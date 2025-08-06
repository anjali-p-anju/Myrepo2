package stringpack;

public class Builder_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("hi");
System.out.println(sb);
StringBuilder sbs=new StringBuilder("hello");
System.out.println(sbs);
//insert-to add/insert new element to string(index based)
sb.insert(2, "world");
System.out.println(sb);
//append-add the new string at end/last
sb.append("good");
System.out.println(sb);
//replace-to replace a string based on index
sb.replace(0, 1, "M");
System.out.println(sb);
//reverse-to reverse a string
sb.reverse();
System.out.println(sb);
//delete-to delete a string based on index
sb.delete(0, 4);
System.out.println(sb);
	}

}
