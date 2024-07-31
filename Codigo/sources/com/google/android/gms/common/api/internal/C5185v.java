package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes.dex */
public class C5185v extends BasePendingResult<Status> {
    public C5185v(AbstractC5106f abstractC5106f) {
        super(abstractC5106f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Status createFailedResult(Status status) {
        return status;
    }
}
