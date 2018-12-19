package board.model.vo;

import java.util.Comparator;

public class DescBoardTitle implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof Board && o2 instanceof Board) {
			Board b1 = (Board)o1;
			Board b2 = (Board)o2;
			
			result = b1.getBoardTitle().compareTo(b2.getBoardTitle()) > 0 ? 1: (b1.getBoardTitle().compareTo(b2.getBoardTitle()) < 0? -1 : 0); 
			/*if(b1.getBoardTitle().compareTo(b2.getBoardTitle()) > 0) {
				result = 1; 
			}else if(b1.getBoardTitle().compareTo(b2.getBoardTitle()) < 0) {
				result = -1;
			}else if(b1.getBoardTitle().compareTo(b2.getBoardTitle()) == 0) {
				result = 0;
			}*/
		}
		return -result;
	}
}
