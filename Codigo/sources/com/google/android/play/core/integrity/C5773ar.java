package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5820c0;
import com.google.android.play.integrity.internal.InterfaceC5847u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.ar */
/* loaded from: classes2.dex */
public final class C5773ar extends AbstractC5778aw {

    /* renamed from: a */
    final /* synthetic */ long f12144a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f12145b;

    /* renamed from: c */
    final /* synthetic */ C5779ax f12146c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5773ar(C5779ax c5779ax, TaskCompletionSource taskCompletionSource, long j10, TaskCompletionSource taskCompletionSource2) {
        super(c5779ax, taskCompletionSource);
        this.f12146c = c5779ax;
        this.f12144a = j10;
        this.f12145b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: b */
    protected final void mo14617b() {
        C5820c0 c5820c0;
        if (C5779ax.m14635g(this.f12146c)) {
            super.mo14616a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C5779ax c5779ax = this.f12146c;
            ((InterfaceC5847u) c5779ax.f12157a.m14680e()).mo14700E1(C5779ax.m14632b(c5779ax, this.f12144a), new BinderC5777av(this.f12146c, this.f12145b));
        } catch (RemoteException e10) {
            c5820c0 = this.f12146c.f12158b;
            c5820c0.m14657b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f12144a));
            this.f12145b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
