package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class x extends a implements z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.z
    public final void w(Bundle bundle, b0 b0Var) {
        Parcel f22 = f2();
        o.c(f22, bundle);
        f22.writeStrongBinder(b0Var);
        g2(2, f22);
    }
}
