package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class t2 extends zzayg implements v2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zze() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzf(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzg() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzh() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzi() {
        zzbm(1, zza());
    }
}
