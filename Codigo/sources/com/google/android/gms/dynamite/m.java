package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class m extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int f2(com.google.android.gms.dynamic.b bVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int g2(com.google.android.gms.dynamic.b bVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final com.google.android.gms.dynamic.b h2(com.google.android.gms.dynamic.b bVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzB.readStrongBinder());
        zzB.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b i2(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(8, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzB.readStrongBinder());
        zzB.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b j2(com.google.android.gms.dynamic.b bVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzB.readStrongBinder());
        zzB.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b k2(com.google.android.gms.dynamic.b bVar, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzB.readStrongBinder());
        zzB.recycle();
        return f22;
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
