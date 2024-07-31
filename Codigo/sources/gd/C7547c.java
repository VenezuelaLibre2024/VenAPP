package gd;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: gd.c */
/* loaded from: classes.dex */
public class C7547c {

    /* renamed from: a */
    private final C7545a f17843a;

    /* renamed from: b */
    private final Bundle f17844b;

    public C7547c(C7545a c7545a) {
        this.f17843a = c7545a;
        this.f17844b = m22914c(c7545a);
    }

    /* renamed from: b */
    private static void m22913b(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    /* renamed from: c */
    private static Bundle m22914c(C7545a c7545a) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (c7545a == null || c7545a.m22907x1() == null || (bundle = c7545a.m22907x1().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        m22913b("medium", "utm_medium", bundle2, bundle3);
        m22913b("source", "utm_source", bundle2, bundle3);
        m22913b("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }

    /* renamed from: a */
    public Bundle m22915a() {
        return new Bundle(this.f17844b);
    }
}
