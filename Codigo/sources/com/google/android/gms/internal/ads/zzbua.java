package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.s2;
import i9.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbua extends zzbtj {
    private final c0 zza;

    public zzbua(c0 c0Var) {
        this.zza = c0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final boolean zzA() {
        return this.zza.l();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final boolean zzB() {
        return this.zza.m();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final double zze() {
        if (this.zza.o() != null) {
            return this.zza.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final float zzf() {
        return this.zza.k();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final float zzg() {
        return this.zza.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final float zzh() {
        return this.zza.f();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final Bundle zzi() {
        return this.zza.g();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final s2 zzj() {
        if (this.zza.L() != null) {
            return this.zza.L().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final zzbjf zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final zzbjm zzl() {
        a9.d i10 = this.zza.i();
        if (i10 != null) {
            return new zzbiz(i10.getDrawable(), i10.getUri(), i10.getScale(), i10.zzb(), i10.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final com.google.android.gms.dynamic.b zzm() {
        View a10 = this.zza.a();
        if (a10 == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.h2(a10);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final com.google.android.gms.dynamic.b zzn() {
        View K = this.zza.K();
        if (K == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.h2(K);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final com.google.android.gms.dynamic.b zzo() {
        Object M = this.zza.M();
        if (M == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.h2(M);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzp() {
        return this.zza.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzq() {
        return this.zza.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzr() {
        return this.zza.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzs() {
        return this.zza.h();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzt() {
        return this.zza.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzu() {
        return this.zza.p();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final List zzv() {
        List<a9.d> j10 = this.zza.j();
        ArrayList arrayList = new ArrayList();
        if (j10 != null) {
            for (a9.d dVar : j10) {
                arrayList.add(new zzbiz(dVar.getDrawable(), dVar.getUri(), dVar.getScale(), dVar.zzb(), dVar.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzw(com.google.android.gms.dynamic.b bVar) {
        this.zza.q((View) com.google.android.gms.dynamic.d.g2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzx() {
        this.zza.s();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzy(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        HashMap hashMap = (HashMap) com.google.android.gms.dynamic.d.g2(bVar2);
        HashMap hashMap2 = (HashMap) com.google.android.gms.dynamic.d.g2(bVar3);
        this.zza.I((View) com.google.android.gms.dynamic.d.g2(bVar), hashMap, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzz(com.google.android.gms.dynamic.b bVar) {
        this.zza.J((View) com.google.android.gms.dynamic.d.g2(bVar));
    }
}
