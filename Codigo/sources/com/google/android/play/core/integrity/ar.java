package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ar extends aw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f10929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f10930b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f10931c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ax axVar, TaskCompletionSource taskCompletionSource, long j10, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f10931c = axVar;
        this.f10929a = j10;
        this.f10930b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.d0
    protected final void b() {
        c0 c0Var;
        if (ax.g(this.f10931c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.f10931c;
            ((com.google.android.play.integrity.internal.u) axVar.f10942a.e()).E1(ax.b(axVar, this.f10929a), new av(this.f10931c, this.f10930b));
        } catch (RemoteException e10) {
            c0Var = this.f10931c.f10943b;
            c0Var.b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f10929a));
            this.f10930b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
