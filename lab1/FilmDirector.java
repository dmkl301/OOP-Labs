package lab1;

public class FilmDirector extends Director {
    private int numberOfAwards;
    private String famousMovie;

    public FilmDirector() {
    }

    public FilmDirector(String name,
                        String surName,
                        Date birthDate,
                        int numberOfAwards,
                        String famousMovie) {
        super(name, surName, birthDate);
        this.numberOfAwards = numberOfAwards;
        this.famousMovie = famousMovie;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfAwards=" + numberOfAwards + ", famousMovie=" + famousMovie;
    }

    public int getNumberOfAwards() {
        return numberOfAwards;
    }

    public void setNumberOfAwards(int numberOfAwards) {
        this.numberOfAwards = numberOfAwards;
    }

    public String getFamousMovie() {
        return famousMovie;
    }

    public void setFamousMovie(String famousMovie) {
        this.famousMovie = famousMovie;
    }
}
