package ra;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ra.repositories.IScheduleRepository;

import java.time.LocalDate;

@SpringBootTest
class SecurityJwtApplicationTests {
	@Autowired
	private IScheduleRepository scheduleRepository;

	@Test
	void contextLoads() {
		scheduleRepository.getStartTimeByMovie_IdAndBranch_IdAndStartDate(7L,1L, LocalDate.parse("2023-04-06"))
				.stream().forEach(System.out::println);
	}

}
