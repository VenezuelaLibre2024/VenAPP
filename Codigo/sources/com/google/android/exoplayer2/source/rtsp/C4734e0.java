package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.C4751s;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p351s8.AbstractC10819f;
import p351s8.C10835n;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: com.google.android.exoplayer2.source.rtsp.e0 */
/* loaded from: classes.dex */
final class C4734e0 extends AbstractC10819f implements InterfaceC4727b, C4751s.b {

    /* renamed from: e */
    private final LinkedBlockingQueue<byte[]> f9379e;

    /* renamed from: f */
    private final long f9380f;

    /* renamed from: g */
    private byte[] f9381g;

    /* renamed from: h */
    private int f9382h;

    public C4734e0(long j10) {
        super(true);
        this.f9380f = j10;
        this.f9379e = new LinkedBlockingQueue<>();
        this.f9381g = new byte[0];
        this.f9382h = -1;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b
    /* renamed from: b */
    public String mo11997b() {
        C11137a.m34605g(this.f9382h != -1);
        return C11172r0.m34860C("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f9382h), Integer.valueOf(this.f9382h + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b
    /* renamed from: c */
    public int mo11998c() {
        return this.f9382h;
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.C4751s.b
    /* renamed from: h */
    public void mo12044h(byte[] bArr) {
        this.f9379e.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b
    /* renamed from: j */
    public C4751s.b mo11999j() {
        return this;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        this.f9382h = c10835n.f27407a.getPort();
        return -1L;
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int min = Math.min(i11, this.f9381g.length);
        System.arraycopy(this.f9381g, 0, bArr, i10, min);
        int i12 = min + 0;
        byte[] bArr2 = this.f9381g;
        this.f9381g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (i12 == i11) {
            return i12;
        }
        try {
            byte[] poll = this.f9379e.poll(this.f9380f, TimeUnit.MILLISECONDS);
            if (poll == null) {
                return -1;
            }
            int min2 = Math.min(i11 - i12, poll.length);
            System.arraycopy(poll, 0, bArr, i10 + i12, min2);
            if (min2 < poll.length) {
                this.f9381g = Arrays.copyOfRange(poll, min2, poll.length);
            }
            return i12 + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
