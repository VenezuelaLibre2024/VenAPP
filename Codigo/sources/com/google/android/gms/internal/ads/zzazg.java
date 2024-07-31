package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzazg {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzazf zza(boolean z10) {
        synchronized (this.zzb) {
            zzazf zzazfVar = null;
            if (this.zzc.isEmpty()) {
                zzcec.zze("Queue empty");
                return null;
            }
            int i10 = 0;
            if (this.zzc.size() < 2) {
                zzazf zzazfVar2 = (zzazf) this.zzc.get(0);
                if (z10) {
                    this.zzc.remove(0);
                } else {
                    zzazfVar2.zzi();
                }
                return zzazfVar2;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = 0;
            for (zzazf zzazfVar3 : this.zzc) {
                int zzb = zzazfVar3.zzb();
                if (zzb > i11) {
                    i10 = i12;
                }
                int i13 = zzb > i11 ? zzb : i11;
                if (zzb > i11) {
                    zzazfVar = zzazfVar3;
                }
                i12++;
                i11 = i13;
            }
            this.zzc.remove(i10);
            return zzazfVar;
        }
    }

    public final void zzb(zzazf zzazfVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                zzcec.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i10 = this.zza;
            this.zza = i10 + 1;
            zzazfVar.zzj(i10);
            zzazfVar.zzn();
            this.zzc.add(zzazfVar);
        }
    }

    public final boolean zzc(zzazf zzazfVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzazf zzazfVar2 = (zzazf) it.next();
                if (t.q().zzi().zzN()) {
                    if (!t.q().zzi().zzO() && !zzazfVar.equals(zzazfVar2) && zzazfVar2.zzf().equals(zzazfVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzazfVar.equals(zzazfVar2) && zzazfVar2.zzd().equals(zzazfVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzazf zzazfVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzazfVar);
        }
    }
}
