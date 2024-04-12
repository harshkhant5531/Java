interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();

    void mousePressed();

    void mouseReleased();

    void mouseMoved();

    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();

    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {
    public void performEvent() {
        System.out.println("perfom event");
    }

    public void mouseClicked() {
        System.out.println("mouse clicked");
    }

    public void mousePressed() {
        System.out.println("mouse pressed");
    }

    public void mouseReleased() {
        System.out.println("mouse relesed");
    }

    public void mouseMoved() {
        System.out.println("mouse moved");
    }

    public void mouseDragged() {
        System.out.println("mouse dragged");
    }

    public void keyPressed() {
        System.out.println("key press");
    }

    public void keyReleased() {
        System.out.println("key relseased");
    }
}

public class Event {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}
