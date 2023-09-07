public class Park {
    private class Attraction {
        private String attractionName;
        private String workingHours;
        private int cost;

        public Attraction(String attractionName, String workingHours, int cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction attraction1 = park.new Attraction("Карусель", "10:00 - 20:00", 150);
        Attraction attraction2 = park.new Attraction("Городок", "09:00 - 18:00", 100);
        Attraction attraction3 = park.new Attraction("Колесо обозрения", "11:00 - 22:00", 200);
        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }
}