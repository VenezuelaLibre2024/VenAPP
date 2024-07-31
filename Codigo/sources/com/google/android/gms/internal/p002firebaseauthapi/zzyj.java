package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.d1;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.e;
import com.google.firebase.auth.j;
import oc.q;

/* loaded from: classes2.dex */
public final class zzyj {
    private final zzadi zza;

    public zzyj(zzadi zzadiVar) {
        this.zza = (zzadi) s.j(zzadiVar);
    }

    public final void zza(zzaep zzaepVar, zzacd zzacdVar) {
        s.j(zzaepVar);
        s.j(zzacdVar);
        this.zza.zza(zzaepVar, new zzyq(this, zzacdVar));
    }

    public final void zza(zzafn zzafnVar, String str, String str2, Boolean bool, d2 d2Var, zzacd zzacdVar, zzadl zzadlVar) {
        s.j(zzafnVar);
        s.j(zzadlVar);
        s.j(zzacdVar);
        this.zza.zza(new zzafa(zzafnVar.zzc()), new zzyr(this, zzadlVar, str2, str, bool, d2Var, zzacdVar, zzafnVar));
    }

    public static /* synthetic */ void zza(zzyj zzyjVar, zzacd zzacdVar, zzafn zzafnVar, zzafc zzafcVar, zzagc zzagcVar, zzadl zzadlVar) {
        s.j(zzacdVar);
        s.j(zzafnVar);
        s.j(zzafcVar);
        s.j(zzagcVar);
        s.j(zzadlVar);
        zzyjVar.zza.zza(zzagcVar, new zzys(zzyjVar, zzagcVar, zzafcVar, zzacdVar, zzafnVar, zzadlVar));
    }

    public static /* synthetic */ void zza(zzyj zzyjVar, zzacd zzacdVar, zzafn zzafnVar, zzagc zzagcVar, zzadl zzadlVar) {
        s.j(zzacdVar);
        s.j(zzafnVar);
        s.j(zzagcVar);
        s.j(zzadlVar);
        zzyjVar.zza.zza(new zzafa(zzafnVar.zzc()), new zzyp(zzyjVar, zzadlVar, zzacdVar, zzafnVar, zzagcVar));
    }

    public static /* synthetic */ void zza(zzyj zzyjVar, zzacd zzacdVar, zzage zzageVar, zzadl zzadlVar) {
        s.j(zzacdVar);
        s.j(zzageVar);
        s.j(zzadlVar);
        zzyjVar.zza.zza(zzageVar, new zzzc(zzyjVar, zzacdVar, zzadlVar));
    }

    public static /* synthetic */ void zza(zzyj zzyjVar, zzagv zzagvVar, zzacd zzacdVar, zzadl zzadlVar) {
        if (!zzagvVar.zzo()) {
            zzyjVar.zza(new zzafn(zzagvVar.zzi(), zzagvVar.zze(), Long.valueOf(zzagvVar.zza()), "Bearer"), zzagvVar.zzh(), zzagvVar.zzg(), Boolean.valueOf(zzagvVar.zzn()), zzagvVar.zzb(), zzacdVar, zzadlVar);
            return;
        }
        zzacdVar.zza(new zzyh(zzagvVar.zzm() ? new Status(17012) : q.a(zzagvVar.zzd()), zzagvVar.zzb(), zzagvVar.zzc(), zzagvVar.zzj()));
    }

    private final void zza(String str, zzadk<zzafn> zzadkVar) {
        s.j(zzadkVar);
        s.f(str);
        zzafn zzb = zzafn.zzb(str);
        if (zzb.zzg()) {
            zzadkVar.zza((zzadk<zzafn>) zzb);
        } else {
            this.zza.zza(new zzafb(zzb.zzd()), new zzaag(this, zzadkVar));
        }
    }

    private final void zzb(zzafe zzafeVar, zzacd zzacdVar) {
        s.j(zzafeVar);
        s.j(zzacdVar);
        this.zza.zza(zzafeVar, new zzzx(this, zzacdVar));
    }

    public final void zza(zzaer zzaerVar, String str, zzacd zzacdVar) {
        s.j(zzaerVar);
        s.j(zzacdVar);
        zza(str, new zzzo(this, zzaerVar, zzacdVar));
    }

    public final void zza(zzaet zzaetVar, zzacd zzacdVar) {
        s.j(zzaetVar);
        s.j(zzacdVar);
        this.zza.zza(zzaetVar, new zzzq(this, zzacdVar));
    }

    public final void zza(zzafe zzafeVar, zzacd zzacdVar) {
        zzb(zzafeVar, zzacdVar);
    }

    public final void zza(zzafg zzafgVar, zzacd zzacdVar) {
        s.j(zzafgVar);
        s.j(zzacdVar);
        this.zza.zza(zzafgVar, new zzzr(this, zzacdVar));
    }

    public final void zza(zzafl zzaflVar, zzacd zzacdVar) {
        s.j(zzaflVar);
        s.j(zzacdVar);
        this.zza.zza(zzaflVar, new zzzs(this, zzacdVar));
    }

    public final void zza(zzafz zzafzVar, zzacd zzacdVar) {
        this.zza.zza(zzafzVar, new zzzz(this, zzacdVar));
    }

    public final void zza(zzaga zzagaVar, zzacd zzacdVar) {
        s.f(zzagaVar.zzd());
        s.j(zzacdVar);
        this.zza.zza(zzagaVar, new zzyx(this, zzacdVar));
    }

