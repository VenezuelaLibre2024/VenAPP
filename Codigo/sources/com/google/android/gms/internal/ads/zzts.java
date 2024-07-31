package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class zzts implements zzut {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzva zzc = new zzva();
    private final zzrs zzd = new zzrs();
    private Looper zze;
    private zzcx zzf;
    private zzpb zzg;

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ zzcx zzM() {
        return null;
    }

    public final zzpb zzb() {
        zzpb zzpbVar = this.zzg;
        zzek.zzb(zzpbVar);
        return zzpbVar;
    }

    public final zzrs zzc(zzur zzurVar) {
        return this.zzd.zza(0, zzurVar);
    }

    public final zzrs zzd(int i10, zzur zzurVar) {
        return this.zzd.zza(0, zzurVar);
    }

    public final zzva zze(zzur zzurVar) {
        return this.zzc.zza(0, zzurVar);
    }

    public final zzva zzf(int i10, zzur zzurVar) {
        return this.zzc.zza(0, zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzg(Handler handler, zzrt zzrtVar) {
        this.zzd.zzb(handler, zzrtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzh(Handler handler, zzvb zzvbVar) {
        this.zzc.zzb(handler, zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzi(zzus zzusVar) {
        boolean z10 = !this.zzb.isEmpty();
        this.zzb.remove(zzusVar);
        if (z10 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzk(zzus zzusVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzusVar);
        if (isEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzm(zzus zzusVar, zzhy zzhyVar, zzpb zzpbVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != myLooper) {
            z10 = false;
        }
        zzek.zzd(z10);
        this.zzg = zzpbVar;
        zzcx zzcxVar = this.zzf;
        this.zza.add(zzusVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzusVar);
            zzn(zzhyVar);
        } else if (zzcxVar != null) {
            zzk(zzusVar);
            zzusVar.zza(this, zzcxVar);
        }
    }

    protected abstract void zzn(zzhy zzhyVar);

    public final void zzo(zzcx zzcxVar) {
        this.zzf = zzcxVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzus) arrayList.get(i10)).zza(this, zzcxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzp(zzus zzusVar) {
        this.zza.remove(zzusVar);
        if (!this.zza.isEmpty()) {
            zzi(zzusVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzr(zzrt zzrtVar) {
        this.zzd.zzc(zzrtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzs(zzvb zzvbVar) {
        this.zzc.zzh(zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ void zzt(zzbp zzbpVar) {
        throw null;
    }

    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
