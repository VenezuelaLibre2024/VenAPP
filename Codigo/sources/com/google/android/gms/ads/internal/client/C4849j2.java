package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.j2 */
/* loaded from: classes.dex */
public final class C4849j2 extends zzayg implements InterfaceC4861l2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4849j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4861l2
    public final void zze(String str, InterfaceC5312b interfaceC5312b, InterfaceC5312b interfaceC5312b2) {
        Parcel zza = zza();
        zza.writeString(str);
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzf(zza, interfaceC5312b2);
        zzbm(1, zza);
    }
}
