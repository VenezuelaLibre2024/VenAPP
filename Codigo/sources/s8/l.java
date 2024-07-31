package s8;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class l extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final j f25278a;

    /* renamed from: b, reason: collision with root package name */
    private final n f25279b;

    /* renamed from: f, reason: collision with root package name */
    private long f25283f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25281d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25282e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f25280c = new byte[1];

    public l(j jVar, n nVar) {
        this.f25278a = jVar;
        this.f25279b = nVar;
    }

    private void a() {
        if (this.f25281d) {
            return;
        }
        this.f25278a.o(this.f25279b);
        this.f25281d = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25282e) {
            return;
        }
        this.f25278a.close();
        this.f25282e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f25280c) == -1) {
            return -1;
        }
        return this.f25280c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        t8.a.g(!this.f25282e);
        a();
        int read = this.f25278a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f25283f += read;
        return read;
    }
}
