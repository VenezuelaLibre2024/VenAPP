package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class PF extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0950Gu A02;
    public final Uri A03;
    public final C1398Ym A04;
    public final InterfaceC0949Gt A05;
    public final String A06;

    public PF(C1398Ym c1398Ym, Uri uri, InterfaceC0949Gt interfaceC0949Gt) throws IOException {
        this.A04 = c1398Ym;
        this.A05 = interfaceC0949Gt;
        this.A03 = uri;
        this.A06 = R0.A08(c1398Ym, uri);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        InterfaceC0950Gu interfaceC0950Gu = this.A02;
        if (interfaceC0950Gu != null) {
            interfaceC0950Gu.close();
        }
        this.A02 = this.A05.A4X();
        this.A01 = (int) this.A02.ADl(new C0954Gy(this.A03, i10, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A02.read(bArr, i10, i11);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.A01;
        int i10 = this.A00;
        long skipped = j11 - i10;
        if (skipped <= 0) {
            return 0L;
        }
        if (j10 > skipped) {
            j10 = skipped;
        }
        int i11 = (int) (i10 + j10);
        this.A00 = i11;
        A00(i11);
        return j10;
    }
}
