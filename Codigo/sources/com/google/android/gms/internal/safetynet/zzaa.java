package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xa.a;
import xa.j;

/* loaded from: classes2.dex */
final class zzaa implements n {
    private final Status zza;
    private final j zzb;

    public zzaa(Status status, j jVar) {
        this.zza = status;
        this.zzb = jVar;
    }

    public final List<a> getHarmfulAppsList() {
        j jVar = this.zzb;
        return jVar == null ? Collections.emptyList() : Arrays.asList(jVar.f30767b);
    }

    public final int getHoursSinceLastScanWithHarmfulApp() {
        j jVar = this.zzb;
        if (jVar == null) {
            return -1;
        }
        return jVar.f30768c;
    }

    public final long getLastScanTimeMs() {
        j jVar = this.zzb;
        if (jVar == null) {
            return 0L;
        }
        return jVar.f30766a;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }
}
