package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzor {
    private final zzcu zza;
    private zzgaa zzb = zzgaa.zzl();
    private zzgad zzc = zzgad.zzd();
    private zzur zzd;
    private zzur zze;
    private zzur zzf;

    public zzor(zzcu zzcuVar) {
        this.zza = zzcuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzur zzj(zzco zzcoVar, zzgaa zzgaaVar, zzur zzurVar, zzcu zzcuVar) {
        zzcx zzn = zzcoVar.zzn();
        int zze = zzcoVar.zze();
        Object zzf = zzn.zzo() ? null : zzn.zzf(zze);
        int zzc = (zzcoVar.zzx() || zzn.zzo()) ? -1 : zzn.zzd(zze, zzcuVar, false).zzc(zzfy.zzq(zzcoVar.zzk()));
        for (int i10 = 0; i10 < zzgaaVar.size(); i10++) {
            zzur zzurVar2 = (zzur) zzgaaVar.get(i10);
            if (zzm(zzurVar2, zzf, zzcoVar.zzx(), zzcoVar.zzb(), zzcoVar.zzc(), zzc)) {
                return zzurVar2;
            }
        }
        if (zzgaaVar.isEmpty() && zzurVar != null) {
            if (zzm(zzurVar, zzf, zzcoVar.zzx(), zzcoVar.zzb(), zzcoVar.zzc(), zzc)) {
                return zzurVar;
            }
        }
        return null;
    }

    private final void zzk(zzgac zzgacVar, zzur zzurVar, zzcx zzcxVar) {
        if (zzurVar == null) {
            return;
        }
        if (zzcxVar.zza(zzurVar.zza) != -1) {
            zzgacVar.zza(zzurVar, zzcxVar);
            return;
        }
        zzcx zzcxVar2 = (zzcx) this.zzc.get(zzurVar);
        if (zzcxVar2 != null) {
            zzgacVar.zza(zzurVar, zzcxVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        zzk(r0, r3.zzd, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r3.zzb.contains(r3.zzd) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (com.google.android.gms.internal.ads.zzfwy.zza(r3.zzd, r3.zzf) == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(com.google.android.gms.internal.ads.zzcx r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzgac r0 = new com.google.android.gms.internal.ads.zzgac
            r0.<init>()
            com.google.android.gms.internal.ads.zzgaa r1 = r3.zzb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.zzur r1 = r3.zze
            r3.zzk(r0, r1, r4)
            com.google.android.gms.internal.ads.zzur r1 = r3.zzf
            com.google.android.gms.internal.ads.zzur r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfwy.zza(r1, r2)
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzur r1 = r3.zzf
            r3.zzk(r0, r1, r4)
        L21:
            com.google.android.gms.internal.ads.zzur r1 = r3.zzd
            com.google.android.gms.internal.ads.zzur r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfwy.zza(r1, r2)
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.zzur r1 = r3.zzd
            com.google.android.gms.internal.ads.zzur r2 = r3.zzf
            boolean r1 = com.google.android.gms.internal.ads.zzfwy.zza(r1, r2)
            if (r1 != 0) goto L5c
            goto L57
        L36:
            r1 = 0
        L37:
            com.google.android.gms.internal.ads.zzgaa r2 = r3.zzb
            int r2 = r2.size()
            if (r1 >= r2) goto L4d
            com.google.android.gms.internal.ads.zzgaa r2 = r3.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzur r2 = (com.google.android.gms.internal.ads.zzur) r2
            r3.zzk(r0, r2, r4)
            int r1 = r1 + 1
            goto L37
        L4d:
            com.google.android.gms.internal.ads.zzgaa r1 = r3.zzb
            com.google.android.gms.internal.ads.zzur r2 = r3.zzd
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5c
        L57:
            com.google.android.gms.internal.ads.zzur r1 = r3.zzd
            r3.zzk(r0, r1, r4)
        L5c:
            com.google.android.gms.internal.ads.zzgad r4 = r0.zzc()
            r3.zzc = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzor.zzl(com.google.android.gms.internal.ads.zzcx):void");
    }

    private static boolean zzm(zzur zzurVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zzurVar.zza.equals(obj)) {
            return false;
        }
        if (z10) {
            if (zzurVar.zzb != i10 || zzurVar.zzc != i11) {
                return false;
            }
        } else if (zzurVar.zzb != -1 || zzurVar.zze != i12) {
            return false;
        }
        return true;
    }

    public final zzcx zza(zzur zzurVar) {
        return (zzcx) this.zzc.get(zzurVar);
    }

    public final zzur zzb() {
        return this.zzd;
    }

    public final zzur zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzgaa zzgaaVar = this.zzb;
        if (!(zzgaaVar instanceof List)) {
            Iterator<E> it = zzgaaVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzgaaVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzgaaVar.get(zzgaaVar.size() - 1);
        }
        return (zzur) obj;
    }

    public final zzur zzd() {
        return this.zze;
    }

    public final zzur zze() {
        return this.zzf;
    }

    public final void zzg(zzco zzcoVar) {
        this.zzd = zzj(zzcoVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzur zzurVar, zzco zzcoVar) {
        this.zzb = zzgaa.zzj(list);
        if (!list.isEmpty()) {
            this.zze = (zzur) list.get(0);
            zzurVar.getClass();
            this.zzf = zzurVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcoVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcoVar.zzn());
    }

    public final void zzi(zzco zzcoVar) {
        this.zzd = zzj(zzcoVar, this.zzb, this.zze, this.zza);
        zzl(zzcoVar.zzn());
    }
}
