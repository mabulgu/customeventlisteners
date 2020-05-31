package com.redhat.pam.templates.listeners;

import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;

public class CustomRuleRuntimeEventListener implements RuleRuntimeEventListener {
    @Override
    public void objectInserted(ObjectInsertedEvent event) {
        System.out.println("OBJECT[" + event.getObject().toString()+ "] INSERTED");
    }

    @Override
    public void objectUpdated(ObjectUpdatedEvent event) {
        System.out.println("OBJECT[" + event.getObject().toString()+ "] UPDATED");
    }

    @Override
    public void objectDeleted(ObjectDeletedEvent event) {
        System.out.println("OBJECT[" + event.getOldObject().toString()+ "] DELETED");
    }
}
