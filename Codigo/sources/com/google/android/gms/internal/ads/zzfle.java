package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class zzfle {
    private static final com.google.common.util.concurrent.f zza = zzgen.zzh(null);
    private final zzgey zzb;
    private final ScheduledExecutorService zzc;
    private final zzflf zzd;

    public zzfle(zzgey zzgeyVar, ScheduledExecutorService scheduledExecutorService, zzflf zzflfVar) {
        this.zzb = zzgeyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzflfVar;
    }

    public final zzfku zza(Object obj, com.google.common.util.concurrent.f... fVarArr) {
        return new zzfku(this, obj, Arrays.asList(fVarArr), null);
    }

    public final zzfld zzb(Object obj, com.google.common.util.concurrent.f fVar) {
        return new zzfld(this, obj, fVar, Collections.singletonList(fVar), fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
