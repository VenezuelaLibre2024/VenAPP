package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbxg extends zzayg implements zzbxi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzf(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbm(1, zza);
    }
}
