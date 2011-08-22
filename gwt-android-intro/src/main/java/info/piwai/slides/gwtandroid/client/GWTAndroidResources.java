package info.piwai.slides.gwtandroid.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.CssResource.NotStrict;

public interface GWTAndroidResources extends ClientBundle {
    
    public static final GWTAndroidResources instance = GWT.create(GWTAndroidResources.class);
    
    ImageResource headerLogo();
    
    @NotStrict
    CssResource gwtandroid();

}
