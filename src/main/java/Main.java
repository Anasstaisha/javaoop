public class Main {
    public static void main(String[] args) {

        FormDate birthday = new FormDate();
        birthday.day = Integer.parseInt("13");
        birthday.month = Integer.parseInt("6");
        birthday.year = Integer.parseInt("1999");


        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}