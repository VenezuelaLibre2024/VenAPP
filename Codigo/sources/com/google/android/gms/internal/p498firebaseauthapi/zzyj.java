package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.C6058d1;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.C6060e;
import com.google.firebase.auth.C6083j;
import p272oc.C9881q;

/* loaded from: classes2.dex */
public final class zzyj {
    private final zzadi zza;

    public zzyj(zzadi zzadiVar) {
        this.zza = (zzadi) C5276s.m13324j(zzadiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaep zzaepVar, zzacd zzacdVar) {
        C5276s.m13324j(zzaepVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzaepVar, new zzyq(this, zzacdVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafn zzafnVar, String str, String str2, Boolean bool, C6059d2 c6059d2, zzacd zzacdVar, zzadl zzadlVar) {
        C5276s.m13324j(zzafnVar);
        C5276s.m13324j(zzadlVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzafa(zzafnVar.zzc()), new zzyr(this, zzadlVar, str2, str, bool, c6059d2, zzacdVar, zzafnVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzyj zzyjVar, zzacd zzacdVar, zzafn zzafnVar, zzafc zzafcVar, zzagc zzagcVar, zzadl zzadlVar) {
        C5276s.m13324j(zzacdVar);
        C5276s.m13324j(zzafnVar);
        C5276s.m13324j(zzafcVar);
        C5276s.m13324j(zzagcVar);
        C5276s.m13324j(zzadlVar);
        zzyjVar.zza.zza(zzagcVar, new zzys(zzyjVar, zzagcVar, zzafcVar, zzacdVar, zzafnVar, zzadlVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzyj zzyjVar, zzacd zzacdVar, zzafn zzafnVar, zzagc zzagcVar, zzadl zzadlVar) {
        C5276s.m13324j(zzacdVar);
        C5276s.m13324j(zzafnVar);
        C5276s.m13324j(zzagcVar);
        C5276s.m13324j(zzadlVar);
        zzyjVar.zza.zza(new zzafa(zzafnVar.zzc()), new zzyp(zzyjVar, zzadlVar, zzacdVar, zzafnVar, zzagcVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzyj zzyjVar, zzacd zzacdVar, zzage zzageVar, zzadl zzadlVar) {
        C5276s.m13324j(zzacdVar);
        C5276s.m13324j(zzageVar);
        C5276s.m13324j(zzadlVar);
        zzyjVar.zza.zza(zzageVar, new zzzc(zzyjVar, zzacdVar, zzadlVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzyj zzyjVar, zzagv zzagvVar, zzacd zzacdVar, zzadl zzadlVar) {
        if (!zzagvVar.zzo()) {
            zzyjVar.zza(new zzafn(zzagvVar.zzi(), zzagvVar.zze(), Long.valueOf(zzagvVar.zza()), "Bearer"), zzagvVar.zzh(), zzagvVar.zzg(), Boolean.valueOf(zzagvVar.zzn()), zzagvVar.zzb(), zzacdVar, zzadlVar);
            return;
        }
        zzacdVar.zza(new zzyh(zzagvVar.zzm() ? new Status(17012) : C9881q.m29583a(zzagvVar.zzd()), zzagvVar.zzb(), zzagvVar.zzc(), zzagvVar.zzj()));
    }

    private final void zza(String str, zzadk<zzafn> zzadkVar) {
        C5276s.m13324j(zzadkVar);
        C5276s.m13320f(str);
        zzafn zzb = zzafn.zzb(str);
        if (zzb.zzg()) {
            zzadkVar.zza((zzadk<zzafn>) zzb);
        } else {
            this.zza.zza(new zzafb(zzb.zzd()), new zzaag(this, zzadkVar));
        }
    }

    private final void zzb(zzafe zzafeVar, zzacd zzacdVar) {
        C5276s.m13324j(zzafeVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzafeVar, new zzzx(this, zzacdVar));
    }

    public final void zza(zzaer zzaerVar, String str, zzacd zzacdVar) {
        C5276s.m13324j(zzaerVar);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzzo(this, zzaerVar, zzacdVar));
    }

    public final void zza(zzaet zzaetVar, zzacd zzacdVar) {
        C5276s.m13324j(zzaetVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzaetVar, new zzzq(this, zzacdVar));
    }

    public final void zza(zzafe zzafeVar, zzacd zzacdVar) {
        zzb(zzafeVar, zzacdVar);
    }

    public final void zza(zzafg zzafgVar, zzacd zzacdVar) {
        C5276s.m13324j(zzafgVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzafgVar, new zzzr(this, zzacdVar));
    }

    public final void zza(zzafl zzaflVar, zzacd zzacdVar) {
        C5276s.m13324j(zzaflVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzaflVar, new zzzs(this, zzacdVar));
    }

    public final void zza(zzafz zzafzVar, zzacd zzacdVar) {
        this.zza.zza(zzafzVar, new zzzz(this, zzacdVar));
    }

    public final void zza(zzaga zzagaVar, zzacd zzacdVar) {
        C5276s.m13320f(zzagaVar.zzd());
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzagaVar, new zzyx(this, zzacdVar));
    }

    public final void zza(zzagg zzaggVar, zzacd zzacdVar) {
        C5276s.m13324j(zzaggVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzaggVar, new zzzl(this, zzaggVar, zzacdVar));
    }

    public final void zza(zzagi zzagiVar, zzacd zzacdVar) {
        C5276s.m13324j(zzagiVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzagiVar, new zzzp(this, zzacdVar));
    }

    public final void zza(zzagt zzagtVar, zzacd zzacdVar) {
        C5276s.m13324j(zzagtVar);
        C5276s.m13324j(zzacdVar);
        zzagtVar.zzb(true);
        this.zza.zza(zzagtVar, new zzzm(this, zzacdVar));
    }

    public final void zza(zzagu zzaguVar, zzacd zzacdVar) {
        C5276s.m13324j(zzaguVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzaguVar, new zzyv(this, zzacdVar));
    }

    public final void zza(zzagy zzagyVar, zzacd zzacdVar) {
        C5276s.m13324j(zzagyVar);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(zzagyVar, new zzza(this, zzacdVar));
    }

    public final void zza(C6083j c6083j, String str, zzacd zzacdVar) {
        C5276s.m13324j(c6083j);
        C5276s.m13324j(zzacdVar);
        if (c6083j.zzg()) {
            zza(c6083j.zzb(), new zzyn(this, c6083j, str, zzacdVar));
        } else {
            zza(new zzaep(c6083j, null, str), zzacdVar);
        }
    }

    public final void zza(String str, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzzw(this, zzacdVar));
    }

    public final void zza(String str, zzagt zzagtVar, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzagtVar);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzzd(this, zzagtVar, zzacdVar));
    }

    public final void zza(String str, zzagy zzagyVar, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzagyVar);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzzb(this, zzagyVar, zzacdVar));
    }

    public final void zza(String str, C6058d1 c6058d1, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(c6058d1);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzaac(this, c6058d1, zzacdVar));
    }

    public final void zza(String str, C6060e c6060e, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        zzafe zzafeVar = new zzafe(4);
        zzafeVar.zzd(str);
        if (c6060e != null) {
            zzafeVar.zza(c6060e);
        }
        zzb(zzafeVar, zzacdVar);
    }

    public final void zza(String str, C6060e c6060e, String str2, String str3, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        zzafe zzafeVar = new zzafe(c6060e.zza());
        zzafeVar.zzb(str);
        zzafeVar.zza(c6060e);
        zzafeVar.zzc(str2);
        zzafeVar.zza(str3);
        this.zza.zza(zzafeVar, new zzyt(this, zzacdVar));
    }

    public final void zza(String str, String str2, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        zzagc zzagcVar = new zzagc();
        zzagcVar.zze(str);
        zzagcVar.zzh(str2);
        this.zza.zza(zzagcVar, new zzaad(this, zzacdVar));
    }

    public final void zza(String str, String str2, String str3, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzafx(str, str2, str3), new zzyy(this, zzacdVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzage(str, str2, null, str3, str4, null), new zzyl(this, zzacdVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13320f(str3);
        C5276s.m13324j(zzacdVar);
        zza(str3, new zzyz(this, str, str2, str4, str5, zzacdVar));
    }

    public final void zzb(String str, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzafb(str), new zzym(this, zzacdVar));
    }

    public final void zzb(String str, String str2, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzaab(this, str2, zzacdVar));
    }

    public final void zzb(String str, String str2, String str3, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzzk(this, str2, str3, zzacdVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzagw(str, str2, str3, str4), new zzyo(this, zzacdVar));
    }

    public final void zzc(String str, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzzu(this, zzacdVar));
    }

    public final void zzc(String str, String str2, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzaae(this, str2, zzacdVar));
    }

    public final void zzd(String str, zzacd zzacdVar) {
        C5276s.m13324j(zzacdVar);
        this.zza.zza(str, new zzzy(this, zzacdVar));
    }

    public final void zzd(String str, String str2, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzafx(str, null, str2), new zzyw(this, zzacdVar));
    }

    public final void zze(String str, zzacd zzacdVar) {
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzage(str), new zzaaa(this, zzacdVar));
    }

    public final void zze(String str, String str2, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        this.zza.zza(new zzaek(str, str2), new zzyu(this, zzacdVar));
    }

    public final void zzf(String str, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzacdVar);
        zza(str, new zzzf(this, zzacdVar));
    }

    public final void zzf(String str, String str2, zzacd zzacdVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzacdVar);
        zza(str2, new zzzi(this, str, zzacdVar));
    }
}
