package dm;

import dk.C7019l;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.s */
/* loaded from: classes3.dex */
public final class C7075s {

    /* renamed from: h */
    public static final a f15680h = new a(null);

    /* renamed from: a */
    public final byte[] f15681a;

    /* renamed from: b */
    public int f15682b;

    /* renamed from: c */
    public int f15683c;

    /* renamed from: d */
    public boolean f15684d;

    /* renamed from: e */
    public boolean f15685e;

    /* renamed from: f */
    public C7075s f15686f;

    /* renamed from: g */
    public C7075s f15687g;

    /* renamed from: dm.s$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C7075s() {
        this.f15681a = new byte[8192];
        this.f15685e = true;
        this.f15684d = false;
    }

    public C7075s(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        C9322n.m27781e(data, "data");
        this.f15681a = data;
        this.f15682b = i10;
        this.f15683c = i11;
        this.f15684d = z10;
        this.f15685e = z11;
    }

    /* renamed from: a */
    public final void m20835a() {
        C7075s c7075s = this.f15687g;
        int i10 = 0;
        if (!(c7075s != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C9322n.m27778b(c7075s);
        if (c7075s.f15685e) {
            int i11 = this.f15683c - this.f15682b;
            C7075s c7075s2 = this.f15687g;
            C9322n.m27778b(c7075s2);
            int i12 = 8192 - c7075s2.f15683c;
            C7075s c7075s3 = this.f15687g;
            C9322n.m27778b(c7075s3);
            if (!c7075s3.f15684d) {
                C7075s c7075s4 = this.f15687g;
                C9322n.m27778b(c7075s4);
                i10 = c7075s4.f15682b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            C7075s c7075s5 = this.f15687g;
            C9322n.m27778b(c7075s5);
            m20840f(c7075s5, i11);
            m20836b();
            C7076t.m20842b(this);
        }
    }

    /* renamed from: b */
    public final C7075s m20836b() {
        C7075s c7075s = this.f15686f;
        if (c7075s == this) {
            c7075s = null;
        }
        C7075s c7075s2 = this.f15687g;
        C9322n.m27778b(c7075s2);
        c7075s2.f15686f = this.f15686f;
        C7075s c7075s3 = this.f15686f;
        C9322n.m27778b(c7075s3);
        c7075s3.f15687g = this.f15687g;
        this.f15686f = null;
        this.f15687g = null;
        return c7075s;
    }

    /* renamed from: c */
    public final C7075s m20837c(C7075s segment) {
        C9322n.m27781e(segment, "segment");
        segment.f15687g = this;
        segment.f15686f = this.f15686f;
        C7075s c7075s = this.f15686f;
        C9322n.m27778b(c7075s);
        c7075s.f15687g = segment;
        this.f15686f = segment;
        return segment;
    }

    /* renamed from: d */
    public final C7075s m20838d() {
        this.f15684d = true;
        return new C7075s(this.f15681a, this.f15682b, this.f15683c, true, false);
    }

    /* renamed from: e */
    public final C7075s m20839e(int i10) {
        C7075s m20843c;
        if (!(i10 > 0 && i10 <= this.f15683c - this.f15682b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            m20843c = m20838d();
        } else {
            m20843c = C7076t.m20843c();
            byte[] bArr = this.f15681a;
            byte[] bArr2 = m20843c.f15681a;
            int i11 = this.f15682b;
            C7019l.m20438f(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        m20843c.f15683c = m20843c.f15682b + i10;
        this.f15682b += i10;
        C7075s c7075s = this.f15687g;
        C9322n.m27778b(c7075s);
        c7075s.m20837c(m20843c);
        return m20843c;
    }

    /* renamed from: f */
    public final void m20840f(C7075s sink, int i10) {
        C9322n.m27781e(sink, "sink");
        if (!sink.f15685e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = sink.f15683c;
        if (i11 + i10 > 8192) {
            if (sink.f15684d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f15682b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f15681a;
            C7019l.m20438f(bArr, bArr, 0, i12, i11, 2, null);
            sink.f15683c -= sink.f15682b;
            sink.f15682b = 0;
        }
        byte[] bArr2 = this.f15681a;
        byte[] bArr3 = sink.f15681a;
        int i13 = sink.f15683c;
        int i14 = this.f15682b;
        C7019l.m20436d(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f15683c += i10;
        this.f15682b += i10;
    }
}
