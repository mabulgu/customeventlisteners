package com.redhat.pam.templates.listeners;

import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;

public class CustomTaskLifeCycleEventListener implements TaskLifeCycleEventListener {

    @Override
    public void beforeTaskActivatedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before ACTIVATED");
    }

    @Override
    public void beforeTaskClaimedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before CLAIMED");
    }

    @Override
    public void beforeTaskSkippedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before SKIPPED");
    }

    @Override
    public void beforeTaskStartedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before STARTED");
    }

    @Override
    public void beforeTaskStoppedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before STOPPED");
    }

    @Override
    public void beforeTaskCompletedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before COMPLETED");
    }

    @Override
    public void beforeTaskFailedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before FAILED");
    }

    @Override
    public void beforeTaskAddedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before ADDED");
    }

    @Override
    public void beforeTaskExitedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before EXITED");
    }

    @Override
    public void beforeTaskReleasedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before RELEASED");
    }

    @Override
    public void beforeTaskResumedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before RESUMED");
    }

    @Override
    public void beforeTaskSuspendedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before SUSPENDED");
    }

    @Override
    public void beforeTaskForwardedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before FORWARDED");
    }

    @Override
    public void beforeTaskDelegatedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before DELEGATED");
    }

    @Override
    public void beforeTaskNominatedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] before NOMINATED");
    }

    @Override
    public void afterTaskActivatedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after ACTIVATED");
    }

    @Override
    public void afterTaskClaimedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after CLAIMED, by "+taskEvent.getTaskContext().getUserId());
    }

    @Override
    public void afterTaskSkippedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after SKIPPED");
    }

    @Override
    public void afterTaskStartedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after STARTED");
    }

    @Override
    public void afterTaskStoppedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after STOPPED");
    }

    @Override
    public void afterTaskCompletedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after COMPLETED");
    }

    @Override
    public void afterTaskFailedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after FAILED");
    }

    @Override
    public void afterTaskAddedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after ADDED");
    }

    @Override
    public void afterTaskExitedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after EXITED");
    }

    @Override
    public void afterTaskReleasedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after RELEASED");
    }

    @Override
    public void afterTaskResumedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after RESUMED");
    }

    @Override
    public void afterTaskSuspendedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after SUSPENDED");
    }

    @Override
    public void afterTaskForwardedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after FORWARDED");
    }

    @Override
    public void afterTaskDelegatedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after DELEGATED");
    }

    @Override
    public void afterTaskNominatedEvent(TaskEvent taskEvent) {
        System.out.println("TASK ["+taskEvent.getTask().getName()+"] after NOMINATED");
    }
}
