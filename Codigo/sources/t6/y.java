package t6;

import android.content.Context;
import android.os.Looper;
import t6.q;
import t6.y;
import v7.a0;

/* loaded from: classes.dex */
public interface y extends j3 {

    /* loaded from: classes.dex */
    public interface a {
        default void A(boolean z10) {
        }

        default void z(boolean z10) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        boolean A;
        Looper B;
        boolean C;

        /* renamed from: a */
        final Context f26594a;

        /* renamed from: b */
        t8.d f26595b;

        /* renamed from: c */
        long f26596c;

        /* renamed from: d */
        eb.v<t3> f26597d;

        /* renamed from: e */
        eb.v<a0.a> f26598e;

        /* renamed from: f */
        eb.v<q8.a0> f26599f;

        /* renamed from: g */
        eb.v<a2> f26600g;

        /* renamed from: h */
        eb.v<s8.e> f26601h;

        /* renamed from: i */
        eb.g<t8.d, u6.a> f26602i;

        /* renamed from: j */
        Looper f26603j;

        /* renamed from: k */
        t8.g0 f26604k;

        /* renamed from: l */
        v6.e f26605l;

        /* renamed from: m */
        boolean f26606m;

        /* renamed from: n */
        int f26607n;

        /* renamed from: o */
        boolean f26608o;

        /* renamed from: p */
        boolean f26609p;

        /* renamed from: q */
        int f26610q;

        /* renamed from: r */
        int f26611r;

        /* renamed from: s */
        boolean f26612s;

        /* renamed from: t */
        u3 f26613t;

        /* renamed from: u */
        long f26614u;

        /* renamed from: v */
        long f26615v;

        /* renamed from: w */
        z1 f26616w;

        /* renamed from: x */
        long f26617x;

        /* renamed from: y */
        long f26618y;

        /* renamed from: z */
        boolean f26619z;

        public b(Context context) {
            this(context, new eb.v() { // from class: t6.z

                /* renamed from: a */
                public final /* synthetic */ Context f26637a;

                public /* synthetic */ z(Context context2) {
                    r1 = context2;
                }

                @Override // eb.v
                public final Object get() {
                    t3 f10;
                    f10 = y.b.f(r1);
                    return f10;
                }
            }, new eb.v() { // from class: t6.a0

                /* renamed from: a */
                public final /* synthetic */ Context f25830a;

                public /* synthetic */ a0(Context context2) {
                    r1 = context2;
                }

                @Override // eb.v
                public final Object get() {
                    a0.a g10;
                    g10 = y.b.g(r1);
                    return g10;
                }
            });
        }

        private b(Context context, eb.v<t3> vVar, eb.v<a0.a> vVar2) {
            this(context, vVar, vVar2, new eb.v() { // from class: t6.b0

                /* renamed from: a */
                public final /* synthetic */ Context f25861a;

                public /* synthetic */ b0(Context context2) {
                    r1 = context2;
                }

                @Override // eb.v
                public final Object get() {
                    q8.a0 h10;
                    h10 = y.b.h(r1);
                    return h10;
                }
            }, new eb.v() { // from class: t6.c0
                @Override // eb.v
                public final Object get() {
                    return new r();
                }
            }, new eb.v() { // from class: t6.d0

                /* renamed from: a */
                public final /* synthetic */ Context f25986a;

                public /* synthetic */ d0(Context context2) {
                    r1 = context2;
                }

                @Override // eb.v
                public final Object get() {
                    s8.e n10;
                    n10 = s8.q.n(r1);
                    return n10;
                }
            }, new eb.g() { // from class: t6.e0
                @Override // eb.g
                public final Object apply(Object obj) {
                    return new u6.n1((t8.d) obj);
                }
            });
        }

        private b(Context context, eb.v<t3> vVar, eb.v<a0.a> vVar2, eb.v<q8.a0> vVar3, eb.v<a2> vVar4, eb.v<s8.e> vVar5, eb.g<t8.d, u6.a> gVar) {
            this.f26594a = (Context) t8.a.e(context);
            this.f26597d = vVar;
            this.f26598e = vVar2;
            this.f26599f = vVar3;
            this.f26600g = vVar4;
            this.f26601h = vVar5;
            this.f26602i = gVar;
            this.f26603j = t8.r0.Q();
            this.f26605l = v6.e.f27964r;
            this.f26607n = 0;
            this.f26610q = 1;
            this.f26611r = 0;
            this.f26612s = true;
            this.f26613t = u3.f26554g;
            this.f26614u = 5000L;
            this.f26615v = 15000L;
            this.f26616w = new q.b().a();
            this.f26595b = t8.d.f26644a;
            this.f26617x = 500L;
            this.f26618y = 2000L;
            this.A = true;
        }

        public static /* synthetic */ t3 f(Context context) {
            return new t(context);
        }

        public static /* synthetic */ a0.a g(Context context) {
            return new v7.q(context, new y6.h());
        }

        public static /* synthetic */ q8.a0 h(Context context) {
            return new q8.m(context);
        }

        public y e() {
            t8.a.g(!this.C);
            this.C = true;
            return new d1(this, null);
        }
    }

    void I(v7.a0 a0Var);

    void L(v6.e eVar, boolean z10);

    u1 l();
}
