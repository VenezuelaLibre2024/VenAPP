package com.google.android.gms.internal.p498firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import la.C9456a;
import la.C9466k;

/* loaded from: classes2.dex */
public final class zzadp {
    private final String zza;
    private final String zzb;

    public zzadp(Context context) {
        this(context, context.getPackageName());
    }

    private zzadp(Context context, String str) {
        C5276s.m13324j(context);
        String m13320f = C5276s.m13320f(str);
        this.zza = m13320f;
        try {
            byte[] m28113a = C9456a.m28113a(context, m13320f);
            if (m28113a != null) {
                this.zzb = C9466k.m28155c(m28113a, false);
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
