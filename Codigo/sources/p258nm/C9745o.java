package p258nm;

import android.media.MediaDataSource;
import kotlin.jvm.internal.C9322n;

/* renamed from: nm.o */
/* loaded from: classes3.dex */
public final class C9745o extends MediaDataSource {

    /* renamed from: a */
    private final byte[] f23975a;

    public C9745o(byte[] data) {
        C9322n.m27781e(data, "data");
        this.f23975a = data;
    }

    /* renamed from: a */
    private final int m29219a(int i10, long j10) {
        long j11 = i10;
        long j12 = j10 + j11;
        byte[] bArr = this.f23975a;
        if (j12 > bArr.length) {
            j11 -= j12 - bArr.length;
        }
        return (int) j11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public synchronized long getSize() {
        return this.f23975a.length;
    }

    @Override // android.media.MediaDataSource
    public synchronized int readAt(long j10, byte[] buffer, int i10, int i11) {
        C9322n.m27781e(buffer, "buffer");
        if (j10 >= this.f23975a.length) {
            return -1;
        }
        int m29219a = m29219a(i11, j10);
        System.arraycopy(this.f23975a, (int) j10, buffer, i10, m29219a);
        return m29219a;
    }
}
