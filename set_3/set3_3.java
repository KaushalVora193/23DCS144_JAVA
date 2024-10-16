package set_3;
public class set3_3 {

    static class Date {
        private int month;
        private int day;
        private int year;

        public Date(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void displayDate() {
            System.out.println(month + "/" + day + "/" + year);
        }
    }

    public static void main(String[] args) {
        Date date = new Date(9, 26, 2024);

        System.out.print("Initial Date: ");
        date.displayDate();

        date.setMonth(12);
        date.setDay(31);
        date.setYear(2023);

        System.out.print("Updated Date: ");
        date.displayDate();
    }
}
