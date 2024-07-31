package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.internal.p002firebaseauthapi.zzacf;
import com.google.android.gms.internal.p002firebaseauthapi.zzacm;
import com.google.android.gms.internal.p002firebaseauthapi.zzacw;
import com.google.android.gms.internal.p002firebaseauthapi.zzadt;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.android.gms.internal.p002firebaseauthapi.zzafj;
import com.google.android.gms.internal.p002firebaseauthapi.zzafk;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.q0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class FirebaseAuth implements oc.b {

    /* renamed from: a */
    private zb.g f11605a;

    /* renamed from: b */
    private final List<b> f11606b;

    /* renamed from: c */
    private final List<oc.a> f11607c;

    /* renamed from: d */
    private List<a> f11608d;

    /* renamed from: e */
    private zzaai f11609e;

    /* renamed from: f */
    private a0 f11610f;

    /* renamed from: g */
    private oc.e f11611g;

    /* renamed from: h */
    private final Object f11612h;

    /* renamed from: i */
    private String f11613i;

    /* renamed from: j */
    private final Object f11614j;

    /* renamed from: k */
    private String f11615k;

    /* renamed from: l */
    private oc.t0 f11616l;

    /* renamed from: m */
    private final RecaptchaAction f11617m;

    /* renamed from: n */
    private final RecaptchaAction f11618n;

    /* renamed from: o */
    private final RecaptchaAction f11619o;

    /* renamed from: p */
    private final oc.y0 f11620p;

    /* renamed from: q */
    private final oc.e1 f11621q;

    /* renamed from: r */
    private final oc.d0 f11622r;

    /* renamed from: s */
    private final ee.b<jc.b> f11623s;

    /* renamed from: t */
    private final ee.b<od.i> f11624t;

    /* renamed from: u */
    private oc.x0 f11625u;

    /* renamed from: v */
    private final Executor f11626v;

    /* renamed from: w */
    private final Executor f11627w;

    /* renamed from: x */
    private final Executor f11628x;

    /* renamed from: y */
    private String f11629y;

    /* loaded from: classes.dex */
    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    /* loaded from: classes.dex */
    public class c implements oc.i1 {
        public c() {
        }

        @Override // oc.i1
        public final void a(zzafn zzafnVar, a0 a0Var) {
            com.google.android.gms.common.internal.s.j(zzafnVar);
            com.google.android.gms.common.internal.s.j(a0Var);
            a0Var.R1(zzafnVar);
            FirebaseAuth.this.e0(a0Var, zzafnVar, true);
        }
    }

    /* loaded from: classes.dex */
    public class d implements oc.w, oc.i1 {
        public d() {
        }

        @Override // oc.i1
        public final void a(zzafn zzafnVar, a0 a0Var) {
            com.google.android.gms.common.internal.s.j(zzafnVar);
            com.google.android.gms.common.internal.s.j(a0Var);
            a0Var.R1(zzafnVar);
            FirebaseAuth.this.f0(a0Var, zzafnVar, true, true);
        }

        @Override // oc.w
        public final void zza(Status status) {
            if (status.v1() == 17011 || status.v1() == 17021 || status.v1() == 17005 || status.v1() == 17091) {
                FirebaseAuth.this.C();
            }
        }
    }

    private FirebaseAuth(zb.g gVar, zzaai zzaaiVar, oc.y0 y0Var, oc.e1 e1Var, oc.d0 d0Var, ee.b<jc.b> bVar, ee.b<od.i> bVar2, @dc.a Executor executor, @dc.b Executor executor2, @dc.c Executor executor3, @dc.d Executor executor4) {
        zzafn a10;
        this.f11606b = new CopyOnWriteArrayList();
        this.f11607c = new CopyOnWriteArrayList();
        this.f11608d = new CopyOnWriteArrayList();
        this.f11612h = new Object();
        this.f11614j = new Object();
        this.f11617m = RecaptchaAction.custom("getOobCode");
        this.f11618n = RecaptchaAction.custom("signInWithPassword");
        this.f11619o = RecaptchaAction.custom("signUpPassword");
        this.f11605a = (zb.g) com.google.android.gms.common.internal.s.j(gVar);
        this.f11609e = (zzaai) com.google.android.gms.common.internal.s.j(zzaaiVar);
        oc.y0 y0Var2 = (oc.y0) com.google.android.gms.common.internal.s.j(y0Var);
        this.f11620p = y0Var2;
        this.f11611g = new oc.e();
        oc.e1 e1Var2 = (oc.e1) com.google.android.gms.common.internal.s.j(e1Var);
        this.f11621q = e1Var2;
        this.f11622r = (oc.d0) com.google.android.gms.common.internal.s.j(d0Var);
        this.f11623s = bVar;
        this.f11624t = bVar2;
        this.f11626v = executor2;
        this.f11627w = executor3;
        this.f11628x = executor4;
        a0 b10 = y0Var2.b();
        this.f11610f = b10;
        if (b10 != null && (a10 = y0Var2.a(b10)) != null) {
            d0(this, this.f11610f, a10, false, false);
        }
        e1Var2.b(this);
    }

    public FirebaseAuth(zb.g gVar, ee.b<jc.b> bVar, ee.b<od.i> bVar2, @dc.a Executor executor, @dc.b Executor executor2, @dc.c Executor executor3, @dc.c ScheduledExecutorService scheduledExecutorService, @dc.d Executor executor4) {
        this(gVar, new zzaai(gVar, executor2, scheduledExecutorService), new oc.y0(gVar.m(), gVar.s()), oc.e1.f(), oc.d0.b(), bVar, bVar2, executor, executor2, executor3, executor4);
    }

    private static oc.x0 I0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f11625u == null) {
            firebaseAuth.f11625u = new oc.x0((zb.g) com.google.android.gms.common.internal.s.j(firebaseAuth.f11605a));
        }
        return firebaseAuth.f11625u;
    }

    private final Task<i> K(j jVar, a0 a0Var, boolean z10) {
        return new g1(this, z10, a0Var, jVar).b(this, this.f11615k, this.f11617m, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<Void> R(a0 a0Var, oc.d1 d1Var) {
        com.google.android.gms.common.internal.s.j(a0Var);
        return this.f11609e.zza(this.f11605a, a0Var, d1Var);
    }

    private final Task<i> W(String str, String str2, String str3, a0 a0Var, boolean z10) {
        return new f1(this, str, z10, a0Var, str2, str3).b(this, str3, this.f11618n, "EMAIL_PASSWORD_PROVIDER");
    }

    public final q0.b a0(String str, q0.b bVar) {
        return (this.f11611g.g() && str != null && str.equals(this.f11611g.d())) ? new l2(this, bVar) : bVar;
    }

    private static void c0(FirebaseAuth firebaseAuth, a0 a0Var) {
        String str;
        if (a0Var != null) {
            str = "Notifying auth state listeners about user ( " + a0Var.l() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f11628x.execute(new w2(firebaseAuth));
    }

    private static void d0(FirebaseAuth firebaseAuth, a0 a0Var, zzafn zzafnVar, boolean z10, boolean z11) {
        boolean z12;
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.j(zzafnVar);
        boolean z13 = true;
        boolean z14 = firebaseAuth.f11610f != null && a0Var.l().equals(firebaseAuth.f11610f.l());
        if (z14 || !z11) {
            a0 a0Var2 = firebaseAuth.f11610f;
            if (a0Var2 == null) {
                z12 = true;
            } else {
                boolean z15 = !z14 || (a0Var2.U1().zzc().equals(zzafnVar.zzc()) ^ true);
                z12 = z14 ? false : true;
                z13 = z15;
            }
            com.google.android.gms.common.internal.s.j(a0Var);
            if (firebaseAuth.f11610f == null || !a0Var.l().equals(firebaseAuth.o())) {
                firebaseAuth.f11610f = a0Var;
            } else {
                firebaseAuth.f11610f.P1(a0Var.y1());
                if (!a0Var.A1()) {
                    firebaseAuth.f11610f.S1();
                }
                firebaseAuth.f11610f.T1(a0Var.x1().b());
            }
            if (z10) {
                firebaseAuth.f11620p.f(firebaseAuth.f11610f);
            }
            if (z13) {
                a0 a0Var3 = firebaseAuth.f11610f;
                if (a0Var3 != null) {
                    a0Var3.R1(zzafnVar);
                }
                p0(firebaseAuth, firebaseAuth.f11610f);
            }
            if (z12) {
                c0(firebaseAuth, firebaseAuth.f11610f);
            }
            if (z10) {
                firebaseAuth.f11620p.d(a0Var, zzafnVar);
            }
            a0 a0Var4 = firebaseAuth.f11610f;
            if (a0Var4 != null) {
                I0(firebaseAuth).c(a0Var4.U1());
            }
        }
    }

    public static void g0(p0 p0Var) {
        String E;
        String str;
        if (!p0Var.m()) {
            FirebaseAuth c10 = p0Var.c();
            String f10 = com.google.android.gms.common.internal.s.f(p0Var.i());
            if ((p0Var.e() != null) || !zzadt.zza(f10, p0Var.f(), p0Var.a(), p0Var.j())) {
                c10.f11622r.a(c10, f10, p0Var.a(), c10.H0(), p0Var.k()).addOnCompleteListener(new j2(c10, p0Var, f10));
                return;
            }
            return;
        }
        FirebaseAuth c11 = p0Var.c();
        if (((oc.o) com.google.android.gms.common.internal.s.j(p0Var.d())).zzd()) {
            E = com.google.android.gms.common.internal.s.f(p0Var.i());
            str = E;
        } else {
            t0 t0Var = (t0) com.google.android.gms.common.internal.s.j(p0Var.g());
            String f11 = com.google.android.gms.common.internal.s.f(t0Var.l());
            E = t0Var.E();
            str = f11;
        }
        if (p0Var.e() == null || !zzadt.zza(str, p0Var.f(), p0Var.a(), p0Var.j())) {
            c11.f11622r.a(c11, E, p0Var.a(), c11.H0(), p0Var.k()).addOnCompleteListener(new i2(c11, p0Var, str));
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) zb.g.o().k(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(zb.g gVar) {
        return (FirebaseAuth) gVar.k(FirebaseAuth.class);
    }

    public static void j0(zb.m mVar, p0 p0Var, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        p0Var.j().execute(new Runnable() { // from class: com.google.firebase.auth.h2

            /* renamed from: b */
            private /* synthetic */ zb.m f11693b;

            public /* synthetic */ h2(zb.m mVar2) {
                r2 = mVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q0.b.this.onVerificationFailed(r2);
            }
        });
    }

    private static void p0(FirebaseAuth firebaseAuth, a0 a0Var) {
        String str;
        if (a0Var != null) {
            str = "Notifying id token listeners about user ( " + a0Var.l() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f11628x.execute(new u2(firebaseAuth, new ke.b(a0Var != null ? a0Var.zzd() : null)));
    }

    private final boolean q0(String str) {
        f c10 = f.c(str);
        return (c10 == null || TextUtils.equals(this.f11615k, c10.d())) ? false : true;
    }

    public Task<i> A(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        return W(str, str2, this.f11615k, null, false);
    }

    public Task<i> B(String str, String str2) {
        return y(k.b(str, str2));
    }

    public final Executor B0() {
        return this.f11627w;
    }

    public void C() {
        F0();
        oc.x0 x0Var = this.f11625u;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public Task<i> D(Activity activity, n nVar) {
        com.google.android.gms.common.internal.s.j(nVar);
        com.google.android.gms.common.internal.s.j(activity);
        TaskCompletionSource<i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f11621q.c(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzacf.zza(new Status(17057)));
        }
        oc.m0.d(activity.getApplicationContext(), this);
        nVar.c(activity);
        return taskCompletionSource.getTask();
    }

    public final Executor D0() {
        return this.f11628x;
    }

    public void E() {
        synchronized (this.f11612h) {
            this.f11613i = zzacw.zza();
        }
    }

    public void F(String str, int i10) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.b(i10 >= 0 && i10 <= 65535, "Port number must be in the range 0-65535");
        zzaed.zza(this.f11605a, str, i10);
    }

    public final void F0() {
        com.google.android.gms.common.internal.s.j(this.f11620p);
        a0 a0Var = this.f11610f;
        if (a0Var != null) {
            oc.y0 y0Var = this.f11620p;
            com.google.android.gms.common.internal.s.j(a0Var);
            y0Var.e(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.l()));
            this.f11610f = null;
        }
        this.f11620p.e("com.google.firebase.auth.FIREBASE_USER");
        p0(this, null);
        c0(this, null);
    }

    public Task<String> G(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zzd(this.f11605a, str, this.f11615k);
    }

    public final Task<zzafj> H() {
        return this.f11609e.zza();
    }

    public final boolean H0() {
        return zzacm.zza(i().m());
    }

    public final Task<i> I(Activity activity, n nVar, a0 a0Var) {
        com.google.android.gms.common.internal.s.j(activity);
        com.google.android.gms.common.internal.s.j(nVar);
        com.google.android.gms.common.internal.s.j(a0Var);
        TaskCompletionSource<i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f11621q.d(activity, taskCompletionSource, this, a0Var)) {
            return Tasks.forException(zzacf.zza(new Status(17057)));
        }
        oc.m0.e(activity.getApplicationContext(), this, a0Var);
        nVar.a(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<Void> J(e eVar, String str) {
        com.google.android.gms.common.internal.s.f(str);
        if (this.f11613i != null) {
            if (eVar == null) {
                eVar = e.D1();
            }
            eVar.C1(this.f11613i);
        }
        return this.f11609e.zza(this.f11605a, eVar, str);
    }

    public final Task<Void> L(a0 a0Var) {
        com.google.android.gms.common.internal.s.j(a0Var);
        return this.f11609e.zza(a0Var, new q2(this, a0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> M(a0 a0Var, h hVar) {
        com.google.android.gms.common.internal.s.j(hVar);
        com.google.android.gms.common.internal.s.j(a0Var);
        return hVar instanceof j ? new n2(this, a0Var, (j) hVar.w1()).b(this, a0Var.z1(), this.f11619o, "EMAIL_PASSWORD_PROVIDER") : this.f11609e.zza(this.f11605a, a0Var, hVar.w1(), (String) null, (oc.d1) new d());
    }

    public final Task<Void> N(a0 a0Var, i0 i0Var, String str) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.j(i0Var);
        return i0Var instanceof r0 ? this.f11609e.zza(this.f11605a, (r0) i0Var, a0Var, str, new c()) : i0Var instanceof w0 ? this.f11609e.zza(this.f11605a, (w0) i0Var, a0Var, str, this.f11615k, new c()) : Tasks.forException(zzacf.zza(new Status(17499)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> O(a0 a0Var, o0 o0Var) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.j(o0Var);
        return this.f11609e.zza(this.f11605a, a0Var, (o0) o0Var.w1(), (oc.d1) new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> P(a0 a0Var, d1 d1Var) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.j(d1Var);
        return this.f11609e.zza(this.f11605a, a0Var, d1Var, (oc.d1) new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> Q(a0 a0Var, String str) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zza(this.f11605a, a0Var, str, this.f11615k, (oc.d1) new d()).continueWithTask(new r2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.v2, oc.d1] */
    public final Task<c0> S(a0 a0Var, boolean z10) {
        if (a0Var == null) {
            return Tasks.forException(zzacf.zza(new Status(17495)));
        }
        zzafn U1 = a0Var.U1();
        return (!U1.zzg() || z10) ? this.f11609e.zza(this.f11605a, a0Var, U1.zzd(), (oc.d1) new v2(this)) : Tasks.forResult(oc.h0.a(U1.zzc()));
    }

    public final Task<i> T(i0 i0Var, oc.o oVar, a0 a0Var) {
        com.google.android.gms.common.internal.s.j(i0Var);
        com.google.android.gms.common.internal.s.j(oVar);
        if (i0Var instanceof r0) {
            return this.f11609e.zza(this.f11605a, a0Var, (r0) i0Var, com.google.android.gms.common.internal.s.f(oVar.zzc()), new c());
        }
        if (i0Var instanceof w0) {
            return this.f11609e.zza(this.f11605a, a0Var, (w0) i0Var, com.google.android.gms.common.internal.s.f(oVar.zzc()), this.f11615k, new c());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final Task<zzafk> U(String str) {
        return this.f11609e.zza(this.f11615k, str);
    }

    public final Task<Void> V(String str, String str2, e eVar) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        if (eVar == null) {
            eVar = e.D1();
        }
        String str3 = this.f11613i;
        if (str3 != null) {
            eVar.C1(str3);
        }
        return this.f11609e.zza(str, str2, eVar);
    }

    public final Task<z0> X(oc.o oVar) {
        com.google.android.gms.common.internal.s.j(oVar);
        return this.f11609e.zza(oVar, this.f11615k).continueWithTask(new s2(this));
    }

    public final q0.b Z(p0 p0Var, q0.b bVar) {
        return p0Var.k() ? bVar : new k2(this, p0Var, bVar);
    }

    @Override // oc.b
    public Task<c0> a(boolean z10) {
        return S(this.f11610f, z10);
    }

    public void b(a aVar) {
        this.f11608d.add(aVar);
        this.f11628x.execute(new t2(this, aVar));
    }

    public void c(b bVar) {
        this.f11606b.add(bVar);
        this.f11628x.execute(new g2(this, bVar));
    }

    public Task<Void> d(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zza(this.f11605a, str, this.f11615k);
    }

    public Task<com.google.firebase.auth.d> e(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zzb(this.f11605a, str, this.f11615k);
    }

    public final void e0(a0 a0Var, zzafn zzafnVar, boolean z10) {
        f0(a0Var, zzafnVar, true, false);
    }

    public Task<Void> f(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        return this.f11609e.zza(this.f11605a, str, str2, this.f11615k);
    }

    public final void f0(a0 a0Var, zzafn zzafnVar, boolean z10, boolean z11) {
        d0(this, a0Var, zzafnVar, true, z11);
    }

    public Task<i> g(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        return new m2(this, str, str2).b(this, this.f11615k, this.f11619o, "EMAIL_PASSWORD_PROVIDER");
    }

    @Deprecated
    public Task<v0> h(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zzc(this.f11605a, str, this.f11615k);
    }

    public final void h0(p0 p0Var, String str, String str2) {
        long longValue = p0Var.h().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String f10 = com.google.android.gms.common.internal.s.f(p0Var.i());
        zzaga zzagaVar = new zzaga(f10, longValue, p0Var.e() != null, this.f11613i, this.f11615k, str, str2, H0());
        q0.b a02 = a0(f10, p0Var.f());
        this.f11609e.zza(this.f11605a, zzagaVar, TextUtils.isEmpty(str) ? Z(p0Var, a02) : a02, p0Var.a(), p0Var.j());
    }

    public zb.g i() {
        return this.f11605a;
    }

    public final synchronized void i0(oc.t0 t0Var) {
        this.f11616l = t0Var;
    }

    public a0 j() {
        return this.f11610f;
    }

    public String k() {
        return this.f11629y;
    }

    public final Task<i> k0(Activity activity, n nVar, a0 a0Var) {
        com.google.android.gms.common.internal.s.j(activity);
        com.google.android.gms.common.internal.s.j(nVar);
        com.google.android.gms.common.internal.s.j(a0Var);
        TaskCompletionSource<i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f11621q.d(activity, taskCompletionSource, this, a0Var)) {
            return Tasks.forException(zzacf.zza(new Status(17057)));
        }
        oc.m0.e(activity.getApplicationContext(), this, a0Var);
        nVar.b(activity);
        return taskCompletionSource.getTask();
    }

    public w l() {
        return this.f11611g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> l0(a0 a0Var) {
        return R(a0Var, new d());
    }

    public String m() {
        String str;
        synchronized (this.f11612h) {
            str = this.f11613i;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> m0(a0 a0Var, String str) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(a0Var);
        return this.f11609e.zzb(this.f11605a, a0Var, str, new d());
    }

    public String n() {
        String str;
        synchronized (this.f11614j) {
            str = this.f11615k;
        }
        return str;
    }

    public String o() {
        a0 a0Var = this.f11610f;
        if (a0Var == null) {
            return null;
        }
        return a0Var.l();
    }

    public final synchronized oc.t0 o0() {
        return this.f11616l;
    }

    public void p(a aVar) {
        this.f11608d.remove(aVar);
    }

    public void q(b bVar) {
        this.f11606b.remove(bVar);
    }

    public Task<Void> r(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return s(str, null);
    }

    public Task<Void> s(String str, e eVar) {
        com.google.android.gms.common.internal.s.f(str);
        if (eVar == null) {
            eVar = e.D1();
        }
        String str2 = this.f11613i;
        if (str2 != null) {
            eVar.C1(str2);
        }
        eVar.B1(1);
        return new p2(this, str, eVar).b(this, this.f11615k, this.f11617m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> s0(a0 a0Var, h hVar) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.j(hVar);
        h w12 = hVar.w1();
        if (!(w12 instanceof j)) {
            return w12 instanceof o0 ? this.f11609e.zzb(this.f11605a, a0Var, (o0) w12, this.f11615k, (oc.d1) new d()) : this.f11609e.zzc(this.f11605a, a0Var, w12, a0Var.z1(), new d());
        }
        j jVar = (j) w12;
        return "password".equals(jVar.v1()) ? W(jVar.zzc(), com.google.android.gms.common.internal.s.f(jVar.zzd()), a0Var.z1(), a0Var, true) : q0(com.google.android.gms.common.internal.s.f(jVar.zze())) ? Tasks.forException(zzacf.zza(new Status(17072))) : K(jVar, a0Var, true);
    }

    public Task<Void> t(String str, e eVar) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(eVar);
        if (!eVar.u1()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.f11613i;
        if (str2 != null) {
            eVar.C1(str2);
        }
        return new o2(this, str, eVar).b(this, this.f11615k, this.f11617m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> t0(a0 a0Var, String str) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zzc(this.f11605a, a0Var, str, new d());
    }

    public void u(String str) {
        String str2;
        com.google.android.gms.common.internal.s.f(str);
        if (str.startsWith("chrome-extension://")) {
            this.f11629y = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.f11629y = (String) com.google.android.gms.common.internal.s.j(new URI(str2).getHost());
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.f11629y = str;
        }
    }

    public final ee.b<jc.b> u0() {
        return this.f11623s;
    }

    public void v(String str) {
        com.google.android.gms.common.internal.s.f(str);
        synchronized (this.f11612h) {
            this.f11613i = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oc.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> v0(a0 a0Var, String str) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zzd(this.f11605a, a0Var, str, new d());
    }

    public void w(String str) {
        com.google.android.gms.common.internal.s.f(str);
        synchronized (this.f11614j) {
            this.f11615k = str;
        }
    }

    public final ee.b<od.i> w0() {
        return this.f11624t;
    }

    public Task<i> x() {
        a0 a0Var = this.f11610f;
        if (a0Var == null || !a0Var.A1()) {
            return this.f11609e.zza(this.f11605a, new c(), this.f11615k);
        }
        oc.d dVar = (oc.d) this.f11610f;
        dVar.Z1(false);
        return Tasks.forResult(new oc.w1(dVar));
    }

    public Task<i> y(h hVar) {
        com.google.android.gms.common.internal.s.j(hVar);
        h w12 = hVar.w1();
        if (w12 instanceof j) {
            j jVar = (j) w12;
            return !jVar.zzf() ? W(jVar.zzc(), (String) com.google.android.gms.common.internal.s.j(jVar.zzd()), this.f11615k, null, false) : q0(com.google.android.gms.common.internal.s.f(jVar.zze())) ? Tasks.forException(zzacf.zza(new Status(17072))) : K(jVar, null, false);
        }
        if (w12 instanceof o0) {
            return this.f11609e.zza(this.f11605a, (o0) w12, this.f11615k, (oc.i1) new c());
        }
        return this.f11609e.zza(this.f11605a, w12, this.f11615k, new c());
    }

    public Task<i> z(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return this.f11609e.zza(this.f11605a, str, this.f11615k, new c());
    }

    public final Executor z0() {
        return this.f11626v;
    }
}
