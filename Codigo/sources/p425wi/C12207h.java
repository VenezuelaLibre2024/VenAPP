package p425wi;

import dm.C7056b;
import io.grpc.internal.AbstractC8825a;
import io.grpc.internal.AbstractC8899t0;
import io.grpc.internal.C8856h2;
import io.grpc.internal.C8880n2;
import io.grpc.internal.InterfaceC8884o2;
import io.grpc.internal.InterfaceC8892r;
import java.util.List;
import p044cj.C2014c;
import p044cj.C2015d;
import p082eb.C7159o;
import p103fb.AbstractC7323a;
import p425wi.C12216q;
import p448xi.C12491d;
import p448xi.EnumC12488a;
import vi.C11895a;
import vi.C11901c;
import vi.C11915g1;
import vi.C11953w0;
import vi.C11955x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wi.h */
/* loaded from: classes3.dex */
public class C12207h extends AbstractC8825a {

    /* renamed from: p */
    private static final C7056b f32557p = new C7056b();

    /* renamed from: h */
    private final C11955x0<?, ?> f32558h;

    /* renamed from: i */
    private final String f32559i;

    /* renamed from: j */
    private final C8856h2 f32560j;

    /* renamed from: k */
    private String f32561k;

    /* renamed from: l */
    private final b f32562l;

    /* renamed from: m */
    private final a f32563m;

    /* renamed from: n */
    private final C11895a f32564n;

    /* renamed from: o */
    private boolean f32565o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.h$a */
    /* loaded from: classes3.dex */
    public class a implements AbstractC8825a.b {
        a() {
        }

        @Override // io.grpc.internal.AbstractC8825a.b
        /* renamed from: c */
        public void mo25214c(C11915g1 c11915g1) {
            C2014c.m10322f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (C12207h.this.f32562l.f32583z) {
                    C12207h.this.f32562l.m39207a0(c11915g1, true, null);
                }
            } finally {
                C2014c.m10324h("OkHttpClientStream$Sink.cancel");
            }
        }

        @Override // io.grpc.internal.AbstractC8825a.b
        /* renamed from: d */
        public void mo25215d(InterfaceC8884o2 interfaceC8884o2, boolean z10, boolean z11, int i10) {
            C7056b m39318c;
            C2014c.m10322f("OkHttpClientStream$Sink.writeFrame");
            if (interfaceC8884o2 == null) {
                m39318c = C12207h.f32557p;
            } else {
                m39318c = ((C12214o) interfaceC8884o2).m39318c();
                int size = (int) m39318c.size();
                if (size > 0) {
                    C12207h.this.m25365s(size);
                }
            }
            try {
                synchronized (C12207h.this.f32562l.f32583z) {
                    C12207h.this.f32562l.m39209e0(m39318c, z10, z11);
                    C12207h.this.m25208w().m25693e(i10);
                }
            } finally {
                C2014c.m10324h("OkHttpClientStream$Sink.writeFrame");
            }
        }

