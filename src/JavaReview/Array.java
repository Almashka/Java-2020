package JavaReview;

public class Array {
    public static void main(String[] args) {
        String[] cities = {"Houston", "Dallas", "New Orleans", "Austin"};
        int[] years = {2010, 2020, 1994, 1975, 1967};
        char[] letters = {'e', 'o', 'i'};

        System.out.println(cities[2]);
        System.out.println(letters[0]);

        cities[1] = "New York";
        System.out.println(cities[1]);
        System.out.println(cities.length);

        for(int i = 0; i < years.length; i++){
            System.out.println(years[i]);
        }

        for(int newVar : years){
            System.out.print(newVar + " ");
        }
    }
}
