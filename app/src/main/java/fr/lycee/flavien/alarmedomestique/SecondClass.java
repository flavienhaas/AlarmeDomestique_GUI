package fr.lycee.flavien.alarmedomestique;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Flavien on 01/02/2016.
 */
public class SecondClass extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        String url = "http://auto.ferrari.com/fr_FR/wp-content/uploads/sites/13/2014/09/FF-thumb.jpg";
        WebView view=(WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
