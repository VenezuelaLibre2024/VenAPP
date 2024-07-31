package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.n;

/* loaded from: classes2.dex */
final class zbj extends zbm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbj(zbl zblVar, f fVar) {
        super(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ n createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    protected final void zba(Context context, zbt zbtVar) {
        zbtVar.zbf(new zbk(this));
    }
}
