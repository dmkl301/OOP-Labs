package lab1;

public class Main {
    public static void main(String[] args) {
        Director Director1 = new Director("asadad", "asdda",new Date(24, 2, 2004));
        Screening screening1 = new Screening("asdasd", 123123123, new Date(22, 22, 1955));
        Screening screening2 = new Screening("asdasd", 123123123, new Date(22, 22, 1955));

        Movie movie1 = new Movie("adadasdasd", MovieGenre.ACTION, Director1);
        movie1.addScreening(screening1);
        movie1.addScreening(screening2);

        System.out.println();
        System.out.println("movie 1 full info");
        System.out.println(movie1);
        System.out.println("__________________________________________________");


        Director Director2 = new FilmDirector("asadad", "asdda",new Date(24, 2, 2004), 13, "adadasdasd");
        Screening screening3 = new Screening("asfdas", 13123123, new Date(24, 12, 1965));
        Screening screening4 = new Screening("asdaad", 13123123, new Date(12, 2, 1956));

        Movie movie2 = new Movie("asdadd", MovieGenre.COMEDY, Director2);
        movie2.addScreening(screening3);
        movie2.addScreening(screening4);

        System.out.println();
        System.out.println("movie 2 full info");
        System.out.println(movie2);
        System.out.println("__________________________________________________");

        Director Director3 = new DocumentaryDirector("asadad", "asdda",new Date(24, 2, 2004), 13, "history");
        Screening screening5 = new Screening("asfdas", 13123123, new Date(24, 12, 1965));
        Screening screening6 = new Screening("asdaad", 13123123, new Date(12, 2, 1956));

        Movie movie3 = new Movie("asdadd", MovieGenre.DRAMA, Director3);
        movie3.addScreening(screening5);
        movie3.addScreening(screening6);

        System.out.println();
        System.out.println("movie 3 full info");
        System.out.println(movie3);
        System.out.println("__________________________________________________");
    }

}
