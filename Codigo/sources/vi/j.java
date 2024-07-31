package vi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import vi.g;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a */
    private static final g<Object, Object> f29134a = new a();

    /* loaded from: classes3.dex */
    class a extends g<Object, Object> {
        a() {
        }

        @Override // vi.g
        public void a(String str, Throwable th2) {
        }

        @Override // vi.g
        public void b() {
        }

        @Override // vi.g
        public void c(int i10) {
        }

        @Override // vi.g
        public void d(Object obj) {
        }

        @Override // vi.g
        public void e(g.a<Object> aVar, w0 w0Var) {
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends d {

        /* renamed from: a */
        private final d f29135a;

        /* renamed from: b */
        private final h f29136b;

        private b(d dVar, h hVar) {
            this.f29135a = dVar;
            this.f29136b = (h) eb.o.p(hVar, "interceptor");
        }

        /* synthetic */ b(d dVar, h hVar, i iVar) {
            this(dVar, hVar);
        }

        @Override // vi.d
        public String a() {
            return this.f29135a.a();
        }

        @Override // vi.d
        public <ReqT, RespT> g<ReqT, RespT> h(x0<ReqT, RespT> x0Var, c cVar) {
            return this.f29136b.a(x0Var, cVar, this.f29135a);
        }
    }

    public static d a(d dVar, List<? extends h> list) {
        eb.o.p(dVar, "channel");
        Iterator<? extends h> it = list.iterator();
        while (it.hasNext()) {
            dVar = new b(dVar, it.next(), null);
        }
        return dVar;
    }

    public static d b(d dVar, h... hVarArr) {
        return a(dVar, Arrays.asList(hVarArr));
    }
}
