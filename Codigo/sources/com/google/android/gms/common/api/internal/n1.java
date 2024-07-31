package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n1 extends w {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w.a f9434d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(w.a aVar, ca.d[] dVarArr, boolean z10, int i10) {
        super(dVarArr, z10, i10);
        this.f9434d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.w
    public final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        r rVar;
        rVar = this.f9434d.f9482a;
        rVar.accept(bVar, taskCompletionSource);
    }
}
