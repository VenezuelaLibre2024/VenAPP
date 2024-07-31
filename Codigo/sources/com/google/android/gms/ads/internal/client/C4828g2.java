package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.g2 */
/* loaded from: classes.dex */
public final class C4828g2 extends zzayg implements InterfaceC4842i2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4828g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4842i2
    /* renamed from: x1 */
    public final void mo12402x1(C4796b5 c4796b5) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4796b5);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4842i2
    public final boolean zzf() {
        Parcel zzbl = zzbl(2, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
