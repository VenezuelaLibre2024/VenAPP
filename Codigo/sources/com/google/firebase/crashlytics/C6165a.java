package com.google.firebase.crashlytics;

import ad.C0103f;
import android.content.Context;
import android.content.pm.PackageManager;
import bf.InterfaceC1776a;
import cc.InterfaceC1940a;
import cd.C1949f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ee.InterfaceC7182a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p084ef.C7184a;
import p106fe.InterfaceC7337f;
import p333rc.C10689d;
import p485zb.C12867g;
import p486zc.C12880b;
import sc.C10886d;
import sc.C10888f;
import sc.C10889g;
import sc.C10893k;
import sc.InterfaceC10883a;
import vc.C11823a;
import vc.C11826b0;
import vc.C11833f;
import vc.C11839i;
import vc.C11847m;
import vc.C11857r;
import vc.C11869x;
import vc.C11872z;

/* renamed from: com.google.firebase.crashlytics.a */
/* loaded from: classes.dex */
public class C6165a {

    /* renamed from: a */
    final C11857r f13075a;

    /* renamed from: com.google.firebase.crashlytics.a$a */
    /* loaded from: classes.dex */
    class a implements Continuation<Void, Object> {
        a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task<Void> task) {
            if (task.isSuccessful()) {
                return null;
            }
            C10889g.m33216f().m33220e("Error fetching settings.", task.getException());
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.a$b */
    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ boolean f13076a;

        /* renamed from: b */
        final /* synthetic */ C11857r f13077b;

        /* renamed from: c */
        final /* synthetic */ C1949f f13078c;

        b(boolean z10, C11857r c11857r, C1949f c1949f) {
            this.f13076a = z10;
            this.f13077b = c11857r;
            this.f13078c = c1949f;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!this.f13076a) {
                return null;
            }
            this.f13077b.m37879j(this.f13078c);
            return null;
        }
    }

    private C6165a(C11857r c11857r) {
        this.f13075a = c11857r;
    }

    /* renamed from: d */
    public static C6165a m16693d() {
        C6165a c6165a = (C6165a) C12867g.m42617o().m42629k(C6165a.class);
        if (c6165a != null) {
            return c6165a;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C6165a m16694e(C12867g c12867g, InterfaceC7337f interfaceC7337f, InterfaceC7182a<InterfaceC10883a> interfaceC7182a, InterfaceC7182a<InterfaceC1940a> interfaceC7182a2, InterfaceC7182a<InterfaceC1776a> interfaceC7182a3) {
        Context m42630m = c12867g.m42630m();
        String packageName = m42630m.getPackageName();
        C10889g.m33216f().m33221g("Initializing Firebase Crashlytics " + C11857r.m37873l() + " for " + packageName);
        C0103f c0103f = new C0103f(m42630m);
        C11869x c11869x = new C11869x(c12867g);
        C11826b0 c11826b0 = new C11826b0(m42630m, packageName, interfaceC7337f, c11869x);
        C10886d c10886d = new C10886d(interfaceC7182a);
        C10689d c10689d = new C10689d(interfaceC7182a2);
        ExecutorService m37959c = C11872z.m37959c("Crashlytics Exception Handler");
        C11847m c11847m = new C11847m(c11869x, c0103f);
        C7184a.m21382e(c11847m);
        C11857r c11857r = new C11857r(c12867g, c11826b0, c10886d, c11869x, c10689d.m32552e(), c10689d.m32551d(), c0103f, m37959c, c11847m, new C10893k(interfaceC7182a3));
        String m42644c = c12867g.m42632r().m42644c();
        String m37732m = C11839i.m37732m(m42630m);
        List<C11833f> m37729j = C11839i.m37729j(m42630m);
        C10889g.m33216f().m33217b("Mapping file ID is: " + m37732m);
        for (C11833f c11833f : m37729j) {
            C10889g.m33216f().m33217b(String.format("Build id for %s on %s: %s", c11833f.m37703c(), c11833f.m37701a(), c11833f.m37702b()));
        }
        try {
            C11823a m37666a = C11823a.m37666a(m42630m, c11826b0, m42644c, m37732m, m37729j, new C10888f(m42630m));
            C10889g.m33216f().m33223i("Installer package name is: " + m37666a.f31209d);
            ExecutorService m37959c2 = C11872z.m37959c("com.google.firebase.crashlytics.startup");
            C1949f m10182l = C1949f.m10182l(m42630m, m42644c, c11826b0, new C12880b(), m37666a.f31211f, m37666a.f31212g, c0103f, c11869x);
            m10182l.m10191p(m37959c2).continueWith(m37959c2, new a());
            Tasks.call(m37959c2, new b(c11857r.m37885s(m37666a, m10182l), c11857r, m10182l));
            return new C6165a(c11857r);
        } catch (PackageManager.NameNotFoundException e10) {
            C10889g.m33216f().m33220e("Error retrieving app package info.", e10);
            return null;
        }
    }

    /* renamed from: a */
    public Task<Boolean> m16695a() {
        return this.f13075a.m37875e();
    }

    /* renamed from: b */
    public void m16696b() {
        this.f13075a.m37876f();
    }

    /* renamed from: c */
    public boolean m16697c() {
        return this.f13075a.m37877g();
    }

    /* renamed from: f */
    public void m16698f(String str) {
        this.f13075a.m37880n(str);
    }

    /* renamed from: g */
    public void m16699g(Throwable th2) {
        if (th2 == null) {
            C10889g.m33216f().m33225k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f13075a.m37881o(th2);
        }
    }

    /* renamed from: h */
    public void m16700h() {
        this.f13075a.m37886t();
    }

    /* renamed from: i */
    public void m16701i(Boolean bool) {
        this.f13075a.m37887u(bool);
    }

    /* renamed from: j */
    public void m16702j(boolean z10) {
        this.f13075a.m37887u(Boolean.valueOf(z10));
    }

    /* renamed from: k */
    public void m16703k(String str, String str2) {
        this.f13075a.m37888v(str, str2);
    }

    /* renamed from: l */
    public void m16704l(String str) {
        this.f13075a.m37890x(str);
    }
}
