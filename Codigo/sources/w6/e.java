package w6;

import t8.r0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f29666a;

    /* renamed from: b, reason: collision with root package name */
    public int f29667b;

    /* renamed from: c, reason: collision with root package name */
    public int f29668c;

    /* renamed from: d, reason: collision with root package name */
    public int f29669d;

    /* renamed from: e, reason: collision with root package name */
    public int f29670e;

    /* renamed from: f, reason: collision with root package name */
    public int f29671f;

    /* renamed from: g, reason: collision with root package name */
    public int f29672g;

    /* renamed from: h, reason: collision with root package name */
    public int f29673h;

    /* renamed from: i, reason: collision with root package name */
    public int f29674i;

    /* renamed from: j, reason: collision with root package name */
    public int f29675j;

    /* renamed from: k, reason: collision with root package name */
    public long f29676k;

    /* renamed from: l, reason: collision with root package name */
    public int f29677l;

    private void b(long j10, int i10) {
        this.f29676k += j10;
        this.f29677l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return r0.C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f29666a), Integer.valueOf(this.f29667b), Integer.valueOf(this.f29668c), Integer.valueOf(this.f29669d), Integer.valueOf(this.f29670e), Integer.valueOf(this.f29671f), Integer.valueOf(this.f29672g), Integer.valueOf(this.f29673h), Integer.valueOf(this.f29674i), Integer.valueOf(this.f29675j), Long.valueOf(this.f29676k), Integer.valueOf(this.f29677l));
    }
}
