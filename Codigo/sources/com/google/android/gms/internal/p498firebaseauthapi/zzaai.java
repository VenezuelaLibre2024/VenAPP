package com.google.android.gms.internal.p498firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.C6053c0;
import com.google.firebase.auth.C6058d1;
import com.google.firebase.auth.C6060e;
import com.google.firebase.auth.C6083j;
import com.google.firebase.auth.C6104o0;
import com.google.firebase.auth.C6112q0;
import com.google.firebase.auth.C6116r0;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6136w0;
import com.google.firebase.auth.InterfaceC6056d;
import com.google.firebase.auth.InterfaceC6076i;
import com.google.firebase.auth.InterfaceC6132v0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p272oc.C9842d;
import p272oc.C9848f;
import p272oc.C9858i0;
import p272oc.C9875o;
import p272oc.C9907y1;
import p272oc.InterfaceC9844d1;
import p272oc.InterfaceC9859i1;
import p272oc.InterfaceC9890t;
import p272oc.InterfaceC9899w;
import p485zb.C12867g;

/* loaded from: classes2.dex */
public final class zzaai extends zzadh {
    public zzaai(C12867g c12867g, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzacg(c12867g, scheduledExecutorService);
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C9842d zza(C12867g c12867g, zzafc zzafcVar) {
        C5276s.m13324j(c12867g);
        C5276s.m13324j(zzafcVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9907y1(zzafcVar, "firebase"));
        List<zzafs> zzl = zzafcVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new C9907y1(zzl.get(i10)));
            }
        }
        C9842d c9842d = new C9842d(c12867g, arrayList);
        c9842d.m29510Y1(new C9848f(zzafcVar.zzb(), zzafcVar.zza()));
        c9842d.m29511Z1(zzafcVar.zzn());
        c9842d.m29509X1(zzafcVar.zze());
        c9842d.mo16451T1(C9858i0.m29542b(zzafcVar.zzk()));
        c9842d.m29512a2(zzafcVar.zzd());
        return c9842d;
    }

    public final Task<zzafj> zza() {
        return zza(new zzaas());
    }

    public final Task<Void> zza(AbstractC6045a0 abstractC6045a0, InterfaceC9890t interfaceC9890t) {
        return zza((zzaal) new zzaal().zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9890t>) interfaceC9890t).zza((InterfaceC9899w) interfaceC9890t));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabk(str));
    }

    public final Task<zzafk> zza(String str, String str2) {
        return zza(new zzaar(str, str2));
    }

    public final Task<Void> zza(String str, String str2, C6060e c6060e) {
        c6060e.m16497B1(7);
        return zza(new zzabz(str, str2, c6060e));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabf(str, str2, str3, str4));
    }

    public final Task<Void> zza(C9875o c9875o, C6124t0 c6124t0, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, C6112q0.b bVar, Executor executor, Activity activity) {
        zzabr zzabrVar = new zzabr(c6124t0, C5276s.m13320f(c9875o.zzc()), str, j10, z10, z11, str2, str3, z12);
        zzabrVar.zza(bVar, activity, executor, c6124t0.mo16553l());
        return zza(zzabrVar);
    }

    public final Task<zzagj> zza(C9875o c9875o, String str) {
        return zza(new zzabs(c9875o, str));
    }

    public final Task<Void> zza(C9875o c9875o, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, C6112q0.b bVar, Executor executor, Activity activity) {
        zzabp zzabpVar = new zzabp(c9875o, str, str2, j10, z10, z11, str3, str4, z12);
        zzabpVar.zza(bVar, activity, executor, str);
        return zza(zzabpVar);
    }

    public final Task<Void> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6058d1 c6058d1, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzaca) new zzaca(c6058d1).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, AbstractC6072h abstractC6072h, String str, InterfaceC9844d1 interfaceC9844d1) {
        C5276s.m13324j(c12867g);
        C5276s.m13324j(abstractC6072h);
        C5276s.m13324j(abstractC6045a0);
        C5276s.m13324j(interfaceC9844d1);
        List<String> mo16453V1 = abstractC6045a0.mo16453V1();
        if (mo16453V1 != null && mo16453V1.contains(abstractC6072h.mo16464u1())) {
            return Tasks.forException(zzacf.zza(new Status(17015)));
        }
        if (abstractC6072h instanceof C6083j) {
            C6083j c6083j = (C6083j) abstractC6072h;
            return !c6083j.zzf() ? zza((zzaau) new zzaau(c6083j, str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1)) : zza((zzaav) new zzaav(c6083j).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
        }
        if (abstractC6072h instanceof C6104o0) {
            zzadt.zza();
            return zza((zzaaw) new zzaaw((C6104o0) abstractC6072h).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
        }
        C5276s.m13324j(c12867g);
        C5276s.m13324j(abstractC6072h);
        C5276s.m13324j(abstractC6045a0);
        C5276s.m13324j(interfaceC9844d1);
        return zza((zzaat) new zzaat(abstractC6072h).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6083j c6083j, String str, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzaba) new zzaba(c6083j, str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6104o0 c6104o0, String str, InterfaceC9844d1 interfaceC9844d1) {
        zzadt.zza();
        return zza((zzabe) new zzabe(c6104o0, str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6104o0 c6104o0, InterfaceC9844d1 interfaceC9844d1) {
        zzadt.zza();
        return zza((zzabx) new zzabx(c6104o0).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6116r0 c6116r0, String str, InterfaceC9859i1 interfaceC9859i1) {
        zzadt.zza();
        zzaaq zzaaqVar = new zzaaq(c6116r0, str, null);
        zzaaqVar.zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1);
        if (abstractC6045a0 != null) {
            zzaaqVar.zza(abstractC6045a0);
        }
        return zza(zzaaqVar);
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6136w0 c6136w0, String str, String str2, InterfaceC9859i1 interfaceC9859i1) {
        zzaaq zzaaqVar = new zzaaq(c6136w0, str, str2);
        zzaaqVar.zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1);
        if (abstractC6045a0 != null) {
            zzaaqVar.zza(abstractC6045a0);
        }
        return zza(zzaaqVar);
    }

    public final Task<Void> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, String str, String str2, String str3, String str4, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzabc) new zzabc(str, str2, str3, str4).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, String str, String str2, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzabu) new zzabu(abstractC6045a0.zze(), str, str2).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<C6053c0> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, String str, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzaap) new zzaap(str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<C6053c0, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zza(C12867g c12867g, AbstractC6045a0 abstractC6045a0, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzabg) new zzabg().zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zza(C12867g c12867g, C6060e c6060e, String str) {
        return zza((zzabi) new zzabi(str, c6060e).zza(c12867g));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, AbstractC6072h abstractC6072h, String str, InterfaceC9859i1 interfaceC9859i1) {
        return zza((zzabm) new zzabm(abstractC6072h, str).zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, C6083j c6083j, String str, InterfaceC9859i1 interfaceC9859i1) {
        return zza((zzabn) new zzabn(c6083j, str).zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, C6104o0 c6104o0, String str, InterfaceC9859i1 interfaceC9859i1) {
        zzadt.zza();
        return zza((zzabq) new zzabq(c6104o0, str).zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1));
    }

    public final Task<Void> zza(C12867g c12867g, C6116r0 c6116r0, AbstractC6045a0 abstractC6045a0, String str, InterfaceC9859i1 interfaceC9859i1) {
        zzadt.zza();
        zzaan zzaanVar = new zzaan(c6116r0, abstractC6045a0.zze(), str, null);
        zzaanVar.zza(c12867g).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9859i1);
        return zza(zzaanVar);
    }

    public final Task<Void> zza(C12867g c12867g, C6136w0 c6136w0, AbstractC6045a0 abstractC6045a0, String str, String str2, InterfaceC9859i1 interfaceC9859i1) {
        zzaan zzaanVar = new zzaan(c6136w0, abstractC6045a0.zze(), str, str2);
        zzaanVar.zza(c12867g).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9859i1);
        return zza(zzaanVar);
    }

    public final Task<Void> zza(C12867g c12867g, String str, C6060e c6060e, String str2, String str3) {
        c6060e.m16497B1(1);
        return zza((zzabh) new zzabh(str, c6060e, str2, str3, "sendPasswordResetEmail").zza(c12867g));
    }

    public final Task<Void> zza(C12867g c12867g, String str, String str2) {
        return zza((zzaah) new zzaah(str, str2).zza(c12867g));
    }

    public final Task<Void> zza(C12867g c12867g, String str, String str2, String str3) {
        return zza((zzaaj) new zzaaj(str, str2, str3).zza(c12867g));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, String str, String str2, String str3, String str4, InterfaceC9859i1 interfaceC9859i1) {
        return zza((zzaam) new zzaam(str, str2, str3, str4).zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, String str, String str2, InterfaceC9859i1 interfaceC9859i1) {
        return zza((zzabl) new zzabl(str, str2).zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1));
    }

    public final Task<InterfaceC6076i> zza(C12867g c12867g, InterfaceC9859i1 interfaceC9859i1, String str) {
        return zza((zzabj) new zzabj(str).zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1));
    }

    public final void zza(C12867g c12867g, zzaga zzagaVar, C6112q0.b bVar, Activity activity, Executor executor) {
        zza((zzacb) new zzacb(zzagaVar).zza(c12867g).zza(bVar, activity, executor, zzagaVar.zzd()));
    }

    public final Task<Void> zzb(C12867g c12867g, AbstractC6045a0 abstractC6045a0, AbstractC6072h abstractC6072h, String str, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzaay) new zzaay(abstractC6072h, str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<InterfaceC6076i> zzb(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6083j c6083j, String str, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzaaz) new zzaaz(c6083j, str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<InterfaceC6076i> zzb(C12867g c12867g, AbstractC6045a0 abstractC6045a0, C6104o0 c6104o0, String str, InterfaceC9844d1 interfaceC9844d1) {
        zzadt.zza();
        return zza((zzabd) new zzabd(c6104o0, str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<InterfaceC6076i> zzb(C12867g c12867g, AbstractC6045a0 abstractC6045a0, String str, String str2, String str3, String str4, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzabb) new zzabb(str, str2, str3, str4).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<InterfaceC6076i> zzb(C12867g c12867g, AbstractC6045a0 abstractC6045a0, String str, InterfaceC9844d1 interfaceC9844d1) {
        C5276s.m13324j(c12867g);
        C5276s.m13320f(str);
        C5276s.m13324j(abstractC6045a0);
        C5276s.m13324j(interfaceC9844d1);
        List<String> mo16453V1 = abstractC6045a0.mo16453V1();
        if ((mo16453V1 != null && !mo16453V1.contains(str)) || abstractC6045a0.mo16430A1()) {
            return Tasks.forException(zzacf.zza(new Status(17016, str)));
        }
        str.hashCode();
        return !str.equals("password") ? zza((zzabw) new zzabw(str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1)) : zza((zzabt) new zzabt().zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zzb(C12867g c12867g, String str, C6060e c6060e, String str2, String str3) {
        c6060e.m16497B1(6);
        return zza((zzabh) new zzabh(str, c6060e, str2, str3, "sendSignInLinkToEmail").zza(c12867g));
    }

    public final Task<InterfaceC6056d> zzb(C12867g c12867g, String str, String str2) {
        return zza((zzaak) new zzaak(str, str2).zza(c12867g));
    }

    public final Task<InterfaceC6076i> zzb(C12867g c12867g, String str, String str2, String str3, String str4, InterfaceC9859i1 interfaceC9859i1) {
        return zza((zzabo) new zzabo(str, str2, str3, str4).zza(c12867g).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9859i1));
    }

    public final Task<InterfaceC6076i> zzc(C12867g c12867g, AbstractC6045a0 abstractC6045a0, AbstractC6072h abstractC6072h, String str, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzaax) new zzaax(abstractC6072h, str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<InterfaceC6076i, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<Void> zzc(C12867g c12867g, AbstractC6045a0 abstractC6045a0, String str, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzabv) new zzabv(str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<InterfaceC6132v0> zzc(C12867g c12867g, String str, String str2) {
        return zza((zzaao) new zzaao(str, str2).zza(c12867g));
    }

    public final Task<Void> zzd(C12867g c12867g, AbstractC6045a0 abstractC6045a0, String str, InterfaceC9844d1 interfaceC9844d1) {
        return zza((zzaby) new zzaby(str).zza(c12867g).zza(abstractC6045a0).zza((zzacx<Void, InterfaceC9859i1>) interfaceC9844d1).zza((InterfaceC9899w) interfaceC9844d1));
    }

    public final Task<String> zzd(C12867g c12867g, String str, String str2) {
        return zza((zzacc) new zzacc(str, str2).zza(c12867g));
    }
}
