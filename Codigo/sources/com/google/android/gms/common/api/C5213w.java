package com.google.android.gms.common.api;

import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.common.api.w */
/* loaded from: classes.dex */
final class C5213w<R extends InterfaceC5204n> extends BasePendingResult<R> {

    /* renamed from: a */
    private final InterfaceC5204n f10628a;

    public C5213w(AbstractC5106f abstractC5106f, InterfaceC5204n interfaceC5204n) {
        super(abstractC5106f);
        this.f10628a = interfaceC5204n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.f10628a;
    }
}
