import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class AppointmentServiceTest {

    @Test
    public void testAddAppointment() throws Exception {
        AppointmentService service = new AppointmentService();
        String appointmentId = "12345";
        Date appointmentDate = new Date();
        String description = "Test appointment";
        Appointment appointment = new Appointment(appointmentId, appointmentDate, description);
        service.addAppointment(appointment);
        assertTrue(service.getAppointments().contains(appointment));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAppointment() throws Exception {
        AppointmentService service = new AppointmentService();
        service.addAppointment(null);
    }

    @Test(expected = Exception.class)
    public void testAddDuplicateAppointmentId() throws Exception {
        AppointmentService service = new AppointmentService();
        String appointmentId = "12345";
        Date appointmentDate = new Date();
        String description = "Test appointment";
        Appointment appointment1 = new Appointment(appointmentId, appointmentDate, description);
        Appointment appointment2 = new Appointment(appointmentId, appointmentDate, description);
        service.addAppointment(appointment1);
        service.addAppointment(appointment2);
    }

    // Additional test cases can be added for the other requirements
}
