package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;

/* renamed from: com.google.android.gms.ads.internal.client.z0 */
/* loaded from: classes.dex */
public final class C4943z0 extends zzayg implements InterfaceC4799c1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4943z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4799c1
    public final void zzc(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbm(1, zza);
    }
}
