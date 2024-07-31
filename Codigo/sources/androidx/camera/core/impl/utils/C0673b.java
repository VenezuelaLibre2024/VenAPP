package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: androidx.camera.core.impl.utils.b */
/* loaded from: classes.dex */
class C0673b extends FilterOutputStream {

    /* renamed from: a */
    final OutputStream f2945a;

    /* renamed from: b */
    private ByteOrder f2946b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0673b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f2945a = outputStream;
        this.f2946b = byteOrder;
    }

    /* renamed from: a */
    public void m3252a(ByteOrder byteOrder) {
        this.f2946b = byteOrder;
    }

    /* renamed from: b */
    public void m3253b(int i10) {
        this.f2945a.write(i10);
    }

    /* renamed from: e */
    public void m3254e(int i10) {
        OutputStream outputStream;
        int i11;
        ByteOrder byteOrder = this.f2946b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2945a.write((i10 >>> 0) & 255);
            this.f2945a.write((i10 >>> 8) & 255);
            this.f2945a.write((i10 >>> 16) & 255);
            outputStream = this.f2945a;
            i11 = i10 >>> 24;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            this.f2945a.write((i10 >>> 24) & 255);
            this.f2945a.write((i10 >>> 16) & 255);
            this.f2945a.write((i10 >>> 8) & 255);
            outputStream = this.f2945a;
            i11 = i10 >>> 0;
        }
        outputStream.write(i11 & 255);
    }

    /* renamed from: f */
    public void m3255f(short s10) {
        OutputStream outputStream;
        int i10;
        ByteOrder byteOrder = this.f2946b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2945a.write((s10 >>> 0) & 255);
            outputStream = this.f2945a;
            i10 = s10 >>> 8;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            this.f2945a.write((s10 >>> 8) & 255);
            outputStream = this.f2945a;
            i10 = s10 >>> 0;
        }
        outputStream.write(i10 & 255);
    }

    /* renamed from: g */
    public void m3256g(long j10) {
        m3254e((int) j10);
    }

    /* renamed from: i */
    public void m3257i(int i10) {
        m3255f((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f2945a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f2945a.write(bArr, i10, i11);
    }
}
