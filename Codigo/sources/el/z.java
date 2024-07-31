package el;

/* loaded from: classes3.dex */
public final class z {

    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.o implements ok.l<Throwable, ck.v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ok.l<E, ck.v> f14826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f14827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ gk.f f14828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ok.l<? super E, ck.v> lVar, E e10, gk.f fVar) {
            super(1);
            this.f14826a = lVar;
            this.f14827b = e10;
            this.f14828c = fVar;
        }

        public final void a(Throwable th2) {
            z.b(this.f14826a, this.f14827b, this.f14828c);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
            a(th2);
            return ck.v.f7137a;
        }
    }

    public static final <E> ok.l<Throwable, ck.v> a(ok.l<? super E, ck.v> lVar, E e10, gk.f fVar) {
        return new a(lVar, e10, fVar);
    }

    public static final <E> void b(ok.l<? super E, ck.v> lVar, E e10, gk.f fVar) {
        q0 c10 = c(lVar, e10, null);
        if (c10 != null) {
            zk.j0.a(fVar, c10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> q0 c(ok.l<? super E, ck.v> lVar, E e10, q0 q0Var) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (q0Var == null || q0Var.getCause() == th2) {
                return new q0("Exception in undelivered element handler for " + e10, th2);
            }
            ck.b.a(q0Var, th2);
        }
        return q0Var;
    }

    public static /* synthetic */ q0 d(ok.l lVar, Object obj, q0 q0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q0Var = null;
        }
        return c(lVar, obj, q0Var);
    }
}
