package daisy.task;

public class Event extends Task {

    protected String fromDate;
    protected String toDate;

    public Event(String taskName, String fromDate, String toDate){
        super(taskName);
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String toString() {
        return String.format("[E][%s] %s (from: %s to: %s)", (this.isDone)? "X":" ", this.taskName, this.fromDate, this.toDate);
    }

    public String save() {
        return String.format("E,%s,%s,%s,%s", (this.isDone)? "1":"0", this.taskName, this.fromDate, this.toDate);
    }

}