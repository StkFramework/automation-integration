package com.softtek.automation.actions;

import com.softtek.automation.ExecutionResult;
import com.softtek.automation.element.UIElement;

public interface UIActionsLocal extends Actions{
	
	public ExecutionResult TypeTextAndIntro(UIElement element, String text);
	
	public ExecutionResult UploadFile(UIElement element, String fullPath);
	
	public ExecutionResult DragAndDrop(UIElement fromElement, UIElement toElement);
	
	public ExecutionResult GetTextFromCacheContext(String key);
}
