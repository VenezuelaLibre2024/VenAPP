package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8899b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8900c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    private String f8901d;

    /* renamed from: e, reason: collision with root package name */
    private String f8902e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8903f;

    public r(Context context, String str) {
        String concat;
        this.f8898a = context.getApplicationContext();
        this.f8899b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + na.e.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            zzcec.zzh("Unable to get package version name for reporting", e10);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f8903f = concat;
    }

    public final String a() {
        return this.f8903f;
    }

    public final String b() {
        return this.f8902e;
    }

    public final String c() {
        return this.f8899b;
    }

    public final String d() {
        return this.f8901d;
    }

    public final Map e() {
        return this.f8900c;
    }

    public final void f(u4 u4Var, zzcei zzceiVar) {
        this.f8901d = u4Var.f8758u.f8686a;
        Bundle bundle = u4Var.f8761x;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) zzbho.zzc.zze();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f8902e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f8900c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f8900c.put("SDKVersion", zzceiVar.zza);
        if (((Boolean) zzbho.zza.zze()).booleanValue()) {
            Bundle b10 = com.google.android.gms.ads.internal.util.e.b(this.f8898a, (String) zzbho.zzb.zze());
            for (String str3 : b10.keySet()) {
                this.f8900c.put(str3, b10.get(str3).toString());
            }
        }
    }
}
