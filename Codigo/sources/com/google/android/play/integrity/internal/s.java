package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class s extends a implements u {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.u
    public final void E1(Bundle bundle, w wVar) {
        Parcel f22 = f2();
        o.c(f22, bundle);
        f22.writeStrongBinder(wVar);
        g2(2, f22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.u
    public final void L1(Bundle bundle, w wVar) {
        Parcel f22 = f2();
        o.c(f22, bundle);
        f22.writeStrongBinder(wVar);
        g2(3, f22);
    }
}
