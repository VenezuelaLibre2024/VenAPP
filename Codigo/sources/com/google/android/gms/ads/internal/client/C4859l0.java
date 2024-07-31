package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.l0 */
/* loaded from: classes.dex */
public final class C4859l0 extends zzayg implements InterfaceC4871n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4859l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4871n0
    public final void zzg(C4917u4 c4917u4) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4917u4);
        zzbm(1, zza);
    }
}
