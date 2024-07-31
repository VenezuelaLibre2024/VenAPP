package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.n;

/* loaded from: classes.dex */
public abstract class p<R extends n> implements o<R> {
    @Override // com.google.android.gms.common.api.o
    public final void a(R r10) {
        Status status = r10.getStatus();
        if (status.y1()) {
            c(r10);
            return;
        }
        b(status);
        if (r10 instanceof k) {
            try {
                ((k) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r10);
}
