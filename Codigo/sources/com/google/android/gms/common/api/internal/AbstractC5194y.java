package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5101a.b;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes.dex */
public abstract class AbstractC5194y<A extends C5101a.b, L> {

    /* renamed from: a */
    private final C5151k.a f10613a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5194y(C5151k.a<L> aVar) {
        this.f10613a = aVar;
    }

    /* renamed from: a */
    public C5151k.a<L> m13205a() {
        return this.f10613a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13031b(A a10, TaskCompletionSource<Boolean> taskCompletionSource);
}
