package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.k;

/* loaded from: classes2.dex */
final class zzbr extends zzbu {
    final /* synthetic */ k zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbr(zzbv zzbvVar, f fVar, k kVar, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = kVar;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzda) bVar).zzq(this.zza, this.zzb, zzbv.zza(this));
    }
}
