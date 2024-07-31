package com.bumptech.glide.load.data;

import java.io.OutputStream;
import p193k3.InterfaceC9139b;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes.dex */
public final class C2132c extends OutputStream {

    /* renamed from: a */
    private final OutputStream f8417a;

    /* renamed from: b */
    private byte[] f8418b;

    /* renamed from: c */
    private InterfaceC9139b f8419c;

    /* renamed from: d */
    private int f8420d;

    public C2132c(OutputStream outputStream, InterfaceC9139b interfaceC9139b) {
        this(outputStream, interfaceC9139b, 65536);
    }

    C2132c(OutputStream outputStream, InterfaceC9139b interfaceC9139b, int i10) {
        this.f8417a = outputStream;
        this.f8419c = interfaceC9139b;
        this.f8418b = (byte[]) interfaceC9139b.mo26943c(i10, byte[].class);
    }

    /* renamed from: a */
    private void m10770a() {
        int i10 = this.f8420d;
        if (i10 > 0) {
            this.f8417a.write(this.f8418b, 0, i10);
            this.f8420d = 0;
        }
    }

    /* renamed from: b */
    private void m10771b() {
        if (this.f8420d == this.f8418b.length) {
            m10770a();
        }
    }

    /* renamed from: e */
    private void m10772e() {
        byte[] bArr = this.f8418b;
        if (bArr != null) {
            this.f8419c.put(bArr);
            this.f8418b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f8417a.close();
            m10772e();
        } catch (Throwable th2) {
            this.f8417a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        m10770a();
        this.f8417a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f8418b;
        int i11 = this.f8420d;
        this.f8420d = i11 + 1;
        bArr[i11] = (byte) i10;
        m10771b();
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
            int i15 = this.f8420d;
            if (i15 == 0 && i13 >= this.f8418b.length) {
                this.f8417a.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f8418b.length - i15);
            System.arraycopy(bArr, i14, this.f8418b, this.f8420d, min);
            this.f8420d += min;
            i12 += min;
            m10771b();
        } while (i12 < i11);
    }
}
