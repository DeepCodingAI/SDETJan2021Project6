package superkeyword;

public class Children extends Parent{

	public Children() {}
	
	public Children(String lastName) {
		super(lastName);
	}
	
	public void atheleticSkills() {
		super.physicalStructure();
		System.out.println(super.lastName + " Sports skills");
		
	}
}
