package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.p;

/* loaded from: classes2.dex */
final class zzca extends zzcb {
    final /* synthetic */ p zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcc zzccVar, f fVar, p pVar, String str) {
        super(fVar);
        this.zza = pVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* synthetic */ void doExecute(a.b bVar) {
        zzda zzdaVar = (zzda) bVar;
        p pVar = this.zza;
        s.b(pVar != null, "locationSettingsRequest can't be null");
        ((zzo) zzdaVar.getService()).zzh(pVar, new zzcr(this), null);
    }
}
