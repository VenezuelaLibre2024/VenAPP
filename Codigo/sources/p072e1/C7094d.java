package p072e1;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class C7094d implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: A */
    private final Rect f15722A;

    /* renamed from: B */
    private final Rect f15723B;

    /* renamed from: C */
    private ByteBuffer f15724C;

    /* renamed from: G */
    e f15728G;

    /* renamed from: H */
    private SurfaceTexture f15729H;

    /* renamed from: I */
    private Surface f15730I;

    /* renamed from: J */
    private Surface f15731J;

    /* renamed from: K */
    private C7092b f15732K;

    /* renamed from: L */
    private C7091a f15733L;

    /* renamed from: M */
    private int f15734M;

    /* renamed from: a */
    MediaCodec f15736a;

    /* renamed from: b */
    final c f15737b;

    /* renamed from: c */
    private final HandlerThread f15738c;

    /* renamed from: d */
    final Handler f15739d;

    /* renamed from: e */
    private final int f15740e;

    /* renamed from: f */
    final int f15741f;

    /* renamed from: r */
    final int f15742r;

    /* renamed from: s */
    final int f15743s;

    /* renamed from: t */
    final int f15744t;

    /* renamed from: u */
    final int f15745u;

    /* renamed from: v */
    final int f15746v;

    /* renamed from: w */
    private final int f15747w;

    /* renamed from: x */
    final boolean f15748x;

    /* renamed from: y */
    private int f15749y;

    /* renamed from: z */
    boolean f15750z;

    /* renamed from: D */
    private final ArrayList<ByteBuffer> f15725D = new ArrayList<>();

    /* renamed from: E */
    private final ArrayList<ByteBuffer> f15726E = new ArrayList<>();

    /* renamed from: F */
    final ArrayList<Integer> f15727F = new ArrayList<>();

    /* renamed from: N */
    private final float[] f15735N = new float[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7094d.this.m20888l();
        }
    }

    /* renamed from: e1.d$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7094d.this.m20891r();
        }
    }

    /* renamed from: e1.d$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract void mo20892a(C7094d c7094d);

        /* renamed from: b */
        public abstract void mo20893b(C7094d c7094d, ByteBuffer byteBuffer);

        /* renamed from: c */
        public abstract void mo20894c(C7094d c7094d, MediaCodec.CodecException codecException);

        /* renamed from: d */
        public abstract void mo20895d(C7094d c7094d, MediaFormat mediaFormat);
    }

    /* renamed from: e1.d$d */
    /* loaded from: classes.dex */
    class d extends MediaCodec.Callback {

        /* renamed from: a */
        private boolean f15753a;

        d() {
        }

        /* renamed from: a */
        private void m20896a(MediaCodec.CodecException codecException) {
            C7094d.this.m20891r();
            if (codecException == null) {
                C7094d c7094d = C7094d.this;
                c7094d.f15737b.mo20892a(c7094d);
            } else {
                C7094d c7094d2 = C7094d.this;
                c7094d2.f15737b.mo20894c(c7094d2, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            if (mediaCodec != C7094d.this.f15736a) {
                return;
            }
            Log.e("HeifEncoder", "onError: " + codecException);
            m20896a(codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
            C7094d c7094d = C7094d.this;
            if (mediaCodec != c7094d.f15736a || c7094d.f15750z) {
                return;
            }
            c7094d.f15727F.add(Integer.valueOf(i10));
            C7094d.this.m20888l();
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
            if (mediaCodec != C7094d.this.f15736a || this.f15753a) {
                return;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i10);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                e eVar = C7094d.this.f15728G;
                if (eVar != null) {
                    eVar.m20901e(bufferInfo.presentationTimeUs);
                }
                C7094d c7094d = C7094d.this;
                c7094d.f15737b.mo20893b(c7094d, outputBuffer);
            }
            this.f15753a = ((bufferInfo.flags & 4) != 0) | this.f15753a;
            mediaCodec.releaseOutputBuffer(i10, false);
            if (this.f15753a) {
                m20896a(null);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (mediaCodec != C7094d.this.f15736a) {
                return;
            }
            if (!"image/vnd.android.heic".equals(mediaFormat.getString("mime"))) {
                mediaFormat.setString("mime", "image/vnd.android.heic");
                mediaFormat.setInteger("width", C7094d.this.f15741f);
                mediaFormat.setInteger("height", C7094d.this.f15742r);
                C7094d c7094d = C7094d.this;
                if (c7094d.f15748x) {
                    mediaFormat.setInteger("tile-width", c7094d.f15743s);
                    mediaFormat.setInteger("tile-height", C7094d.this.f15744t);
                    mediaFormat.setInteger("grid-rows", C7094d.this.f15745u);
                    mediaFormat.setInteger("grid-cols", C7094d.this.f15746v);
                }
            }
            C7094d c7094d2 = C7094d.this;
            c7094d2.f15737b.mo20895d(c7094d2, mediaFormat);
        }
    }

    /* renamed from: e1.d$e */
    /* loaded from: classes.dex */
    private class e {

        /* renamed from: a */
        final boolean f15755a;

        /* renamed from: b */
        long f15756b = -1;

        /* renamed from: c */
        long f15757c = -1;

        /* renamed from: d */
        long f15758d = -1;

        /* renamed from: e */
        long f15759e = -1;

        /* renamed from: f */
        long f15760f = -1;

        /* renamed from: g */
        boolean f15761g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e1.d$e$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaCodec mediaCodec = C7094d.this.f15736a;
                if (mediaCodec != null) {
                    mediaCodec.signalEndOfInputStream();
                }
            }
        }

        e(boolean z10) {
            this.f15755a = z10;
        }

        /* renamed from: a */
        private void m20897a() {
            C7094d.this.f15739d.post(new a());
            this.f15761g = true;
        }

        /* renamed from: b */
        private void m20898b() {
            if (this.f15761g) {
                return;
            }
            if (this.f15758d < 0) {
                long j10 = this.f15756b;
                if (j10 >= 0 && this.f15757c >= j10) {
                    long j11 = this.f15759e;
                    if (j11 < 0) {
                        m20897a();
                        return;
                    }
                    this.f15758d = j11;
                }
            }
            long j12 = this.f15758d;
            if (j12 < 0 || j12 > this.f15760f) {
                return;
            }
            m20897a();
        }

        /* renamed from: c */
        synchronized void m20899c(long j10) {
            if (this.f15755a) {
                if (this.f15756b < 0) {
                    this.f15756b = j10;
                }
            } else if (this.f15758d < 0) {
                this.f15758d = j10 / 1000;
            }
            m20898b();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[Catch: all -> 0x001c, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0013, B:11:0x0015), top: B:2:0x0001 }] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        synchronized boolean m20900d(long r5, long r7) {
            /*
                r4 = this;
                monitor-enter(r4)
                long r0 = r4.f15756b     // Catch: java.lang.Throwable -> L1c
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 < 0) goto L10
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 > 0) goto Le
                goto L10
            Le:
                r0 = 0
                goto L11
            L10:
                r0 = 1
            L11:
                if (r0 == 0) goto L15
                r4.f15759e = r7     // Catch: java.lang.Throwable -> L1c
            L15:
                r4.f15757c = r5     // Catch: java.lang.Throwable -> L1c
                r4.m20898b()     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r4)
                return r0
            L1c:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p072e1.C7094d.e.m20900d(long, long):boolean");
        }

        /* renamed from: e */
        synchronized void m20901e(long j10) {
            this.f15760f = j10;
            m20898b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7094d(int r20, int r21, boolean r22, int r23, int r24, android.os.Handler r25, p072e1.C7094d.c r26) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e1.C7094d.<init>(int, int, boolean, int, int, android.os.Handler, e1.d$c):void");
    }

    /* renamed from: a */
    private ByteBuffer m20880a() {
        ByteBuffer remove;
        synchronized (this.f15725D) {
            while (!this.f15750z && this.f15725D.isEmpty()) {
                try {
                    this.f15725D.wait();
                } catch (InterruptedException unused) {
                }
            }
            remove = this.f15750z ? null : this.f15725D.remove(0);
        }
        return remove;
    }

    /* renamed from: e */
    private void m20881e(byte[] bArr) {
        ByteBuffer m20880a = m20880a();
        if (m20880a == null) {
            return;
        }
        m20880a.clear();
        if (bArr != null) {
            m20880a.put(bArr);
        }
        m20880a.flip();
        synchronized (this.f15726E) {
            this.f15726E.add(m20880a);
        }
        this.f15739d.post(new a());
    }

    /* renamed from: f */
    private long m20882f(int i10) {
        return ((i10 * 1000000) / this.f15747w) + 132;
    }

    /* renamed from: g */
    private static void m20883g(ByteBuffer byteBuffer, Image image, int i10, int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (rect.width() != rect2.width() || rect.height() != rect2.height()) {
            throw new IllegalArgumentException("src and dst rect size are different!");
        }
        if (i10 % 2 == 0 && i11 % 2 == 0) {
            int i14 = 2;
            if (rect.left % 2 == 0 && rect.top % 2 == 0 && rect.right % 2 == 0 && rect.bottom % 2 == 0 && rect2.left % 2 == 0 && rect2.top % 2 == 0 && rect2.right % 2 == 0 && rect2.bottom % 2 == 0) {
                Image.Plane[] planes = image.getPlanes();
                int i15 = 0;
                while (i15 < planes.length) {
                    ByteBuffer buffer = planes[i15].getBuffer();
                    int pixelStride = planes[i15].getPixelStride();
                    int min = Math.min(rect.width(), i10 - rect.left);
                    int min2 = Math.min(rect.height(), i11 - rect.top);
                    if (i15 > 0) {
                        i13 = ((i10 * i11) * (i15 + 3)) / 4;
                        i12 = i14;
                    } else {
                        i12 = 1;
                        i13 = 0;
                    }
                    for (int i16 = 0; i16 < min2 / i12; i16++) {
                        byteBuffer.position(((((rect.top / i12) + i16) * i10) / i12) + i13 + (rect.left / i12));
                        buffer.position((((rect2.top / i12) + i16) * planes[i15].getRowStride()) + ((rect2.left * pixelStride) / i12));
                        int i17 = 0;
                        while (true) {
                            int i18 = min / i12;
                            if (i17 < i18) {
                                buffer.put(byteBuffer.get());
                                if (pixelStride > 1 && i17 != i18 - 1) {
                                    buffer.position((buffer.position() + pixelStride) - 1);
                                }
                                i17++;
                            }
                        }
                    }
                    i15++;
                    i14 = 2;
                }
                return;
            }
        }
        throw new IllegalArgumentException("src or dst are not aligned!");
    }

    /* renamed from: i */
    private void m20884i() {
        GLES20.glViewport(0, 0, this.f15743s, this.f15744t);
        for (int i10 = 0; i10 < this.f15745u; i10++) {
            for (int i11 = 0; i11 < this.f15746v; i11++) {
                int i12 = this.f15743s;
                int i13 = i11 * i12;
                int i14 = this.f15744t;
                int i15 = i10 * i14;
                this.f15722A.set(i13, i15, i12 + i13, i14 + i15);
                this.f15733L.m20864a(this.f15734M, C7096f.f15796i, this.f15722A);
                C7092b c7092b = this.f15732K;
                int i16 = this.f15749y;
                this.f15749y = i16 + 1;
                c7092b.m20877i(m20882f(i16) * 1000);
                this.f15732K.m20878j();
            }
        }
    }

    /* renamed from: j */
    private ByteBuffer m20885j() {
        if (!this.f15750z && this.f15724C == null) {
            synchronized (this.f15726E) {
                this.f15724C = this.f15726E.isEmpty() ? null : this.f15726E.remove(0);
            }
        }
        if (this.f15750z) {
            return null;
        }
        return this.f15724C;
    }

    /* renamed from: n */
    private void m20886n(boolean z10) {
        synchronized (this.f15725D) {
            this.f15750z = z10 | this.f15750z;
            this.f15725D.add(this.f15724C);
            this.f15725D.notifyAll();
        }
        this.f15724C = null;
    }

    /* renamed from: b */
    public void m20887b(Bitmap bitmap) {
        if (this.f15740e != 2) {
            throw new IllegalStateException("addBitmap is only allowed in bitmap input mode");
        }
        if (this.f15728G.m20900d(m20882f(this.f15749y) * 1000, m20882f((this.f15749y + this.f15747w) - 1))) {
            synchronized (this) {
                C7092b c7092b = this.f15732K;
                if (c7092b == null) {
                    return;
                }
                c7092b.m20874f();
                this.f15733L.m20866d(this.f15734M, bitmap);
                m20884i();
                this.f15732K.m20875g();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f15725D) {
            this.f15750z = true;
            this.f15725D.notifyAll();
        }
        this.f15739d.postAtFrontOfQueue(new b());
    }

    /* renamed from: l */
    void m20888l() {
        while (true) {
            ByteBuffer m20885j = m20885j();
            if (m20885j == null || this.f15727F.isEmpty()) {
                return;
            }
            int intValue = this.f15727F.remove(0).intValue();
            boolean z10 = this.f15749y % this.f15747w == 0 && m20885j.remaining() == 0;
            if (!z10) {
                Image inputImage = this.f15736a.getInputImage(intValue);
                int i10 = this.f15743s;
                int i11 = this.f15749y;
                int i12 = this.f15746v;
                int i13 = (i11 % i12) * i10;
                int i14 = this.f15744t;
                int i15 = ((i11 / i12) % this.f15745u) * i14;
                this.f15722A.set(i13, i15, i10 + i13, i14 + i15);
                m20883g(m20885j, inputImage, this.f15741f, this.f15742r, this.f15722A, this.f15723B);
            }
            MediaCodec mediaCodec = this.f15736a;
            int capacity = z10 ? 0 : mediaCodec.getInputBuffer(intValue).capacity();
            int i16 = this.f15749y;
            this.f15749y = i16 + 1;
            mediaCodec.queueInputBuffer(intValue, 0, capacity, m20882f(i16), z10 ? 4 : 0);
            if (z10 || this.f15749y % this.f15747w == 0) {
                m20886n(z10);
            }
        }
    }

    /* renamed from: o */
    public void m20889o() {
        this.f15736a.start();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            C7092b c7092b = this.f15732K;
            if (c7092b == null) {
                return;
            }
            c7092b.m20874f();
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.f15735N);
            if (this.f15728G.m20900d(surfaceTexture.getTimestamp(), m20882f((this.f15749y + this.f15747w) - 1))) {
                m20884i();
            }
            surfaceTexture.releaseTexImage();
            this.f15732K.m20875g();
        }
    }

    /* renamed from: q */
    public void m20890q() {
        int i10 = this.f15740e;
        if (i10 == 2) {
            this.f15728G.m20899c(0L);
        } else if (i10 == 0) {
            m20881e(null);
        }
    }

    /* renamed from: r */
    void m20891r() {
        MediaCodec mediaCodec = this.f15736a;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f15736a.release();
            this.f15736a = null;
        }
        synchronized (this.f15725D) {
            this.f15750z = true;
            this.f15725D.notifyAll();
        }
        synchronized (this) {
            C7091a c7091a = this.f15733L;
            if (c7091a != null) {
                c7091a.m20867e(false);
                this.f15733L = null;
            }
            C7092b c7092b = this.f15732K;
            if (c7092b != null) {
                c7092b.m20876h();
                this.f15732K = null;
            }
            SurfaceTexture surfaceTexture = this.f15729H;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f15729H = null;
            }
        }
    }
}
