package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import java.util.List;
import java.util.Map;
import o.b;
import o.c;

/* loaded from: classes3.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    protected static final String LOG_TAG = "TrustedWebActivity";
    public c builder;

    private void prepareCustomTabs() {
        a.C0023a c0023a = new a.C0023a();
        String str = this.customSettings.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            c0023a.e(Color.parseColor(this.customSettings.toolbarBackgroundColor));
        }
        String str2 = this.customSettings.navigationBarColor;
        if (str2 != null && !str2.isEmpty()) {
            c0023a.b(Color.parseColor(this.customSettings.navigationBarColor));
        }
        String str3 = this.customSettings.navigationBarDividerColor;
        if (str3 != null && !str3.isEmpty()) {
            c0023a.c(Color.parseColor(this.customSettings.navigationBarDividerColor));
        }
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            c0023a.d(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        this.builder.c(c0023a.a());
        List<String> list = this.customSettings.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.b(this.customSettings.additionalTrustedOrigins);
        }
        o.a aVar = this.customSettings.displayMode;
        if (aVar != null) {
            this.builder.d(aVar);
        }
        this.builder.e(this.customSettings.screenOrientation.intValue());
    }

    private void prepareCustomTabsIntent(b bVar) {
        Intent a10 = bVar.a();
        String str = this.customSettings.packageName;
        if (str == null) {
            str = CustomTabsHelper.getPackageNameToUse(this);
        }
        a10.setPackage(str);
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, a10);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            d.c(a10);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        if (this.customTabsSession == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        mayLaunchUrl(str, list);
        this.builder = new c(parse);
        prepareCustomTabs();
        b a10 = this.builder.a(this.customTabsSession);
        prepareCustomTabsIntent(a10);
        CustomTabActivityHelper.openTrustedWebActivity(this, a10, parse, map, str2 != null ? Uri.parse(str2) : null, 100);
    }
}
