import java.time.LocalDate;
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


}
