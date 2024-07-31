package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C5005j2;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcbs;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.b */
/* loaded from: classes.dex */
public final class C4781b {

    /* renamed from: a */
    private final Context f9680a;

    /* renamed from: b */
    private boolean f9681b;

    /* renamed from: c */
    private final zzcbs f9682c;

    /* renamed from: d */
    private final zzbyk f9683d = new zzbyk(false, Collections.emptyList());

    public C4781b(Context context, zzcbs zzcbsVar, zzbyk zzbykVar) {
        this.f9680a = context;
        this.f9682c = zzcbsVar;
    }

    /* renamed from: d */
    private final boolean m12359d() {
        zzcbs zzcbsVar = this.f9682c;
        return (zzcbsVar != null && zzcbsVar.zza().zzf) || this.f9683d.zza;
    }

    /* renamed from: a */
    public final void m12360a() {
        this.f9681b = true;
    }

    /* renamed from: b */
    public final void m12361b(String str) {
        List<String> list;
        if (m12359d()) {
            if (str == null) {
                str = "";
            }
            zzcbs zzcbsVar = this.f9682c;
            if (zzcbsVar != null) {
                zzcbsVar.zzd(str, null, 3);
                return;
            }
            zzbyk zzbykVar = this.f9683d;
            if (!zzbykVar.zza || (list = zzbykVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f9680a;
                    C4965t.m12581r();
                    C5005j2.m12672k(context, "", replace);
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean m12362c() {
        return !m12359d() || this.f9681b;
    }
}
