package com.google.android.gms.internal.p496authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.C5083a;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zbg extends zbm {
    final /* synthetic */ C5083a zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbg(zbl zblVar, AbstractC5106f abstractC5106f, C5083a c5083a) {
        super(abstractC5106f);
        this.zba = c5083a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC5204n createFailedResult(Status status) {
        return new zbe(status, null);
    }

    @Override // com.google.android.gms.internal.p496authapi.zbm
    protected final void zba(Context context, zbt zbtVar) {
        zbtVar.zbd(new zbf(this), this.zba);
    }
}
