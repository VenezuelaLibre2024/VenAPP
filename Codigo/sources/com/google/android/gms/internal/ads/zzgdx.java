package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class zzgdx extends zzgdm {
    private List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdx(zzfzv zzfzvVar, boolean z10) {
        super(zzfzvVar, z10, true);
        List emptyList = zzfzvVar.isEmpty() ? Collections.emptyList() : zzgao.zza(zzfzvVar.size());
        for (int i10 = 0; i10 < zzfzvVar.size(); i10++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzf(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzgdw(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdm
    public final void zzy(int i10) {
        super.zzy(i10);
        this.zza = null;
    }
}
