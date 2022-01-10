import java.util.ArrayList;
import java.awt.Color;

public class Coarr {

	
	//ArrayList that'll contain the colors
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: snake , 1: food, 0:empty 
	SquarePanel square;
	public Coarr(int col){
		
		//Lets add the color to the arrayList
		C.add(Color.pink);//0
		C.add(Color.yellow);    //1
		C.add(Color.white);   //2
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
