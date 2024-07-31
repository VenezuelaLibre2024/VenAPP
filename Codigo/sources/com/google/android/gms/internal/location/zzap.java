package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.location.m;

/* loaded from: classes2.dex */
final class zzap extends zzat {
    final /* synthetic */ m zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzau zzauVar, f fVar, m mVar) {
        super(fVar);
        this.zza = mVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzda) bVar).zzB(l.c(this.zza, m.class.getSimpleName()), true, zzau.zza(this));
    }
}
