
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_User {


	
	@Before
	public void testCreation() {
		
		
	}
	
	
	//on vérifie que chaque user id est unique
	@Test
	public final void testCreationId() {
		
		User usr1= new User("dupont","patrick");
		User usr2= new User("dup","patrick");
		User usr3= new User("dup","patrick");
		System.out.println("utilisateur crée" +"id " + usr1.getId());
		System.out.println("utilisateur crée" +"id " + usr2.getId());
		System.out.println("utilisateur crée" +"id " + usr3.getId());
		assertNotEquals(usr1.getId(), usr2.getId());
	}
	
	//les paramètres ne doivent pas être nuls
	@Test
	public final void testCreationNomPrenom() {
		User usr1= new User("","");
		
		
		
		
assertFalse("param invalides", usr1.getNom()=="" && usr1.getPrenom()=="");

	}
	@Test
	public final void testCreationNom() {
		User usr2= new User("","aaaa");
assertFalse("param invalides", usr2.getNom()=="");

	}
	@Test
	public final void testCreationPrenom() {
		User usr3= new User("aaaa","");
assertFalse("param invalides", usr3.getPrenom()=="");

	}
	@Test
	public final void testCreationReussiePrenomNom() {
		
		User usr4= new User("aaaa","aaaa");
assertTrue("param invalides", usr4.getPrenom()!="" && usr4.getPrenom() !="");

	}
	
	
	
	
	
	
}
