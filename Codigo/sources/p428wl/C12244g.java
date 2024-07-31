package p428wl;

import java.util.List;
import kotlin.jvm.internal.C9322n;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.InterfaceC10528e;
import p319ql.InterfaceC10547v;
import p406vl.C11976c;
import p406vl.C11978e;

/* renamed from: wl.g */
/* loaded from: classes3.dex */
public final class C12244g implements InterfaceC10547v.a {

    /* renamed from: a */
    private final C11978e f32718a;

    /* renamed from: b */
    private final List<InterfaceC10547v> f32719b;

    /* renamed from: c */
    private final int f32720c;

    /* renamed from: d */
    private final C11976c f32721d;

    /* renamed from: e */
    private final C10521a0 f32722e;

    /* renamed from: f */
    private final int f32723f;

    /* renamed from: g */
    private final int f32724g;

    /* renamed from: h */
    private final int f32725h;

    /* renamed from: i */
    private int f32726i;

    /* JADX WARN: Multi-variable type inference failed */
    public C12244g(C11978e call, List<? extends InterfaceC10547v> interceptors, int i10, C11976c c11976c, C10521a0 request, int i11, int i12, int i13) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(interceptors, "interceptors");
        C9322n.m27781e(request, "request");
        this.f32718a = call;
        this.f32719b = interceptors;
        this.f32720c = i10;
        this.f32721d = c11976c;
        this.f32722e = request;
        this.f32723f = i11;
        this.f32724g = i12;
        this.f32725h = i13;
    }

    /* renamed from: c */
    public static /* synthetic */ C12244g m39415c(C12244g c12244g, int i10, C11976c c11976c, C10521a0 c10521a0, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c12244g.f32720c;
        }
        if ((i14 & 2) != 0) {
            c11976c = c12244g.f32721d;
        }
        C11976c c11976c2 = c11976c;
        if ((i14 & 4) != 0) {
            c10521a0 = c12244g.f32722e;
        }
        C10521a0 c10521a02 = c10521a0;
        if ((i14 & 8) != 0) {
            i11 = c12244g.f32723f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = c12244g.f32724g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = c12244g.f32725h;
        }
        return c12244g.m39416b(i10, c11976c2, c10521a02, i15, i16, i13);
    }

    @Override // p319ql.InterfaceC10547v.a
    /* renamed from: a */
    public C10525c0 mo31939a(C10521a0 request) {
        C9322n.m27781e(request, "request");
        if (!(this.f32720c < this.f32719b.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f32726i++;
        C11976c c11976c = this.f32721d;
        if (c11976c != null) {
            if (!c11976c.m38408j().m38427g(request.m31608i())) {
                throw new IllegalStateException(("network interceptor " + this.f32719b.get(this.f32720c - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f32726i == 1)) {
                throw new IllegalStateException(("network interceptor " + this.f32719b.get(this.f32720c - 1) + " must call proceed() exactly once").toString());
            }
        }
        C12244g m39415c = m39415c(this, this.f32720c + 1, null, request, 0, 0, 0, 58, null);
        InterfaceC10547v interfaceC10547v = this.f32719b.get(this.f32720c);
        C10525c0 mo31938a = interfaceC10547v.mo31938a(m39415c);
        if (mo31938a == null) {
            throw new NullPointerException("interceptor " + interfaceC10547v + " returned null");
        }
        if (this.f32721d != null) {
            if (!(this.f32720c + 1 >= this.f32719b.size() || m39415c.f32726i == 1)) {
                throw new IllegalStateException(("network interceptor " + interfaceC10547v + " must call proceed() exactly once").toString());
            }
        }
        if (mo31938a.m31641a() != null) {
            return mo31938a;
        }
        throw new IllegalStateException(("interceptor " + interfaceC10547v + " returned a response with no body").toString());
    }

    /* renamed from: b */
    public final C12244g m39416b(int i10, C11976c c11976c, C10521a0 request, int i11, int i12, int i13) {
        C9322n.m27781e(request, "request");
        return new C12244g(this.f32718a, this.f32719b, i10, c11976c, request, i11, i12, i13);
    }

    @Override // p319ql.InterfaceC10547v.a
    public InterfaceC10528e call() {
        return this.f32718a;
    }

    /* renamed from: d */
    public final C11978e m39417d() {
        return this.f32718a;
    }

    /* renamed from: e */
    public final int m39418e() {
        return this.f32723f;
    }

    /* renamed from: f */
    public final C11976c m39419f() {
        return this.f32721d;
    }

    /* renamed from: g */
    public final int m39420g() {
        return this.f32724g;
    }

    /* renamed from: h */
    public final C10521a0 m39421h() {
        return this.f32722e;
    }

    /* renamed from: i */
    public final int m39422i() {
        return this.f32725h;
    }

    /* renamed from: j */
    public int m39423j() {
        return this.f32724g;
    }

    @Override // p319ql.InterfaceC10547v.a
    /* renamed from: o */
    public C10521a0 mo31940o() {
        return this.f32722e;
    }
}
