package edu.brain.lesson4;

class PostOffice {
    private final static String COMPANY = "Meest";
    private String address;
    private int amountClients;

    public PostOffice(String address, int amountClients) {
        this.address = address;
        this.amountClients = amountClients;
    }

    public String calcVolumetricWeight(float height, float length, float width) {
        float volumetricWeight = height * length * width / 4000;
        return "Volumetric weight " + volumetricWeight + " kg";
    }

    public String packingShipping(float weight) {
        if (weight >= 1 && weight <= 10) {
            return "Your package weight: " + weight + " kg, cost: 10$";
        } else if (weight >= 10 && weight <= 20) {
            return "Your package weight: " + weight + "kg, cost: 20$";
        } else if (weight >= 20 && weight <= 30) {
            return "Your package weight: " + weight + "kg, cost: 40$";
        } else {
            return "Your package weight: " + weight + " kg is too weight, cost 50$";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getClients() {
        return amountClients;
    }

    public void setClients(int amountClients) {
        this.amountClients = amountClients;
    }

    public String getCOMPANY() {
        return COMPANY;
    }

    @Override
    public String toString() {
        return "class PostOffice{" +
                "address='" + address + '\'' +
                ", amountClients=" + amountClients +
                '}';
    }
}
