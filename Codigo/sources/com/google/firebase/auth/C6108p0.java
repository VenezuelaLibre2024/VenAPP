package com.google.firebase.auth;

import android.app.Activity;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.C6112q0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p272oc.C9875o;

/* renamed from: com.google.firebase.auth.p0 */
/* loaded from: classes.dex */
public final class C6108p0 {

    /* renamed from: a */
    private final FirebaseAuth f12970a;

    /* renamed from: b */
    private Long f12971b;

    /* renamed from: c */
    private C6112q0.b f12972c;

    /* renamed from: d */
    private Executor f12973d;

    /* renamed from: e */
    private String f12974e;

    /* renamed from: f */
    private Activity f12975f;

    /* renamed from: g */
    private C6112q0.a f12976g;

    /* renamed from: h */
    private AbstractC6092l0 f12977h;

    /* renamed from: i */
    private C6124t0 f12978i;

    /* renamed from: j */
    private boolean f12979j;

    /* renamed from: k */
    private boolean f12980k;

    /* renamed from: com.google.firebase.auth.p0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final FirebaseAuth f12981a;

        /* renamed from: b */
        private String f12982b;

        /* renamed from: c */
        private Long f12983c;

        /* renamed from: d */
        private C6112q0.b f12984d;

        /* renamed from: e */
        private Executor f12985e;

        /* renamed from: f */
        private Activity f12986f;

        /* renamed from: g */
        private C6112q0.a f12987g;

        /* renamed from: h */
        private AbstractC6092l0 f12988h;

        /* renamed from: i */
        private C6124t0 f12989i;

        /* renamed from: j */
        private boolean f12990j;

        public a(FirebaseAuth firebaseAuth) {
            this.f12981a = (FirebaseAuth) C5276s.m13324j(firebaseAuth);
        }

        /* renamed from: a */
        public final C6108p0 m16595a() {
            boolean z10;
            String str;
            C5276s.m13325k(this.f12981a, "FirebaseAuth instance cannot be null");
            C5276s.m13325k(this.f12983c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            C5276s.m13325k(this.f12984d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f12985e = this.f12981a.m16364D0();
            if (this.f12983c.longValue() < 0 || this.f12983c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            AbstractC6092l0 abstractC6092l0 = this.f12988h;
            if (abstractC6092l0 == null) {
                C5276s.m13321g(this.f12982b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                C5276s.m13316b(!this.f12990j, "You cannot require sms validation without setting a multi-factor session.");
                C5276s.m13316b(this.f12989i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (abstractC6092l0 != null && ((C9875o) abstractC6092l0).zzd()) {
                    C5276s.m13320f(this.f12982b);
                    z10 = this.f12989i == null;
                    str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
                } else {
                    C5276s.m13316b(this.f12989i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    z10 = this.f12982b == null;
                    str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
                }
                C5276s.m13316b(z10, str);
            }
            return new C6108p0(this.f12981a, this.f12983c, this.f12984d, this.f12985e, this.f12982b, this.f12986f, this.f12987g, this.f12988h, this.f12989i, this.f12990j);
        }

        /* renamed from: b */
        public final a m16596b(Activity activity) {
            this.f12986f = activity;
            return this;
        }

        /* renamed from: c */
        public final a m16597c(C6112q0.b bVar) {
            this.f12984d = bVar;
            return this;
        }

        /* renamed from: d */
        public final a m16598d(C6112q0.a aVar) {
            this.f12987g = aVar;
            return this;
        }

        /* renamed from: e */
        public final a m16599e(C6124t0 c6124t0) {
            this.f12989i = c6124t0;
            return this;
        }

        /* renamed from: f */
        public final a m16600f(AbstractC6092l0 abstractC6092l0) {
            this.f12988h = abstractC6092l0;
            return this;
        }

        /* renamed from: g */
        public final a m16601g(String str) {
            this.f12982b = str;
            return this;
        }

        /* renamed from: h */
        public final a m16602h(Long l10, TimeUnit timeUnit) {
            this.f12983c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    private C6108p0(FirebaseAuth firebaseAuth, Long l10, C6112q0.b bVar, Executor executor, String str, Activity activity, C6112q0.a aVar, AbstractC6092l0 abstractC6092l0, C6124t0 c6124t0, boolean z10) {
        this.f12970a = firebaseAuth;
        this.f12974e = str;
        this.f12971b = l10;
        this.f12972c = bVar;
        this.f12975f = activity;
        this.f12973d = executor;
        this.f12976g = aVar;
        this.f12977h = abstractC6092l0;
        this.f12978i = c6124t0;
        this.f12979j = z10;
    }

    /* renamed from: a */
    public final Activity m16582a() {
        return this.f12975f;
    }

    /* renamed from: b */
    public final void m16583b(boolean z10) {
        this.f12980k = true;
    }

    /* renamed from: c */
    public final FirebaseAuth m16584c() {
        return this.f12970a;
    }

    /* renamed from: d */
    public final AbstractC6092l0 m16585d() {
        return this.f12977h;
    }

    /* renamed from: e */
    public final C6112q0.a m16586e() {
        return this.f12976g;
    }

    /* renamed from: f */
    public final C6112q0.b m16587f() {
        return this.f12972c;
    }

    /* renamed from: g */
    public final C6124t0 m16588g() {
        return this.f12978i;
    }

    /* renamed from: h */
    public final Long m16589h() {
        return this.f12971b;
    }

    /* renamed from: i */
    public final String m16590i() {
        return this.f12974e;
    }

    /* renamed from: j */
    public final Executor m16591j() {
        return this.f12973d;
    }

    /* renamed from: k */
    public final boolean m16592k() {
        return this.f12980k;
    }

    /* renamed from: l */
    public final boolean m16593l() {
        return this.f12979j;
    }

    /* renamed from: m */
    public final boolean m16594m() {
        return this.f12977h != null;
    }
}
