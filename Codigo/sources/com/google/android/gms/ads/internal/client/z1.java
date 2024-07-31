package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class z1 extends zzayg implements c2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.c2
    public final void zze(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(1, zza);
    }
}
