package a;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class A {
	public static void main(String[] args) {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println(ahora.format(formateador));
		
		System.out.println("GMT" + ZonedDateTime.now(ZoneId.of("GMT0")).format(formateador));
		System.out.println("india" + ZonedDateTime.now(ZoneId.of("Asis/Kolkata")).format(formateador));
		System.out.println("UTC" + ZonedDateTime.now(ZoneId.of("UTC")).format(formateador));
		
		System.out.println();
	}
}