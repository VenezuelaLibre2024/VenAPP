package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class as extends aw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10932a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f10933b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f10934c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f10935d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ax f10936e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(ax axVar, TaskCompletionSource taskCompletionSource, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f10936e = axVar;
        this.f10932a = str;
        this.f10933b = j10;
        this.f10934c = j11;
        this.f10935d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.d0
    protected final void b() {
        c0 c0Var;
        if (ax.g(this.f10936e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.f10936e;
            ((com.google.android.play.integrity.internal.u) axVar.f10942a.e()).L1(ax.a(axVar, this.f10932a, this.f10933b, this.f10934c), new au(this.f10936e, this.f10935d));
        } catch (RemoteException e10) {
            c0Var = this.f10936e.f10943b;
            c0Var.b(e10, "requestExpressIntegrityToken(%s, %s)", this.f10932a, Long.valueOf(this.f10933b));
            this.f10935d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
