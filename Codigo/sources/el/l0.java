package el;

import gk.f;
import zk.r2;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f14782a = new h0("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final ok.p<Object, f.b, Object> f14783b = a.f14786a;

    /* renamed from: c, reason: collision with root package name */
    private static final ok.p<r2<?>, f.b, r2<?>> f14784c = b.f14787a;

    /* renamed from: d, reason: collision with root package name */
    private static final ok.p<p0, f.b, p0> f14785d = c.f14788a;

    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.o implements ok.p<Object, f.b, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14786a = new a();

        a() {
            super(2);
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, f.b bVar) {
            if (!(bVar instanceof r2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.o implements ok.p<r2<?>, f.b, r2<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14787a = new b();

        b() {
            super(2);
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r2<?> invoke(r2<?> r2Var, f.b bVar) {
            if (r2Var != null) {
                return r2Var;
            }
            if (bVar instanceof r2) {
                return (r2) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.o implements ok.p<p0, f.b, p0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14788a = new c();

        c() {
            super(2);
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(p0 p0Var, f.b bVar) {
            if (bVar instanceof r2) {
                r2<?> r2Var = (r2) bVar;
                p0Var.a(r2Var, r2Var.v0(p0Var.f14800a));
            }
            return p0Var;
        }
    }

    public static final void a(gk.f fVar, Object obj) {
        if (obj == f14782a) {
            return;
        }
        if (obj instanceof p0) {
            ((p0) obj).b(fVar);
            return;
        }
        Object z02 = fVar.z0(null, f14784c);
        kotlin.jvm.internal.n.c(z02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((r2) z02).S(fVar, obj);
    }

    public static final Object b(gk.f fVar) {
        Object z02 = fVar.z0(0, f14783b);
        kotlin.jvm.internal.n.b(z02);
        return z02;
    }

    public static final Object c(gk.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return f14782a;
        }
        if (obj instanceof Integer) {
            return fVar.z0(new p0(fVar, ((Number) obj).intValue()), f14785d);
        }
        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((r2) obj).v0(fVar);
    }
}
