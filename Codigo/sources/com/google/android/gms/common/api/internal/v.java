package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class v extends BasePendingResult<Status> {
    public v(com.google.android.gms.common.api.f fVar) {
        super(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Status createFailedResult(Status status) {
        return status;
    }
}