package com.google.android.gms.common.api;

import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.common.api.x */
/* loaded from: classes.dex */
final class C5214x<R extends InterfaceC5204n> extends BasePendingResult<R> {
    public C5214x(AbstractC5106f abstractC5106f) {
        super(abstractC5106f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
