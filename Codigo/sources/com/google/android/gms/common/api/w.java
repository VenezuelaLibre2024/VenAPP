package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.n;

/* loaded from: classes.dex */
final class w<R extends n> extends BasePendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    private final n f9514a;

    public w(f fVar, n nVar) {
        super(fVar);
        this.f9514a = nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.f9514a;
    }
}
