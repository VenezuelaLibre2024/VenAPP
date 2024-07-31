package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.List;

/* loaded from: classes2.dex */
final class zzbt extends zzbu {
    final /* synthetic */ List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbt(zzbv zzbvVar, f fVar, List list) {
        super(fVar);
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzda) bVar).zzy(this.zza, zzbv.zza(this));
    }
}
