package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzgah extends zzfyb {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfxf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgah(Iterator it, zzfxf zzfxfVar) {
        this.zza = it;
        this.zzb = zzfxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfxf zzfxfVar = this.zzb;
            Object next = it.next();
            if (zzfxfVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
