package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.n;
import xa.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzr extends zze<e.b> {
    protected final zzg zzc;

    public zzr(f fVar) {
        super(fVar);
        this.zzc = new zzq(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ n createFailedResult(Status status) {
        return new zzp(status, null);
    }
}
