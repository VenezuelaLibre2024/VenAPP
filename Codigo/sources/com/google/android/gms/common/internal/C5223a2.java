package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.common.zza;

/* renamed from: com.google.android.gms.common.internal.a2 */
/* loaded from: classes.dex */
public final class C5223a2 extends zza implements InterfaceC5292x0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5223a2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5292x0
    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5292x0
    public final InterfaceC5312b zzd() {
        Parcel zzB = zzB(1, zza());
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzB.readStrongBinder());
        zzB.recycle();
        return m13410f2;
    }
}
