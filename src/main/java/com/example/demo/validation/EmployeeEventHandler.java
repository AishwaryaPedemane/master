package com.example.demo.validation;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterLinkDelete;
import org.springframework.data.rest.core.annotation.HandleAfterLinkSave;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeLinkDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeLinkSave;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.example.demo.model.Employee;

@RepositoryEventHandler(Employee.class)
public class EmployeeEventHandler {

	@HandleAfterCreate
	@HandleAfterDelete
	@HandleAfterSave
	public void handleAfter(Employee p) {
		throw new EventHandlerInvokedException();
	}

	@HandleAfterLinkDelete
	@HandleAfterLinkSave
	public void handleAfterLink(Employee p, Object o) {
		throw new EventHandlerInvokedException();
	}

	@HandleBeforeCreate
	@HandleBeforeDelete
	@HandleBeforeSave
	public void handleBefore(Employee p) {
		throw new EventHandlerInvokedException();
	}

	@HandleBeforeLinkDelete
	@HandleBeforeLinkSave
	public void handleBeforeLink(Employee p, Object o) {
		throw new EventHandlerInvokedException();
	}
}

  


