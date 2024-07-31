package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;

/* renamed from: com.google.android.gms.ads.internal.client.v1 */
/* loaded from: classes.dex */
public final class C4920v1 extends zzayg implements InterfaceC4932x1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4920v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4932x1
    public final String zze() {
        Parcel zzbl = zzbl(1, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4932x1
    public final String zzf() {
        Parcel zzbl = zzbl(2, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }
}
