package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes.dex */
public final class a2 extends zza implements x0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.x0
    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.x0
    public final com.google.android.gms.dynamic.b zzd() {
        Parcel zzB = zzB(1, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzB.readStrongBinder());
        zzB.recycle();
        return f22;
    }
}
