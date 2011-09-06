package info.piwai.slides.gwtandroid.client.webtoolkit;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

public class ButtonExample extends Button implements ClickHandler {

	public ButtonExample() {
		addClickHandler(this);
	}

	@Override
	public void onClick(ClickEvent event) {
		Window.alert("Mais c'est trop simple !");		
	}
	
}
