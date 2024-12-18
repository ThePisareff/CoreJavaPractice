package pisareff.SimpleExamples.NestedClasses.InnerClasses.NonStatickMemberClass_InnerClass;

public class Car {
    private String carNumber;
    private int vinNumber;
    private Body body;
    private double versionECU = 1.1;

    public Car(String carNumber, int vinNumber, int bodyNumber) {
        this.carNumber = carNumber;
        this.vinNumber = vinNumber;
        this.body = new Body(bodyNumber);
    }

    private void getInfo() {
        System.out.println("Car number - " + carNumber + "\n" +
                "VIN number - " + vinNumber + "\n"
                + "Body number - " + body.bodyNumber);
    }

    private class Body {
        private int bodyNumber;

        public Body(int bodyNumber) {
            this.bodyNumber = bodyNumber;
        }

        public int getBodyNumber() {
            return bodyNumber;
        }
    }

    public class CarHandler {
        private double handlerVersion = 1.1;

        public void start(){
            getInfo(); // Может вызывать private методы
            System.out.println("Version ECU - " + versionECU); // Может получить доступ к private полю
            System.out.println("Handler version - " + handlerVersion);
        }

        public void changeCarNumber(String Number){
            carNumber = Number; // Может изменить private поле
        }

        public int getBodyNumber(){
            return body.bodyNumber; // Имеет доступ к private полю параллельного private inner класса
        }
    }
}


