package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcbs;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8603a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8604b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcbs f8605c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbyk f8606d = new zzbyk(false, Collections.emptyList());

    public b(Context context, zzcbs zzcbsVar, zzbyk zzbykVar) {
        this.f8603a = context;
        this.f8605c = zzcbsVar;
    }

    private final boolean d() {
        zzcbs zzcbsVar = this.f8605c;
        return (zzcbsVar != null && zzcbsVar.zza().zzf) || this.f8606d.zza;
    }

    public final void a() {
        this.f8604b = true;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            zzcbs zzcbsVar = this.f8605c;
            if (zzcbsVar != null) {
                zzcbsVar.zzd(str, null, 3);
                return;
            }
            zzbyk zzbykVar = this.f8606d;
            if (!zzbykVar.zza || (list = zzbykVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f8603a;
                    t.r();
                    j2.k(context, "", replace);
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.f8604b;
    }
}
