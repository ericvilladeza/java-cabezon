package a;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class A {
	public static void main(String[] args) {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println(ahora.format(formateador));
		
		System.out.println(ahora.);
	}
}