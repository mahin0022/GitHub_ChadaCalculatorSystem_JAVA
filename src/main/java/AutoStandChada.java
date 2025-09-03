class AutoStandChada extends Chada {
    AutoStandChada(String serviceName, float baseChada) {
        super(serviceName, baseChada);
    }

    void displayInfo() {
        System.out.println("Auto Service Name: " + serviceName);
        System.out.println("Auto Base Chada: " + baseChada);
    }
}