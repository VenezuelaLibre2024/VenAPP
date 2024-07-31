package e1;

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

/* loaded from: classes.dex */
public final class d implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    private final Rect A;
    private final Rect B;
    private ByteBuffer C;
    e G;
    private SurfaceTexture H;
    private Surface I;
    private Surface J;
    private e1.b K;
    private e1.a L;
    private int M;

    /* renamed from: a, reason: collision with root package name */
    MediaCodec f14364a;

    /* renamed from: b, reason: collision with root package name */
    final c f14365b;

    /* renamed from: c, reason: collision with root package name */
    private final HandlerThread f14366c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f14367d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14368e;

    /* renamed from: f, reason: collision with root package name */
    final int f14369f;

    /* renamed from: r, reason: collision with root package name */
    final int f14370r;

    /* renamed from: s, reason: collision with root package name */
    final int f14371s;

    /* renamed from: t, reason: collision with root package name */
    final int f14372t;

    /* renamed from: u, reason: collision with root package name */
    final int f14373u;

    /* renamed from: v, reason: collision with root package name */
    final int f14374v;

    /* renamed from: w, reason: collision with root package name */
    private final int f14375w;

    /* renamed from: x, reason: collision with root package name */
    final boolean f14376x;

    /* renamed from: y, reason: collision with root package name */
    private int f14377y;

    /* renamed from: z, reason: collision with root package name */
    boolean f14378z;
    private final ArrayList<ByteBuffer> D = new ArrayList<>();
    private final ArrayList<ByteBuffer> E = new ArrayList<>();
    final ArrayList<Integer> F = new ArrayList<>();
    private final float[] N = new float[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.l();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.r();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(d dVar);

        public abstract void b(d dVar, ByteBuffer byteBuffer);

        public abstract void c(d dVar, MediaCodec.CodecException codecException);

        public abstract void d(d dVar, MediaFormat mediaFormat);
    }

    /* renamed from: e1.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0219d extends MediaCodec.Callback {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14381a;

        C0219d() {
        }

        private void a(MediaCodec.CodecException codecException) {
            d.this.r();
            if (codecException == null) {
                d dVar = d.this;
                dVar.f14365b.a(dVar);
            } else {
                d dVar2 = d.this;
                dVar2.f14365b.c(dVar2, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            if (mediaCodec != d.this.f14364a) {
                return;
            }
            Log.e("HeifEncoder", "onError: " + codecException);
            a(codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
            d dVar = d.this;
            if (mediaCodec != dVar.f14364a || dVar.f14378z) {
                return;
            }
            dVar.F.add(Integer.valueOf(i10));
            d.this.l();
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
            if (mediaCodec != d.this.f14364a || this.f14381a) {
                return;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i10);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                e eVar = d.this.G;
                if (eVar != null) {
                    eVar.e(bufferInfo.presentationTimeUs);
                }
                d dVar = d.this;
                dVar.f14365b.b(dVar, outputBuffer);
            }
            this.f14381a = ((bufferInfo.flags & 4) != 0) | this.f14381a;
            mediaCodec.releaseOutputBuffer(i10, false);
            if (this.f14381a) {
                a(null);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (mediaCodec != d.this.f14364a) {
                return;
            }
            if (!"image/vnd.android.heic".equals(mediaFormat.getString("mime"))) {
                mediaFormat.setString("mime", "image/vnd.android.heic");
                mediaFormat.setInteger("width", d.this.f14369f);
                mediaFormat.setInteger("height", d.this.f14370r);
                d dVar = d.this;
                if (dVar.f14376x) {
                    mediaFormat.setInteger("tile-width", dVar.f14371s);
                    mediaFormat.setInteger("tile-height", d.this.f14372t);
                    mediaFormat.setInteger("grid-rows", d.this.f14373u);
                    mediaFormat.setInteger("grid-cols", d.this.f14374v);
                }
            }
            d dVar2 = d.this;
            dVar2.f14365b.d(dVar2, mediaFormat);
        }
    }

    /* loaded from: classes.dex */
    private class e {

        /* renamed from: a, reason: collision with root package name */
        final boolean f14383a;

        /* renamed from: b, reason: collision with root package name */
        long f14384b = -1;

        /* renamed from: c, reason: collision with root package name */
        long f14385c = -1;

        /* renamed from: d, reason: collision with root package name */
        long f14386d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f14387e = -1;

        /* renamed from: f, reason: collision with root package name */
        long f14388f = -1;

        /* renamed from: g, reason: collision with root package name */
        boolean f14389g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaCodec mediaCodec = d.this.f14364a;
                if (mediaCodec != null) {
                    mediaCodec.signalEndOfInputStream();
                }
            }
        }

        e(boolean z10) {
            this.f14383a = z10;
        }

        private void a() {
            d.this.f14367d.post(new a());
            this.f14389g = true;
        }

        private void b() {
            if (this.f14389g) {
                return;
            }
            if (this.f14386d < 0) {
                long j10 = this.f14384b;
                if (j10 >= 0 && this.f14385c >= j10) {
                    long j11 = this.f14387e;
                    if (j11 < 0) {
                        a();
                        return;
                    }
                    this.f14386d = j11;
                }
            }
            long j12 = this.f14386d;
            if (j12 < 0 || j12 > this.f14388f) {
                return;
            }
            a();
        }

        synchronized void c(long j10) {
            if (this.f14383a) {
                if (this.f14384b < 0) {
                    this.f14384b = j10;
                }
            } else if (this.f14386d < 0) {
                this.f14386d = j10 / 1000;
            }
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[Catch: all -> 0x001c, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0013, B:11:0x0015), top: B:2:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        synchronized boolean d(long r5, long r7) {
            /*
                r4 = this;
                monitor-enter(r4)
                long r0 = r4.f14384b     // Catch: java.lang.Throwable -> L1c
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
                r4.f14387e = r7     // Catch: java.lang.Throwable -> L1c
            L15:
                r4.f14385c = r5     // Catch: java.lang.Throwable -> L1c
                r4.b()     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r4)
                return r0
            L1c:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.d.e.d(long, long):boolean");
        }

        synchronized void e(long j10) {
            this.f14388f = j10;
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(int r20, int r21, boolean r22, int r23, int r24, android.os.Handler r25, e1.d.c r26) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.<init>(int, int, boolean, int, int, android.os.Handler, e1.d$c):void");
    }

    private ByteBuffer a() {
        ByteBuffer remove;
        synchronized (this.D) {
            while (!this.f14378z && this.D.isEmpty()) {
                try {
                    this.D.wait();
                } catch (InterruptedException unused) {
                }
            }
            remove = this.f14378z ? null : this.D.remove(0);
        }
        return remove;
    }

    private void e(byte[] bArr) {
        ByteBuffer a10 = a();
        if (a10 == null) {
            return;
        }
        a10.clear();
        if (bArr != null) {
            a10.put(bArr);
        }
        a10.flip();
        synchronized (this.E) {
            this.E.add(a10);
        }
        this.f14367d.post(new a());
    }

    private long f(int i10) {
        return ((i10 * 1000000) / this.f14375w) + 132;
    }

    private static void g(ByteBuffer byteBuffer, Image image, int i10, int i11, Rect rect, Rect rect2) {
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

    private void i() {
        GLES20.glViewport(0, 0, this.f14371s, this.f14372t);
        for (int i10 = 0; i10 < this.f14373u; i10++) {
            for (int i11 = 0; i11 < this.f14374v; i11++) {
                int i12 = this.f14371s;
                int i13 = i11 * i12;
                int i14 = this.f14372t;
                int i15 = i10 * i14;
                this.A.set(i13, i15, i12 + i13, i14 + i15);
                this.L.a(this.M, f.f14424i, this.A);
                e1.b bVar = this.K;
                int i16 = this.f14377y;
                this.f14377y = i16 + 1;
                bVar.i(f(i16) * 1000);
                this.K.j();
            }
        }
    }

    private ByteBuffer j() {
        if (!this.f14378z && this.C == null) {
            synchronized (this.E) {
                this.C = this.E.isEmpty() ? null : this.E.remove(0);
            }
        }
        if (this.f14378z) {
            return null;
        }
        return this.C;
    }

    private void n(boolean z10) {
        synchronized (this.D) {
            this.f14378z = z10 | this.f14378z;
            this.D.add(this.C);
            this.D.notifyAll();
        }
        this.C = null;
    }

    public void b(Bitmap bitmap) {
        if (this.f14368e != 2) {
            throw new IllegalStateException("addBitmap is only allowed in bitmap input mode");
        }
        if (this.G.d(f(this.f14377y) * 1000, f((this.f14377y + this.f14375w) - 1))) {
            synchronized (this) {
                e1.b bVar = this.K;
                if (bVar == null) {
                    return;
                }
                bVar.f();
                this.L.d(this.M, bitmap);
                i();
                this.K.g();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.D) {
            this.f14378z = true;
            this.D.notifyAll();
        }
        this.f14367d.postAtFrontOfQueue(new b());
    }

    void l() {
        while (true) {
            ByteBuffer j10 = j();
            if (j10 == null || this.F.isEmpty()) {
                return;
            }
            int intValue = this.F.remove(0).intValue();
            boolean z10 = this.f14377y % this.f14375w == 0 && j10.remaining() == 0;
            if (!z10) {
                Image inputImage = this.f14364a.getInputImage(intValue);
                int i10 = this.f14371s;
                int i11 = this.f14377y;
                int i12 = this.f14374v;
                int i13 = (i11 % i12) * i10;
                int i14 = this.f14372t;
                int i15 = ((i11 / i12) % this.f14373u) * i14;
                this.A.set(i13, i15, i10 + i13, i14 + i15);
                g(j10, inputImage, this.f14369f, this.f14370r, this.A, this.B);
            }
            MediaCodec mediaCodec = this.f14364a;
            int capacity = z10 ? 0 : mediaCodec.getInputBuffer(intValue).capacity();
            int i16 = this.f14377y;
            this.f14377y = i16 + 1;
            mediaCodec.queueInputBuffer(intValue, 0, capacity, f(i16), z10 ? 4 : 0);
            if (z10 || this.f14377y % this.f14375w == 0) {
                n(z10);
            }
        }
    }

    public void o() {
        this.f14364a.start();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            e1.b bVar = this.K;
            if (bVar == null) {
                return;
            }
            bVar.f();
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.N);
            if (this.G.d(surfaceTexture.getTimestamp(), f((this.f14377y + this.f14375w) - 1))) {
                i();
            }
            surfaceTexture.releaseTexImage();
            this.K.g();
        }
    }

    public void q() {
        int i10 = this.f14368e;
        if (i10 == 2) {
            this.G.c(0L);
        } else if (i10 == 0) {
            e(null);
        }
    }

    void r() {
        MediaCodec mediaCodec = this.f14364a;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f14364a.release();
            this.f14364a = null;
        }
        synchronized (this.D) {
            this.f14378z = true;
            this.D.notifyAll();
        }
        synchronized (this) {
            e1.a aVar = this.L;
            if (aVar != null) {
                aVar.e(false);
                this.L = null;
            }
            e1.b bVar = this.K;
            if (bVar != null) {
                bVar.h();
                this.K = null;
            }
            SurfaceTexture surfaceTexture = this.H;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.H = null;
            }
        }
    }
}
