package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import ca.C1899d0;
import ca.C1903f0;
import ca.C1907h0;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.common.internal.a1 */
/* loaded from: classes.dex */
public final class C5222a1 extends zza implements InterfaceC5230c1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5222a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5230c1
    /* renamed from: f */
    public final boolean mo13223f(C1907h0 c1907h0, InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzc.zzc(zza, c1907h0);
        zzc.zze(zza, interfaceC5312b);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5230c1
    /* renamed from: k */
    public final C1903f0 mo13224k(C1899d0 c1899d0) {
        Parcel zza = zza();
        zzc.zzc(zza, c1899d0);
        Parcel zzB = zzB(8, zza);
        C1903f0 c1903f0 = (C1903f0) zzc.zza(zzB, C1903f0.CREATOR);
        zzB.recycle();
        return c1903f0;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5230c1
    /* renamed from: v */
    public final C1903f0 mo13225v(C1899d0 c1899d0) {
        Parcel zza = zza();
        zzc.zzc(zza, c1899d0);
        Parcel zzB = zzB(6, zza);
        C1903f0 c1903f0 = (C1903f0) zzc.zza(zzB, C1903f0.CREATOR);
        zzB.recycle();
        return c1903f0;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5230c1
    public final boolean zzi() {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
