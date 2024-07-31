package vi;

import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;

/* renamed from: vi.d0 */
/* loaded from: classes3.dex */
public final class C11905d0 {

    /* renamed from: a */
    public final String f31515a;

    /* renamed from: b */
    public final b f31516b;

    /* renamed from: c */
    public final long f31517c;

    /* renamed from: d */
    public final InterfaceC11935n0 f31518d;

    /* renamed from: e */
    public final InterfaceC11935n0 f31519e;

    /* renamed from: vi.d0$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private String f31520a;

        /* renamed from: b */
        private b f31521b;

        /* renamed from: c */
        private Long f31522c;

        /* renamed from: d */
        private InterfaceC11935n0 f31523d;

        /* renamed from: e */
        private InterfaceC11935n0 f31524e;

        /* renamed from: a */
        public C11905d0 m38112a() {
            C7159o.m21313p(this.f31520a, "description");
            C7159o.m21313p(this.f31521b, "severity");
            C7159o.m21313p(this.f31522c, "timestampNanos");
            C7159o.m21319v(this.f31523d == null || this.f31524e == null, "at least one of channelRef and subchannelRef must be null");
            return new C11905d0(this.f31520a, this.f31521b, this.f31522c.longValue(), this.f31523d, this.f31524e);
        }

        /* renamed from: b */
        public a m38113b(String str) {
            this.f31520a = str;
            return this;
        }

        /* renamed from: c */
        public a m38114c(b bVar) {
            this.f31521b = bVar;
            return this;
        }

        /* renamed from: d */
        public a m38115d(InterfaceC11935n0 interfaceC11935n0) {
            this.f31524e = interfaceC11935n0;
            return this;
        }

        /* renamed from: e */
        public a m38116e(long j10) {
            this.f31522c = Long.valueOf(j10);
            return this;
        }
    }

    /* renamed from: vi.d0$b */
    /* loaded from: classes3.dex */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    private C11905d0(String str, b bVar, long j10, InterfaceC11935n0 interfaceC11935n0, InterfaceC11935n0 interfaceC11935n02) {
        this.f31515a = str;
        this.f31516b = (b) C7159o.m21313p(bVar, "severity");
        this.f31517c = j10;
        this.f31518d = interfaceC11935n0;
        this.f31519e = interfaceC11935n02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11905d0)) {
            return false;
        }
        C11905d0 c11905d0 = (C11905d0) obj;
        return C7155k.m21289a(this.f31515a, c11905d0.f31515a) && C7155k.m21289a(this.f31516b, c11905d0.f31516b) && this.f31517c == c11905d0.f31517c && C7155k.m21289a(this.f31518d, c11905d0.f31518d) && C7155k.m21289a(this.f31519e, c11905d0.f31519e);
    }

    public int hashCode() {
        return C7155k.m21290b(this.f31515a, this.f31516b, Long.valueOf(this.f31517c), this.f31518d, this.f31519e);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("description", this.f31515a).m21284d("severity", this.f31516b).m21283c("timestampNanos", this.f31517c).m21284d("channelRef", this.f31518d).m21284d("subchannelRef", this.f31519e).toString();
    }
}
