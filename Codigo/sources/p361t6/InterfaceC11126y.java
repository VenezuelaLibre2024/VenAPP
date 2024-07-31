package p361t6;

import android.content.Context;
import android.os.Looper;
import p082eb.InterfaceC7151g;
import p082eb.InterfaceC7166v;
import p307q8.AbstractC10294a0;
import p307q8.C10307m;
import p351s8.C10839q;
import p351s8.InterfaceC10817e;
import p361t6.C11086q;
import p361t6.InterfaceC11126y;
import p363t8.C11137a;
import p363t8.C11150g0;
import p363t8.C11172r0;
import p363t8.InterfaceC11143d;
import p376u6.C11394n1;
import p376u6.InterfaceC11327a;
import p396v6.C11639e;
import p397v7.C11723q;
import p397v7.InterfaceC11684a0;
import p459y6.C12618h;

/* renamed from: t6.y */
/* loaded from: classes.dex */
public interface InterfaceC11126y extends InterfaceC11053j3 {

    /* renamed from: t6.y$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: A */
        default void mo33964A(boolean z10) {
        }

        /* renamed from: z */
        default void m34576z(boolean z10) {
        }
    }

    /* renamed from: t6.y$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        boolean f28887A;

        /* renamed from: B */
        Looper f28888B;

        /* renamed from: C */
        boolean f28889C;

        /* renamed from: a */
        final Context f28890a;

        /* renamed from: b */
        InterfaceC11143d f28891b;

        /* renamed from: c */
        long f28892c;

        /* renamed from: d */
        InterfaceC7166v<InterfaceC11105t3> f28893d;

        /* renamed from: e */
        InterfaceC7166v<InterfaceC11684a0.a> f28894e;

        /* renamed from: f */
        InterfaceC7166v<AbstractC10294a0> f28895f;

        /* renamed from: g */
        InterfaceC7166v<InterfaceC10998a2> f28896g;

        /* renamed from: h */
        InterfaceC7166v<InterfaceC10817e> f28897h;

        /* renamed from: i */
        InterfaceC7151g<InterfaceC11143d, InterfaceC11327a> f28898i;

        /* renamed from: j */
        Looper f28899j;

        /* renamed from: k */
        C11150g0 f28900k;

        /* renamed from: l */
        C11639e f28901l;

        /* renamed from: m */
        boolean f28902m;

        /* renamed from: n */
        int f28903n;

        /* renamed from: o */
        boolean f28904o;

        /* renamed from: p */
        boolean f28905p;

        /* renamed from: q */
        int f28906q;

        /* renamed from: r */
        int f28907r;

        /* renamed from: s */
        boolean f28908s;

        /* renamed from: t */
        C11110u3 f28909t;

        /* renamed from: u */
        long f28910u;

        /* renamed from: v */
        long f28911v;

        /* renamed from: w */
        InterfaceC11133z1 f28912w;

        /* renamed from: x */
        long f28913x;

        /* renamed from: y */
        long f28914y;

        /* renamed from: z */
        boolean f28915z;

        public b(final Context context) {
            this(context, new InterfaceC7166v() { // from class: t6.z
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    InterfaceC11105t3 m34581f;
                    m34581f = InterfaceC11126y.b.m34581f(context);
                    return m34581f;
                }
            }, new InterfaceC7166v() { // from class: t6.a0
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    InterfaceC11684a0.a m34582g;
                    m34582g = InterfaceC11126y.b.m34582g(context);
                    return m34582g;
                }
            });
        }

        private b(final Context context, InterfaceC7166v<InterfaceC11105t3> interfaceC7166v, InterfaceC7166v<InterfaceC11684a0.a> interfaceC7166v2) {
            this(context, interfaceC7166v, interfaceC7166v2, new InterfaceC7166v() { // from class: t6.b0
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    AbstractC10294a0 m34583h;
                    m34583h = InterfaceC11126y.b.m34583h(context);
                    return m34583h;
                }
            }, new InterfaceC7166v() { // from class: t6.c0
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    return new C11091r();
                }
            }, new InterfaceC7166v() { // from class: t6.d0
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    InterfaceC10817e m33049n;
                    m33049n = C10839q.m33049n(context);
                    return m33049n;
                }
            }, new InterfaceC7151g() { // from class: t6.e0
                @Override // p082eb.InterfaceC7151g
                public final Object apply(Object obj) {
                    return new C11394n1((InterfaceC11143d) obj);
                }
            });
        }

        private b(Context context, InterfaceC7166v<InterfaceC11105t3> interfaceC7166v, InterfaceC7166v<InterfaceC11684a0.a> interfaceC7166v2, InterfaceC7166v<AbstractC10294a0> interfaceC7166v3, InterfaceC7166v<InterfaceC10998a2> interfaceC7166v4, InterfaceC7166v<InterfaceC10817e> interfaceC7166v5, InterfaceC7151g<InterfaceC11143d, InterfaceC11327a> interfaceC7151g) {
            this.f28890a = (Context) C11137a.m34603e(context);
            this.f28893d = interfaceC7166v;
            this.f28894e = interfaceC7166v2;
            this.f28895f = interfaceC7166v3;
            this.f28896g = interfaceC7166v4;
            this.f28897h = interfaceC7166v5;
            this.f28898i = interfaceC7151g;
            this.f28899j = C11172r0.m34888Q();
            this.f28901l = C11639e.f30288r;
            this.f28903n = 0;
            this.f28906q = 1;
            this.f28907r = 0;
            this.f28908s = true;
            this.f28909t = C11110u3.f28840g;
            this.f28910u = 5000L;
            this.f28911v = 15000L;
            this.f28912w = new C11086q.b().m34317a();
            this.f28891b = InterfaceC11143d.f28940a;
            this.f28913x = 500L;
            this.f28914y = 2000L;
            this.f28887A = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ InterfaceC11105t3 m34581f(Context context) {
            return new C11101t(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ InterfaceC11684a0.a m34582g(Context context) {
            return new C11723q(context, new C12618h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static /* synthetic */ AbstractC10294a0 m34583h(Context context) {
            return new C10307m(context);
        }

        /* renamed from: e */
        public InterfaceC11126y m34585e() {
            C11137a.m34605g(!this.f28889C);
            this.f28889C = true;
            return new C11015d1(this, null);
        }
    }

    /* renamed from: I */
    void mo33913I(InterfaceC11684a0 interfaceC11684a0);

    /* renamed from: L */
    void mo33916L(C11639e c11639e, boolean z10);

    /* renamed from: l */
    C11108u1 mo33936l();
}
