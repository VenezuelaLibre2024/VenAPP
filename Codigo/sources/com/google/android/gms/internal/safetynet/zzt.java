package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.n;
import xa.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzt extends zze<e.d> {
    protected final zzg zza;

    public zzt(f fVar) {
        super(fVar);
        this.zza = new zzs(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ n createFailedResult(Status status) {
        return new zzad(status, false);
    }
}