    public final void zza(zzagg zzaggVar, zzacd zzacdVar) {
        s.j(zzaggVar);
        s.j(zzacdVar);
        this.zza.zza(zzaggVar, new zzzl(this, zzaggVar, zzacdVar));
    }

    public final void zza(zzagi zzagiVar, zzacd zzacdVar) {
        s.j(zzagiVar);
        s.j(zzacdVar);
        this.zza.zza(zzagiVar, new zzzp(this, zzacdVar));
    }

    public final void zza(zzagt zzagtVar, zzacd zzacdVar) {
        s.j(zzagtVar);
        s.j(zzacdVar);
        zzagtVar.zzb(true);
        this.zza.zza(zzagtVar, new zzzm(this, zzacdVar));
    }

    public final void zza(zzagu zzaguVar, zzacd zzacdVar) {
        s.j(zzaguVar);
        s.j(zzacdVar);
        this.zza.zza(zzaguVar, new zzyv(this, zzacdVar));
    }

    public final void zza(zzagy zzagyVar, zzacd zzacdVar) {
        s.j(zzagyVar);
        s.j(zzacdVar);
        this.zza.zza(zzagyVar, new zzza(this, zzacdVar));
    }

    public final void zza(j jVar, String str, zzacd zzacdVar) {
        s.j(jVar);
        s.j(zzacdVar);
        if (jVar.zzg()) {
            zza(jVar.zzb(), new zzyn(this, jVar, str, zzacdVar));
        } else {
            zza(new zzaep(jVar, null, str), zzacdVar);
        }
    }

    public final void zza(String str, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        zza(str, new zzzw(this, zzacdVar));
    }

    public final void zza(String str, zzagt zzagtVar, zzacd zzacdVar) {
        s.f(str);
        s.j(zzagtVar);
        s.j(zzacdVar);
        zza(str, new zzzd(this, zzagtVar, zzacdVar));
    }

    public final void zza(String str, zzagy zzagyVar, zzacd zzacdVar) {
        s.f(str);
        s.j(zzagyVar);
        s.j(zzacdVar);
        zza(str, new zzzb(this, zzagyVar, zzacdVar));
    }

    public final void zza(String str, d1 d1Var, zzacd zzacdVar) {
        s.f(str);
        s.j(d1Var);
        s.j(zzacdVar);
        zza(str, new zzaac(this, d1Var, zzacdVar));
    }

    public final void zza(String str, e eVar, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        zzafe zzafeVar = new zzafe(4);
        zzafeVar.zzd(str);
        if (eVar != null) {
            zzafeVar.zza(eVar);
        }
        zzb(zzafeVar, zzacdVar);
    }

    public final void zza(String str, e eVar, String str2, String str3, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        zzafe zzafeVar = new zzafe(eVar.zza());
        zzafeVar.zzb(str);
        zzafeVar.zza(eVar);
        zzafeVar.zzc(str2);
        zzafeVar.zza(str3);
        this.zza.zza(zzafeVar, new zzyt(this, zzacdVar));
    }

    public final void zza(String str, String str2, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        zzagc zzagcVar = new zzagc();
        zzagcVar.zze(str);
        zzagcVar.zzh(str2);
        this.zza.zza(zzagcVar, new zzaad(this, zzacdVar));
    }

    public final void zza(String str, String str2, String str3, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.j(zzacdVar);
        this.zza.zza(new zzafx(str, str2, str3), new zzyy(this, zzacdVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.j(zzacdVar);
        this.zza.zza(new zzage(str, str2, null, str3, str4, null), new zzyl(this, zzacdVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.f(str3);
        s.j(zzacdVar);
        zza(str3, new zzyz(this, str, str2, str4, str5, zzacdVar));
    }

    public final void zzb(String str, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        this.zza.zza(new zzafb(str), new zzym(this, zzacdVar));
    }

    public final void zzb(String str, String str2, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.j(zzacdVar);
        zza(str, new zzaab(this, str2, zzacdVar));
    }

    public final void zzb(String str, String str2, String str3, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.j(zzacdVar);
        zza(str, new zzzk(this, str2, str3, zzacdVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.j(zzacdVar);
        this.zza.zza(new zzagw(str, str2, str3, str4), new zzyo(this, zzacdVar));
    }

    public final void zzc(String str, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        zza(str, new zzzu(this, zzacdVar));
    }

    public final void zzc(String str, String str2, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.j(zzacdVar);
        zza(str, new zzaae(this, str2, zzacdVar));
    }

    public final void zzd(String str, zzacd zzacdVar) {
        s.j(zzacdVar);
        this.zza.zza(str, new zzzy(this, zzacdVar));
    }

    public final void zzd(String str, String str2, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        this.zza.zza(new zzafx(str, null, str2), new zzyw(this, zzacdVar));
    }

    public final void zze(String str, zzacd zzacdVar) {
        s.j(zzacdVar);
        this.zza.zza(new zzage(str), new zzaaa(this, zzacdVar));
    }

    public final void zze(String str, String str2, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        this.zza.zza(new zzaek(str, str2), new zzyu(this, zzacdVar));
    }

    public final void zzf(String str, zzacd zzacdVar) {
        s.f(str);
        s.j(zzacdVar);
        zza(str, new zzzf(this, zzacdVar));
    }

    public final void zzf(String str, String str2, zzacd zzacdVar) {
        s.f(str);
        s.f(str2);
        s.j(zzacdVar);
        zza(str2, new zzzi(this, str, zzacdVar));
    }
}
