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
package info.piwai.slides.gwtandroid.client;

import info.piwai.rockslide.client.shownotes.WidgetSlideNotes;
import info.piwai.rockslide.client.slides.ChapterHolder;
import info.piwai.rockslide.client.slides.ChapterName;
import info.piwai.rockslide.client.slides.ULPanel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Widget;

public class ULTableDesMatieres extends WidgetSlideNotes {

    interface Binder extends UiBinder<Widget, ULTableDesMatieres> {
    }

    private static final Binder binder = GWT.create(Binder.class);
    
    @UiField
    ULPanel ulPanel;

    public ULTableDesMatieres(ChapterHolder chapterHolder) {
        super(binder);
        
        for (ChapterName chapterName : chapterHolder.getChapterNames()) {
            String readableName = chapterName.getReadableName();
            String historyName = chapterName.getHistoryName();

            Anchor anchor = new Anchor(readableName);
            anchor.setHref("#" + historyName);

            ulPanel.add(anchor);
        }
    }
    
    @Override
    public String toString() {
        return "TableDesMatieres";
    }
}
