package p351s8;

import java.io.InputStream;
import p363t8.C11137a;

/* renamed from: s8.l */
/* loaded from: classes.dex */
public final class C10831l extends InputStream {

    /* renamed from: a */
    private final InterfaceC10827j f27397a;

    /* renamed from: b */
    private final C10835n f27398b;

    /* renamed from: f */
    private long f27402f;

    /* renamed from: d */
    private boolean f27400d = false;

    /* renamed from: e */
    private boolean f27401e = false;

    /* renamed from: c */
    private final byte[] f27399c = new byte[1];

    public C10831l(InterfaceC10827j interfaceC10827j, C10835n c10835n) {
        this.f27397a = interfaceC10827j;
        this.f27398b = c10835n;
    }

    /* renamed from: a */
    private void m33013a() {
        if (this.f27400d) {
            return;
        }
        this.f27397a.mo162o(this.f27398b);
        this.f27400d = true;
    }

    /* renamed from: b */
    public void m33014b() {
        m33013a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f27401e) {
            return;
        }
        this.f27397a.close();
        this.f27401e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f27399c) == -1) {
            return -1;
        }
        return this.f27399c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        C11137a.m34605g(!this.f27401e);
        m33013a();
        int read = this.f27397a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f27402f += read;
        return read;
    }
}
