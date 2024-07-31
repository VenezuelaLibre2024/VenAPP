package com.google.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.q0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    private final FirebaseAuth f11755a;

    /* renamed from: b */
    private Long f11756b;

    /* renamed from: c */
    private q0.b f11757c;

    /* renamed from: d */
    private Executor f11758d;

    /* renamed from: e */
    private String f11759e;

    /* renamed from: f */
    private Activity f11760f;

    /* renamed from: g */
    private q0.a f11761g;

    /* renamed from: h */
    private l0 f11762h;

    /* renamed from: i */
    private t0 f11763i;

    /* renamed from: j */
    private boolean f11764j;

    /* renamed from: k */
    private boolean f11765k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final FirebaseAuth f11766a;

        /* renamed from: b */
        private String f11767b;

        /* renamed from: c */
        private Long f11768c;

        /* renamed from: d */
        private q0.b f11769d;

        /* renamed from: e */
        private Executor f11770e;

        /* renamed from: f */
        private Activity f11771f;

        /* renamed from: g */
        private q0.a f11772g;

        /* renamed from: h */
        private l0 f11773h;

        /* renamed from: i */
        private t0 f11774i;

        /* renamed from: j */
        private boolean f11775j;

        public a(FirebaseAuth firebaseAuth) {
            this.f11766a = (FirebaseAuth) com.google.android.gms.common.internal.s.j(firebaseAuth);
        }

        public final p0 a() {
            boolean z10;
            String str;
            com.google.android.gms.common.internal.s.k(this.f11766a, "FirebaseAuth instance cannot be null");
            com.google.android.gms.common.internal.s.k(this.f11768c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            com.google.android.gms.common.internal.s.k(this.f11769d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f11770e = this.f11766a.D0();
            if (this.f11768c.longValue() < 0 || this.f11768c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            l0 l0Var = this.f11773h;
            if (l0Var == null) {
                com.google.android.gms.common.internal.s.g(this.f11767b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                com.google.android.gms.common.internal.s.b(!this.f11775j, "You cannot require sms validation without setting a multi-factor session.");
                com.google.android.gms.common.internal.s.b(this.f11774i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (l0Var != null && ((oc.o) l0Var).zzd()) {
                    com.google.android.gms.common.internal.s.f(this.f11767b);
                    z10 = this.f11774i == null;
                    str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
                } else {
                    com.google.android.gms.common.internal.s.b(this.f11774i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    z10 = this.f11767b == null;
                    str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
                }
                com.google.android.gms.common.internal.s.b(z10, str);
            }
            return new p0(this.f11766a, this.f11768c, this.f11769d, this.f11770e, this.f11767b, this.f11771f, this.f11772g, this.f11773h, this.f11774i, this.f11775j);
        }

        public final a b(Activity activity) {
            this.f11771f = activity;
            return this;
        }

        public final a c(q0.b bVar) {
            this.f11769d = bVar;
            return this;
        }

        public final a d(q0.a aVar) {
            this.f11772g = aVar;
            return this;
        }

        public final a e(t0 t0Var) {
            this.f11774i = t0Var;
            return this;
        }

        public final a f(l0 l0Var) {
            this.f11773h = l0Var;
            return this;
        }

        public final a g(String str) {
            this.f11767b = str;
            return this;
        }

        public final a h(Long l10, TimeUnit timeUnit) {
            this.f11768c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    private p0(FirebaseAuth firebaseAuth, Long l10, q0.b bVar, Executor executor, String str, Activity activity, q0.a aVar, l0 l0Var, t0 t0Var, boolean z10) {
        this.f11755a = firebaseAuth;
        this.f11759e = str;
        this.f11756b = l10;
        this.f11757c = bVar;
        this.f11760f = activity;
        this.f11758d = executor;
        this.f11761g = aVar;
        this.f11762h = l0Var;
        this.f11763i = t0Var;
        this.f11764j = z10;
    }

    /* synthetic */ p0(FirebaseAuth firebaseAuth, Long l10, q0.b bVar, Executor executor, String str, Activity activity, q0.a aVar, l0 l0Var, t0 t0Var, boolean z10, t1 t1Var) {
        this(firebaseAuth, l10, bVar, executor, str, activity, aVar, l0Var, t0Var, z10);
    }

    public final Activity a() {
        return this.f11760f;
    }

    public final void b(boolean z10) {
        this.f11765k = true;
    }

    public final FirebaseAuth c() {
        return this.f11755a;
    }

    public final l0 d() {
        return this.f11762h;
    }

    public final q0.a e() {
        return this.f11761g;
    }

    public final q0.b f() {
        return this.f11757c;
    }

    public final t0 g() {
        return this.f11763i;
    }

    public final Long h() {
        return this.f11756b;
    }

    public final String i() {
        return this.f11759e;
    }

    public final Executor j() {
        return this.f11758d;
    }

    public final boolean k() {
        return this.f11765k;
    }

    public final boolean l() {
        return this.f11764j;
    }

    public final boolean m() {
        return this.f11762h != null;
    }
}
