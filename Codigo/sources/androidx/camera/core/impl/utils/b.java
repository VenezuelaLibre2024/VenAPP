package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final OutputStream f2601a;

    /* renamed from: b, reason: collision with root package name */
    private ByteOrder f2602b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f2601a = outputStream;
        this.f2602b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.f2602b = byteOrder;
    }

    public void b(int i10) {
        this.f2601a.write(i10);
    }

    public void e(int i10) {
        OutputStream outputStream;
        int i11;
        ByteOrder byteOrder = this.f2602b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2601a.write((i10 >>> 0) & 255);
            this.f2601a.write((i10 >>> 8) & 255);
            this.f2601a.write((i10 >>> 16) & 255);
            outputStream = this.f2601a;
            i11 = i10 >>> 24;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            this.f2601a.write((i10 >>> 24) & 255);
            this.f2601a.write((i10 >>> 16) & 255);
            this.f2601a.write((i10 >>> 8) & 255);
            outputStream = this.f2601a;
            i11 = i10 >>> 0;
        }
        outputStream.write(i11 & 255);
    }

    public void f(short s10) {
        OutputStream outputStream;
        int i10;
        ByteOrder byteOrder = this.f2602b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2601a.write((s10 >>> 0) & 255);
            outputStream = this.f2601a;
            i10 = s10 >>> 8;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            this.f2601a.write((s10 >>> 8) & 255);
            outputStream = this.f2601a;
            i10 = s10 >>> 0;
        }
        outputStream.write(i10 & 255);
    }

    public void g(long j10) {
        e((int) j10);
    }

    public void i(int i10) {
        f((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f2601a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f2601a.write(bArr, i10, i11);
    }
}
