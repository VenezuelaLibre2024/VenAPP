package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C4917u4;
import com.google.android.gms.ads.internal.util.C4982e;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Map;
import java.util.TreeMap;
import na.C9696e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.r */
/* loaded from: classes.dex */
public final class C4963r {

    /* renamed from: a */
    private final Context f9993a;

    /* renamed from: b */
    private final String f9994b;

    /* renamed from: c */
    private final Map f9995c = new TreeMap();

    /* renamed from: d */
    private String f9996d;

    /* renamed from: e */
    private String f9997e;

    /* renamed from: f */
    private final String f9998f;

    public C4963r(Context context, String str) {
        String concat;
        this.f9993a = context.getApplicationContext();
        this.f9994b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + C9696e.m29080a(context).m29077f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            zzcec.zzh("Unable to get package version name for reporting", e10);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f9998f = concat;
    }

    /* renamed from: a */
    public final String m12546a() {
        return this.f9998f;
    }

    /* renamed from: b */
    public final String m12547b() {
        return this.f9997e;
    }

    /* renamed from: c */
    public final String m12548c() {
        return this.f9994b;
    }

    /* renamed from: d */
    public final String m12549d() {
        return this.f9996d;
    }

    /* renamed from: e */
    public final Map m12550e() {
        return this.f9995c;
    }

    /* renamed from: f */
    public final void m12551f(C4917u4 c4917u4, zzcei zzceiVar) {
        this.f9996d = c4917u4.f9845u.f9763a;
        Bundle bundle = c4917u4.f9848x;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) zzbho.zzc.zze();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f9997e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f9995c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f9995c.put("SDKVersion", zzceiVar.zza);
        if (((Boolean) zzbho.zza.zze()).booleanValue()) {
            Bundle m12626b = C4982e.m12626b(this.f9993a, (String) zzbho.zzb.zze());
            for (String str3 : m12626b.keySet()) {
                this.f9995c.put(str3, m12626b.get(str3).toString());
            }
        }
    }
}
