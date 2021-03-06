/*Copyright 2016 Karunakaran.G Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.ezhil.handbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ezhil.handbook.R;

public class Loadhtml extends AppCompatActivity {
    WebView web;
    String filepath;
    String filename;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadhtml);
        web = (WebView) findViewById(R.id.webview);
        web.getSettings().setDisplayZoomControls(false);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            filename=extras.getString("file");
            filepath="file:///android_asset/contents/"+filename+".html";
            web.loadUrl(filepath);
        }

    }
}