/**
 * Copyright (C) 2011 Pierre-Yves Ricau (py.ricau at gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package info.piwai.slides.gwtandroid.client.webtoolkit;

import info.piwai.rockslide.client.shownotes.ElementSlideNotes;
import info.piwai.rockslide.client.shownotes.WidgetSlideNotes;
import info.piwai.rockslide.client.slides.Chapter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;

public class WebToolkit extends Chapter {

    @UiTemplate("Title.ui.xml")
    interface Title extends UiBinder<Element, ElementSlideNotes> {
        Title binder = GWT.create(Title.class);
    }
    
    @UiTemplate("EmptyCode.ui.xml")
    interface EmptyCode extends UiBinder<Widget, WidgetSlideNotes> {
        EmptyCode binder = GWT.create(EmptyCode.class);
    }
    
    @UiTemplate("EmptySlide.ui.xml")
    interface EmptySlide extends UiBinder<Element, ElementSlideNotes> {
        EmptySlide binder = GWT.create(EmptySlide.class);
    }
    
    @UiTemplate("Pause.ui.xml")
    interface Pause extends UiBinder<Element, ElementSlideNotes> {
        Pause binder = GWT.create(Pause.class);
    }
    
    @UiTemplate("Questions.ui.xml")
    interface Questions extends UiBinder<Element, ElementSlideNotes> {
        Questions binder = GWT.create(Questions.class);
    }
    
    @Override
    protected void buildSlides() {
        addNotesSlide(Title.binder);
//        addWidgetNotesSlide(EmptyCode.binder);
//        addNotesSlide(EmptySlide.binder);
        addNotesSlide(Questions.binder);
        addNotesSlide(Pause.binder);
        addTableOfContent();
    }
    
    @Override
    public String getHistoryName() {
        return "GWT";
    }
    
    @Override
    public String getReadableName() {
        return "Google Web Toolkit";
    }
}
