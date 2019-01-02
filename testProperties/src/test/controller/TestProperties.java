package test.controller;

import java.util.*;

import test.entity.Employee;
import java.io.*;

public class TestProperties {

	public static void main(String[] args) {
		TestProperties test = new TestProperties();
		Properties prop = new Properties();
		
		Employee[] em = test.readFile(prop);
		test.printConsole(prop);
		test.addEmpData(prop);
		test.printConsole(prop);
		test.saveEmpXML(em);	
	}
	public void addEmpData(Properties p) {
		p.setProperty("20160412", "홍길동,기획부,3800000,0.1");
		p.setProperty("20140811", "포로리,홍보부,1800000,0.2");
	}
	public Employee[] readFile(Properties p) {
		
		try {
			p.load(new FileReader("empData.txt"));		
			}catch(IOException e) {
			e.printStackTrace();
		}
		Set s = p.keySet();
		Iterator iter = s.iterator();
		Employee[] emar = new Employee[p.size()];
		for(int i = 0; iter.hasNext(); i++) {
			String key = (String)iter.next();
			String value = (String)p.get(key);
			String[] values = value.split(",");
			
			int eno = Integer.parseInt(key);
			int salary = Integer.parseInt(values[2]);
			double bonusPoint = Double.parseDouble(values[3]);
			
			emar[i] = new Employee(eno,values[0],values[1],salary,bonusPoint);
		}
		return emar;
	}
	public void printConsole(Properties p) {
		Set s = p.keySet();
		Iterator iter = s.iterator();
		while(iter.hasNext()) {
			String key = (String)iter.next();
			String value = (String)p.get(key);
			System.out.println(key + "=" + value);		
		}
	}
	public void saveEmpXML(Employee[] er) {
		Properties prop = new Properties();
		
		for(Employee em : er) {
			String value = em.toString() + (int)(em.getSalary() + (em.getSalary() * em.getBonusPoint()));
			prop.setProperty(String.valueOf(em.getEld()), value);		
		}
		
		try {
			prop.storeToXML(new FileOutputStream("empResult.xml"),"보너스포인트 적용된 연봉결과","UTF-8");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}
