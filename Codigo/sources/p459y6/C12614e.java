package p459y6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p351s8.InterfaceC10823h;
import p361t6.C11093r1;
import p363t8.C11172r0;

/* renamed from: y6.e */
/* loaded from: classes.dex */
public final class C12614e implements InterfaceC12622l {

    /* renamed from: b */
    private final InterfaceC10823h f34254b;

    /* renamed from: c */
    private final long f34255c;

    /* renamed from: d */
    private long f34256d;

    /* renamed from: f */
    private int f34258f;

    /* renamed from: g */
    private int f34259g;

    /* renamed from: e */
    private byte[] f34257e = new byte[65536];

    /* renamed from: a */
    private final byte[] f34253a = new byte[RecognitionOptions.AZTEC];

    static {
        C11093r1.m34452a("goog.exo.extractor");
    }

    public C12614e(InterfaceC10823h interfaceC10823h, long j10, long j11) {
        this.f34254b = interfaceC10823h;
        this.f34256d = j10;
        this.f34255c = j11;
    }

    /* renamed from: h */
    private void m41526h(int i10) {
        if (i10 != -1) {
            this.f34256d += i10;
        }
    }

    /* renamed from: r */
    private void m41527r(int i10) {
        int i11 = this.f34258f + i10;
        byte[] bArr = this.f34257e;
        if (i11 > bArr.length) {
            this.f34257e = Arrays.copyOf(this.f34257e, C11172r0.m34942q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    /* renamed from: s */
    private int m41528s(byte[] bArr, int i10, int i11) {
        int i12 = this.f34259g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f34257e, 0, bArr, i10, min);
        m41531w(min);
        return min;
    }

    /* renamed from: t */
    private int m41529t(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f34254b.read(bArr, i10 + i12, i11 - i12);
        if (read != -1) {
            return i12 + read;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: u */
    private int m41530u(int i10) {
        int min = Math.min(this.f34259g, i10);
        m41531w(min);
        return min;
    }

    /* renamed from: w */
    private void m41531w(int i10) {
        int i11 = this.f34259g - i10;
        this.f34259g = i11;
        this.f34258f = 0;
        byte[] bArr = this.f34257e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f34257e = bArr2;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: a */
    public int mo41532a(int i10) {
        int m41530u = m41530u(i10);
        if (m41530u == 0) {
            byte[] bArr = this.f34253a;
            m41530u = m41529t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        m41526h(m41530u);
        return m41530u;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: d */
    public boolean mo41533d(byte[] bArr, int i10, int i11, boolean z10) {
        if (!mo41539p(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f34257e, this.f34258f - i11, bArr, i10, i11);
        return true;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: f */
    public void mo41534f() {
        this.f34258f = 0;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: g */
    public boolean mo41535g(byte[] bArr, int i10, int i11, boolean z10) {
        int m41528s = m41528s(bArr, i10, i11);
        while (m41528s < i11 && m41528s != -1) {
            m41528s = m41529t(bArr, i10, i11, m41528s, z10);
        }
        m41526h(m41528s);
        return m41528s != -1;
    }

    @Override // p459y6.InterfaceC12622l
    public long getLength() {
        return this.f34255c;
    }

    @Override // p459y6.InterfaceC12622l
    public long getPosition() {
        return this.f34256d;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: i */
    public long mo19807i() {
        return this.f34256d + this.f34258f;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: k */
    public void mo41536k(int i10) {
        mo41539p(i10, false);
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: m */
    public int mo41537m(byte[] bArr, int i10, int i11) {
        int min;
        m41527r(i11);
        int i12 = this.f34259g;
        int i13 = this.f34258f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = m41529t(this.f34257e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f34259g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f34257e, this.f34258f, bArr, i10, min);
        this.f34258f += min;
        return min;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: n */
    public void mo41538n(int i10) {
        m41541v(i10, false);
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: p */
    public boolean mo41539p(int i10, boolean z10) {
        m41527r(i10);
        int i11 = this.f34259g - this.f34258f;
        while (i11 < i10) {
            i11 = m41529t(this.f34257e, this.f34258f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f34259g = this.f34258f + i11;
        }
        this.f34258f += i10;
        return true;
    }

    @Override // p459y6.InterfaceC12622l
    /* renamed from: q */
    public void mo41540q(byte[] bArr, int i10, int i11) {
        mo41533d(bArr, i10, i11, false);
    }

    @Override // p459y6.InterfaceC12622l, p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        int m41528s = m41528s(bArr, i10, i11);
        if (m41528s == 0) {
            m41528s = m41529t(bArr, i10, i11, 0, true);
        }
        m41526h(m41528s);
        return m41528s;
    }

    @Override // p459y6.InterfaceC12622l
    public void readFully(byte[] bArr, int i10, int i11) {
        mo41535g(bArr, i10, i11, false);
    }

    /* renamed from: v */
    public boolean m41541v(int i10, boolean z10) {
        int m41530u = m41530u(i10);
        while (m41530u < i10 && m41530u != -1) {
            m41530u = m41529t(this.f34253a, -m41530u, Math.min(i10, this.f34253a.length + m41530u), m41530u, z10);
        }
        m41526h(m41530u);
        return m41530u != -1;
    }
}
