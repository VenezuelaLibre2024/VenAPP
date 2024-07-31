package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

/* loaded from: classes2.dex */
final class zzak implements n {
    private final Status zza;

    public zzak(Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }
}
