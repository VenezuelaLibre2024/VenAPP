package com.google.android.gms.common.internal;

import android.os.IBinder;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes.dex */
public final class z1 extends zza implements l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.l
    public final void cancel() {
        zzD(2, zza());
    }
}
