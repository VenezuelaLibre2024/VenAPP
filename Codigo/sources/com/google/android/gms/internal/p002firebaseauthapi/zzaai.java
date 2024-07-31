package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.c0;
import com.google.firebase.auth.d1;
import com.google.firebase.auth.e;
import com.google.firebase.auth.h;
import com.google.firebase.auth.i;
import com.google.firebase.auth.j;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.r0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.v0;
import com.google.firebase.auth.w0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import oc.d;
import oc.f;
import oc.i0;
import oc.i1;
import oc.o;
import oc.t;
import oc.w;
import oc.y1;
import zb.g;

/* loaded from: classes2.dex */
public final class zzaai extends zzadh {
    public zzaai(g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzacg(gVar, scheduledExecutorService);
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d zza(g gVar, zzafc zzafcVar) {
        s.j(gVar);
        s.j(zzafcVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new y1(zzafcVar, "firebase"));
        List<zzafs> zzl = zzafcVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new y1(zzl.get(i10)));
            }
        }
        d dVar = new d(gVar, arrayList);
        dVar.Y1(new f(zzafcVar.zzb(), zzafcVar.zza()));
        dVar.Z1(zzafcVar.zzn());
        dVar.X1(zzafcVar.zze());
        dVar.T1(i0.b(zzafcVar.zzk()));
        dVar.a2(zzafcVar.zzd());
        return dVar;
    }

    public final Task<zzafj> zza() {
        return zza(new zzaas());
    }

    public final Task<Void> zza(a0 a0Var, t tVar) {
        return zza((zzaal) new zzaal().zza(a0Var).zza((zzacx<Void, t>) tVar).zza((w) tVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabk(str));
    }

    public final Task<zzafk> zza(String str, String str2) {
        return zza(new zzaar(str, str2));
    }

    public final Task<Void> zza(String str, String str2, e eVar) {
        eVar.B1(7);
        return zza(new zzabz(str, str2, eVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabf(str, str2, str3, str4));
    }

    public final Task<Void> zza(o oVar, t0 t0Var, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, q0.b bVar, Executor executor, Activity activity) {
        zzabr zzabrVar = new zzabr(t0Var, s.f(oVar.zzc()), str, j10, z10, z11, str2, str3, z12);
        zzabrVar.zza(bVar, activity, executor, t0Var.l());
        return zza(zzabrVar);
    }

    public final Task<zzagj> zza(o oVar, String str) {
        return zza(new zzabs(oVar, str));
    }

    public final Task<Void> zza(o oVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, q0.b bVar, Executor executor, Activity activity) {
        zzabp zzabpVar = new zzabp(oVar, str, str2, j10, z10, z11, str3, str4, z12);
        zzabpVar.zza(bVar, activity, executor, str);
        return zza(zzabpVar);
    }

    public final Task<Void> zza(g gVar, a0 a0Var, d1 d1Var, oc.d1 d1Var2) {
        return zza((zzaca) new zzaca(d1Var).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var2).zza((w) d1Var2));
    }

    public final Task<i> zza(g gVar, a0 a0Var, h hVar, String str, oc.d1 d1Var) {
        s.j(gVar);
        s.j(hVar);
        s.j(a0Var);
        s.j(d1Var);
        List<String> V1 = a0Var.V1();
        if (V1 != null && V1.contains(hVar.u1())) {
            return Tasks.forException(zzacf.zza(new Status(17015)));
        }
        if (hVar instanceof j) {
            j jVar = (j) hVar;
            return !jVar.zzf() ? zza((zzaau) new zzaau(jVar, str).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var)) : zza((zzaav) new zzaav(jVar).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
        }
        if (hVar instanceof o0) {
            zzadt.zza();
            return zza((zzaaw) new zzaaw((o0) hVar).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
        }
        s.j(gVar);
        s.j(hVar);
        s.j(a0Var);
        s.j(d1Var);
        return zza((zzaat) new zzaat(hVar).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(g gVar, a0 a0Var, j jVar, String str, oc.d1 d1Var) {
        return zza((zzaba) new zzaba(jVar, str).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(g gVar, a0 a0Var, o0 o0Var, String str, oc.d1 d1Var) {
        zzadt.zza();
        return zza((zzabe) new zzabe(o0Var, str).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(g gVar, a0 a0Var, o0 o0Var, oc.d1 d1Var) {
        zzadt.zza();
        return zza((zzabx) new zzabx(o0Var).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<i> zza(g gVar, a0 a0Var, r0 r0Var, String str, i1 i1Var) {
        zzadt.zza();
        zzaaq zzaaqVar = new zzaaq(r0Var, str, null);
        zzaaqVar.zza(gVar).zza((zzacx<i, i1>) i1Var);
        if (a0Var != null) {
            zzaaqVar.zza(a0Var);
        }
        return zza(zzaaqVar);
    }

    public final Task<i> zza(g gVar, a0 a0Var, w0 w0Var, String str, String str2, i1 i1Var) {
        zzaaq zzaaqVar = new zzaaq(w0Var, str, str2);
        zzaaqVar.zza(gVar).zza((zzacx<i, i1>) i1Var);
        if (a0Var != null) {
            zzaaqVar.zza(a0Var);
        }
        return zza(zzaaqVar);
    }

    public final Task<Void> zza(g gVar, a0 a0Var, String str, String str2, String str3, String str4, oc.d1 d1Var) {
        return zza((zzabc) new zzabc(str, str2, str3, str4).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(g gVar, a0 a0Var, String str, String str2, oc.d1 d1Var) {
        return zza((zzabu) new zzabu(a0Var.zze(), str, str2).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<c0> zza(g gVar, a0 a0Var, String str, oc.d1 d1Var) {
        return zza((zzaap) new zzaap(str).zza(gVar).zza(a0Var).zza((zzacx<c0, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(g gVar, a0 a0Var, oc.d1 d1Var) {
        return zza((zzabg) new zzabg().zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(g gVar, e eVar, String str) {
        return zza((zzabi) new zzabi(str, eVar).zza(gVar));
    }

    public final Task<i> zza(g gVar, h hVar, String str, i1 i1Var) {
        return zza((zzabm) new zzabm(hVar, str).zza(gVar).zza((zzacx<i, i1>) i1Var));
    }

    public final Task<i> zza(g gVar, j jVar, String str, i1 i1Var) {
        return zza((zzabn) new zzabn(jVar, str).zza(gVar).zza((zzacx<i, i1>) i1Var));
    }

    public final Task<i> zza(g gVar, o0 o0Var, String str, i1 i1Var) {
        zzadt.zza();
        return zza((zzabq) new zzabq(o0Var, str).zza(gVar).zza((zzacx<i, i1>) i1Var));
    }

    public final Task<Void> zza(g gVar, r0 r0Var, a0 a0Var, String str, i1 i1Var) {
        zzadt.zza();
        zzaan zzaanVar = new zzaan(r0Var, a0Var.zze(), str, null);
        zzaanVar.zza(gVar).zza((zzacx<Void, i1>) i1Var);
        return zza(zzaanVar);
    }

    public final Task<Void> zza(g gVar, w0 w0Var, a0 a0Var, String str, String str2, i1 i1Var) {
        zzaan zzaanVar = new zzaan(w0Var, a0Var.zze(), str, str2);
        zzaanVar.zza(gVar).zza((zzacx<Void, i1>) i1Var);
        return zza(zzaanVar);
    }

    public final Task<Void> zza(g gVar, String str, e eVar, String str2, String str3) {
        eVar.B1(1);
        return zza((zzabh) new zzabh(str, eVar, str2, str3, "sendPasswordResetEmail").zza(gVar));
    }

    public final Task<Void> zza(g gVar, String str, String str2) {
        return zza((zzaah) new zzaah(str, str2).zza(gVar));
    }

    public final Task<Void> zza(g gVar, String str, String str2, String str3) {
        return zza((zzaaj) new zzaaj(str, str2, str3).zza(gVar));
    }

    public final Task<i> zza(g gVar, String str, String str2, String str3, String str4, i1 i1Var) {
        return zza((zzaam) new zzaam(str, str2, str3, str4).zza(gVar).zza((zzacx<i, i1>) i1Var));
    }

    public final Task<i> zza(g gVar, String str, String str2, i1 i1Var) {
        return zza((zzabl) new zzabl(str, str2).zza(gVar).zza((zzacx<i, i1>) i1Var));
    }

    public final Task<i> zza(g gVar, i1 i1Var, String str) {
        return zza((zzabj) new zzabj(str).zza(gVar).zza((zzacx<i, i1>) i1Var));
    }

    public final void zza(g gVar, zzaga zzagaVar, q0.b bVar, Activity activity, Executor executor) {
        zza((zzacb) new zzacb(zzagaVar).zza(gVar).zza(bVar, activity, executor, zzagaVar.zzd()));
    }

    public final Task<Void> zzb(g gVar, a0 a0Var, h hVar, String str, oc.d1 d1Var) {
        return zza((zzaay) new zzaay(hVar, str).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<i> zzb(g gVar, a0 a0Var, j jVar, String str, oc.d1 d1Var) {
        return zza((zzaaz) new zzaaz(jVar, str).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<i> zzb(g gVar, a0 a0Var, o0 o0Var, String str, oc.d1 d1Var) {
        zzadt.zza();
        return zza((zzabd) new zzabd(o0Var, str).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<i> zzb(g gVar, a0 a0Var, String str, String str2, String str3, String str4, oc.d1 d1Var) {
        return zza((zzabb) new zzabb(str, str2, str3, str4).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<i> zzb(g gVar, a0 a0Var, String str, oc.d1 d1Var) {
        s.j(gVar);
        s.f(str);
        s.j(a0Var);
        s.j(d1Var);
        List<String> V1 = a0Var.V1();
        if ((V1 != null && !V1.contains(str)) || a0Var.A1()) {
            return Tasks.forException(zzacf.zza(new Status(17016, str)));
        }
        str.hashCode();
        return !str.equals("password") ? zza((zzabw) new zzabw(str).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var)) : zza((zzabt) new zzabt().zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zzb(g gVar, String str, e eVar, String str2, String str3) {
        eVar.B1(6);
        return zza((zzabh) new zzabh(str, eVar, str2, str3, "sendSignInLinkToEmail").zza(gVar));
    }

    public final Task<com.google.firebase.auth.d> zzb(g gVar, String str, String str2) {
        return zza((zzaak) new zzaak(str, str2).zza(gVar));
    }

    public final Task<i> zzb(g gVar, String str, String str2, String str3, String str4, i1 i1Var) {
        return zza((zzabo) new zzabo(str, str2, str3, str4).zza(gVar).zza((zzacx<i, i1>) i1Var));
    }

    public final Task<i> zzc(g gVar, a0 a0Var, h hVar, String str, oc.d1 d1Var) {
        return zza((zzaax) new zzaax(hVar, str).zza(gVar).zza(a0Var).zza((zzacx<i, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<Void> zzc(g gVar, a0 a0Var, String str, oc.d1 d1Var) {
        return zza((zzabv) new zzabv(str).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<v0> zzc(g gVar, String str, String str2) {
        return zza((zzaao) new zzaao(str, str2).zza(gVar));
    }

    public final Task<Void> zzd(g gVar, a0 a0Var, String str, oc.d1 d1Var) {
        return zza((zzaby) new zzaby(str).zza(gVar).zza(a0Var).zza((zzacx<Void, i1>) d1Var).zza((w) d1Var));
    }

    public final Task<String> zzd(g gVar, String str, String str2) {
        return zza((zzacc) new zzacc(str, str2).zza(gVar));
    }
}
