package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.integrity.internal.h0 */
/* loaded from: classes2.dex */
public final class C5830h0 extends AbstractRunnableC5822d0 {

    /* renamed from: r */
    final /* synthetic */ C5821d f12233r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5830h0(C5821d c5821d) {
        this.f12233r = c5821d;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: b */
    public final void mo14617b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        C5820c0 c5820c0;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        C5820c0 c5820c02;
        obj = this.f12233r.f12216f;
        synchronized (obj) {
            atomicInteger = this.f12233r.f12222l;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.f12233r.f12222l;
                if (atomicInteger2.decrementAndGet() > 0) {
                    c5820c02 = this.f12233r.f12212b;
                    c5820c02.m14658c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            C5821d c5821d = this.f12233r;
            iInterface = c5821d.f12224n;
            if (iInterface != null) {
                c5820c0 = c5821d.f12212b;
                c5820c0.m14658c("Unbind from service.", new Object[0]);
                C5821d c5821d2 = this.f12233r;
                context = c5821d2.f12211a;
                serviceConnection = c5821d2.f12223m;
                context.unbindService(serviceConnection);
                this.f12233r.f12217g = false;
                this.f12233r.f12224n = null;
                this.f12233r.f12223m = null;
            }
            this.f12233r.m14678x();
        }
    }
}
