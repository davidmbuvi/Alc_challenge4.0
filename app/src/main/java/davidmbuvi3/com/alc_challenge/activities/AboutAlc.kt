package davidmbuvi3.com.alc_challenge.activities

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.graphics.Bitmap
import android.net.Uri
import android.net.http.SslError
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.webkit.SslErrorHandler
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import davidmbuvi3.com.alc_challenge.R

class AboutAlc : AppCompatActivity() {
    private var webview: WebView? = null
    lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)
        val webview = findViewById(R.id.webview) as WebView
        progressBar = findViewById(R.id.progressBar) as ProgressBar
        val settings = webview.settings
        settings.javaScriptEnabled = true
        settings.builtInZoomControls=true
        webview.webViewClient = data()
       webview.loadUrl("https://andela.com/alc/")


    }

    class data : WebViewClient() {
        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            handler?.proceed()
            super.onReceivedSslError(view, handler, error)
        }

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {

            view?.loadUrl(request?.url.toString())
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url)
            return true
        }
    }
}