package fr.lycee.flavien.alarmedomestique;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Flavien on 27/02/2016.
 */

public class Content extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_accueil);

        String url = "http://10.38.205.155/voleur";
        WebView view=(WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}













