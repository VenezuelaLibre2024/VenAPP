package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.f;

/* loaded from: classes2.dex */
final class zzo extends zzx {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzae zzaeVar, f fVar, String str) {
        super(fVar);
        this.zza = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(zzaf zzafVar) {
        ((zzh) zzafVar.getService()).zzj(this.zzb, this.zza);
    }
}
