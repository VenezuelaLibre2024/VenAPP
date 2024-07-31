package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import x9.c;

/* loaded from: classes2.dex */
final class zzbu implements n {
    private final Status zza;
    private c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public zzbu(c cVar) {
        this.zzb = cVar;
        this.zza = Status.f9292r;
    }

    public final c getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }
}
