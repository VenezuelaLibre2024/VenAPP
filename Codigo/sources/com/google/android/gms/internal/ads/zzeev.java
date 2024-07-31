package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.d0;
import com.google.android.gms.ads.internal.util.u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeev implements zzgej {
    final /* synthetic */ zzbyx zza;

    public zzeev(zzeew zzeewVar, zzbyx zzbyxVar) {
        this.zza = zzbyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        try {
            this.zza.zze(d0.v1(th2));
        } catch (RemoteException e10) {
            u1.b("Ad service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e10) {
            u1.b("Ad service can't call client", e10);
        }
    }
}
