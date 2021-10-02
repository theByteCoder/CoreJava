package core;
abstract class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}

interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}

interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}

public class ImplementMultipleInterfaces extends Horse implements Flyer, Mythical {
    public static void main(String... args) {
    	ImplementMultipleInterfaces myApp = new ImplementMultipleInterfaces();
        System.out.println(myApp.identifyMyself());
    }
}