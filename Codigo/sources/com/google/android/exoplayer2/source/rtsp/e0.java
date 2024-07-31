package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.s;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import t8.r0;

/* loaded from: classes.dex */
final class e0 extends s8.f implements b, s.b {

    /* renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue<byte[]> f8335e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8336f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f8337g;

    /* renamed from: h, reason: collision with root package name */
    private int f8338h;

    public e0(long j10) {
        super(true);
        this.f8336f = j10;
        this.f8335e = new LinkedBlockingQueue<>();
        this.f8337g = new byte[0];
        this.f8338h = -1;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public String b() {
        t8.a.g(this.f8338h != -1);
        return r0.C("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f8338h), Integer.valueOf(this.f8338h + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public int c() {
        return this.f8338h;
    }

    @Override // s8.j
    public void close() {
    }

    @Override // s8.j
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.s.b
    public void h(byte[] bArr) {
        this.f8335e.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public s.b j() {
        return this;
    }

    @Override // s8.j
    public long o(s8.n nVar) {
        this.f8338h = nVar.f25288a.getPort();
        return -1L;
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int min = Math.min(i11, this.f8337g.length);
        System.arraycopy(this.f8337g, 0, bArr, i10, min);
        int i12 = min + 0;
        byte[] bArr2 = this.f8337g;
        this.f8337g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (i12 == i11) {
            return i12;
        }
        try {
            byte[] poll = this.f8335e.poll(this.f8336f, TimeUnit.MILLISECONDS);
            if (poll == null) {
                return -1;
            }
            int min2 = Math.min(i11 - i12, poll.length);
            System.arraycopy(poll, 0, bArr, i10 + i12, min2);
            if (min2 < poll.length) {
                this.f8337g = Arrays.copyOfRange(poll, min2, poll.length);
            }
            return i12 + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
