package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzv extends zze<Object> {
    protected final zzg zza;

    public zzv(f fVar) {
        super(fVar);
        this.zza = new zzu(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ n createFailedResult(Status status) {
        return new zzaa(status, null);
    }
}
