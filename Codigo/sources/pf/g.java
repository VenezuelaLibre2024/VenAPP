package pf;

import aj.b;
import vi.x0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    private static volatile x0<d, e> f23047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements b.a<b> {
        a() {
        }

        @Override // aj.b.a
        /* renamed from: b */
        public b a(vi.d dVar, vi.c cVar) {
            return new b(dVar, cVar, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends aj.a<b> {
        private b(vi.d dVar, vi.c cVar) {
            super(dVar, cVar);
        }

        /* synthetic */ b(vi.d dVar, vi.c cVar, f fVar) {
            this(dVar, cVar);
        }

        @Override // aj.b
        /* renamed from: g */
        public b a(vi.d dVar, vi.c cVar) {
            return new b(dVar, cVar);
        }

        public e h(d dVar) {
            return (e) aj.c.b(c(), g.a(), b(), dVar);
        }
    }

    private g() {
    }

    public static x0<d, e> a() {
        x0<d, e> x0Var = f23047a;
        if (x0Var == null) {
            synchronized (g.class) {
                x0Var = f23047a;
                if (x0Var == null) {
                    x0Var = x0.g().f(x0.d.UNARY).b(x0.b("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns")).e(true).c(zi.b.b(d.i0())).d(zi.b.b(e.d0())).a();
                    f23047a = x0Var;
                }
            }
        }
        return x0Var;
    }

    public static b b(vi.d dVar) {
        return (b) aj.a.e(new a(), dVar);
    }
}
