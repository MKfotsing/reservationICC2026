package be.iccbxl.pid.reservations_springboot.validation;

/** Implémenté par les DTO annotés avec {@link PasswordMatches}. */
public interface PasswordConfirmation {
    String getPassword();
    String getConfirmPassword();
}
