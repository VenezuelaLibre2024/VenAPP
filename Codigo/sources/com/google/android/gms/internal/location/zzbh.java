package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.location.e;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbh implements r {
    public final /* synthetic */ e zza;
    public final /* synthetic */ CancellationToken zzb;

    public /* synthetic */ zzbh(e eVar, CancellationToken cancellationToken) {
        this.zza = eVar;
        this.zzb = cancellationToken;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void accept(Object obj, Object obj2) {
        a aVar = zzbp.zzb;
        ((zzda) obj).zzs(this.zza, this.zzb, (TaskCompletionSource) obj2);
    }
}
