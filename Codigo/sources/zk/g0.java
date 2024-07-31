package zk;

import gk.Continuation;
import gk.f;

/* loaded from: classes3.dex */
public final class g0 {

    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements ok.p<gk.f, f.b, gk.f> {

        /* renamed from: a */
        public static final a f32885a = new a();

        a() {
            super(2);
        }

        @Override // ok.p
        /* renamed from: a */
        public final gk.f invoke(gk.f fVar, f.b bVar) {
            return bVar instanceof f0 ? fVar.U(((f0) bVar).q()) : fVar.U(bVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements ok.p<gk.f, f.b, gk.f> {

        /* renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.x<gk.f> f32886a;

        /* renamed from: b */
        final /* synthetic */ boolean f32887b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.x<gk.f> xVar, boolean z10) {
            super(2);
            this.f32886a = xVar;
            this.f32887b = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, gk.f] */
        @Override // ok.p
        /* renamed from: a */
        public final gk.f invoke(gk.f fVar, f.b bVar) {
            if (!(bVar instanceof f0)) {
                return fVar.U(bVar);
            }
            f.b b10 = this.f32886a.f20759a.b(bVar.getKey());
            if (b10 != null) {
                kotlin.jvm.internal.x<gk.f> xVar = this.f32886a;
                xVar.f20759a = xVar.f20759a.Q(bVar.getKey());
                return fVar.U(((f0) bVar).f(b10));
            }
            f0 f0Var = (f0) bVar;
            if (this.f32887b) {
                f0Var = f0Var.q();
            }
            return fVar.U(f0Var);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.o implements ok.p<Boolean, f.b, Boolean> {

        /* renamed from: a */
        public static final c f32888a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, f.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof f0));
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, f.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final gk.f a(gk.f fVar, gk.f fVar2, boolean z10) {
        boolean c10 = c(fVar);
        boolean c11 = c(fVar2);
        if (!c10 && !c11) {
            return fVar.U(fVar2);
        }
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f20759a = fVar2;
        gk.g gVar = gk.g.f16294a;
        gk.f fVar3 = (gk.f) fVar.z0(gVar, new b(xVar, z10));
        if (c11) {
            xVar.f20759a = ((gk.f) xVar.f20759a).z0(gVar, a.f32885a);
        }
        return fVar3.U((gk.f) xVar.f20759a);
    }

    public static final String b(gk.f fVar) {
        return null;
    }

    private static final boolean c(gk.f fVar) {
        return ((Boolean) fVar.z0(Boolean.FALSE, c.f32888a)).booleanValue();
    }

    public static final gk.f d(gk.f fVar, gk.f fVar2) {
        return !c(fVar2) ? fVar.U(fVar2) : a(fVar, fVar2, false);
    }

    public static final gk.f e(k0 k0Var, gk.f fVar) {
        gk.f a10 = a(k0Var.h(), fVar, true);
        return (a10 == a1.a() || a10.b(gk.d.f16291n) != null) ? a10 : a10.U(a1.a());
    }

    public static final z2<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof w0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof z2) {
                return (z2) eVar;
            }
        }
        return null;
    }

    public static final z2<?> g(Continuation<?> continuation, gk.f fVar, Object obj) {
        if (!(continuation instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(fVar.b(a3.f32842a) != null)) {
            return null;
        }
        z2<?> f10 = f((kotlin.coroutines.jvm.internal.e) continuation);
        if (f10 != null) {
            f10.S0(fVar, obj);
        }
        return f10;
    }
}
