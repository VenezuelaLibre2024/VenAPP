package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

/* loaded from: classes2.dex */
final class zzaq extends zzat {
    final /* synthetic */ boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzau zzauVar, f fVar, boolean z10) {
        super(fVar);
        this.zza = z10;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzda) bVar).zzA(this.zza, zzau.zza(this));
    }
}
