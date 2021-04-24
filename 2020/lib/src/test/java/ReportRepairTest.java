import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReportRepairTest {
	@Test void testMainMethod() {

		assertEquals(514579, ReportRepair.partOne(new int[]{1721, 979, 366, 299, 675, 1456}));
		assertEquals(241861950, ReportRepair.partTwo(new int[]{1721, 979, 366, 299, 675, 1456}));

    }
}
