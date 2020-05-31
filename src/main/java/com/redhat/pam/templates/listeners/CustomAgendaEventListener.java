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
    public void agendaGroupPopped(AgendaGroupPoppedEvent agendaGroupPoppedEvent) {

    }

    @Override
    public void agendaGroupPushed(AgendaGroupPushedEvent agendaGroupPushedEvent) {

    }

    @Override
    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent ruleFlowGroupActivatedEvent) {

    }

    @Override
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent ruleFlowGroupActivatedEvent) {

    }

    @Override
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent ruleFlowGroupDeactivatedEvent) {

    }

    @Override
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent ruleFlowGroupDeactivatedEvent) {

    }
}
