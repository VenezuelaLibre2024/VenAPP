package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfu extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfu(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzfr.zze;
        atomicBoolean.set(true);
    }
}
