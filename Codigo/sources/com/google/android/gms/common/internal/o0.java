package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o0 implements i.a {

    /* renamed from: a */
    final /* synthetic */ com.google.android.gms.common.api.i f9609a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f9610b;

    /* renamed from: c */
    final /* synthetic */ r.a f9611c;

    /* renamed from: d */
    final /* synthetic */ r0 f9612d;

    public o0(com.google.android.gms.common.api.i iVar, TaskCompletionSource taskCompletionSource, r.a aVar, r0 r0Var) {
        this.f9609a = iVar;
        this.f9610b = taskCompletionSource;
        this.f9611c = aVar;
        this.f9612d = r0Var;
    }

    @Override // com.google.android.gms.common.api.i.a
    public final void a(Status status) {
        if (!status.y1()) {
            this.f9610b.setException(b.a(status));
        } else {
            this.f9610b.setResult(this.f9611c.a(this.f9609a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
