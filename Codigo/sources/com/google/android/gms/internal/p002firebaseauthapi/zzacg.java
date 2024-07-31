package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.d1;
import com.google.firebase.auth.i0;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.r0;
import com.google.firebase.auth.w0;
import com.google.firebase.auth.z0;
import ga.a;
import java.util.concurrent.ScheduledExecutorService;
import zb.g;

/* loaded from: classes2.dex */
public final class zzacg {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyj zzb;
    private final zzadu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacg(g gVar, ScheduledExecutorService scheduledExecutorService) {
        s.j(gVar);
        Context m10 = gVar.m();
        s.j(m10);
        this.zzb = new zzyj(new zzacu(gVar, zzacr.zza()));
        this.zzc = new zzadu(m10, scheduledExecutorService);
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zza(zzafz zzafzVar, zzace zzaceVar) {
        s.j(zzafzVar);
        this.zzb.zza(zzafzVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(zzagm zzagmVar, zzace zzaceVar) {
        this.zzb.zza(zzagmVar, new zzacd((zzace) s.j(zzaceVar), zza));
    }

    public final void zza(zzagt zzagtVar, zzace zzaceVar) {
        s.j(zzagtVar);
        s.j(zzaceVar);
        this.zzb.zza(zzagtVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(zzagu zzaguVar, zzace zzaceVar) {
        s.j(zzaguVar);
        s.j(zzaceVar);
        this.zzb.zza(zzaguVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxv zzxvVar, zzace zzaceVar) {
        s.j(zzxvVar);
        s.f(zzxvVar.zza());
        s.f(zzxvVar.zzb());
        s.j(zzaceVar);
        this.zzb.zza(zzxvVar.zza(), zzxvVar.zzb(), zzxvVar.zzc(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxx zzxxVar, zzace zzaceVar) {
        s.j(zzxxVar);
        this.zzb.zza(zzafl.zza(zzxxVar.zzb(), zzxxVar.zza()), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxy zzxyVar, zzace zzaceVar) {
        s.j(zzxyVar);
        this.zzb.zza(zzafg.zzb(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxz zzxzVar, zzace zzaceVar) {
        s.j(zzxzVar);
        s.f(zzxzVar.zzb());
        s.j(zzaceVar);
        this.zzb.zza(zzxzVar.zzb(), zzxzVar.zza(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzya zzyaVar, zzace zzaceVar) {
        s.j(zzaceVar);
        s.j(zzyaVar);
        o0 o0Var = (o0) s.j(zzyaVar.zza());
        this.zzb.zza(s.f(zzyaVar.zzb()), zzado.zza(o0Var), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyb zzybVar, zzace zzaceVar) {
        s.j(zzaceVar);
        s.j(zzybVar);
        zzaga zzagaVar = (zzaga) s.j(zzybVar.zza());
        String zzd = zzagaVar.zzd();
        zzacd zzacdVar = new zzacd(zzaceVar, zza);
        if (this.zzc.zzd(zzd)) {
            if (!zzagaVar.zze()) {
                this.zzc.zzb(zzacdVar, zzd);
                return;
            }
            this.zzc.zzc(zzd);
        }
        long zzb = zzagaVar.zzb();
        boolean zzf = zzagaVar.zzf();
        if (zza(zzb, zzf)) {
            zzagaVar.zza(new zzaee(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzacdVar, zzb, zzf);
        this.zzb.zza(zzagaVar, this.zzc.zza(zzacdVar, zzd));
    }

    public final void zza(zzyc zzycVar, zzace zzaceVar) {
        s.j(zzycVar);
        s.f(zzycVar.zzc());
        s.j(zzaceVar);
        this.zzb.zza(zzycVar.zzc(), zzycVar.zza(), zzycVar.zzd(), zzycVar.zzb(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyd zzydVar, zzace zzaceVar) {
        s.j(zzydVar);
        s.j(zzydVar.zza());
        s.j(zzaceVar);
        this.zzb.zza(zzydVar.zza(), zzydVar.zzb(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzye zzyeVar, zzace zzaceVar) {
        s.j(zzyeVar);
        s.j(zzaceVar);
        this.zzb.zzd(zzyeVar.zza(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyf zzyfVar, zzace zzaceVar) {
        s.j(zzyfVar);
        s.j(zzaceVar);
        String E = zzyfVar.zzb().E();
        zzacd zzacdVar = new zzacd(zzaceVar, zza);
        if (this.zzc.zzd(E)) {
            if (!zzyfVar.zzg()) {
                this.zzc.zzb(zzacdVar, E);
                return;
            }
            this.zzc.zzc(E);
        }
        long zza2 = zzyfVar.zza();
        boolean zzh = zzyfVar.zzh();
        zzagi zza3 = zzagi.zza(zzyfVar.zzd(), zzyfVar.zzb().l(), zzyfVar.zzb().E(), zzyfVar.zzc(), zzyfVar.zzf(), zzyfVar.zze());
        if (zza(zza2, zzh)) {
            zza3.zza(new zzaee(this.zzc.zzb()));
        }
        this.zzc.zza(E, zzacdVar, zza2, zzh);
        this.zzb.zza(zza3, this.zzc.zza(zzacdVar, E));
    }

    public final void zza(zzyg zzygVar, zzace zzaceVar) {
        s.j(zzaceVar);
        s.j(zzygVar);
        this.zzb.zza(zzado.zza((o0) s.j(zzygVar.zza())), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyi zzyiVar, zzace zzaceVar) {
        s.j(zzyiVar);
        this.zzb.zza(zzafe.zza(zzyiVar.zza(), zzyiVar.zzb(), zzyiVar.zzc()), new zzacd(zzaceVar, zza));
    }

    public final void zza(i0 i0Var, String str, String str2, String str3, zzace zzaceVar) {
        zzaer zza2;
        s.j(i0Var);
        s.g(str, "cachedTokenState should not be empty.");
        s.j(zzaceVar);
        if (i0Var instanceof r0) {
            o0 a10 = ((r0) i0Var).a();
            zza2 = zzaev.zza(str, (String) s.j(a10.zzc()), (String) s.j(a10.x1()), str2, str3);
        } else {
            if (!(i0Var instanceof w0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            w0 w0Var = (w0) i0Var;
            zza2 = zzaex.zza(str, s.f(str2), s.f(((z0) s.j(w0Var.a())).c()), s.f(w0Var.c()), str3);
        }
        this.zzb.zza(zza2, str, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, zzace zzaceVar) {
        s.f(str);
        s.j(zzaceVar);
        this.zzb.zza(str, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, zzagt zzagtVar, zzace zzaceVar) {
        s.f(str);
        s.j(zzagtVar);
        s.j(zzaceVar);
        this.zzb.zza(str, zzagtVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, d1 d1Var, zzace zzaceVar) {
        s.f(str);
        s.j(d1Var);
        s.j(zzaceVar);
        this.zzb.zza(str, d1Var, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, i0 i0Var, String str2, zzace zzaceVar) {
        zzyj zzyjVar;
        zzaet zza2;
        zzacd zzacdVar;
        s.f(str);
        s.j(i0Var);
        s.j(zzaceVar);
        if (i0Var instanceof r0) {
            o0 a10 = ((r0) i0Var).a();
            zzyjVar = this.zzb;
            zza2 = zzaeu.zza(str, (String) s.j(a10.zzc()), (String) s.j(a10.x1()), str2);
            zzacdVar = new zzacd(zzaceVar, zza);
        } else {
            if (!(i0Var instanceof w0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            w0 w0Var = (w0) i0Var;
            zzyjVar = this.zzb;
            zza2 = zzaew.zza(str, s.f(w0Var.c()), str2, s.f(w0Var.b()));
            zzacdVar = new zzacd(zzaceVar, zza);
        }
        zzyjVar.zza(zza2, zzacdVar);
    }

    public final void zza(String str, String str2, zzace zzaceVar) {
        s.f(str);
        s.j(zzaceVar);
        this.zzb.zza(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzace zzaceVar) {
        s.g(str, "idToken should not be empty.");
        s.j(zzaceVar);
        zzacd zzacdVar = new zzacd(zzaceVar, zza);
        if (this.zzc.zzd(str2)) {
            zzadu zzaduVar = this.zzc;
            if (!z10) {
                zzaduVar.zzb(zzacdVar, str2);
                return;
            }
            zzaduVar.zzc(str2);
        }
        zzagk zza2 = zzagk.zza(str, str2, str3, str4, str5, null);
        if (zza(j10, z12)) {
            zza2.zza(new zzaee(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacdVar, j10, z12);
        this.zzb.zza(zza2, this.zzc.zza(zzacdVar, str2));
    }

    public final void zza(String str, String str2, String str3, zzace zzaceVar) {
        s.g(str, "cachedTokenState should not be empty.");
        s.g(str2, "uid should not be empty.");
        s.j(zzaceVar);
        this.zzb.zzb(str, str2, str3, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzace zzaceVar) {
        s.f(str);
        s.f(str2);
        s.j(zzaceVar);
        this.zzb.zza(str, str2, str3, str4, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzace zzaceVar) {
        s.f(str);
        s.f(str2);
        s.f(str3);
        s.j(zzaceVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacd(zzaceVar, zza));
    }

    public final void zzb(String str, zzace zzaceVar) {
        s.f(str);
        s.j(zzaceVar);
        this.zzb.zzb(str, new zzacd(zzaceVar, zza));
    }

    public final void zzb(String str, String str2, zzace zzaceVar) {
        s.f(str);
        s.f(str2);
        s.j(zzaceVar);
        this.zzb.zzb(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzace zzaceVar) {
        s.f(str);
        s.f(str2);
        s.j(zzaceVar);
        s.j(zzaceVar);
        this.zzb.zzb(str, str2, str3, str4, new zzacd(zzaceVar, zza));
    }

    public final void zzc(String str, zzace zzaceVar) {
        s.f(str);
        s.j(zzaceVar);
        this.zzb.zzc(str, new zzacd(zzaceVar, zza));
    }

    public final void zzc(String str, String str2, zzace zzaceVar) {
        s.f(str);
        s.f(str2);
        s.j(zzaceVar);
        this.zzb.zzc(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zzd(String str, zzace zzaceVar) {
        s.j(zzaceVar);
        this.zzb.zze(str, new zzacd(zzaceVar, zza));
    }

    public final void zzd(String str, String str2, zzace zzaceVar) {
        s.f(str);
        s.j(zzaceVar);
        this.zzb.zzd(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zze(String str, zzace zzaceVar) {
        s.f(str);
        s.j(zzaceVar);
        this.zzb.zzf(str, new zzacd(zzaceVar, zza));
    }

    public final void zze(String str, String str2, zzace zzaceVar) {
        s.f(str);
        this.zzb.zze(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zzf(String str, String str2, zzace zzaceVar) {
        s.f(str);
        s.f(str2);
        s.j(zzaceVar);
        this.zzb.zzf(str, str2, new zzacd(zzaceVar, zza));
    }
}
