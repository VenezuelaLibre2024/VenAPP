package com.bumptech.glide.load.data;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f7450a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f7451b;

    /* renamed from: c, reason: collision with root package name */
    private k3.b f7452c;

    /* renamed from: d, reason: collision with root package name */
    private int f7453d;

    public c(OutputStream outputStream, k3.b bVar) {
        this(outputStream, bVar, 65536);
    }

    c(OutputStream outputStream, k3.b bVar, int i10) {
        this.f7450a = outputStream;
        this.f7452c = bVar;
        this.f7451b = (byte[]) bVar.c(i10, byte[].class);
    }

    private void a() {
        int i10 = this.f7453d;
        if (i10 > 0) {
            this.f7450a.write(this.f7451b, 0, i10);
            this.f7453d = 0;
        }
    }

    private void b() {
        if (this.f7453d == this.f7451b.length) {
            a();
        }
    }

    private void e() {
        byte[] bArr = this.f7451b;
        if (bArr != null) {
            this.f7452c.put(bArr);
            this.f7451b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f7450a.close();
            e();
        } catch (Throwable th2) {
            this.f7450a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f7450a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f7451b;
        int i11 = this.f7453d;
        this.f7453d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f7453d;
            if (i15 == 0 && i13 >= this.f7451b.length) {
                this.f7450a.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f7451b.length - i15);
            System.arraycopy(bArr, i14, this.f7451b, this.f7453d, min);
            this.f7453d += min;
            i12 += min;
            b();
        } while (i12 < i11);
    }
}
