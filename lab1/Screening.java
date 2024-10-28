package lab1;

public class Screening {
    private String screeningName;
    private int profit;
    private Date screeningDate;

    public Screening() {
    }

    public Screening(String screeningName, int profit, Date screeningDate) {
        this.screeningName = screeningName;
        this.profit = profit;
        this.screeningDate = screeningDate;
    }

    public void printInfo() {
        System.out.printf("Screening info: screeningName: %s, profit: %s%n", screeningName, profit);
        System.out.println("Screening date: ");
        screeningDate.printInfo();
    }

    public String getScreeningName() {
        return screeningName;
    }

    public void setScreeningName(String screeningName) {
        this.screeningName = screeningName;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public Date getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(Date screeningDate) {
        this.screeningDate = screeningDate;
    }
}
