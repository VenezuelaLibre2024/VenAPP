package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5101a.d;
import com.google.android.gms.common.api.internal.AbstractC5123d;
import com.google.android.gms.common.api.internal.AbstractC5167p;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.AbstractC5194y;
import com.google.android.gms.common.api.internal.BinderC5160m1;
import com.google.android.gms.common.api.internal.C5111a;
import com.google.android.gms.common.api.internal.C5115b;
import com.google.android.gms.common.api.internal.C5120c0;
import com.google.android.gms.common.api.internal.C5135g;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.common.api.internal.C5155l;
import com.google.android.gms.common.api.internal.C5156l0;
import com.google.android.gms.common.api.internal.C5170q;
import com.google.android.gms.common.api.internal.C5171q0;
import com.google.android.gms.common.api.internal.InterfaceC5182u;
import com.google.android.gms.common.api.internal.ServiceConnectionC5158m;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import la.C9471p;

/* renamed from: com.google.android.gms.common.api.e */
/* loaded from: classes.dex */
public abstract class AbstractC5105e<O extends C5101a.d> {
    protected final C5135g zaa;
    private final Context zab;
    private final String zac;
    private final C5101a zad;
    private final C5101a.d zae;
    private final C5115b zaf;
    private final Looper zag;
    private final int zah;
    private final AbstractC5106f zai;
    private final InterfaceC5182u zaj;

    /* renamed from: com.google.android.gms.common.api.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f10417c = new C13182a().m12980a();

        /* renamed from: a */
        public final InterfaceC5182u f10418a;

        /* renamed from: b */
        public final Looper f10419b;

        /* renamed from: com.google.android.gms.common.api.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13182a {

            /* renamed from: a */
            private InterfaceC5182u f10420a;

            /* renamed from: b */
            private Looper f10421b;

            /* renamed from: a */
            public a m12980a() {
                if (this.f10420a == null) {
                    this.f10420a = new C5111a();
                }
                if (this.f10421b == null) {
                    this.f10421b = Looper.getMainLooper();
                }
                return new a(this.f10420a, this.f10421b);
            }

            /* renamed from: b */
            public C13182a m12981b(Looper looper) {
                C5276s.m13325k(looper, "Looper must not be null.");
                this.f10421b = looper;
                return this;
            }

