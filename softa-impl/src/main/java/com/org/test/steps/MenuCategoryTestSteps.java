package com.org.test.steps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.operations.ButtonElements;
import com.org.test.utils.ColorUtils;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.And;

public class MenuCategoryTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIActions Actions;
	@Autowired(required=true)
	private ButtonElements buttonElements;
	@Autowired(required=true)
	private ColorUtils colorUtils;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	
	
	
	@And("^Click on Browse button Category Image and Upload Image:$")
    public void click_on_browse_button_and_upload_bid_item_file(final List<String> imageName) throws Throwable {
	//	ExecutionContext executionContext = new ExecutionContext();
		UIActions.PutTextInVolatileContext(imageName.get(1), "ImageName");
		buttonElements.uploadImage(UIElementFactory.createElement(imageName.get(3)), imageName.get(2));
		Thread.sleep(2000);
		System.out.println(UIActions.GetTextInCacheContext("ImageName").getObjectResult().toString());
	}

}
