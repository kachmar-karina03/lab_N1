import java.util.Objects;

public class Task7 {
    public static void main(String[] args) {
User profi = new User("Mykola","Srgyuk", 12, "wdaddawd@gmail.com");

profi.toString();
    }
    public static class User
    {
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public User(String firstName, String lastName, int age, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    firstName.equals(user.firstName) &&
                    lastName.equals(user.lastName) &&
                    Objects.equals(email, user.email);
        }

        @Override
        public String toString() {
            return super.toString();
        }

        private String firstName;
        private  String lastName;
        private int age;
        private String email;
    }
}
