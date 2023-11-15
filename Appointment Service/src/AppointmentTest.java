import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class AppointmentTest {

    @Test
    public void testGetters() {
        String appointmentId = "12345";
        Date appointmentDate = new Date();
        String description = "Test appointment";
        Appointment appointment = new Appointment(appointmentId, appointmentDate, description);
        assertEquals(appointmentId, appointment.getAppointmentId());
        assertEquals(appointmentDate, appointment.getAppointmentDate());
        assertEquals(description, appointment.getDescription());
    }

}
