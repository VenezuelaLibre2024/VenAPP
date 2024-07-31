package i4;

import android.content.Intent;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: d */
    public static final a f17122d = new a(null);

    /* renamed from: e */
    private static volatile u0 f17123e;

    /* renamed from: a */
    private final k1.a f17124a;

    /* renamed from: b */
    private final t0 f17125b;

    /* renamed from: c */
    private s0 f17126c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized u0 a() {
            u0 u0Var;
            if (u0.f17123e == null) {
                k1.a b10 = k1.a.b(e0.l());
                kotlin.jvm.internal.n.d(b10, "getInstance(applicationContext)");
                u0.f17123e = new u0(b10, new t0());
            }
            u0Var = u0.f17123e;
            if (u0Var == null) {
                kotlin.jvm.internal.n.p("instance");
                throw null;
            }
            return u0Var;
        }
    }

    public u0(k1.a localBroadcastManager, t0 profileCache) {
        kotlin.jvm.internal.n.e(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.n.e(profileCache, "profileCache");
        this.f17124a = localBroadcastManager;
        this.f17125b = profileCache;
    }

    private final void e(s0 s0Var, s0 s0Var2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", s0Var);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", s0Var2);
        this.f17124a.d(intent);
    }

    private final void g(s0 s0Var, boolean z10) {
        s0 s0Var2 = this.f17126c;
        this.f17126c = s0Var;
        if (z10) {
            t0 t0Var = this.f17125b;
            if (s0Var != null) {
                t0Var.c(s0Var);
            } else {
                t0Var.a();
            }
        }
        if (com.facebook.internal.n0.e(s0Var2, s0Var)) {
            return;
        }
        e(s0Var2, s0Var);
    }

    public final s0 c() {
        return this.f17126c;
    }

    public final boolean d() {
        s0 b10 = this.f17125b.b();
        if (b10 == null) {
            return false;
        }
        g(b10, false);
        return true;
    }

    public final void f(s0 s0Var) {
        g(s0Var, true);
    }
}
