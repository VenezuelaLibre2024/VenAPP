package com.google.android.gms.internal.p496authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zbi extends zbm {
    final /* synthetic */ Credential zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbi(zbl zblVar, AbstractC5106f abstractC5106f, Credential credential) {
        super(abstractC5106f);
        this.zba = credential;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC5204n createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p496authapi.zbm
    protected final void zba(Context context, zbt zbtVar) {
        zbtVar.zbc(new zbk(this), new zbp(this.zba));
    }
}
