package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class j2 extends zzayg implements l2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.l2
    public final void zze(String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        Parcel zza = zza();
        zza.writeString(str);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, bVar2);
        zzbm(1, zza);
    }
}
