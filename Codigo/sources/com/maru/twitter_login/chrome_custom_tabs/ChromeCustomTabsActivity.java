package com.maru.twitter_login.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.i;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.maru.twitter_login.chrome_custom_tabs.a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ChromeCustomTabsActivity extends Activity implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f13480a;

    /* renamed from: b, reason: collision with root package name */
    public String f13481b;

    /* renamed from: c, reason: collision with root package name */
    public d.b f13482c;

    /* renamed from: d, reason: collision with root package name */
    public com.maru.twitter_login.chrome_custom_tabs.a f13483d;

    /* renamed from: e, reason: collision with root package name */
    public i f13484e;

    /* renamed from: f, reason: collision with root package name */
    public nh.a f13485f;

    /* renamed from: r, reason: collision with root package name */
    protected final int f13486r = 0;

    /* loaded from: classes3.dex */
    class a implements a.InterfaceC0192a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ChromeCustomTabsActivity f13488b;

        a(String str, ChromeCustomTabsActivity chromeCustomTabsActivity) {
            this.f13487a = str;
            this.f13488b = chromeCustomTabsActivity;
        }

        @Override // com.maru.twitter_login.chrome_custom_tabs.a.InterfaceC0192a
        public void onCustomTabsConnected() {
            ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
            chromeCustomTabsActivity.f13484e = chromeCustomTabsActivity.f13483d.b();
            Uri parse = Uri.parse(this.f13487a);
            ChromeCustomTabsActivity.this.f13483d.d(parse, null, null);
            ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
            chromeCustomTabsActivity2.f13482c = new d.b(chromeCustomTabsActivity2.f13484e);
            d b10 = ChromeCustomTabsActivity.this.f13482c.b();
            ChromeCustomTabsActivity.this.d(b10);
            com.maru.twitter_login.chrome_custom_tabs.a.e(this.f13488b, b10, parse, 0);
        }

        @Override // com.maru.twitter_login.chrome_custom_tabs.a.InterfaceC0192a
        public void onCustomTabsDisconnected() {
            this.f13488b.b();
            ChromeCustomTabsActivity.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        dVar.f1766a.setPackage(oh.a.b(this));
        oh.a.a(this, dVar.f1766a);
    }

    public void b() {
        this.f13484e = null;
        finish();
        this.f13480a.invokeMethod("onClose", new HashMap());
    }

    public void c() {
        this.f13480a.setMethodCallHandler(null);
        this.f13485f = null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 0) {
            b();
            c();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mh.a.f21506a);
        Bundle extras = getIntent().getExtras();
        this.f13485f = nh.a.f21973d.get(extras.getString("managerId"));
        this.f13481b = extras.getString(FacebookMediationAdapter.KEY_ID);
        MethodChannel methodChannel = new MethodChannel(this.f13485f.f21975b.b(), "twitter_login/auth_browser_" + this.f13481b);
        this.f13480a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        String string = extras.getString("url");
        com.maru.twitter_login.chrome_custom_tabs.a aVar = new com.maru.twitter_login.chrome_custom_tabs.a();
        this.f13483d = aVar;
        aVar.f(new a(string, this));
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f13483d.a(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f13483d.g(this);
    }
}
