package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import la.a;
import la.k;

/* loaded from: classes2.dex */
public final class zzadp {
    private final String zza;
    private final String zzb;

    public zzadp(Context context) {
        this(context, context.getPackageName());
    }

    private zzadp(Context context, String str) {
        s.j(context);
        String f10 = s.f(str);
        this.zza = f10;
        try {
            byte[] a10 = a.a(context, f10);
            if (a10 != null) {
                this.zzb = k.c(a10, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
