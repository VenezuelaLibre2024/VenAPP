package p133h7;

import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.Arrays;
import p133h7.AbstractC7662i;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12615e0;

/* renamed from: h7.j */
/* loaded from: classes.dex */
final class C7663j extends AbstractC7662i {

    /* renamed from: n */
    private a f18164n;

    /* renamed from: o */
    private int f18165o;

    /* renamed from: p */
    private boolean f18166p;

    /* renamed from: q */
    private C12615e0.d f18167q;

    /* renamed from: r */
    private C12615e0.b f18168r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h7.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C12615e0.d f18169a;

        /* renamed from: b */
        public final C12615e0.b f18170b;

        /* renamed from: c */
        public final byte[] f18171c;

        /* renamed from: d */
        public final C12615e0.c[] f18172d;

        /* renamed from: e */
        public final int f18173e;

        public a(C12615e0.d dVar, C12615e0.b bVar, byte[] bArr, C12615e0.c[] cVarArr, int i10) {
            this.f18169a = dVar;
            this.f18170b = bVar;
            this.f18171c = bArr;
            this.f18172d = cVarArr;
            this.f18173e = i10;
        }
    }

    /* renamed from: n */
    static void m23285n(C11146e0 c11146e0, long j10) {
        if (c11146e0.m34680b() < c11146e0.m34684g() + 4) {
            c11146e0.m34674R(Arrays.copyOf(c11146e0.m34682e(), c11146e0.m34684g() + 4));
        } else {
            c11146e0.m34676T(c11146e0.m34684g() + 4);
        }
        byte[] m34682e = c11146e0.m34682e();
        m34682e[c11146e0.m34684g() - 4] = (byte) (j10 & 255);
        m34682e[c11146e0.m34684g() - 3] = (byte) ((j10 >>> 8) & 255);
        m34682e[c11146e0.m34684g() - 2] = (byte) ((j10 >>> 16) & 255);
        m34682e[c11146e0.m34684g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    /* renamed from: o */
    private static int m23286o(byte b10, a aVar) {
        return !aVar.f18172d[m23287p(b10, aVar.f18173e, 1)].f34268a ? aVar.f18169a.f34278g : aVar.f18169a.f34279h;
    }

    /* renamed from: p */
    static int m23287p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    /* renamed from: r */
    public static boolean m23288r(C11146e0 c11146e0) {
        try {
            return C12615e0.m41554m(1, c11146e0, true);
        } catch (C11005b3 unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p133h7.AbstractC7662i
    /* renamed from: e */
    public void mo23282e(long j10) {
        super.mo23282e(j10);
        this.f18166p = j10 != 0;
        C12615e0.d dVar = this.f18167q;
        this.f18165o = dVar != null ? dVar.f34278g : 0;
    }

    @Override // p133h7.AbstractC7662i
    /* renamed from: f */
    protected long mo23255f(C11146e0 c11146e0) {
        if ((c11146e0.m34682e()[0] & 1) == 1) {
            return -1L;
        }
        int m23286o = m23286o(c11146e0.m34682e()[0], (a) C11137a.m34607i(this.f18164n));
        long j10 = this.f18166p ? (this.f18165o + m23286o) / 4 : 0;
        m23285n(c11146e0, j10);
        this.f18166p = true;
        this.f18165o = m23286o;
        return j10;
    }

    @Override // p133h7.AbstractC7662i
    /* renamed from: h */
    protected boolean mo23256h(C11146e0 c11146e0, long j10, AbstractC7662i.b bVar) {
        if (this.f18164n != null) {
            C11137a.m34603e(bVar.f18162a);
            return false;
        }
        a m23289q = m23289q(c11146e0);
        this.f18164n = m23289q;
        if (m23289q == null) {
            return true;
        }
        C12615e0.d dVar = m23289q.f18169a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f34281j);
        arrayList.add(m23289q.f18171c);
        bVar.f18162a = new C11108u1.b().m34552g0("audio/vorbis").m34528I(dVar.f34276e).m34547b0(dVar.f34275d).m34529J(dVar.f34273b).m34553h0(dVar.f34274c).m34541V(arrayList).m34545Z(C12615e0.m41544c(AbstractC5907w.m15080s(m23289q.f18170b.f34266b))).m34526G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p133h7.AbstractC7662i
    /* renamed from: l */
    public void mo23257l(boolean z10) {
        super.mo23257l(z10);
        if (z10) {
            this.f18164n = null;
            this.f18167q = null;
            this.f18168r = null;
        }
        this.f18165o = 0;
        this.f18166p = false;
    }

    /* renamed from: q */
    a m23289q(C11146e0 c11146e0) {
        C12615e0.d dVar = this.f18167q;
        if (dVar == null) {
            this.f18167q = C12615e0.m41552k(c11146e0);
            return null;
        }
        C12615e0.b bVar = this.f18168r;
        if (bVar == null) {
            this.f18168r = C12615e0.m41550i(c11146e0);
            return null;
        }
        byte[] bArr = new byte[c11146e0.m34684g()];
        System.arraycopy(c11146e0.m34682e(), 0, bArr, 0, c11146e0.m34684g());
        return new a(dVar, bVar, bArr, C12615e0.m41553l(c11146e0, dVar.f34273b), C12615e0.m41542a(r4.length - 1));
    }
}
