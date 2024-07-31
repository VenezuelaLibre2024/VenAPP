package com.google.android.gms.internal.p496authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC5127e;

/* loaded from: classes2.dex */
final class zbk extends zbd {
    private final InterfaceC5127e zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbk(InterfaceC5127e interfaceC5127e) {
        this.zba = interfaceC5127e;
    }

    @Override // com.google.android.gms.internal.p496authapi.zbd, com.google.android.gms.internal.p496authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
