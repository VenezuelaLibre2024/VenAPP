package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
final class zzt extends zzv {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzw zzwVar, f fVar, long j10, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = j10;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zzf zzfVar = (zzf) bVar;
        long j10 = this.zza;
        PendingIntent pendingIntent = this.zzb;
        s.j(pendingIntent);
        s.b(j10 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzo) zzfVar.getService()).zzr(j10, true, pendingIntent);
        setResult((zzt) Status.f9292r);
    }
}
