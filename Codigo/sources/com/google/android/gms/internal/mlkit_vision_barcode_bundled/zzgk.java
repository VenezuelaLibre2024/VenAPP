package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgk extends zzgu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgk(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgu
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzds) zzg(i10).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzds) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
