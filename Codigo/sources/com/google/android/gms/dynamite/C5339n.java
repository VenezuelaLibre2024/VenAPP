package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.dynamite.n */
/* loaded from: classes.dex */
public final class C5339n extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5339n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: f2 */
    public final InterfaceC5312b m13437f2(InterfaceC5312b interfaceC5312b, String str, int i10, InterfaceC5312b interfaceC5312b2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, interfaceC5312b2);
        Parcel zzB = zzB(2, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzB.readStrongBinder());
        zzB.recycle();
        return m13410f2;
    }

    /* renamed from: g2 */
    public final InterfaceC5312b m13438g2(InterfaceC5312b interfaceC5312b, String str, int i10, InterfaceC5312b interfaceC5312b2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, interfaceC5312b2);
        Parcel zzB = zzB(3, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzB.readStrongBinder());
        zzB.recycle();
        return m13410f2;
    }
}
