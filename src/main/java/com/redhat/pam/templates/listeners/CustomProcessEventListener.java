package com.redhat.pam.templates.listeners;

import org.kie.api.event.process.*;

public class CustomProcessEventListener implements ProcessEventListener {

    @Override
    public void beforeProcessStarted(ProcessStartedEvent event) {
        System.out.println("PROCESS ["+event.getProcessInstance().getProcessName()+"] before STARTED");
    }

    @Override
    public void afterProcessStarted(ProcessStartedEvent event) {
        System.out.println("PROCESS ["+event.getProcessInstance().getProcessName()+"] after STARTED");
    }

    @Override
    public void beforeProcessCompleted(ProcessCompletedEvent event) {
        System.out.println("PROCESS ["+event.getProcessInstance().getProcessName()+"] before COMPLETED");
    }

    @Override
    public void afterProcessCompleted(ProcessCompletedEvent event) {
        System.out.println("PROCESS ["+event.getProcessInstance().getProcessName()+"] after COMPLETED");
    }

    @Override
    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println("NODE ["+event.getNodeInstance().getNodeName()+"] before TRIGGERED");
    }

    @Override
    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println("NODE ["+event.getNodeInstance().getNodeName()+"] after TRIGGERED");
    }

    @Override
    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println("NODE ["+event.getNodeInstance().getNodeName()+"] before LEFT");
    }

    @Override
    public void afterNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println("NODE ["+event.getNodeInstance().getNodeName()+"] after LEFT");
    }

    @Override
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println("VARIABLE ["+event.getVariableId()+"] before CHANGED");
    }

    @Override
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println("VARIABLE ["+event.getVariableId()+"] after CHANGED");
    }
}
