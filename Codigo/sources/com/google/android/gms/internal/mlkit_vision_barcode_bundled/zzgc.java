package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgc {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgc(zzgb zzgbVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzdb zza(zzgc zzgcVar, zzdb zzdbVar, zzdb zzdbVar2) {
        zzgcVar.zzb(zzdbVar);
        zzgcVar.zzb(zzdbVar2);
        zzdb zzdbVar3 = (zzdb) zzgcVar.zza.pop();
        while (!zzgcVar.zza.isEmpty()) {
            zzdbVar3 = new zzgg((zzdb) zzgcVar.zza.pop(), zzdbVar3);
        }
        return zzdbVar3;
    }

    private final void zzb(zzdb zzdbVar) {
        zzgf zzgfVar;
        if (!zzdbVar.zzh()) {
            if (!(zzdbVar instanceof zzgg)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzdbVar.getClass())));
            }
            zzgg zzggVar = (zzgg) zzdbVar;
            zzb(zzgg.zzg(zzggVar));
            zzb(zzgg.zzy(zzggVar));
            return;
        }
        int zzc = zzc(zzdbVar.zzd());
        int zzc2 = zzgg.zzc(zzc + 1);
        if (this.zza.isEmpty() || ((zzdb) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzdbVar);
            return;
        }
        int zzc3 = zzgg.zzc(zzc);
        zzdb zzdbVar2 = (zzdb) this.zza.pop();
        while (true) {
            zzgfVar = null;
            if (this.zza.isEmpty() || ((zzdb) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzdbVar2 = new zzgg((zzdb) this.zza.pop(), zzdbVar2);
            }
        }
        zzgg zzggVar2 = new zzgg(zzdbVar2, zzdbVar);
        while (!this.zza.isEmpty()) {
            if (((zzdb) this.zza.peek()).zzd() >= zzgg.zzc(zzc(zzggVar2.zzd()) + 1)) {
                break;
            } else {
                zzggVar2 = new zzgg((zzdb) this.zza.pop(), zzggVar2);
            }
        }
        this.zza.push(zzggVar2);
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzgg.zza, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
