package com.example;

import java.net.URI;
import java.util.List;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;

import com.ibm.openpages.api.workflow.actions.AbstractCustomAction;
import com.ibm.openpages.api.workflow.actions.IWFCustomProperty;
import com.ibm.openpages.api.workflow.actions.IWFOperationContext;

public class TestCustomAction extends AbstractCustomAction {

    public TestCustomAction(IWFOperationContext context, List<IWFCustomProperty> properties) {
        super(context, properties);
    }

    @Override
    protected void process() throws Exception {
        
		System.out.println("Test Custom Action");
        
    }

}