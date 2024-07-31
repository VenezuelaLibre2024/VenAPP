package io.grpc.internal;

import io.grpc.internal.a;
import java.nio.charset.Charset;
import vi.k0;
import vi.w0;

/* loaded from: classes3.dex */
public abstract class t0 extends a.c {

    /* renamed from: w, reason: collision with root package name */
    private static final k0.a<Integer> f19144w;

    /* renamed from: x, reason: collision with root package name */
    private static final w0.g<Integer> f19145x;

    /* renamed from: s, reason: collision with root package name */
    private vi.g1 f19146s;

    /* renamed from: t, reason: collision with root package name */
    private vi.w0 f19147t;

    /* renamed from: u, reason: collision with root package name */
    private Charset f19148u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f19149v;

    /* loaded from: classes3.dex */
    class a implements k0.a<Integer> {
        a() {
        }

        @Override // vi.w0.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, vi.k0.f29143a));
        }

        @Override // vi.w0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f19144w = aVar;
        f19145x = vi.k0.b(":status", aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t0(int i10, h2 h2Var, n2 n2Var) {
        super(i10, h2Var, n2Var);
        this.f19148u = eb.e.f14596c;
    }

    private static Charset O(vi.w0 w0Var) {
        String str = (String) w0Var.g(q0.f19090j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return eb.e.f14596c;
    }

    private vi.g1 Q(vi.w0 w0Var) {
        vi.g1 g1Var = (vi.g1) w0Var.g(vi.m0.f29171b);
        if (g1Var != null) {
            return g1Var.r((String) w0Var.g(vi.m0.f29170a));
        }
        if (this.f19149v) {
            return vi.g1.f29102h.r("missing GRPC status in response");
        }
        Integer num = (Integer) w0Var.g(f19145x);
        return (num != null ? q0.l(num.intValue()) : vi.g1.f29114t.r("missing HTTP status code")).f("missing GRPC status, inferred error from HTTP status code");
    }

    private static void R(vi.w0 w0Var) {
        w0Var.e(f19145x);
        w0Var.e(vi.m0.f29171b);
        w0Var.e(vi.m0.f29170a);
    }

    private vi.g1 V(vi.w0 w0Var) {
        Integer num = (Integer) w0Var.g(f19145x);
        if (num == null) {
            return vi.g1.f29114t.r("Missing HTTP status code");
        }
        String str = (String) w0Var.g(q0.f19090j);
        if (q0.m(str)) {
            return null;
        }
        return q0.l(num.intValue()).f("invalid content-type: " + str);
    }

    protected abstract void P(vi.g1 g1Var, boolean z10, vi.w0 w0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(u1 u1Var, boolean z10) {
        vi.g1 g1Var = this.f19146s;
        if (g1Var != null) {
            this.f19146s = g1Var.f("DATA-----------------------------\n" + v1.e(u1Var, this.f19148u));
            u1Var.close();
            if (this.f19146s.o().length() > 1000 || z10) {
                P(this.f19146s, false, this.f19147t);
                return;
            }
            return;
        }
        if (!this.f19149v) {
            P(vi.g1.f29114t.r("headers not received before payload"), false, new vi.w0());
            return;
        }
        int k10 = u1Var.k();
        D(u1Var);
        if (z10) {
            this.f19146s = vi.g1.f29114t.r(k10 > 0 ? "Received unexpected EOS on non-empty DATA frame from server" : "Received unexpected EOS on empty DATA frame from server");
            vi.w0 w0Var = new vi.w0();
            this.f19147t = w0Var;
            N(this.f19146s, false, w0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    public void T(vi.w0 w0Var) {
        eb.o.p(w0Var, "headers");
        vi.g1 g1Var = this.f19146s;
        if (g1Var != null) {
            this.f19146s = g1Var.f("headers: " + w0Var);
            return;
        }
        try {
            if (this.f19149v) {
                vi.g1 r10 = vi.g1.f29114t.r("Received headers twice");
                this.f19146s = r10;
                if (r10 != null) {
                    this.f19146s = r10.f("headers: " + w0Var);
                    this.f19147t = w0Var;
                    this.f19148u = O(w0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) w0Var.g(f19145x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                vi.g1 g1Var2 = this.f19146s;
                if (g1Var2 != null) {
                    this.f19146s = g1Var2.f("headers: " + w0Var);
                    this.f19147t = w0Var;
                    this.f19148u = O(w0Var);
                    return;
                }
                return;
            }
            this.f19149v = true;
            vi.g1 V = V(w0Var);
            this.f19146s = V;
            if (V != null) {
                if (V != null) {
                    this.f19146s = V.f("headers: " + w0Var);
                    this.f19147t = w0Var;
                    this.f19148u = O(w0Var);
                    return;
                }
                return;
            }
            R(w0Var);
            E(w0Var);
            vi.g1 g1Var3 = this.f19146s;
            if (g1Var3 != null) {
                this.f19146s = g1Var3.f("headers: " + w0Var);
                this.f19147t = w0Var;
                this.f19148u = O(w0Var);
            }
        } catch (Throwable th2) {
            vi.g1 g1Var4 = this.f19146s;
            if (g1Var4 != null) {
                this.f19146s = g1Var4.f("headers: " + w0Var);
                this.f19147t = w0Var;
                this.f19148u = O(w0Var);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(vi.w0 w0Var) {
        eb.o.p(w0Var, "trailers");
        if (this.f19146s == null && !this.f19149v) {
            vi.g1 V = V(w0Var);
            this.f19146s = V;
            if (V != null) {
                this.f19147t = w0Var;
            }
        }
        vi.g1 g1Var = this.f19146s;
        if (g1Var == null) {
            vi.g1 Q = Q(w0Var);
            R(w0Var);
            F(w0Var, Q);
        } else {
            vi.g1 f10 = g1Var.f("trailers: " + w0Var);
            this.f19146s = f10;
            P(f10, false, this.f19147t);
        }
    }

    @Override // io.grpc.internal.a.c, io.grpc.internal.k1.b
    public /* bridge */ /* synthetic */ void e(boolean z10) {
        super.e(z10);
    }
}
