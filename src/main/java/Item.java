public class Item {
    private String name;
    private Boolean done;

    public Item(String name) {
        this.name = name;
        this.done = false;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isDone() {
        return this.done;
    }

    public void markAsDone() {
        this.done = true;
    }

    public void unmark() {
        this.done = false;
    }

    @Override
    public String toString() {
        if (this.isDone()) {
            return "[X] " + this.getName();
        }
        return "[ ] " + this.name;
    }



}
