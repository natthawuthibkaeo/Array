import java.util.*;
public class ArrayOperation {

	public static void main(String[] args) {
		ArrayList<Object>lst= new ArrayList();
		lst.add(0,2);
		lst.add(1,3);
		lst.add(2,6);
		lst.add(3,5);
		lst.add(4,10);
		for(int i =0; i<lst.size();i++){
			if((Integer)lst.get(i)%2==0){
				lst.remove(i);
			}
		}
		System.out.println(lst.toString());

	}

}
