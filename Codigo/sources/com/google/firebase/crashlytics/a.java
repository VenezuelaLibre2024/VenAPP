package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import cd.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import sc.d;
import sc.g;
import sc.k;
import vc.b0;
import vc.i;
import vc.m;
import vc.r;
import vc.x;
import vc.z;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    final r f11860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.a$a */
    /* loaded from: classes.dex */
    public class C0174a implements Continuation<Void, Object> {
        C0174a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task<Void> task) {
            if (task.isSuccessful()) {
                return null;
            }
            g.f().e("Error fetching settings.", task.getException());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ boolean f11861a;

        /* renamed from: b */
        final /* synthetic */ r f11862b;

        /* renamed from: c */
        final /* synthetic */ f f11863c;

        b(boolean z10, r rVar, f fVar) {
            this.f11861a = z10;
            this.f11862b = rVar;
            this.f11863c = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (!this.f11861a) {
                return null;
            }
            this.f11862b.j(this.f11863c);
            return null;
        }
    }

    private a(r rVar) {
        this.f11860a = rVar;
    }

    public static a d() {
        a aVar = (a) zb.g.o().k(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static a e(zb.g gVar, fe.f fVar, ee.a<sc.a> aVar, ee.a<cc.a> aVar2, ee.a<bf.a> aVar3) {
        Context m10 = gVar.m();
        String packageName = m10.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + r.l() + " for " + packageName);
        ad.f fVar2 = new ad.f(m10);
        x xVar = new x(gVar);
        b0 b0Var = new b0(m10, packageName, fVar, xVar);
        d dVar = new d(aVar);
        rc.d dVar2 = new rc.d(aVar2);
        ExecutorService c10 = z.c("Crashlytics Exception Handler");
        m mVar = new m(xVar, fVar2);
        ef.a.e(mVar);
        r rVar = new r(gVar, b0Var, dVar, xVar, dVar2.e(), dVar2.d(), fVar2, c10, mVar, new k(aVar3));
        String c11 = gVar.r().c();
        String m11 = i.m(m10);
        List<vc.f> j10 = i.j(m10);
        g.f().b("Mapping file ID is: " + m11);
        for (vc.f fVar3 : j10) {
            g.f().b(String.format("Build id for %s on %s: %s", fVar3.c(), fVar3.a(), fVar3.b()));
        }
        try {
            vc.a a10 = vc.a.a(m10, b0Var, c11, m11, j10, new sc.f(m10));
            g.f().i("Installer package name is: " + a10.f28775d);
            ExecutorService c12 = z.c("com.google.firebase.crashlytics.startup");
            f l10 = f.l(m10, c11, b0Var, new zc.b(), a10.f28777f, a10.f28778g, fVar2, xVar);
            l10.p(c12).continueWith(c12, new C0174a());
            Tasks.call(c12, new b(rVar.s(a10, l10), rVar, l10));
            return new a(rVar);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public Task<Boolean> a() {
        return this.f11860a.e();
    }

    public void b() {
        this.f11860a.f();
    }

    public boolean c() {
        return this.f11860a.g();
    }

    public void f(String str) {
        this.f11860a.n(str);
    }

    public void g(Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f11860a.o(th2);
        }
    }

    public void h() {
        this.f11860a.t();
    }

    public void i(Boolean bool) {
        this.f11860a.u(bool);
    }

    public void j(boolean z10) {
        this.f11860a.u(Boolean.valueOf(z10));
    }

    public void k(String str, String str2) {
        this.f11860a.v(str, str2);
    }

    public void l(String str) {
        this.f11860a.x(str);
    }
}
