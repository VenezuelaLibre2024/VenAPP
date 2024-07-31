package wl;

import java.util.List;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.c0;
import ql.v;

/* loaded from: classes3.dex */
public final class g implements v.a {

    /* renamed from: a, reason: collision with root package name */
    private final vl.e f30206a;

    /* renamed from: b, reason: collision with root package name */
    private final List<v> f30207b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30208c;

    /* renamed from: d, reason: collision with root package name */
    private final vl.c f30209d;

    /* renamed from: e, reason: collision with root package name */
    private final a0 f30210e;

    /* renamed from: f, reason: collision with root package name */
    private final int f30211f;

    /* renamed from: g, reason: collision with root package name */
    private final int f30212g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30213h;

    /* renamed from: i, reason: collision with root package name */
    private int f30214i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(vl.e call, List<? extends v> interceptors, int i10, vl.c cVar, a0 request, int i11, int i12, int i13) {
        n.e(call, "call");
        n.e(interceptors, "interceptors");
        n.e(request, "request");
        this.f30206a = call;
        this.f30207b = interceptors;
        this.f30208c = i10;
        this.f30209d = cVar;
        this.f30210e = request;
        this.f30211f = i11;
        this.f30212g = i12;
        this.f30213h = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, vl.c cVar, a0 a0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f30208c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f30209d;
        }
        vl.c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            a0Var = gVar.f30210e;
        }
        a0 a0Var2 = a0Var;
        if ((i14 & 8) != 0) {
            i11 = gVar.f30211f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f30212g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f30213h;
        }
        return gVar.b(i10, cVar2, a0Var2, i15, i16, i13);
    }

    @Override // ql.v.a
    public c0 a(a0 request) {
        n.e(request, "request");
        if (!(this.f30208c < this.f30207b.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f30214i++;
        vl.c cVar = this.f30209d;
        if (cVar != null) {
            if (!cVar.j().g(request.i())) {
                throw new IllegalStateException(("network interceptor " + this.f30207b.get(this.f30208c - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f30214i == 1)) {
                throw new IllegalStateException(("network interceptor " + this.f30207b.get(this.f30208c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g c10 = c(this, this.f30208c + 1, null, request, 0, 0, 0, 58, null);
        v vVar = this.f30207b.get(this.f30208c);
        c0 a10 = vVar.a(c10);
        if (a10 == null) {
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f30209d != null) {
            if (!(this.f30208c + 1 >= this.f30207b.size() || c10.f30214i == 1)) {
                throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
            }
        }
        if (a10.a() != null) {
            return a10;
        }
        throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    public final g b(int i10, vl.c cVar, a0 request, int i11, int i12, int i13) {
        n.e(request, "request");
        return new g(this.f30206a, this.f30207b, i10, cVar, request, i11, i12, i13);
    }

    @Override // ql.v.a
    public ql.e call() {
        return this.f30206a;
    }

    public final vl.e d() {
        return this.f30206a;
    }

    public final int e() {
        return this.f30211f;
    }

    public final vl.c f() {
        return this.f30209d;
    }

    public final int g() {
        return this.f30212g;
    }

    public final a0 h() {
        return this.f30210e;
    }

    public final int i() {
        return this.f30213h;
    }

    public int j() {
        return this.f30212g;
    }

    @Override // ql.v.a
    public a0 o() {
        return this.f30210e;
    }
}
