package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.f;
import java.util.List;

/* loaded from: classes2.dex */
final class zzj extends zzz {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zzae zzaeVar, f fVar, List list, String str, String str2) {
        super(fVar);
        this.zza = list;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(zzaf zzafVar) {
        zzafVar.zzq(this.zze, this.zza, 1, this.zzb, null);
    }
}
