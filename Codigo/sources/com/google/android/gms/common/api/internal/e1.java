package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1 extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q.a f9351b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(q.a aVar, k.a aVar2) {
        super(aVar2);
        this.f9351b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.y
    public final void b(a.b bVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        r rVar;
        rVar = this.f9351b.f9454b;
        rVar.accept(bVar, taskCompletionSource);
    }
}
