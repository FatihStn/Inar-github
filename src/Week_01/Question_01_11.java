package Week_01;

public class Question_01_11 {
    public static void main (String[] args){
        int population=312032486;
        int birth_per_year=(60*60*24*365)/7;
        int death_per_year=(60*60*24*365)/13;
        int immigrant_per_year=(60*60*24*365)/45;
        System.out.println("Year 1 projection:");
        System.out.println(population+ birth_per_year-death_per_year+immigrant_per_year);
        System.out.println("Year 2 projection:");
        System.out.println(population+ 2*(birth_per_year-death_per_year+immigrant_per_year));
        System.out.println("Year 3 projection:");
        System.out.println(population+ 3*(birth_per_year-death_per_year+immigrant_per_year));
        System.out.println("Year 4 projection:");
        System.out.println(population+ 4*(birth_per_year-death_per_year+immigrant_per_year));
        System.out.println("Year 5 projection:");
        System.out.println(population+ 5*(birth_per_year-death_per_year+immigrant_per_year));


    }
}
