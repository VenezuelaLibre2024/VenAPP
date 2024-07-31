package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class a1 extends zza implements c1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.c1
    public final boolean f(ca.h0 h0Var, com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzc.zzc(zza, h0Var);
        zzc.zze(zza, bVar);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.common.internal.c1
    public final ca.f0 k(ca.d0 d0Var) {
        Parcel zza = zza();
        zzc.zzc(zza, d0Var);
        Parcel zzB = zzB(8, zza);
        ca.f0 f0Var = (ca.f0) zzc.zza(zzB, ca.f0.CREATOR);
        zzB.recycle();
        return f0Var;
    }

    @Override // com.google.android.gms.common.internal.c1
    public final ca.f0 v(ca.d0 d0Var) {
        Parcel zza = zza();
        zzc.zzc(zza, d0Var);
        Parcel zzB = zzB(6, zza);
        ca.f0 f0Var = (ca.f0) zzc.zza(zzB, ca.f0.CREATOR);
        zzB.recycle();
        return f0Var;
    }

    @Override // com.google.android.gms.common.internal.c1
    public final boolean zzi() {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