        @Override // io.grpc.internal.AbstractC8825a.b
        /* renamed from: e */
        public void mo25216e(C11953w0 c11953w0, byte[] bArr) {
            C2014c.m10322f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + C12207h.this.f32558h.m38341c();
            if (bArr != null) {
                C12207h.this.f32565o = true;
                str = str + "?" + AbstractC7323a.m21950b().m21955f(bArr);
            }
            try {
                synchronized (C12207h.this.f32562l.f32583z) {
                    C12207h.this.f32562l.m39210g0(c11953w0, str);
                }
            } finally {
                C2014c.m10324h("OkHttpClientStream$Sink.writeHeaders");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.h$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC8899t0 implements C12216q.b {

        /* renamed from: A */
        private List<C12491d> f32567A;

        /* renamed from: B */
        private C7056b f32568B;

        /* renamed from: C */
        private boolean f32569C;

        /* renamed from: D */
        private boolean f32570D;

        /* renamed from: E */
        private boolean f32571E;

        /* renamed from: F */
        private int f32572F;

        /* renamed from: G */
        private int f32573G;

        /* renamed from: H */
        private final C12201b f32574H;

        /* renamed from: I */
        private final C12216q f32575I;

        /* renamed from: J */
        private final C12208i f32576J;

        /* renamed from: K */
        private boolean f32577K;

        /* renamed from: L */
        private final C2015d f32578L;

        /* renamed from: M */
        private C12216q.c f32579M;

        /* renamed from: N */
        private int f32580N;

        /* renamed from: y */
        private final int f32582y;

        /* renamed from: z */
        private final Object f32583z;

        public b(int i10, C8856h2 c8856h2, Object obj, C12201b c12201b, C12216q c12216q, C12208i c12208i, int i11, String str) {
            super(i10, c8856h2, C12207h.this.m25208w());
            this.f32568B = new C7056b();
            this.f32569C = false;
            this.f32570D = false;
            this.f32571E = false;
            this.f32577K = true;
            this.f32580N = -1;
            this.f32583z = C7159o.m21313p(obj, "lock");
            this.f32574H = c12201b;
            this.f32575I = c12216q;
            this.f32576J = c12208i;
            this.f32572F = i11;
            this.f32573G = i11;
            this.f32582y = i11;
            this.f32578L = C2014c.m10317a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public void m39207a0(C11915g1 c11915g1, boolean z10, C11953w0 c11953w0) {
            if (this.f32571E) {
                return;
            }
            this.f32571E = true;
            if (!this.f32577K) {
                this.f32576J.m39267U(m39212c0(), c11915g1, InterfaceC8892r.a.PROCESSED, z10, EnumC12488a.CANCEL, c11953w0);
                return;
            }
            this.f32576J.m39276h0(C12207h.this);
            this.f32567A = null;
            this.f32568B.m20714b();
            this.f32577K = false;
            if (c11953w0 == null) {
                c11953w0 = new C11953w0();
            }
            m25232N(c11915g1, true, c11953w0);
        }

        /* renamed from: d0 */
        private void m39208d0() {
            if (m25228G()) {
                this.f32576J.m39267U(m39212c0(), null, InterfaceC8892r.a.PROCESSED, false, null, null);
            } else {
                this.f32576J.m39267U(m39212c0(), null, InterfaceC8892r.a.PROCESSED, false, EnumC12488a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public void m39209e0(C7056b c7056b, boolean z10, boolean z11) {
            if (this.f32571E) {
                return;
            }
            if (!this.f32577K) {
                C7159o.m21319v(m39212c0() != -1, "streamId should be set");
                this.f32575I.m39322d(z10, this.f32579M, c7056b, z11);
            } else {
                this.f32568B.mo19710K0(c7056b, (int) c7056b.size());
                this.f32569C |= z10;
                this.f32570D |= z11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public void m39210g0(C11953w0 c11953w0, String str) {
            this.f32567A = C12203d.m39179b(c11953w0, str, C12207h.this.f32561k, C12207h.this.f32559i, C12207h.this.f32565o, this.f32576J.m39273b0());
            this.f32576J.m39277o0(C12207h.this);
        }

        @Override // io.grpc.internal.AbstractC8899t0
        /* renamed from: P */
        protected void mo25832P(C11915g1 c11915g1, boolean z10, C11953w0 c11953w0) {
            m39207a0(c11915g1, z10, c11953w0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b0 */
        public C12216q.c m39211b0() {
            C12216q.c cVar;
            synchronized (this.f32583z) {
                cVar = this.f32579M;
            }
            return cVar;
        }

        @Override // io.grpc.internal.C8867k1.b
        /* renamed from: c */
        public void mo25571c(int i10) {
            int i11 = this.f32573G - i10;
            this.f32573G = i11;
            float f10 = i11;
            int i12 = this.f32582y;
            if (f10 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.f32572F += i13;
                this.f32573G = i11 + i13;
                this.f32574H.mo39174d(m39212c0(), i13);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c0 */
        public int m39212c0() {
            return this.f32580N;
        }

        @Override // io.grpc.internal.C8867k1.b
        /* renamed from: d */
        public void mo25572d(Throwable th2) {
            mo25832P(C11915g1.m38137l(th2), true, new C11953w0());
        }

        @Override // io.grpc.internal.AbstractC8899t0, io.grpc.internal.AbstractC8825a.c, io.grpc.internal.C8867k1.b
        /* renamed from: e */
        public void mo25233e(boolean z10) {
            m39208d0();
            super.mo25233e(z10);
        }

        @Override // io.grpc.internal.C8849g.d
        /* renamed from: f */
        public void mo25574f(Runnable runnable) {
            synchronized (this.f32583z) {
                runnable.run();
            }
        }

        /* renamed from: f0 */
        public void m39213f0(int i10) {
            C7159o.m21321x(this.f32580N == -1, "the stream has been started with id %s", i10);
            this.f32580N = i10;
            this.f32579M = this.f32575I.m39321c(this, i10);
            C12207h.this.f32562l.mo25379r();
            if (this.f32577K) {
                this.f32574H.mo39176r1(C12207h.this.f32565o, false, this.f32580N, 0, this.f32567A);
                C12207h.this.f32560j.m25594c();
                this.f32567A = null;
                if (this.f32568B.size() > 0) {
                    this.f32575I.m39322d(this.f32569C, this.f32579M, this.f32568B, this.f32570D);
                }
                this.f32577K = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h0 */
        public C2015d m39214h0() {
            return this.f32578L;
        }

        /* renamed from: i0 */
        public void m39215i0(C7056b c7056b, boolean z10) {
            int size = this.f32572F - ((int) c7056b.size());
            this.f32572F = size;
            if (size >= 0) {
                super.m25833S(new C12211l(c7056b), z10);
            } else {
                this.f32574H.mo39168s(m39212c0(), EnumC12488a.FLOW_CONTROL_ERROR);
                this.f32576J.m39267U(m39212c0(), C11915g1.f31548t.m38147r("Received data size exceeded our receiving window size"), InterfaceC8892r.a.PROCESSED, false, null, null);
            }
        }

        /* renamed from: j0 */
        public void m39216j0(List<C12491d> list, boolean z10) {
            if (z10) {
                m25835U(C12217r.m39344c(list));
            } else {
                m25834T(C12217r.m39342a(list));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.AbstractC8837d.a
        /* renamed from: r */
        public void mo25379r() {
            super.mo25379r();
            m25378m().m25691c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12207h(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C12201b c12201b, C12208i c12208i, C12216q c12216q, Object obj, int i10, int i11, String str, String str2, C8856h2 c8856h2, C8880n2 c8880n2, C11901c c11901c, boolean z10) {
        super(new C12215p(), c8856h2, c8880n2, c11953w0, c11901c, z10 && c11955x0.m38344f());
        this.f32563m = new a();
        this.f32565o = false;
        this.f32560j = (C8856h2) C7159o.m21313p(c8856h2, "statsTraceCtx");
        this.f32558h = c11955x0;
        this.f32561k = str;
        this.f32559i = str2;
        this.f32564n = c12208i.m39268V();
        this.f32562l = new b(i10, c8856h2, obj, c12201b, c12216q, c12208i, i11, c11955x0.m38341c());
    }

    /* renamed from: L */
    public C11955x0.d m39199L() {
        return this.f32558h.m38343e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC8825a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b mo25206t() {
        return this.f32562l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean m39201N() {
        return this.f32565o;
    }

    @Override // io.grpc.internal.InterfaceC8889q
    public C11895a getAttributes() {
        return this.f32564n;
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: l */
    public void mo25286l(String str) {
        this.f32561k = (String) C7159o.m21313p(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC8825a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public a mo25207u() {
        return this.f32563m;
    }
}
