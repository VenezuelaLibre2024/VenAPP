package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.z1 */
/* loaded from: classes.dex */
public final class C4944z1 extends zzayg implements InterfaceC4800c2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4944z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4800c2
    public final void zze(C4801c3 c4801c3) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4801c3);
        zzbm(1, zza);
    }
}
