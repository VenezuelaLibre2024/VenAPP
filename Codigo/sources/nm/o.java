package nm;

import android.media.MediaDataSource;

/* loaded from: classes3.dex */
public final class o extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22042a;

    public o(byte[] data) {
        kotlin.jvm.internal.n.e(data, "data");
        this.f22042a = data;
    }

    private final int a(int i10, long j10) {
        long j11 = i10;
        long j12 = j10 + j11;
        byte[] bArr = this.f22042a;
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
        return this.f22042a.length;
    }

    @Override // android.media.MediaDataSource
    public synchronized int readAt(long j10, byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        if (j10 >= this.f22042a.length) {
            return -1;
        }
        int a10 = a(i11, j10);
        System.arraycopy(this.f22042a, (int) j10, buffer, i10, a10);
        return a10;
    }
}
