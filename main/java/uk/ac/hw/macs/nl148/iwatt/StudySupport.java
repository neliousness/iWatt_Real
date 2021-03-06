package uk.ac.hw.macs.nl148.iwatt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Author: Neio Lucas
 * File : StudySupport.java
 * Platform : Android Operating System
 * Date:  02/04/2016.
 * Description: This activity redirects the user to a webpage
 */

public class StudySupport extends AppCompatActivity {

    WebView webv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_support);

        webv = (WebView) findViewById(R.id.support_webview);
        WebSettings webSettings = webv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webv.loadUrl("http://www.hw.ac.uk/is/skills-development/study-support.htm");
    }
}
