class BusChada extends Chada {
    BusChada(String serviceName, float baseChada) {
        super(serviceName, baseChada);
    }

    void displayInfo() {
        System.out.println("Bus Service Name: " + serviceName);
        System.out.println("Bus Base Chada: " + baseChada);
    }
}