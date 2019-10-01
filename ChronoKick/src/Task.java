public class Task {

    private String taskName;
    private String taskDescription;
    private String dueDate;
    private Stats Statistics;
    private Task masterTask;
    private LinkedList[Task] subtasks;

    public Task(String taskName, String taskDescription, String dueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }

    public Task(String taskName, String taskDescription, String dueDate, Task masterTask) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.masterTask = masterTask;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Stats getStatistics() {
        return Statistics;
    }

    public void setStatistics(Stats statistics) {
        Statistics = statistics;
    }

    public Task getMasterTask() {
        return masterTask;
    }

    public void setMasterTask(Task masterTask) {
        this.masterTask = masterTask;
    }

}