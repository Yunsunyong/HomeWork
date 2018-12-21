package board.controller;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

import board.model.vo.*;

public class BoardManager {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardManager() {
		try(ObjectInputStream obj = new ObjectInputStream(new FileInputStream("board_list.dat"));){
			list = (ArrayList<Board>)obj.readObject();
		}catch(FileNotFoundException e) {
			System.out.println("board_list.dat 파일이 없습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeBoard() {
			
			Calendar cal = new GregorianCalendar();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			StringBuilder sb = new StringBuilder();
			System.out.println("새 게시글 쓰기 입니다.");
			System.out.print("글제목 :");
			String name = sc.nextLine();
			System.out.print("작성자 :");
			String author = sc.next();
					
			sc.nextLine();
			System.out.println("글 내용 입력하십시오.");
			String str = null;
			while(!(str = sc.nextLine()).equals("exit")) {
				sb.append(str);
			}			
			//Board b = new Board(list.size(),name,author,b,sb.toString(),0);
			//list.add(b);
	}
	public void dispalyAllList() {
		for(Board b : list) {
			System.out.println(b);
		}
	}
	public void displayBoard() {
		try {
			System.out.print("조회할 글번호 :");
			int index = sc.nextInt();
			System.out.println(list.get(index));
			list.get(index).setReadCount(list.get(index).getReadCount()+1);
						
		}catch(Exception e) {
			System.out.println("글번호를 잘못 입력하셨습니다.");
			System.out.println("0 에서" + (list.size() -1) +"까지 입력해주세요.");			
		}	
	}
	public void modifyTitle() {
		try {
			System.out.print("조회할 글번호 :");
			int index = sc.nextInt();
			System.out.println(list.get(index));
			System.out.print("변경할 제목 :");
			sc.nextLine();
			String name = sc.nextLine();
			list.get(index).setBoardTitle(name);
		}catch(Exception e) {
			System.out.println("글번호를 잘못 입력하셨습니다.");
			System.out.println("0 에서" + (list.size() -1) +"까지 입력해주세요.");			
		}
	}
	public void modifyContent() {
		try {
			StringBuilder sb = new StringBuilder();
			System.out.print("수정할 글번호 :");
			int index = sc.nextInt();
			System.out.println(list.get(index));
			System.out.println("변경할 내용 :");
			String str = null;
			sc.nextLine();
			while(!(str = sc.nextLine()).equals("exit")) {
				sb.append(str);
			}
			list.get(index).setBoardContent(sb.toString());
		}catch(Exception e) {
			System.out.println("글번호를 잘못 입력하셨습니다.");
			System.out.println("0 에서" + (list.size() -1) +"까지 입력해주세요.");			
		}
	}
	public void deleteBoard() {
		try {	
			System.out.print("삭제할 글번호 :");
			int index = sc.nextInt();
			System.out.println(list.get(index));
			System.out.print("정말로 삭제하시겠습니까?(y/n) : ");
			if(sc.next().toLowerCase().charAt(0) == 'y') {
				list.remove(index);
				}
			System.out.println(index + "번 글이 삭제 되었습니다.");
			}catch(Exception e) {
				System.out.println("글번호를 잘못 입력하셨습니다.");
				System.out.println("0 에서" + (list.size() -1) +"까지 입력해주세요.");			
			}
	}
	public void searchBoard() {
		System.out.print("검색할 제목 :");
		String name = sc.next();		
		for(int index = 0; index < list.size(); index++) {
			if(list.get(index).getBoardTitle().equals(name)) {
				System.out.println(list.get(index));
			}
		}		
	}
	public void saveListFile() {
		
		try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			for(int i = 0; i < list.size(); i++) {
				ob.writeObject(list);
			}
			System.out.println("board_list.dat에 성공적으로 저장되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void sortList(int item, boolean isDesc) {
		
		switch(item) {
			case 1 : if(isDesc == true) {
				list.sort(new DescBoardNo());
			}else if(isDesc == false) {
				list.sort(new AscBoardNo());
			}
			break;
			case 2 :if(isDesc == true) {
				list.sort(new DescBoardDate());
			}else if(isDesc == false) {
				list.sort(new AscBoardDate());
			}
			break;
			case 3 :if(isDesc == true) {
				list.sort(new DescBoardTitle());
			}else if(isDesc == false) {
				list.sort(new AscBoardTitle());
			}
			break;
		}
	}
}
