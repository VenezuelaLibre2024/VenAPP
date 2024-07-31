package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.location.n;

/* loaded from: classes2.dex */
final class zzan extends zzat {
    final /* synthetic */ n zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzau zzauVar, f fVar, n nVar) {
        super(fVar);
        this.zza = nVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzda) bVar).zzC(l.c(this.zza, n.class.getSimpleName()), true, zzau.zza(this));
    }
}
