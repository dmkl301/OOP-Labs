package lab1;

public class DocumentaryDirector extends Director {
    private int numberOfDocumentaries;
    private String specializationTopic;

    public DocumentaryDirector() {
    }

    public DocumentaryDirector(String name,
                               String surName,
                               Date birthDate,
                               int numberOfDocumentaries,
                               String specializationTopic) {
        super(name, surName, birthDate);
        this.numberOfDocumentaries = numberOfDocumentaries;
        this.specializationTopic = specializationTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfDocumentaries=" + numberOfDocumentaries + ", specializationTopic=" + specializationTopic;
    }

    public int getNumberOfDocumentaries() {
        return numberOfDocumentaries;
    }

    public void setNumberOfDocumentaries(int numberOfDocumentaries) {
        this.numberOfDocumentaries = numberOfDocumentaries;
    }

    public String getSpecializationTopic() {
        return specializationTopic;
    }

    public void setSpecializationTopic(String specializationTopic) {
        this.specializationTopic = specializationTopic;
    }
}
