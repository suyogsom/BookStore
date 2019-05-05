package com.bookstore.app.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.bookstore.app.controllers.TextBooksController;
import com.bookstore.app.models.TextBooks;
import com.bookstore.app.services.TextBooksService;


@RunWith(MockitoJUnitRunner.class)
public class TextBooksControllerTest {
	
    @InjectMocks
    TextBooksController textBooksController;
     
    @Mock
    TextBooksService textBooksService;
 
    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @Test
    public void getAllTextBooksTest()
    {
        List<TextBooks> list = new ArrayList<TextBooks>();
        TextBooks book1 = new TextBooks("101","CIS","java","thid is java","2001",45.3);
        TextBooks book2 = new TextBooks("102","CIVIL","java EE","thid is java EE" ,"2002",4523.3);
        TextBooks book3 = new TextBooks("103","MCIS","java SE","thid is java SE","2003",452334.3);
         
        list.add(book1);
        list.add(book2);
        list.add(book3);
         
        when(textBooksService.getAllTextbooks()).thenReturn(list);
         
        List<TextBooks> empList = textBooksController.getAllTextbooks();
         
        assertEquals(3, empList.size());

        for(int i=0;i<empList.size();i++) {
        	System.out.print("\nid:" + empList.get(i).getId());
        	System.out.print("\t\tname:" + empList.get(i).getName());
        	System.out.print("\t\tdepartment:" + empList.get(i).getDepartment());
        	System.out.print("\t\tdescription:" + empList.get(i).getDescription());
        }
    }
    
	@Test
	public void testRandom() {
		System.out.println("Basedir : " + System.getProperty("user.dir"));
		
		Properties properties = System.getProperties();
		properties.forEach((i,j) -> System.out.println("Property " + i + " value " + j));
		
		System.out.println("user home : " + System.getProperty("user.home"));
	
	}
	     
	/*
	 * @Test public void getEmployeeByIdTest() {
	 * when(dao.getEmployeeById(1)).thenReturn(new
	 * EmployeeVO(1,"Lokesh","Gupta","user@email.com"));
	 * 
	 * EmployeeVO emp = manager.getEmployeeById(1);
	 * 
	 * assertEquals("Lokesh", emp.getFirstName()); assertEquals("Gupta",
	 * emp.getLastName()); assertEquals("user@email.com", emp.getEmail()); }
	 * 
	 * @Test public void createEmployeeTest() { EmployeeVO emp = new
	 * EmployeeVO(1,"Lokesh","Gupta","user@email.com");
	 * 
	 * manager.addEmployee(emp);
	 * 
	 * verify(dao, times(1)).addEmployee(emp); }
	 */
}