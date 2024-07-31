package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class q2 extends zzayg implements s2 {
    public q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final v2 zzi() {
        v2 t2Var;
        Parcel zzbl = zzbl(11, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            t2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            t2Var = queryLocalInterface instanceof v2 ? (v2) queryLocalInterface : new t2(readStrongBinder);
        }
        zzbl.recycle();
        return t2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzm(v2 v2Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, v2Var);
        zzbm(8, zza);
    }
}
