enum Signal{RED, YELLOW, GREEN}

public class TrafficLight{
    Signal color = Signal.RED;

    public void change(){
        switch(color){
            case RED:
                color = Signal.YELLOW;
                break;

            case YELLOW:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.RED;
                break;
        }
    }

    public String toString(){
        return "Now the traffic light is : " + color;
    }

    public static void main(String[] args){
        TrafficLight light = new TrafficLight();
        for (int i = 0; i < 7 ; ++i){
            System.out.println(light.toString());
            light.change();
        }
    }
}