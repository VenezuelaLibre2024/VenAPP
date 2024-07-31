package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 extends p {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q.a f9345e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(q.a aVar, k kVar, ca.d[] dVarArr, boolean z10, int i10) {
        super(kVar, dVarArr, z10, i10);
        this.f9345e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.p
    public final void d(a.b bVar, TaskCompletionSource<Void> taskCompletionSource) {
        r rVar;
        rVar = this.f9345e.f9453a;
        rVar.accept(bVar, taskCompletionSource);
    }
}
