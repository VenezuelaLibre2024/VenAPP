package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.qb */
/* loaded from: classes2.dex */
public final class C5641qb {

    /* renamed from: a */
    private final C5712w5 f11751a;

    public C5641qb(C5712w5 c5712w5) {
        this.f11751a = c5712w5;
    }

    /* renamed from: d */
    private final boolean m14249d() {
        return this.f11751a.m14494A().f12073x.m13720a() > 0;
    }

    /* renamed from: e */
    private final boolean m14250e() {
        return m14249d() && this.f11751a.zzb().mo28130a() - this.f11751a.m14494A().f12073x.m13720a() > this.f11751a.m14521u().m13905s(null, C5474e0.f11249V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m14251a() {
        this.f11751a.zzl().mo13687i();
        if (m14249d()) {
            if (m14250e()) {
                this.f11751a.m14494A().f12072w.m13878b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f11751a.m14496C().m13703u0("auto", "_cmpx", bundle);
            } else {
                String m13877a = this.f11751a.m14494A().f12072w.m13877a();
                if (TextUtils.isEmpty(m13877a)) {
                    this.f11751a.zzj().m14184D().m14218a("Cache still valid but referrer not found");
                } else {
                    long m13720a = ((this.f11751a.m14494A().f12073x.m13720a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(m13877a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", m13720a);
                    Object obj = pair.first;
                    this.f11751a.m14496C().m13703u0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f11751a.m14494A().f12072w.m13878b(null);
            }
            this.f11751a.m14494A().f12073x.m13721b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m14252b(String str, Bundle bundle) {
        String str2;
        this.f11751a.zzl().mo13687i();
        if (this.f11751a.m14512k()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f11751a.m14494A().f12072w.m13878b(str2);
        this.f11751a.m14494A().f12073x.m13721b(this.f11751a.zzb().mo28130a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m14253c() {
        if (m14249d() && m14250e()) {
            this.f11751a.m14494A().f12072w.m13878b(null);
        }
    }
}
