package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: classes2.dex */
final class zbk extends zbd {
    private final e zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbk(e eVar) {
        this.zba = eVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
