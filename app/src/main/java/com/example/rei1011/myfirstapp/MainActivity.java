package com.example.rei1011.myfirstapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.textview_1)
    TextView mButterTextView;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.web_view_starbucks)
    WebView mStarbucksWebView;
    @Bind(R.id.web_view_yahoo)
    WebView mYahooWebView;
    @Bind(R.id.web_view_google)
    WebView mGoogleWebView;
    @Bind(R.id.button_1)
    Button mButton1;
    @Bind(R.id.button_2)
    Button mButton2;
    @Bind(R.id.button_3)
    Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @OnClick({R.id.button_1, R.id.button_2,R.id.button_3})
    public void OnClik(View view) {
        if (view == mButton1 ) {
            Log.d(TAG, "onClick Button1");
            mStarbucksWebView.loadUrl("http://www.starbucks.co.jp/");

        } else if(view == mButton2) {
            Log.d(TAG, "onClick Button2");
            //URL
            mYahooWebView.loadUrl("http://www.yahoo.co.jp/");

        } else if(view == mButton3) {
            Log.d(TAG, "onClick Button3");
            //URL
            mGoogleWebView.loadUrl("https://www.google.co.jp/");

        }
        /*
      //  Log.d(TAG, "OnClick : ");
        //       mButterTextView.setText(getResources().getString(R.string.rei));
        //   mButterTextView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.web_view_starbucks);
        //標準ブラウザをキャンセル
        myWebView.setWebViewClient(new WebViewClient());
        //URL
        myWebView.loadUrl("http://www.starbucks.co.jp/");
        */
    }
/*
     @OnClick(R.id.button_2)
     public void OnClik2() {
      setContentView(R.layout.activity_main);
      WebView myWebView = (WebView)findViewById(R.id.web_view_yahoo);
      //標準ブラウザをキャンセル
      myWebView.setWebViewClient(new WebViewClient());
      //URL
      myWebView.loadUrl("http://www.yahoo.co.jp/");
      }

    @OnClick(R.id.button_3)
    public void OnClik3() {
//        Log.d(TAG, "OnClick : ");
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView)findViewById(R.id.web_view_google);
        //標準ブラウザをキャンセル
        myWebView.setWebViewClient(new WebViewClient());
        //URL
        myWebView.loadUrl("https://www.google.co.jp/");


    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
