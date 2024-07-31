package com.maru.twitter_login.chrome_custom_tabs;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.AbstractServiceConnectionC0395e;
import androidx.browser.customtabs.C0392b;
import androidx.browser.customtabs.C0393c;
import androidx.browser.customtabs.C0394d;
import androidx.browser.customtabs.C0399i;
import java.util.List;
import p277oh.C9945a;
import p277oh.C9947c;
import p277oh.InterfaceC9948d;

/* renamed from: com.maru.twitter_login.chrome_custom_tabs.a */
/* loaded from: classes3.dex */
public class C6661a implements InterfaceC9948d {

    /* renamed from: a */
    private C0399i f14782a;

    /* renamed from: b */
    private C0393c f14783b;

    /* renamed from: c */
    private AbstractServiceConnectionC0395e f14784c;

    /* renamed from: d */
    private a f14785d;

    /* renamed from: e */
    private C0392b f14786e;

    /* renamed from: com.maru.twitter_login.chrome_custom_tabs.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    /* renamed from: c */
    public static boolean m19487c(Activity activity) {
        return C9945a.m29734b(activity) != null;
    }

    /* renamed from: e */
    public static void m19488e(Activity activity, C0394d c0394d, Uri uri, int i10) {
        c0394d.f2069a.setData(uri);
        activity.startActivityForResult(c0394d.f2069a, i10);
    }

    /* renamed from: a */
    public void m19489a(Activity activity) {
        String m29734b;
        if (this.f14783b == null && (m29734b = C9945a.m29734b(activity)) != null) {
            C9947c c9947c = new C9947c(this);
            this.f14784c = c9947c;
            C0393c.m2091a(activity, m29734b, c9947c);
        }
    }

    /* renamed from: b */
    public C0399i m19490b() {
        C0399i m2097f;
        C0393c c0393c = this.f14783b;
        if (c0393c != null) {
            m2097f = this.f14782a == null ? c0393c.m2097f(this.f14786e) : null;
            return this.f14782a;
        }
        this.f14782a = m2097f;
        return this.f14782a;
    }

    /* renamed from: d */
    public boolean m19491d(Uri uri, Bundle bundle, List<Bundle> list) {
        C0399i m19490b;
        if (this.f14783b == null || (m19490b = m19490b()) == null) {
            return false;
        }
        return m19490b.m2132i(uri, bundle, list);
    }

    /* renamed from: f */
    public void m19492f(a aVar) {
        this.f14785d = aVar;
    }

    /* renamed from: g */
    public void m19493g(Activity activity) {
        AbstractServiceConnectionC0395e abstractServiceConnectionC0395e = this.f14784c;
        if (abstractServiceConnectionC0395e == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC0395e);
        this.f14783b = null;
        this.f14782a = null;
        this.f14784c = null;
    }

    @Override // p277oh.InterfaceC9948d
    public void onServiceConnected(C0393c c0393c) {
        this.f14783b = c0393c;
        c0393c.m2098h(0L);
        a aVar = this.f14785d;
        if (aVar != null) {
            aVar.onCustomTabsConnected();
        }
    }

    @Override // p277oh.InterfaceC9948d
    public void onServiceDisconnected() {
        this.f14783b = null;
        this.f14782a = null;
        a aVar = this.f14785d;
        if (aVar != null) {
            aVar.onCustomTabsDisconnected();
        }
    }
}
