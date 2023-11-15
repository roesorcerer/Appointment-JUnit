/**
 * 
 */

/**
 * @author Rowan Stratton
 *
 */
import java.util.*;

public class AppointmentService {

    private final Map<String, Appointment> appointments;

    public AppointmentService() {
        appointments = new HashMap<>();
    }

    public void addAppointment(Appointment appointment) throws Exception {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null");
        }
        if (appointments.containsKey(appointment.getAppointmentId())) {
            throw new Exception("Appointment ID already exists");
        }
        if (appointment.getAppointmentDate().before(new Date())) {
            throw new Exception("Appointment Date cannot be in the past");
        }
        if (appointment.getDescription() == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (appointment.getDescription().length() > 50) {
            throw new IllegalArgumentException("Description cannot be longer than 50 characters");
        }
        appointments.put(appointment.getAppointmentId(), appointment);
    }

    public void deleteAppointment(String appointmentId) {
        appointments.remove(appointmentId);
    }

    public Appointment getAppointment(String appointmentId) {
        return appointments.get(appointmentId);
    }

    public Collection<Appointment> getAppointments() {
        return appointments.values();
    }

}

