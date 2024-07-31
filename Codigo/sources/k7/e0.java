package k7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import k7.l;
import t8.o0;
import t8.r0;

/* loaded from: classes.dex */
public final class e0 implements l {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f20421a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f20422b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f20423c;

    /* loaded from: classes.dex */
    public static class b implements l.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [k7.e0$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // k7.l.b
        public l a(l.a aVar) {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec b10 = b(aVar);
                try {
                    o0.a("configureCodec");
                    b10.configure(aVar.f20452b, aVar.f20454d, aVar.f20455e, aVar.f20456f);
                    o0.c();
                    o0.a("startCodec");
                    b10.start();
                    o0.c();
                    return new e0(b10);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = b10;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (RuntimeException e12) {
                e = e12;
            }
        }

        protected MediaCodec b(l.a aVar) {
            t8.a.e(aVar.f20451a);
            String str = aVar.f20451a.f20459a;
            o0.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            o0.c();
            return createByCodecName;
        }
    }

    private e0(MediaCodec mediaCodec) {
        this.f20421a = mediaCodec;
        if (r0.f26744a < 21) {
            this.f20422b = mediaCodec.getInputBuffers();
            this.f20423c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // k7.l
    public MediaFormat a() {
        return this.f20421a.getOutputFormat();
    }

    @Override // k7.l
    public void b(int i10) {
        this.f20421a.setVideoScalingMode(i10);
    }

    @Override // k7.l
    public ByteBuffer c(int i10) {
        return r0.f26744a >= 21 ? this.f20421a.getInputBuffer(i10) : ((ByteBuffer[]) r0.j(this.f20422b))[i10];
    }

    @Override // k7.l
    public void d(Surface surface) {
        this.f20421a.setOutputSurface(surface);
    }

    @Override // k7.l
    public void e(int i10, int i11, int i12, long j10, int i13) {
        this.f20421a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // k7.l
    public void f(int i10, int i11, w6.c cVar, long j10, int i12) {
        this.f20421a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // k7.l
    public void flush() {
        this.f20421a.flush();
    }

    @Override // k7.l
    public boolean g() {
        return false;
    }

    @Override // k7.l
    public void h(final l.c cVar, Handler handler) {
        this.f20421a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: k7.d0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                e0.this.p(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // k7.l
    public void i(Bundle bundle) {
        this.f20421a.setParameters(bundle);
    }

    @Override // k7.l
    public void j(int i10, long j10) {
        this.f20421a.releaseOutputBuffer(i10, j10);
    }

    @Override // k7.l
    public int k() {
        return this.f20421a.dequeueInputBuffer(0L);
    }

    @Override // k7.l
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f20421a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && r0.f26744a < 21) {
                this.f20423c = this.f20421a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // k7.l
    public void m(int i10, boolean z10) {
        this.f20421a.releaseOutputBuffer(i10, z10);
    }

    @Override // k7.l
    public ByteBuffer n(int i10) {
        return r0.f26744a >= 21 ? this.f20421a.getOutputBuffer(i10) : ((ByteBuffer[]) r0.j(this.f20423c))[i10];
    }

    @Override // k7.l
    public void release() {
        this.f20422b = null;
        this.f20423c = null;
        this.f20421a.release();
    }
}
