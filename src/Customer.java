import java.time.LocalDate;
import java.util.Objects;

/*CAMBIO DE UUUID A LONG PARA ID*/
public class Customer {

    /*CONTADOR DE ID */
        private static Long idCont = 0L;
        private Long id;
        private String name;
        private String lastName;
        private LocalDate birthDate;
        private String email;
        private String phone;
        private String identificationNumber;

        public Customer(String name, String lastName, LocalDate birthDate, String email, String phone, String identificationNumber) {
            if(Objects.isNull(name)) throw new IllegalArgumentException("name cannot be null");
            if(Objects.isNull(lastName)) throw new IllegalArgumentException("lastname cannot be null");
            if(Objects.isNull(birthDate)) throw new IllegalArgumentException("birthdate cannot be null");
            if(Objects.isNull(email)) throw new IllegalArgumentException("email cannot be null");
            if(Objects.isNull(phone)) throw new IllegalArgumentException("phone cannot be null");
            if(Objects.isNull(identificationNumber)) throw new IllegalArgumentException("identification number cannot be null");
            /*INCREMENTO DE IDS*/
            this.id = ++idCont;
            this.name = name;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.email = email;
            this.phone = phone;
            this.identificationNumber = identificationNumber;
        }

        // Getters
        public Long getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getLastName() {
            return lastName;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(lastName, customer.lastName) && Objects.equals(birthDate, customer.birthDate) && Objects.equals(email, customer.email) && Objects.equals(phone, customer.phone) && Objects.equals(identificationNumber, customer.identificationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, birthDate, email, phone, identificationNumber);
    }
}
