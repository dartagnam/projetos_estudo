import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		LocalDate d04 = LocalDate.parse("2024-05-26");
		LocalDateTime d05 = LocalDateTime.parse("2024-05-26T12:50:05");
		Instant d06 = Instant.parse("2024-05-26T12:50:05Z");
		Instant d07 = Instant.parse("2024-05-26T12:50:05-03:00");

		LocalDate d08 = LocalDate.parse("26/05/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("26/05/2024 15:50", fmt2);

		LocalDate d10 = LocalDate.of(2024, 5, 26);
		LocalDateTime d11 = LocalDateTime.of(2024, 5, 26, 1, 30);

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		
		
	}

}
