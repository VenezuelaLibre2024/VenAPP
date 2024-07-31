package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class e<O extends a.d> {
    protected final com.google.android.gms.common.api.internal.g zaa;
    private final Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final com.google.android.gms.common.api.internal.b zaf;
    private final Looper zag;
    private final int zah;
    private final f zai;
    private final com.google.android.gms.common.api.internal.u zaj;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f9309c = new C0148a().a();

        /* renamed from: a */
        public final com.google.android.gms.common.api.internal.u f9310a;

        /* renamed from: b */
        public final Looper f9311b;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        /* loaded from: classes.dex */
        public static class C0148a {

            /* renamed from: a */
            private com.google.android.gms.common.api.internal.u f9312a;

            /* renamed from: b */
            private Looper f9313b;

            public a a() {
                if (this.f9312a == null) {
                    this.f9312a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.f9313b == null) {
                    this.f9313b = Looper.getMainLooper();
                }
                return new a(this.f9312a, this.f9313b);
            }

            public C0148a b(Looper looper) {
                com.google.android.gms.common.internal.s.k(looper, "Looper must not be null.");
                this.f9313b = looper;
                return this;
            }

            public C0148a c(com.google.android.gms.common.api.internal.u uVar) {
                com.google.android.gms.common.internal.s.k(uVar, "StatusExceptionMapper must not be null.");
                this.f9312a = uVar;
                return this;
            }
        }

        private a(com.google.android.gms.common.api.internal.u uVar, Account account, Looper looper) {
            this.f9310a = uVar;
            this.f9311b = looper;
        }

        /* synthetic */ a(com.google.android.gms.common.api.internal.u uVar, Account account, Looper looper, v vVar) {
            this(uVar, null, looper);
        }
    }

    public e(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.app.Activity r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.u r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.u):void");
    }

    private e(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        com.google.android.gms.common.internal.s.k(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.s.k(aVar, "Api must not be null.");
        com.google.android.gms.common.internal.s.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (la.p.l()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.f9311b;
        com.google.android.gms.common.api.internal.b a10 = com.google.android.gms.common.api.internal.b.a(aVar, dVar, str);
        this.zaf = a10;
        this.zai = new q0(this);
        com.google.android.gms.common.api.internal.g y10 = com.google.android.gms.common.api.internal.g.y(this.zab);
        this.zaa = y10;
        this.zah = y10.n();
        this.zaj = aVar2.f9310a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            c0.j(activity, y10, a10);
        }
        y10.c(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.u r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.b(r5)
            r0.c(r6)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, android.os.Looper, com.google.android.gms.common.api.internal.u):void");
    }

    public e(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.u r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.c(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.u):void");
    }

    private final com.google.android.gms.common.api.internal.d zad(int i10, com.google.android.gms.common.api.internal.d dVar) {
        dVar.zak();
        this.zaa.H(this, i10, dVar);
        return dVar;
    }

    private final Task zae(int i10, com.google.android.gms.common.api.internal.w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.I(this, i10, wVar, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public f asGoogleApiClient() {
        return this.zai;
    }

    protected e.a createClientSettingsBuilder() {
        Account c12;
        GoogleSignInAccount T0;
        GoogleSignInAccount T02;
        e.a aVar = new e.a();
        a.d dVar = this.zae;
        if (!(dVar instanceof a.d.b) || (T02 = ((a.d.b) dVar).T0()) == null) {
            a.d dVar2 = this.zae;
            c12 = dVar2 instanceof a.d.InterfaceC0147a ? ((a.d.InterfaceC0147a) dVar2).c1() : null;
        } else {
            c12 = T02.c1();
        }
        aVar.d(c12);
        a.d dVar3 = this.zae;
        aVar.c((!(dVar3 instanceof a.d.b) || (T0 = ((a.d.b) dVar3).T0()) == null) ? Collections.emptySet() : T0.z1());
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    protected Task<Boolean> disconnectService() {
        return this.zaa.A(this);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends n, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.w<A, TResult> wVar) {
        return zae(2, wVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends n, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    public <TResult, A extends a.b> Task<TResult> doRead(com.google.android.gms.common.api.internal.w<A, TResult> wVar) {
        return zae(0, wVar);
    }

    @Deprecated
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.p<A, ?>, U extends com.google.android.gms.common.api.internal.y<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        com.google.android.gms.common.internal.s.j(t10);
        com.google.android.gms.common.internal.s.j(u10);
        com.google.android.gms.common.internal.s.k(t10.b(), "Listener has already been released.");
        com.google.android.gms.common.internal.s.k(u10.a(), "Listener has already been released.");
        com.google.android.gms.common.internal.s.b(com.google.android.gms.common.internal.q.b(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.B(this, t10, u10, u.f9513a);
    }

    public <A extends a.b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.q<A, ?> qVar) {
        com.google.android.gms.common.internal.s.j(qVar);
        com.google.android.gms.common.internal.s.k(qVar.f9450a.b(), "Listener has already been released.");
        com.google.android.gms.common.internal.s.k(qVar.f9451b.a(), "Listener has already been released.");
        return this.zaa.B(this, qVar.f9450a, qVar.f9451b, qVar.f9452c);
    }

    public Task<Boolean> doUnregisterEventListener(k.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public Task<Boolean> doUnregisterEventListener(k.a<?> aVar, int i10) {
        com.google.android.gms.common.internal.s.k(aVar, "Listener key cannot be null.");
        return this.zaa.C(this, aVar, i10);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends n, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    public <TResult, A extends a.b> Task<TResult> doWrite(com.google.android.gms.common.api.internal.w<A, TResult> wVar) {
        return zae(1, wVar);
    }

    public final com.google.android.gms.common.api.internal.b<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.k<L> registerListener(L l10, String str) {
        return com.google.android.gms.common.api.internal.l.a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zab(Looper looper, l0 l0Var) {
        a.f buildClient = ((a.AbstractC0146a) com.google.android.gms.common.internal.s.j(this.zad.a())).buildClient(this.zab, looper, createClientSettingsBuilder().a(), (com.google.android.gms.common.internal.e) this.zae, (f.a) l0Var, (f.b) l0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.c)) {
            ((com.google.android.gms.common.internal.c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.api.internal.m)) {
            ((com.google.android.gms.common.api.internal.m) buildClient).d(contextAttributionTag);
        }
        return buildClient;
    }

    public final m1 zac(Context context, Handler handler) {
        return new m1(context, handler, createClientSettingsBuilder().a());
    }
}
