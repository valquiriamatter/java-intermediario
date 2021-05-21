import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DatesJava8 {

	public static void main(String[] args) {

		// data dd MM yyyy
		LocalDate agora = LocalDate.now(); //pegar a data atual
		System.out.println(agora);

		System.out.println(LocalDate.of(2019, 2, 1)); //setar uma data
		System.out.println(LocalDate.parse("1988-07-09"));//transformando uma String em LocalDate

		System.out.println(agora.plusDays(30)); //aumentando 30 dias

		System.out.println(agora.minus(1, ChronoUnit.MONTHS)); //voltanto 1 mês

		System.out.println(agora.getDayOfWeek()); //dia da semana
		System.out.println(agora.getDayOfMonth()); // dia do mês
		System.out.println(agora.getDayOfYear()); //dia do ano

		System.out.println(LocalDate.parse("2021-05-21").isLeapYear()); // é ano bisexto?

		// hora formato ISO
		LocalTime hAgora = LocalTime.now();//pegando o horário local
		System.out.println(hAgora);

		System.out.println(LocalTime.of(20, 18)); //setando uma hora
		System.out.println(LocalTime.parse("20:18")); //convertendo uma String em hora

		System.out.println(hAgora.plusMinutes(50)); //aumentando 50 minutos
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES)); //diminuindo 40 minutos

		System.out.println(hAgora.getHour()); //pegando só a hora

		// data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);

		//setando uma data completa
		System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
		System.out.println(LocalDateTime.parse("2019-02-16T20:25:10")); //convertendo uma String em data completa
		System.out.println(agoraCompleto.plusYears(20)); //aumentando 20 anos

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso); //fuso

		Set<String> fusos = ZoneId.getAvailableZoneIds(); //pegando os fusos
//		for (String f : fusos) {
//			System.out.println(f);
//		}

		ZoneId sp = ZoneId.of("America/Sao_Paulo"); //zona horario
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp); //zona horario com fuso
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]")); //convertendo

		ZoneOffset offset = ZoneOffset.of("+02:00"); //+n horas
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset); //agora
		System.out.println(offsetdt);

		Date date = new Date();
		Calendar c = Calendar.getInstance();

		//convertendo para api mais antiga
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));

	}
}