package br.com.saborhorta;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView navegador = new WebView(this);

        WebSettings configuracoes = navegador.getSettings();
        configuracoes.setJavaScriptEnabled(true);
        configuracoes.setDomStorageEnabled(true);

        navegador.setWebViewClient(new WebViewClient());

        // Permite exibir a solicitação de senha
        navegador.setWebChromeClient(new WebChromeClient());

        setContentView(navegador);

        navegador.loadUrl("file:///android_asset/index.html");
    }
}
