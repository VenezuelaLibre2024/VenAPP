package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
/* loaded from: classes.dex */
public final class C2136g extends FilterInputStream {

    /* renamed from: c */
    private static final byte[] f8424c;

    /* renamed from: d */
    private static final int f8425d;

    /* renamed from: e */
    private static final int f8426e;

    /* renamed from: a */
    private final byte f8427a;

    /* renamed from: b */
    private int f8428b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f8424c = bArr;
        int length = bArr.length;
        f8425d = length;
        f8426e = length + 2;
    }

    public C2136g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f8427a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f8428b;
        int read = (i11 < 2 || i11 > (i10 = f8426e)) ? super.read() : i11 == i10 ? this.f8427a : f8424c[i11 - 2] & 255;
        if (read != -1) {
            this.f8428b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f8428b;
        int i14 = f8426e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f8427a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f8424c, this.f8428b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f8428b += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f8428b = (int) (this.f8428b + skip);
        }
        return skip;
    }
}
