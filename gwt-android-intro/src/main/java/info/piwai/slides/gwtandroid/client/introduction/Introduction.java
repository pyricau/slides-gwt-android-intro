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
package info.piwai.slides.gwtandroid.client.introduction;

import info.piwai.rockslide.client.slides.Chapter;
import info.piwai.rockslide.client.ui.Slides;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;

public class Introduction extends Chapter {

    interface Binder extends UiBinder<Slides, Void> {
        Binder binder = GWT.create(Binder.class);
    }
    
    @Override
    protected void buildSlides() {
        addMultiSlide(Binder.binder);
        addTableOfContent();
    }
}
