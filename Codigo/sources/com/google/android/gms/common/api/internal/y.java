package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class y<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final k.a f9499a;

    /* JADX INFO: Access modifiers changed from: protected */
    public y(k.a<L> aVar) {
        this.f9499a = aVar;
    }

    public k.a<L> a() {
        return this.f9499a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(A a10, TaskCompletionSource<Boolean> taskCompletionSource);
}
