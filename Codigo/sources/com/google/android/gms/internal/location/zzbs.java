package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

/* loaded from: classes2.dex */
final class zzbs extends zzbu {
    final /* synthetic */ PendingIntent zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbs(zzbv zzbvVar, f fVar, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzda) bVar).zzx(this.zza, zzbv.zza(this));
    }
}
