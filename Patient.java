class Patient {
    private int patientId;
    private String name;
    private int age;
    private double temperature;

    public Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    public void checkFeverStatus() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Body Temperature: " + temperature + "°F");
        
        if (temperature > 100.4) {
            System.out.println("Diagnosis: Fever");
        } else {
            System.out.println("Diagnosis: Normal");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(501, "Amit Kumar", 34, 101.2);
        Patient p2 = new Patient(502, "Sneha Verma", 28, 98.6);

        p1.checkFeverStatus();
        System.out.println("-------------------");
        p2.checkFeverStatus();
    }
}
