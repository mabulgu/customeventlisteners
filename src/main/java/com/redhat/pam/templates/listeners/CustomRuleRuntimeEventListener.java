package com.redhat.pam.templates.listeners;

import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;

public class CustomRuleRuntimeEventListener implements RuleRuntimeEventListener {
    @Override
    public void objectInserted(ObjectInsertedEvent objectInsertedEvent) {
    }

    @Override
    public void objectUpdated(ObjectUpdatedEvent objectUpdatedEvent) {

    }

    @Override
    public void objectDeleted(ObjectDeletedEvent objectDeletedEvent) {

    }
}
