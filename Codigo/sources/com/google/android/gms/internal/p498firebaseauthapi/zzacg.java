package com.google.android.gms.internal.p498firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.AbstractC6077i0;
import com.google.firebase.auth.C6058d1;
import com.google.firebase.auth.C6104o0;
import com.google.firebase.auth.C6116r0;
import com.google.firebase.auth.C6136w0;
import com.google.firebase.auth.InterfaceC6146z0;
import ga.C7533a;
import java.util.concurrent.ScheduledExecutorService;
import p485zb.C12867g;

/* loaded from: classes2.dex */
public final class zzacg {
    private static final C7533a zza = new C7533a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyj zzb;
    private final zzadu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacg(C12867g c12867g, ScheduledExecutorService scheduledExecutorService) {
        C5276s.m13324j(c12867g);
        Context m42630m = c12867g.m42630m();
        C5276s.m13324j(m42630m);
        this.zzb = new zzyj(new zzacu(c12867g, zzacr.zza()));
        this.zzc = new zzadu(m42630m, scheduledExecutorService);
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.m22876h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zza(zzafz zzafzVar, zzace zzaceVar) {
        C5276s.m13324j(zzafzVar);
        this.zzb.zza(zzafzVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(zzagm zzagmVar, zzace zzaceVar) {
        this.zzb.zza(zzagmVar, new zzacd((zzace) C5276s.m13324j(zzaceVar), zza));
    }

    public final void zza(zzagt zzagtVar, zzace zzaceVar) {
        C5276s.m13324j(zzagtVar);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(zzagtVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(zzagu zzaguVar, zzace zzaceVar) {
        C5276s.m13324j(zzaguVar);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(zzaguVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxv zzxvVar, zzace zzaceVar) {
        C5276s.m13324j(zzxvVar);
        C5276s.m13320f(zzxvVar.zza());
        C5276s.m13320f(zzxvVar.zzb());
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(zzxvVar.zza(), zzxvVar.zzb(), zzxvVar.zzc(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxx zzxxVar, zzace zzaceVar) {
        C5276s.m13324j(zzxxVar);
        this.zzb.zza(zzafl.zza(zzxxVar.zzb(), zzxxVar.zza()), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxy zzxyVar, zzace zzaceVar) {
        C5276s.m13324j(zzxyVar);
        this.zzb.zza(zzafg.zzb(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzxz zzxzVar, zzace zzaceVar) {
        C5276s.m13324j(zzxzVar);
        C5276s.m13320f(zzxzVar.zzb());
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(zzxzVar.zzb(), zzxzVar.zza(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzya zzyaVar, zzace zzaceVar) {
        C5276s.m13324j(zzaceVar);
        C5276s.m13324j(zzyaVar);
        C6104o0 c6104o0 = (C6104o0) C5276s.m13324j(zzyaVar.zza());
        this.zzb.zza(C5276s.m13320f(zzyaVar.zzb()), zzado.zza(c6104o0), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyb zzybVar, zzace zzaceVar) {
        C5276s.m13324j(zzaceVar);
        C5276s.m13324j(zzybVar);
        zzaga zzagaVar = (zzaga) C5276s.m13324j(zzybVar.zza());
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
        C5276s.m13324j(zzycVar);
        C5276s.m13320f(zzycVar.zzc());
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(zzycVar.zzc(), zzycVar.zza(), zzycVar.zzd(), zzycVar.zzb(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyd zzydVar, zzace zzaceVar) {
        C5276s.m13324j(zzydVar);
        C5276s.m13324j(zzydVar.zza());
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(zzydVar.zza(), zzydVar.zzb(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzye zzyeVar, zzace zzaceVar) {
        C5276s.m13324j(zzyeVar);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzd(zzyeVar.zza(), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyf zzyfVar, zzace zzaceVar) {
        C5276s.m13324j(zzyfVar);
        C5276s.m13324j(zzaceVar);
        String m16610E = zzyfVar.zzb().m16610E();
        zzacd zzacdVar = new zzacd(zzaceVar, zza);
        if (this.zzc.zzd(m16610E)) {
            if (!zzyfVar.zzg()) {
                this.zzc.zzb(zzacdVar, m16610E);
                return;
            }
            this.zzc.zzc(m16610E);
        }
        long zza2 = zzyfVar.zza();
        boolean zzh = zzyfVar.zzh();
        zzagi zza3 = zzagi.zza(zzyfVar.zzd(), zzyfVar.zzb().mo16553l(), zzyfVar.zzb().m16610E(), zzyfVar.zzc(), zzyfVar.zzf(), zzyfVar.zze());
        if (zza(zza2, zzh)) {
            zza3.zza(new zzaee(this.zzc.zzb()));
        }
        this.zzc.zza(m16610E, zzacdVar, zza2, zzh);
        this.zzb.zza(zza3, this.zzc.zza(zzacdVar, m16610E));
    }

    public final void zza(zzyg zzygVar, zzace zzaceVar) {
        C5276s.m13324j(zzaceVar);
        C5276s.m13324j(zzygVar);
        this.zzb.zza(zzado.zza((C6104o0) C5276s.m13324j(zzygVar.zza())), new zzacd(zzaceVar, zza));
    }

    public final void zza(zzyi zzyiVar, zzace zzaceVar) {
        C5276s.m13324j(zzyiVar);
        this.zzb.zza(zzafe.zza(zzyiVar.zza(), zzyiVar.zzb(), zzyiVar.zzc()), new zzacd(zzaceVar, zza));
    }

    public final void zza(AbstractC6077i0 abstractC6077i0, String str, String str2, String str3, zzace zzaceVar) {
        zzaer zza2;
        C5276s.m13324j(abstractC6077i0);
        C5276s.m13321g(str, "cachedTokenState should not be empty.");
        C5276s.m13324j(zzaceVar);
        if (abstractC6077i0 instanceof C6116r0) {
            C6104o0 m16607a = ((C6116r0) abstractC6077i0).m16607a();
            zza2 = zzaev.zza(str, (String) C5276s.m13324j(m16607a.zzc()), (String) C5276s.m13324j(m16607a.m16580x1()), str2, str3);
        } else {
            if (!(abstractC6077i0 instanceof C6136w0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            C6136w0 c6136w0 = (C6136w0) abstractC6077i0;
            zza2 = zzaex.zza(str, C5276s.m13320f(str2), C5276s.m13320f(((InterfaceC6146z0) C5276s.m13324j(c6136w0.m16617a())).mo16632c()), C5276s.m13320f(c6136w0.m16619c()), str3);
        }
        this.zzb.zza(zza2, str, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(str, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, zzagt zzagtVar, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzagtVar);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(str, zzagtVar, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, C6058d1 c6058d1, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(c6058d1);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(str, c6058d1, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, AbstractC6077i0 abstractC6077i0, String str2, zzace zzaceVar) {
        zzyj zzyjVar;
        zzaet zza2;
        zzacd zzacdVar;
        C5276s.m13320f(str);
        C5276s.m13324j(abstractC6077i0);
        C5276s.m13324j(zzaceVar);
        if (abstractC6077i0 instanceof C6116r0) {
            C6104o0 m16607a = ((C6116r0) abstractC6077i0).m16607a();
            zzyjVar = this.zzb;
            zza2 = zzaeu.zza(str, (String) C5276s.m13324j(m16607a.zzc()), (String) C5276s.m13324j(m16607a.m16580x1()), str2);
            zzacdVar = new zzacd(zzaceVar, zza);
        } else {
            if (!(abstractC6077i0 instanceof C6136w0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            C6136w0 c6136w0 = (C6136w0) abstractC6077i0;
            zzyjVar = this.zzb;
            zza2 = zzaew.zza(str, C5276s.m13320f(c6136w0.m16619c()), str2, C5276s.m13320f(c6136w0.m16618b()));
            zzacdVar = new zzacd(zzaceVar, zza);
        }
        zzyjVar.zza(zza2, zzacdVar);
    }

    public final void zza(String str, String str2, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzace zzaceVar) {
        C5276s.m13321g(str, "idToken should not be empty.");
        C5276s.m13324j(zzaceVar);
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
        C5276s.m13321g(str, "cachedTokenState should not be empty.");
        C5276s.m13321g(str2, "uid should not be empty.");
        C5276s.m13324j(zzaceVar);
        this.zzb.zzb(str, str2, str3, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(str, str2, str3, str4, new zzacd(zzaceVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13320f(str3);
        C5276s.m13324j(zzaceVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacd(zzaceVar, zza));
    }

    public final void zzb(String str, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzb(str, new zzacd(zzaceVar, zza));
    }

    public final void zzb(String str, String str2, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzb(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzaceVar);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzb(str, str2, str3, str4, new zzacd(zzaceVar, zza));
    }

    public final void zzc(String str, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzc(str, new zzacd(zzaceVar, zza));
    }

    public final void zzc(String str, String str2, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzc(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zzd(String str, zzace zzaceVar) {
        C5276s.m13324j(zzaceVar);
        this.zzb.zze(str, new zzacd(zzaceVar, zza));
    }

    public final void zzd(String str, String str2, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzd(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zze(String str, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzf(str, new zzacd(zzaceVar, zza));
    }

    public final void zze(String str, String str2, zzace zzaceVar) {
        C5276s.m13320f(str);
        this.zzb.zze(str, str2, new zzacd(zzaceVar, zza));
    }

    public final void zzf(String str, String str2, zzace zzaceVar) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13324j(zzaceVar);
        this.zzb.zzf(str, str2, new zzacd(zzaceVar, zza));
    }
}
