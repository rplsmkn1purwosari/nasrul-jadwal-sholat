package info.blogbasbas.carimasjid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import info.blogbasbas.carimasjid.R;

public class berita1 extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita1);

        webView = findViewById(R.id.web_berita1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.islampos.com/amp/");
    }
}
