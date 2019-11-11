//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.junit.Test;
//
//public class hillEncryptTest {
//
//	@Test
//	public void equivalenceTest() {
//		String s = hillEncrypt.encrypt("hello my name is Juan");
//		String h = hillEncrypt.encrypt("hello my name is Juan");
//		assertThat(s,not(equalTo(h)));
//	}
//	@Test
//	public void specialCharTest(){
//		String s = hillEncrypt.encrypt("hpe developer community&*%*&^*@*");
//		String h = "hpe developer community&*%*&^*@*";
//		assertThat(s,not(equalTo(h)));
//	}
//	@Test
//	public void numTest(){
//		String s = hillEncrypt.encrypt("hello my9039813jname");
//		String h = "hello my9039813jname";
//		assertThat(s, not(equalTo(h)));
//	}
//	@Test
//	public void fillCharTest(){
//		String s = hillEncrypt.encrypt("jeff is taking it lightly");
//		String h = "jeff is taking it lightly";
//		Integer sl = s.length();
//		Integer hl = h.length();
//		assertThat(sl,not(equalTo(hl)));
//	}
//
//}
