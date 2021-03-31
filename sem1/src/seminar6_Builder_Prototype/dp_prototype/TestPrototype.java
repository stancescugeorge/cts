package seminar6_Builder_Prototype.dp_prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Model3DCaracter superman1=new Model3DCaracter("albastru");
		//Model3DCaracter superman2=new Model3DCaracter("albastru"); //nu vreau sa mai folosesc constructorul din cauza consumului de timp
		
		Model3DCaracter superman2 = (Model3DCaracter) superman1.clone();
	}

}
