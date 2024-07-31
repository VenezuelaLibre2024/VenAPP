package y6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import t6.r1;
import t8.r0;

/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: b, reason: collision with root package name */
    private final s8.h f31718b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31719c;

    /* renamed from: d, reason: collision with root package name */
    private long f31720d;

    /* renamed from: f, reason: collision with root package name */
    private int f31722f;

    /* renamed from: g, reason: collision with root package name */
    private int f31723g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f31721e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31717a = new byte[RecognitionOptions.AZTEC];

    static {
        r1.a("goog.exo.extractor");
    }

    public e(s8.h hVar, long j10, long j11) {
        this.f31718b = hVar;
        this.f31720d = j10;
        this.f31719c = j11;
    }

    private void h(int i10) {
        if (i10 != -1) {
            this.f31720d += i10;
        }
    }

    private void r(int i10) {
        int i11 = this.f31722f + i10;
        byte[] bArr = this.f31721e;
        if (i11 > bArr.length) {
            this.f31721e = Arrays.copyOf(this.f31721e, r0.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int s(byte[] bArr, int i10, int i11) {
        int i12 = this.f31723g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f31721e, 0, bArr, i10, min);
        w(min);
        return min;
    }

    private int t(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f31718b.read(bArr, i10 + i12, i11 - i12);
        if (read != -1) {
            return i12 + read;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int u(int i10) {
        int min = Math.min(this.f31723g, i10);
        w(min);
        return min;
    }

    private void w(int i10) {
        int i11 = this.f31723g - i10;
        this.f31723g = i11;
        this.f31722f = 0;
        byte[] bArr = this.f31721e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f31721e = bArr2;
    }

    @Override // y6.l
    public int a(int i10) {
        int u10 = u(i10);
        if (u10 == 0) {
            byte[] bArr = this.f31717a;
            u10 = t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        h(u10);
        return u10;
    }

    @Override // y6.l
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        if (!p(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f31721e, this.f31722f - i11, bArr, i10, i11);
        return true;
    }

    @Override // y6.l
    public void f() {
        this.f31722f = 0;
    }

    @Override // y6.l
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        int s10 = s(bArr, i10, i11);
        while (s10 < i11 && s10 != -1) {
            s10 = t(bArr, i10, i11, s10, z10);
        }
        h(s10);
        return s10 != -1;
    }

    @Override // y6.l
    public long getLength() {
        return this.f31719c;
    }

    @Override // y6.l
    public long getPosition() {
        return this.f31720d;
    }

    @Override // y6.l
    public long i() {
        return this.f31720d + this.f31722f;
    }

    @Override // y6.l
    public void k(int i10) {
        p(i10, false);
    }

    @Override // y6.l
    public int m(byte[] bArr, int i10, int i11) {
        int min;
        r(i11);
        int i12 = this.f31723g;
        int i13 = this.f31722f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = t(this.f31721e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f31723g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f31721e, this.f31722f, bArr, i10, min);
        this.f31722f += min;
        return min;
    }

    @Override // y6.l
    public void n(int i10) {
        v(i10, false);
    }

    @Override // y6.l
    public boolean p(int i10, boolean z10) {
        r(i10);
        int i11 = this.f31723g - this.f31722f;
        while (i11 < i10) {
            i11 = t(this.f31721e, this.f31722f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f31723g = this.f31722f + i11;
        }
        this.f31722f += i10;
        return true;
    }

    @Override // y6.l
    public void q(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    @Override // y6.l, s8.h
    public int read(byte[] bArr, int i10, int i11) {
        int s10 = s(bArr, i10, i11);
        if (s10 == 0) {
            s10 = t(bArr, i10, i11, 0, true);
        }
        h(s10);
        return s10;
    }

    @Override // y6.l
    public void readFully(byte[] bArr, int i10, int i11) {
        g(bArr, i10, i11, false);
    }

    public boolean v(int i10, boolean z10) {
        int u10 = u(i10);
        while (u10 < i10 && u10 != -1) {
            u10 = t(this.f31717a, -u10, Math.min(i10, this.f31717a.length + u10), u10, z10);
        }
        h(u10);
        return u10 != -1;
    }
}
