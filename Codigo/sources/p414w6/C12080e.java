package p414w6;

import p363t8.C11172r0;

/* renamed from: w6.e */
/* loaded from: classes.dex */
public final class C12080e {

    /* renamed from: a */
    public int f32129a;

    /* renamed from: b */
    public int f32130b;

    /* renamed from: c */
    public int f32131c;

    /* renamed from: d */
    public int f32132d;

    /* renamed from: e */
    public int f32133e;

    /* renamed from: f */
    public int f32134f;

    /* renamed from: g */
    public int f32135g;

    /* renamed from: h */
    public int f32136h;

    /* renamed from: i */
    public int f32137i;

    /* renamed from: j */
    public int f32138j;

    /* renamed from: k */
    public long f32139k;

    /* renamed from: l */
    public int f32140l;

    /* renamed from: b */
    private void m38804b(long j10, int i10) {
        this.f32139k += j10;
        this.f32140l += i10;
    }

    /* renamed from: a */
    public void m38805a(long j10) {
        m38804b(j10, 1);
    }

    /* renamed from: c */
    public synchronized void m38806c() {
    }

    public String toString() {
        return C11172r0.m34860C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f32129a), Integer.valueOf(this.f32130b), Integer.valueOf(this.f32131c), Integer.valueOf(this.f32132d), Integer.valueOf(this.f32133e), Integer.valueOf(this.f32134f), Integer.valueOf(this.f32135g), Integer.valueOf(this.f32136h), Integer.valueOf(this.f32137i), Integer.valueOf(this.f32138j), Long.valueOf(this.f32139k), Integer.valueOf(this.f32140l));
    }
}
