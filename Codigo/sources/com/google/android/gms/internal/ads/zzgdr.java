package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
final class zzgdr extends zzgdo {
    private zzgdr() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdr(zzgdq zzgdqVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdo
    public final int zza(zzgds zzgdsVar) {
        int i10;
        int i11;
        synchronized (zzgdsVar) {
            i10 = zzgdsVar.remaining;
            i11 = i10 - 1;
            zzgdsVar.remaining = i11;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdo
    public final void zzb(zzgds zzgdsVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgdsVar) {
            set3 = zzgdsVar.seenExceptions;
            if (set3 == null) {
                zzgdsVar.seenExceptions = set2;
            }
        }
    }
}