            /* renamed from: c */
            public C13182a m12982c(InterfaceC5182u interfaceC5182u) {
                C5276s.m13325k(interfaceC5182u, "StatusExceptionMapper must not be null.");
                this.f10420a = interfaceC5182u;
                return this;
            }
        }

        private a(InterfaceC5182u interfaceC5182u, Account account, Looper looper) {
            this.f10418a = interfaceC5182u;
            this.f10419b = looper;
        }
    }

    public AbstractC5105e(Activity activity, C5101a<O> c5101a, O o10, a aVar) {
        this(activity, activity, c5101a, o10, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC5105e(android.app.Activity r2, com.google.android.gms.common.api.C5101a<O> r3, O r4, com.google.android.gms.common.api.internal.InterfaceC5182u r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.m12982c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m12981b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.m12980a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC5105e.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.u):void");
    }

    private AbstractC5105e(Context context, Activity activity, C5101a c5101a, C5101a.d dVar, a aVar) {
        C5276s.m13325k(context, "Null context is not permitted.");
        C5276s.m13325k(c5101a, "Api must not be null.");
        C5276s.m13325k(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (C9471p.m28175l()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = c5101a;
        this.zae = dVar;
        this.zag = aVar.f10419b;
        C5115b m12999a = C5115b.m12999a(c5101a, dVar, str);
        this.zaf = m12999a;
        this.zai = new C5171q0(this);
        C5135g m13052y = C5135g.m13052y(this.zab);
        this.zaa = m13052y;
        this.zah = m13052y.m13067n();
        this.zaj = aVar.f10418a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C5120c0.m13017j(activity, m13052y, m12999a);
        }
        m13052y.m13062c(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC5105e(android.content.Context r2, com.google.android.gms.common.api.C5101a<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.InterfaceC5182u r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.m12981b(r5)
            r0.m12982c(r6)
            com.google.android.gms.common.api.e$a r5 = r0.m12980a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC5105e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, android.os.Looper, com.google.android.gms.common.api.internal.u):void");
    }

    public AbstractC5105e(Context context, C5101a<O> c5101a, O o10, a aVar) {
        this(context, (Activity) null, c5101a, o10, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC5105e(android.content.Context r2, com.google.android.gms.common.api.C5101a<O> r3, O r4, com.google.android.gms.common.api.internal.InterfaceC5182u r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.m12982c(r5)
            com.google.android.gms.common.api.e$a r5 = r0.m12980a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC5105e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.u):void");
    }

    private final AbstractC5123d zad(int i10, AbstractC5123d abstractC5123d) {
        abstractC5123d.zak();
        this.zaa.m13057H(this, i10, abstractC5123d);
        return abstractC5123d;
    }

    private final Task zae(int i10, AbstractC5188w abstractC5188w) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.m13058I(this, i10, abstractC5188w, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public AbstractC5106f asGoogleApiClient() {
        return this.zai;
    }

    protected C5234e.a createClientSettingsBuilder() {
        Account m12977c1;
        GoogleSignInAccount m12978T0;
        GoogleSignInAccount m12978T02;
        C5234e.a aVar = new C5234e.a();
        C5101a.d dVar = this.zae;
        if (!(dVar instanceof C5101a.d.b) || (m12978T02 = ((C5101a.d.b) dVar).m12978T0()) == null) {
            C5101a.d dVar2 = this.zae;
            m12977c1 = dVar2 instanceof C5101a.d.a ? ((C5101a.d.a) dVar2).m12977c1() : null;
        } else {
            m12977c1 = m12978T02.m12905c1();
        }
        aVar.m13245d(m12977c1);
        C5101a.d dVar3 = this.zae;
        aVar.m13244c((!(dVar3 instanceof C5101a.d.b) || (m12978T0 = ((C5101a.d.b) dVar3).m12978T0()) == null) ? Collections.emptySet() : m12978T0.m12913z1());
        aVar.m13246e(this.zab.getClass().getName());
        aVar.m13243b(this.zab.getPackageName());
        return aVar;
    }

    protected Task<Boolean> disconnectService() {
        return this.zaa.m13054A(this);
    }

    public <A extends C5101a.b, T extends AbstractC5123d<? extends InterfaceC5204n, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    public <TResult, A extends C5101a.b> Task<TResult> doBestEffortWrite(AbstractC5188w<A, TResult> abstractC5188w) {
        return zae(2, abstractC5188w);
    }

    public <A extends C5101a.b, T extends AbstractC5123d<? extends InterfaceC5204n, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    public <TResult, A extends C5101a.b> Task<TResult> doRead(AbstractC5188w<A, TResult> abstractC5188w) {
        return zae(0, abstractC5188w);
    }

    @Deprecated
    public <A extends C5101a.b, T extends AbstractC5167p<A, ?>, U extends AbstractC5194y<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        C5276s.m13324j(t10);
        C5276s.m13324j(u10);
        C5276s.m13325k(t10.m13146b(), "Listener has already been released.");
        C5276s.m13325k(u10.m13205a(), "Listener has already been released.");
        C5276s.m13316b(C5270q.m13304b(t10.m13146b(), u10.m13205a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.m13055B(this, t10, u10, new Runnable() { // from class: com.google.android.gms.common.api.u
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    public <A extends C5101a.b> Task<Void> doRegisterEventListener(C5170q<A, ?> c5170q) {
        C5276s.m13324j(c5170q);
        C5276s.m13325k(c5170q.f10564a.m13146b(), "Listener has already been released.");
        C5276s.m13325k(c5170q.f10565b.m13205a(), "Listener has already been released.");
        return this.zaa.m13055B(this, c5170q.f10564a, c5170q.f10565b, c5170q.f10566c);
    }

    public Task<Boolean> doUnregisterEventListener(C5151k.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public Task<Boolean> doUnregisterEventListener(C5151k.a<?> aVar, int i10) {
        C5276s.m13325k(aVar, "Listener key cannot be null.");
        return this.zaa.m13056C(this, aVar, i10);
    }

    public <A extends C5101a.b, T extends AbstractC5123d<? extends InterfaceC5204n, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    public <TResult, A extends C5101a.b> Task<TResult> doWrite(AbstractC5188w<A, TResult> abstractC5188w) {
        return zae(1, abstractC5188w);
    }

    public final C5115b<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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

    public <L> C5151k<L> registerListener(L l10, String str) {
        return C5155l.m13090a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5101a.f zab(Looper looper, C5156l0 c5156l0) {
        C5101a.f buildClient = ((C5101a.a) C5276s.m13324j(this.zad.m12974a())).buildClient(this.zab, looper, createClientSettingsBuilder().m13242a(), (C5234e) this.zae, (AbstractC5106f.a) c5156l0, (AbstractC5106f.b) c5156l0);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC5228c)) {
            ((AbstractC5228c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof ServiceConnectionC5158m)) {
            ((ServiceConnectionC5158m) buildClient).m13137d(contextAttributionTag);
        }
        return buildClient;
    }

    public final BinderC5160m1 zac(Context context, Handler handler) {
        return new BinderC5160m1(context, handler, createClientSettingsBuilder().m13242a());
    }
}
