package info.blogbasbas.carimasjid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import info.blogbasbas.carimasjid.R;

public class tata_cara_sholat_activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata_cara_sholat_activity);

        webView = findViewById(R.id.web_tata_cara_sholat);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://wisatanabawi.com/bacaan-sholat/");
    }
}
