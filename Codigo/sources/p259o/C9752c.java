package p259o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.C0391a;
import androidx.browser.customtabs.C0394d;
import androidx.browser.customtabs.C0399i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p259o.InterfaceC9750a;

/* renamed from: o.c */
/* loaded from: classes.dex */
public class C9752c {

    /* renamed from: a */
    private final Uri f23982a;

    /* renamed from: c */
    private List<String> f23984c;

    /* renamed from: d */
    private Bundle f23985d;

    /* renamed from: b */
    private final C0394d.b f23983b = new C0394d.b();

    /* renamed from: e */
    private InterfaceC9750a f23986e = new InterfaceC9750a.a();

    /* renamed from: f */
    private int f23987f = 0;

    public C9752c(Uri uri) {
        this.f23982a = uri;
    }

    /* renamed from: a */
    public C9751b m29228a(C0399i c0399i) {
        if (c0399i == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.f23983b.m2119i(c0399i);
        Intent intent = this.f23983b.m2113b().f2069a;
        intent.setData(this.f23982a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.f23984c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f23984c));
        }
        Bundle bundle = this.f23985d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List emptyList = Collections.emptyList();
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f23986e.mo29226a());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f23987f);
        return new C9751b(intent, emptyList);
    }

    /* renamed from: b */
    public C9752c m29229b(List<String> list) {
        this.f23984c = list;
        return this;
    }

    /* renamed from: c */
    public C9752c m29230c(C0391a c0391a) {
        this.f23983b.m2115e(c0391a);
        return this;
    }

    /* renamed from: d */
    public C9752c m29231d(InterfaceC9750a interfaceC9750a) {
        this.f23986e = interfaceC9750a;
        return this;
    }

    /* renamed from: e */
    public C9752c m29232e(int i10) {
        this.f23987f = i10;
        return this;
    }
}
