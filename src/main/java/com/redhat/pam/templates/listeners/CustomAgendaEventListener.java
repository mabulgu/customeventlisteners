package com.redhat.pam.templates.listeners;

import org.kie.api.event.rule.*;

public class CustomAgendaEventListener implements AgendaEventListener {
    @Override
    public void matchCreated(MatchCreatedEvent event) {
        System.out.println("RULE [" + event.getMatch().getRule().getName() + "] match CREATED");
    }

    @Override
    public void matchCancelled(MatchCancelledEvent event) {
        System.out.println("RULE [" + event.getMatch().getRule().getName() + "] match CANCELLED");
    }

    @Override
    public void beforeMatchFired(BeforeMatchFiredEvent event) {
        System.out.println("RULE [" + event.getMatch().getRule().getName() + "] before match FIRED");
    }

    @Override
    public void afterMatchFired(AfterMatchFiredEvent event) {
        System.out.println("RULE [" + event.getMatch().getRule().getName() + "] after match FIRED");
    }

    @Override
    public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
        System.out.println("AGENDA_GROUP [" + event.getAgendaGroup().getName() + "] POPPED");
    }

    @Override
    public void agendaGroupPushed(AgendaGroupPushedEvent event) {
        System.out.println("AGENDA_GROUP [" + event.getAgendaGroup().getName() + "] PUSHED");
    }

    @Override
    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println("RULE_FLOW_GROUP [" + event.getRuleFlowGroup().getName() + "] before ACTIVATED");
    }

    @Override
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println("RULE_FLOW_GROUP [" + event.getRuleFlowGroup().getName() + "] after ACTIVATED");
    }

    @Override
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println("RULE_FLOW_GROUP [" + event.getRuleFlowGroup().getName() + "] before DEACTIVATED");
    }

    @Override
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println("RULE_FLOW_GROUP [" + event.getRuleFlowGroup().getName() + "] after DEACTIVATED");
    }
}
