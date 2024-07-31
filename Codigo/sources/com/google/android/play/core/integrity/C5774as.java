package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5820c0;
import com.google.android.play.integrity.internal.InterfaceC5847u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.as */
/* loaded from: classes2.dex */
public final class C5774as extends AbstractC5778aw {

    /* renamed from: a */
    final /* synthetic */ String f12147a;

    /* renamed from: b */
    final /* synthetic */ long f12148b;

    /* renamed from: c */
    final /* synthetic */ long f12149c;

    /* renamed from: d */
    final /* synthetic */ TaskCompletionSource f12150d;

    /* renamed from: e */
    final /* synthetic */ C5779ax f12151e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5774as(C5779ax c5779ax, TaskCompletionSource taskCompletionSource, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(c5779ax, taskCompletionSource);
        this.f12151e = c5779ax;
        this.f12147a = str;
        this.f12148b = j10;
        this.f12149c = j11;
        this.f12150d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: b */
    protected final void mo14617b() {
        C5820c0 c5820c0;
        if (C5779ax.m14635g(this.f12151e)) {
            super.mo14616a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C5779ax c5779ax = this.f12151e;
            ((InterfaceC5847u) c5779ax.f12157a.m14680e()).mo14701L1(C5779ax.m14631a(c5779ax, this.f12147a, this.f12148b, this.f12149c), new BinderC5776au(this.f12151e, this.f12150d));
        } catch (RemoteException e10) {
            c5820c0 = this.f12151e.f12158b;
            c5820c0.m14657b(e10, "requestExpressIntegrityToken(%s, %s)", this.f12147a, Long.valueOf(this.f12148b));
            this.f12150d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
