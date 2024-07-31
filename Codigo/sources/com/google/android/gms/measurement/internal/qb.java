package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class qb {

    /* renamed from: a */
    private final w5 f10564a;

    public qb(w5 w5Var) {
        this.f10564a = w5Var;
    }

    private final boolean d() {
        return this.f10564a.A().f10858x.a() > 0;
    }

    private final boolean e() {
        return d() && this.f10564a.zzb().a() - this.f10564a.A().f10858x.a() > this.f10564a.u().s(null, e0.V);
    }

    public final void a() {
        this.f10564a.zzl().i();
        if (d()) {
            if (e()) {
                this.f10564a.A().f10857w.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f10564a.C().u0("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f10564a.A().f10857w.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f10564a.zzj().D().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f10564a.A().f10858x.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    this.f10564a.C().u0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f10564a.A().f10857w.b(null);
            }
            this.f10564a.A().f10858x.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String str2;
        this.f10564a.zzl().i();
        if (this.f10564a.k()) {
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
        this.f10564a.A().f10857w.b(str2);
        this.f10564a.A().f10858x.b(this.f10564a.zzb().a());
    }

    public final void c() {
        if (d() && e()) {
            this.f10564a.A().f10857w.b(null);
        }
    }
}
