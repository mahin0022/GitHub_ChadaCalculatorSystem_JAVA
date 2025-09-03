// Base Class
class Chada {
    String serviceName;
    float baseChada;

    Chada(String serviceName, float baseChada) {
        this.serviceName = serviceName;
        this.baseChada = baseChada;
    }

    void displayInfo() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Base Chada: " + baseChada);
    }

    float calculateChada() {
        return baseChada;
    }

    float calculateChada(int quantity) {
        return baseChada * quantity;
    }

    double calculateChada(int quantity, double extraPercent) {
        return (baseChada * quantity) + (baseChada * quantity * extraPercent / 100);
    }
}




