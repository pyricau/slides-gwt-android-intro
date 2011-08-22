package info.piwai.slides.gwtandroid.client;

import info.piwai.rockslide.client.PresentationEntryPoint;
import info.piwai.rockslide.client.slides.ChapterHolder;
import info.piwai.rockslide.client.slides.Presentable;
import info.piwai.rockslide.client.slides.PresentationHeader;
import info.piwai.rockslide.client.slides.TableOfContentFactory;
import info.piwai.rockslide.client.slides.ULTableOfContent;
import info.piwai.rockslide.sh.client.SyntaxHighlighter;
import info.piwai.slides.gwtandroid.client.android.Android;
import info.piwai.slides.gwtandroid.client.introduction.Introduction;
import info.piwai.slides.gwtandroid.client.playn.PlayN;
import info.piwai.slides.gwtandroid.client.webtoolkit.WebToolkit;

import com.google.gwt.user.client.ui.IsWidget;

public class GWTAndroid extends PresentationEntryPoint {

    private PresentationHeader header;

    @Override
    public void initSlides() {

        /**
         * Custom CSS injection
         */
        GWTAndroidResources.instance.gwtandroid().ensureInjected();

        /**
         * Default options of SyntaxHighlighter
         */
        SyntaxHighlighter.toolbar = false;

        /**
         * Will only work if the module info.piwai.rockslide.ga.SlideAnalytics
         * is imported
         */
        // Analytics.enable("UA-XXX");

    }

    @Override
    public void loadChapters(ChapterHolder holder) {
        holder.addChapter(new Introduction());
        holder.addChapter(new WebToolkit());
        holder.addChapter(new Android());
        holder.addChapter(new PlayN());

        header = new PresentationHeader(holder);
    }

    @Override
    public IsWidget getHeaderWidget() {
        return header;
    }
    
    @Override
    public TableOfContentFactory buildTableOfContentFactory(final ChapterHolder chapterHolder) {
        return new TableOfContentFactory() {
            @Override
            public Presentable buildTableOfContent() {
                return new ULTableDesMatieres(chapterHolder);
            }
        };
    }

}
