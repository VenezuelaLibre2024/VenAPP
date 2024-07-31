package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.k1;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzbfm {
    private final Context zza;

    public zzbfm(Context context) {
        s.k(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza(Intent intent) {
        s.k(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean zzb() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        return ((Boolean) k1.a(this.zza, zzbfl.zza)).booleanValue() && na.e.a(this.zza).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
