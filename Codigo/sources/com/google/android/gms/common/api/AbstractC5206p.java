package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.InterfaceC5204n;

/* renamed from: com.google.android.gms.common.api.p */
/* loaded from: classes.dex */
public abstract class AbstractC5206p<R extends InterfaceC5204n> implements InterfaceC5205o<R> {
    @Override // com.google.android.gms.common.api.InterfaceC5205o
    /* renamed from: a */
    public final void mo13184a(R r10) {
        Status status = r10.getStatus();
        if (status.m12972y1()) {
            m13216c(r10);
            return;
        }
        m13215b(status);
        if (r10 instanceof InterfaceC5201k) {
            try {
                ((InterfaceC5201k) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    /* renamed from: b */
    public abstract void m13215b(Status status);

    /* renamed from: c */
    public abstract void m13216c(R r10);
}
