package gd;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f16206a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f16207b;

    public c(a aVar) {
        this.f16206a = aVar;
        this.f16207b = c(aVar);
    }

    private static void b(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    private static Bundle c(a aVar) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (aVar == null || aVar.x1() == null || (bundle = aVar.x1().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        b("medium", "utm_medium", bundle2, bundle3);
        b("source", "utm_source", bundle2, bundle3);
        b("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }

    public Bundle a() {
        return new Bundle(this.f16207b);
    }
}
