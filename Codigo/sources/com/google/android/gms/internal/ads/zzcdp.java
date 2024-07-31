package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzcdp implements zzazj {
    final zzcdm zza;
    private final w1 zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcdn zzf = new zzcdn();

    public zzcdp(String str, w1 w1Var) {
        this.zza = new zzcdm(str, w1Var);
        this.zze = w1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zza(boolean z10) {
        zzcdm zzcdmVar;
        int zzc;
        long a10 = t.b().a();
        if (!z10) {
            this.zze.b(a10);
            this.zze.f(this.zza.zzd);
            return;
        }
        if (a10 - this.zze.zzd() > ((Long) a0.c().zza(zzbgc.zzaT)).longValue()) {
            zzcdmVar = this.zza;
            zzc = -1;
        } else {
            zzcdmVar = this.zza;
            zzc = this.zze.zzc();
        }
        zzcdmVar.zzd = zzc;
        this.zzg = true;
    }

    public final int zzb() {
        int zza;
        synchronized (this.zzd) {
            zza = this.zza.zza();
        }
        return zza;
    }

    public final zzcde zzc(la.f fVar, String str) {
        return new zzcde(fVar, this, this.zzf.zza(), str);
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(zzcde zzcdeVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcdeVar);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(u4 u4Var, long j10) {
        synchronized (this.zzd) {
            this.zza.zzg(u4Var, j10);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context, zzfip zzfipVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zzb(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcde) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfipVar.zzc(hashSet);
        return bundle;
    }
}
