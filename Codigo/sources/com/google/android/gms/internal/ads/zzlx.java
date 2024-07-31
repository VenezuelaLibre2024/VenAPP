package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzlx {
    private final zzpb zza;
    private final zzlw zze;
    private final zzmp zzh;
    private final zzew zzi;
    private boolean zzj;
    private zzhy zzk;
    private zzwk zzl = new zzwk(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlx(zzlw zzlwVar, zzmp zzmpVar, zzew zzewVar, zzpb zzpbVar) {
        this.zza = zzpbVar;
        this.zze = zzlwVar;
        this.zzh = zzmpVar;
        this.zzi = zzewVar;
    }

    private final void zzr(int i10, int i11) {
        while (i10 < this.zzb.size()) {
            ((zzlv) this.zzb.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzs(zzlv zzlvVar) {
        zzlu zzluVar = (zzlu) this.zzf.get(zzlvVar);
        if (zzluVar != null) {
            zzluVar.zza.zzi(zzluVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlv zzlvVar = (zzlv) it.next();
            if (zzlvVar.zzc.isEmpty()) {
                zzs(zzlvVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzlv zzlvVar) {
        if (zzlvVar.zze && zzlvVar.zzc.isEmpty()) {
            zzlu zzluVar = (zzlu) this.zzf.remove(zzlvVar);
            zzluVar.getClass();
            zzluVar.zza.zzp(zzluVar.zzb);
            zzluVar.zza.zzs(zzluVar.zzc);
            zzluVar.zza.zzr(zzluVar.zzc);
            this.zzg.remove(zzlvVar);
        }
    }

    private final void zzv(zzlv zzlvVar) {
        zzum zzumVar = zzlvVar.zza;
        zzln zzlnVar = new zzus() { // from class: com.google.android.gms.internal.ads.zzln
            public /* synthetic */ zzln() {
            }

            @Override // com.google.android.gms.internal.ads.zzus
            public final void zza(zzut zzutVar, zzcx zzcxVar) {
                zzlx.this.zzf(zzutVar, zzcxVar);
            }
        };
        zzlt zzltVar = new zzlt(this, zzlvVar);
        this.zzf.put(zzlvVar, new zzlu(zzumVar, zzlnVar, zzltVar));
        zzumVar.zzh(new Handler(zzfy.zzx(), null), zzltVar);
        zzumVar.zzg(new Handler(zzfy.zzx(), null), zzltVar);
        zzumVar.zzm(zzlnVar, this.zzk, this.zza);
    }

    private final void zzw(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            zzlv zzlvVar = (zzlv) this.zzb.remove(i11);
            this.zzd.remove(zzlvVar.zzb);
            zzr(i11, -zzlvVar.zza.zzC().zzc());
            zzlvVar.zze = true;
            if (this.zzj) {
                zzu(zzlvVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcx zzb() {
        if (this.zzb.isEmpty()) {
            return zzcx.zza;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb.size(); i11++) {
            zzlv zzlvVar = (zzlv) this.zzb.get(i11);
            zzlvVar.zzd = i10;
            i10 += zzlvVar.zza.zzC().zzc();
        }
        return new zzmd(this.zzb, this.zzl);
    }

    public final zzcx zzc(int i10, int i11, List list) {
        zzek.zzd(i10 >= 0 && i10 <= i11 && i11 <= zza());
        zzek.zzd(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((zzlv) this.zzb.get(i12)).zza.zzt((zzbp) list.get(i12 - i10));
        }
        return zzb();
    }

    public final /* synthetic */ void zzf(zzut zzutVar, zzcx zzcxVar) {
        this.zze.zzh();
    }

    public final void zzg(zzhy zzhyVar) {
        zzek.zzf(!this.zzj);
        this.zzk = zzhyVar;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzlv zzlvVar = (zzlv) this.zzb.get(i10);
            zzv(zzlvVar);
            this.zzg.add(zzlvVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlu zzluVar : this.zzf.values()) {
            try {
                zzluVar.zza.zzp(zzluVar.zzb);
            } catch (RuntimeException e10) {
                zzff.zzd("MediaSourceList", "Failed to release child source.", e10);
            }
            zzluVar.zza.zzs(zzluVar.zzc);
            zzluVar.zza.zzr(zzluVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzup zzupVar) {
        zzlv zzlvVar = (zzlv) this.zzc.remove(zzupVar);
        zzlvVar.getClass();
        zzlvVar.zza.zzG(zzupVar);
        zzlvVar.zzc.remove(((zzuj) zzupVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzlvVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzcx zzk(int i10, List list, zzwk zzwkVar) {
        int i11;
        if (!list.isEmpty()) {
            this.zzl = zzwkVar;
            for (int i12 = i10; i12 < list.size() + i10; i12++) {
                zzlv zzlvVar = (zzlv) list.get(i12 - i10);
                if (i12 > 0) {
                    zzlv zzlvVar2 = (zzlv) this.zzb.get(i12 - 1);
                    i11 = zzlvVar2.zzd + zzlvVar2.zza.zzC().zzc();
                } else {
                    i11 = 0;
                }
                zzlvVar.zzc(i11);
                zzr(i12, zzlvVar.zza.zzC().zzc());
                this.zzb.add(i12, zzlvVar);
                this.zzd.put(zzlvVar.zzb, zzlvVar);
                if (this.zzj) {
                    zzv(zzlvVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlvVar);
                    } else {
                        zzs(zzlvVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcx zzl(int i10, int i11, int i12, zzwk zzwkVar) {
        zzek.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcx zzm(int i10, int i11, zzwk zzwkVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        }
        zzek.zzd(z10);
        this.zzl = zzwkVar;
        zzw(i10, i11);
        return zzb();
    }

    public final zzcx zzn(List list, zzwk zzwkVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwkVar);
    }

    public final zzcx zzo(zzwk zzwkVar) {
        int zza = zza();
        if (zzwkVar.zzc() != zza) {
            zzwkVar = zzwkVar.zzf().zzg(0, zza);
        }
        this.zzl = zzwkVar;
        return zzb();
    }

    public final zzup zzp(zzur zzurVar, zzyx zzyxVar, long j10) {
        int i10 = zzmd.zzc;
        Object obj = zzurVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzur zza = zzurVar.zza(((Pair) obj).second);
        zzlv zzlvVar = (zzlv) this.zzd.get(obj2);
        zzlvVar.getClass();
        this.zzg.add(zzlvVar);
        zzlu zzluVar = (zzlu) this.zzf.get(zzlvVar);
        if (zzluVar != null) {
            zzluVar.zza.zzk(zzluVar.zzb);
        }
        zzlvVar.zzc.add(zza);
        zzuj zzI = zzlvVar.zza.zzI(zza, zzyxVar, j10);
        this.zzc.put(zzI, zzlvVar);
        zzt();
        return zzI;
    }

    public final zzwk zzq() {
        return this.zzl;
    }
}
