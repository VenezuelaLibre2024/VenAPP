package io.grpc.internal;

import io.grpc.internal.AbstractC8825a;
import java.nio.charset.Charset;
import p082eb.C7149e;
import p082eb.C7159o;
import vi.C11915g1;
import vi.C11926k0;
import vi.C11932m0;
import vi.C11953w0;

/* renamed from: io.grpc.internal.t0 */
/* loaded from: classes3.dex */
public abstract class AbstractC8899t0 extends AbstractC8825a.c {

    /* renamed from: w */
    private static final C11926k0.a<Integer> f20891w;

    /* renamed from: x */
    private static final C11953w0.g<Integer> f20892x;

    /* renamed from: s */
    private C11915g1 f20893s;

    /* renamed from: t */
    private C11953w0 f20894t;

    /* renamed from: u */
    private Charset f20895u;

    /* renamed from: v */
    private boolean f20896v;

    /* renamed from: io.grpc.internal.t0$a */
    /* loaded from: classes3.dex */
    class a implements C11926k0.a<Integer> {
        a() {
        }

        @Override // vi.C11953w0.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer mo25766b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, C11926k0.f31578a));
        }

        @Override // vi.C11953w0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo25765a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f20891w = aVar;
        f20892x = C11926k0.m38189b(":status", aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8899t0(int i10, C8856h2 c8856h2, C8880n2 c8880n2) {
        super(i10, c8856h2, c8880n2);
        this.f20895u = C7149e.f16019c;
    }

    /* renamed from: O */
    private static Charset m25828O(C11953w0 c11953w0) {
        String str = (String) c11953w0.m38310g(C8890q0.f20837j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return C7149e.f16019c;
    }

    /* renamed from: Q */
    private C11915g1 m25829Q(C11953w0 c11953w0) {
        C11915g1 c11915g1 = (C11915g1) c11953w0.m38310g(C11932m0.f31606b);
        if (c11915g1 != null) {
            return c11915g1.m38147r((String) c11953w0.m38310g(C11932m0.f31605a));
        }
        if (this.f20896v) {
            return C11915g1.f31536h.m38147r("missing GRPC status in response");
        }
        Integer num = (Integer) c11953w0.m38310g(f20892x);
        return (num != null ? C8890q0.m25755l(num.intValue()) : C11915g1.f31548t.m38147r("missing HTTP status code")).m38141f("missing GRPC status, inferred error from HTTP status code");
    }

    /* renamed from: R */
    private static void m25830R(C11953w0 c11953w0) {
        c11953w0.m38309e(f20892x);
        c11953w0.m38309e(C11932m0.f31606b);
        c11953w0.m38309e(C11932m0.f31605a);
    }

    /* renamed from: V */
    private C11915g1 m25831V(C11953w0 c11953w0) {
        Integer num = (Integer) c11953w0.m38310g(f20892x);
        if (num == null) {
            return C11915g1.f31548t.m38147r("Missing HTTP status code");
        }
        String str = (String) c11953w0.m38310g(C8890q0.f20837j);
        if (C8890q0.m25756m(str)) {
            return null;
        }
        return C8890q0.m25755l(num.intValue()).m38141f("invalid content-type: " + str);
    }

    /* renamed from: P */
    protected abstract void mo25832P(C11915g1 c11915g1, boolean z10, C11953w0 c11953w0);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public void m25833S(InterfaceC8903u1 interfaceC8903u1, boolean z10) {
        C11915g1 c11915g1 = this.f20893s;
        if (c11915g1 != null) {
            this.f20893s = c11915g1.m38141f("DATA-----------------------------\n" + C8906v1.m25870e(interfaceC8903u1, this.f20895u));
            interfaceC8903u1.close();
            if (this.f20893s.m38144o().length() > 1000 || z10) {
                mo25832P(this.f20893s, false, this.f20894t);
                return;
            }
            return;
        }
        if (!this.f20896v) {
            mo25832P(C11915g1.f31548t.m38147r("headers not received before payload"), false, new C11953w0());
            return;
        }
        int mo25686k = interfaceC8903u1.mo25686k();
        m25225D(interfaceC8903u1);
        if (z10) {
            this.f20893s = C11915g1.f31548t.m38147r(mo25686k > 0 ? "Received unexpected EOS on non-empty DATA frame from server" : "Received unexpected EOS on empty DATA frame from server");
            C11953w0 c11953w0 = new C11953w0();
            this.f20894t = c11953w0;
            m25232N(this.f20893s, false, c11953w0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    /* renamed from: T */
    public void m25834T(C11953w0 c11953w0) {
        C7159o.m21313p(c11953w0, "headers");
        C11915g1 c11915g1 = this.f20893s;
        if (c11915g1 != null) {
            this.f20893s = c11915g1.m38141f("headers: " + c11953w0);
            return;
        }
        try {
            if (this.f20896v) {
                C11915g1 m38147r = C11915g1.f31548t.m38147r("Received headers twice");
                this.f20893s = m38147r;
                if (m38147r != null) {
                    this.f20893s = m38147r.m38141f("headers: " + c11953w0);
                    this.f20894t = c11953w0;
                    this.f20895u = m25828O(c11953w0);
                    return;
                }
                return;
            }
            Integer num = (Integer) c11953w0.m38310g(f20892x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                C11915g1 c11915g12 = this.f20893s;
                if (c11915g12 != null) {
                    this.f20893s = c11915g12.m38141f("headers: " + c11953w0);
                    this.f20894t = c11953w0;
                    this.f20895u = m25828O(c11953w0);
                    return;
                }
                return;
            }
            this.f20896v = true;
            C11915g1 m25831V = m25831V(c11953w0);
            this.f20893s = m25831V;
            if (m25831V != null) {
                if (m25831V != null) {
                    this.f20893s = m25831V.m38141f("headers: " + c11953w0);
                    this.f20894t = c11953w0;
                    this.f20895u = m25828O(c11953w0);
                    return;
                }
                return;
            }
            m25830R(c11953w0);
            m25226E(c11953w0);
            C11915g1 c11915g13 = this.f20893s;
            if (c11915g13 != null) {
                this.f20893s = c11915g13.m38141f("headers: " + c11953w0);
                this.f20894t = c11953w0;
                this.f20895u = m25828O(c11953w0);
            }
        } catch (Throwable th2) {
            C11915g1 c11915g14 = this.f20893s;
            if (c11915g14 != null) {
                this.f20893s = c11915g14.m38141f("headers: " + c11953w0);
                this.f20894t = c11953w0;
                this.f20895u = m25828O(c11953w0);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public void m25835U(C11953w0 c11953w0) {
        C7159o.m21313p(c11953w0, "trailers");
        if (this.f20893s == null && !this.f20896v) {
            C11915g1 m25831V = m25831V(c11953w0);
            this.f20893s = m25831V;
            if (m25831V != null) {
                this.f20894t = c11953w0;
            }
        }
        C11915g1 c11915g1 = this.f20893s;
        if (c11915g1 == null) {
            C11915g1 m25829Q = m25829Q(c11953w0);
            m25830R(c11953w0);
            m25227F(c11953w0, m25829Q);
        } else {
            C11915g1 m38141f = c11915g1.m38141f("trailers: " + c11953w0);
            this.f20893s = m38141f;
            mo25832P(m38141f, false, this.f20894t);
        }
    }

    @Override // io.grpc.internal.AbstractC8825a.c, io.grpc.internal.C8867k1.b
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo25233e(boolean z10) {
        super.mo25233e(z10);
    }
}
