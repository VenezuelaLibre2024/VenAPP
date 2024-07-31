package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private final Uri f22049a;

    /* renamed from: c */
    private List<String> f22051c;

    /* renamed from: d */
    private Bundle f22052d;

    /* renamed from: b */
    private final d.b f22050b = new d.b();

    /* renamed from: e */
    private a f22053e = new a.C0361a();

    /* renamed from: f */
    private int f22054f = 0;

    public c(Uri uri) {
        this.f22049a = uri;
    }

    public b a(i iVar) {
        if (iVar == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.f22050b.i(iVar);
        Intent intent = this.f22050b.b().f1766a;
        intent.setData(this.f22049a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.f22051c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f22051c));
        }
        Bundle bundle = this.f22052d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List emptyList = Collections.emptyList();
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f22053e.a());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f22054f);
        return new b(intent, emptyList);
    }

    public c b(List<String> list) {
        this.f22051c = list;
        return this;
    }

    public c c(androidx.browser.customtabs.a aVar) {
        this.f22050b.e(aVar);
        return this;
    }

    public c d(a aVar) {
        this.f22053e = aVar;
        return this;
    }

    public c e(int i10) {
        this.f22054f = i10;
        return this;
    }
}
