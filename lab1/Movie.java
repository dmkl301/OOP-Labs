package lab1;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private MovieGenre genre;
    private Director director;
    private List<Screening> screening = new ArrayList<>();

    public Movie() {
    }

    public Movie(String title, MovieGenre genre, Director director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public void printInfo() {
        System.out.printf("Movied info: title %s, genre %s%n", title, genre);
        System.out.println("Director info: ");
        director.printInfo();
        for (Screening screening : screening) {
            screening.printInfo();
        }
    }

    public void printShortInfo() {
        double sum = 0;
        for (Screening screening : screening) {
            sum += screening.getProfit();
        }
        double average = sum / screening.size();
        System.out.printf("Short info: title %s, director %s, profitAvg %s%n", title, director.getName(), average);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Screening screening : screening) {
            sb.append(screening.toString()).append("\n");
        }

        return "title=%s, genre=[%s], director=[%s], %nscreening=[%n%s]".formatted(title, genre, director.toString(), sb.toString());
    }

    public void addScreening(Screening screening) {
        this.screening.add(screening);
    }

    public List<Screening> getScreening() {
        return screening;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

}
