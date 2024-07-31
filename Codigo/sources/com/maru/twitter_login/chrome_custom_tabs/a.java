package com.maru.twitter_login.chrome_custom_tabs;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.i;
import java.util.List;
import oh.d;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private i f13490a;

    /* renamed from: b, reason: collision with root package name */
    private c f13491b;

    /* renamed from: c, reason: collision with root package name */
    private e f13492c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0192a f13493d;

    /* renamed from: e, reason: collision with root package name */
    private b f13494e;

    /* renamed from: com.maru.twitter_login.chrome_custom_tabs.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0192a {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean c(Activity activity) {
        return oh.a.b(activity) != null;
    }

    public static void e(Activity activity, androidx.browser.customtabs.d dVar, Uri uri, int i10) {
        dVar.f1766a.setData(uri);
        activity.startActivityForResult(dVar.f1766a, i10);
    }

    public void a(Activity activity) {
        String b10;
        if (this.f13491b == null && (b10 = oh.a.b(activity)) != null) {
            oh.c cVar = new oh.c(this);
            this.f13492c = cVar;
            c.a(activity, b10, cVar);
        }
    }

    public i b() {
        i f10;
        c cVar = this.f13491b;
        if (cVar != null) {
            f10 = this.f13490a == null ? cVar.f(this.f13494e) : null;
            return this.f13490a;
        }
        this.f13490a = f10;
        return this.f13490a;
    }

    public boolean d(Uri uri, Bundle bundle, List<Bundle> list) {
        i b10;
        if (this.f13491b == null || (b10 = b()) == null) {
            return false;
        }
        return b10.i(uri, bundle, list);
    }

    public void f(InterfaceC0192a interfaceC0192a) {
        this.f13493d = interfaceC0192a;
    }

    public void g(Activity activity) {
        e eVar = this.f13492c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f13491b = null;
        this.f13490a = null;
        this.f13492c = null;
    }

    @Override // oh.d
    public void onServiceConnected(c cVar) {
        this.f13491b = cVar;
        cVar.h(0L);
        InterfaceC0192a interfaceC0192a = this.f13493d;
        if (interfaceC0192a != null) {
            interfaceC0192a.onCustomTabsConnected();
        }
    }

    @Override // oh.d
    public void onServiceDisconnected() {
        this.f13491b = null;
        this.f13490a = null;
        InterfaceC0192a interfaceC0192a = this.f13493d;
        if (interfaceC0192a != null) {
            interfaceC0192a.onCustomTabsDisconnected();
        }
    }
}
