package p197k7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p197k7.InterfaceC9191l;
import p363t8.C11137a;
import p363t8.C11166o0;
import p363t8.C11172r0;
import p414w6.C12078c;

/* renamed from: k7.e0 */
/* loaded from: classes.dex */
public final class C9184e0 implements InterfaceC9191l {

    /* renamed from: a */
    private final MediaCodec f22203a;

    /* renamed from: b */
    private ByteBuffer[] f22204b;

    /* renamed from: c */
    private ByteBuffer[] f22205c;

    /* renamed from: k7.e0$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9191l.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [k7.e0$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p197k7.InterfaceC9191l.b
        /* renamed from: a */
        public InterfaceC9191l mo27153a(InterfaceC9191l.a aVar) {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec m27226b = m27226b(aVar);
                try {
                    C11166o0.m34831a("configureCodec");
                    m27226b.configure(aVar.f22234b, aVar.f22236d, aVar.f22237e, aVar.f22238f);
                    C11166o0.m34833c();
                    C11166o0.m34831a("startCodec");
                    m27226b.start();
                    C11166o0.m34833c();
                    return new C9184e0(m27226b);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = m27226b;
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

        /* renamed from: b */
        protected MediaCodec m27226b(InterfaceC9191l.a aVar) {
            C11137a.m34603e(aVar.f22233a);
            String str = aVar.f22233a.f22241a;
            C11166o0.m34831a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C11166o0.m34833c();
            return createByCodecName;
        }
    }

    private C9184e0(MediaCodec mediaCodec) {
        this.f22203a = mediaCodec;
        if (C11172r0.f29040a < 21) {
            this.f22204b = mediaCodec.getInputBuffers();
            this.f22205c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m27225p(InterfaceC9191l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.mo27260a(this, j10, j11);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: a */
    public MediaFormat mo27135a() {
        return this.f22203a.getOutputFormat();
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: b */
    public void mo27136b(int i10) {
        this.f22203a.setVideoScalingMode(i10);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: c */
    public ByteBuffer mo27137c(int i10) {
        return C11172r0.f29040a >= 21 ? this.f22203a.getInputBuffer(i10) : ((ByteBuffer[]) C11172r0.m34928j(this.f22204b))[i10];
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: d */
    public void mo27138d(Surface surface) {
        this.f22203a.setOutputSurface(surface);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: e */
    public void mo27139e(int i10, int i11, int i12, long j10, int i13) {
        this.f22203a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: f */
    public void mo27140f(int i10, int i11, C12078c c12078c, long j10, int i12) {
        this.f22203a.queueSecureInputBuffer(i10, i11, c12078c.m38799a(), j10, i12);
    }

    @Override // p197k7.InterfaceC9191l
    public void flush() {
        this.f22203a.flush();
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: g */
    public boolean mo27141g() {
        return false;
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: h */
    public void mo27142h(final InterfaceC9191l.c cVar, Handler handler) {
        this.f22203a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: k7.d0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                C9184e0.this.m27225p(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: i */
    public void mo27143i(Bundle bundle) {
        this.f22203a.setParameters(bundle);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: j */
    public void mo27144j(int i10, long j10) {
        this.f22203a.releaseOutputBuffer(i10, j10);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: k */
    public int mo27145k() {
        return this.f22203a.dequeueInputBuffer(0L);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: l */
    public int mo27146l(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f22203a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && C11172r0.f29040a < 21) {
                this.f22205c = this.f22203a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: m */
    public void mo27147m(int i10, boolean z10) {
        this.f22203a.releaseOutputBuffer(i10, z10);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: n */
    public ByteBuffer mo27148n(int i10) {
        return C11172r0.f29040a >= 21 ? this.f22203a.getOutputBuffer(i10) : ((ByteBuffer[]) C11172r0.m34928j(this.f22205c))[i10];
    }

    @Override // p197k7.InterfaceC9191l
    public void release() {
        this.f22204b = null;
        this.f22205c = null;
        this.f22203a.release();
    }
}
