package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class n extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.b f2(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(2, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzB.readStrongBinder());
        zzB.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b g2(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(3, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzB.readStrongBinder());
        zzB.recycle();
        return f22;
    }
}
