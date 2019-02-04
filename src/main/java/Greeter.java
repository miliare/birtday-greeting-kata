import java.time.LocalDate;

public class Greeter {

    public static final String BIRTHDAY_TODAY = LocalDate.now().toString();
    public static final String REGEX = ", ";

    public static String greet() {

        String users = getUsers();
        String birthdayUser = computeBirthday(users);

        return String.format("Subject: Happy birthday!\n\n" +
                "Happy birthday, dear %s!", birthdayUser);
    }

    private static String computeBirthday(String users) {
        if (LocalDate.now().toString().equals(users.split(REGEX)[2])) {
            return users.split(REGEX)[1];
        }
        return "";
    }

    private static String getUsers() {
        return "Doe, John, " + BIRTHDAY_TODAY + ", john.doe@foobar.com, "
                + "Ann, Mary, 1975/09/11, mary.ann@foobar.com";
    }


}
