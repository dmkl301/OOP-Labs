package lab1;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private MovieGenre genre;
    private Director director;
    private List<Screening> screeningList = new ArrayList<>();

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
        for (Screening screening : screeningList) {
            screening.printInfo();
        }
    }

    public void printShortInfo() {
        double sum = 0;
        for (Screening screening : screeningList) {
            sum += screening.getProfit();
        }
        double average = sum / screeningList.size();
        System.out.printf("Short info: title %s, director %s, profitAvg %s%n", title, director.getName(), average);
    }

    public void addScreening(Screening screening) {
        screeningList.add(screening);
    }

    public List<Screening> getScreening() {
        return screeningList;
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

    public List<Screening> getScreeningList() {
        return screeningList;
    }

    public void setScreeningList(List<Screening> screeningList) {
        this.screeningList = screeningList;
    }
}
