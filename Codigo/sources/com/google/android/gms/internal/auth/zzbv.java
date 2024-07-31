package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzbv implements n {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) s.j(status);
        this.zzb = "";
    }

    public zzbv(String str) {
        this.zzb = (String) s.j(str);
        this.zza = Status.f9292r;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }
}
