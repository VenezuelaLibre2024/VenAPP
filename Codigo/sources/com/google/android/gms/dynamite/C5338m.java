package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.dynamite.m */
/* loaded from: classes.dex */
public final class C5338m extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5338m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: f2 */
    public final int m13431f2(InterfaceC5312b interfaceC5312b, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: g2 */
    public final int m13432g2(InterfaceC5312b interfaceC5312b, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: h2 */
    public final InterfaceC5312b m13433h2(InterfaceC5312b interfaceC5312b, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzB.readStrongBinder());
        zzB.recycle();
        return m13410f2;
    }

    /* renamed from: i2 */
    public final InterfaceC5312b m13434i2(InterfaceC5312b interfaceC5312b, String str, int i10, InterfaceC5312b interfaceC5312b2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, interfaceC5312b2);
        Parcel zzB = zzB(8, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzB.readStrongBinder());
        zzB.recycle();
        return m13410f2;
    }

    /* renamed from: j2 */
    public final InterfaceC5312b m13435j2(InterfaceC5312b interfaceC5312b, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzB.readStrongBinder());
        zzB.recycle();
        return m13410f2;
    }

    /* renamed from: k2 */
    public final InterfaceC5312b m13436k2(InterfaceC5312b interfaceC5312b, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzB.readStrongBinder());
        zzB.recycle();
        return m13410f2;
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
