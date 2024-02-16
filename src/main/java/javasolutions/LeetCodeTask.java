package javasolutions;

public abstract class LeetCodeTask {
    private final int taskNumber;
    private final String taskName;

    public LeetCodeTask(Integer taskNumber, String taskName) {
        this.taskNumber = taskNumber;
        this.taskName = taskName;
    }
    public String getTaskName() {
        return taskName;
    }
    public Integer getTaskNumber() {
        return taskNumber;
    }
}