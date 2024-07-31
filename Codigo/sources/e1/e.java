package e1;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import e1.d;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final int f14392a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f14393b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f14394c;

    /* renamed from: d, reason: collision with root package name */
    int f14395d;

    /* renamed from: e, reason: collision with root package name */
    final int f14396e;

    /* renamed from: f, reason: collision with root package name */
    final int f14397f;

    /* renamed from: r, reason: collision with root package name */
    final int f14398r;

    /* renamed from: t, reason: collision with root package name */
    MediaMuxer f14400t;

    /* renamed from: u, reason: collision with root package name */
    private e1.d f14401u;

    /* renamed from: w, reason: collision with root package name */
    int[] f14403w;

    /* renamed from: x, reason: collision with root package name */
    int f14404x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f14405y;

    /* renamed from: s, reason: collision with root package name */
    final d f14399s = new d();

    /* renamed from: v, reason: collision with root package name */
    final AtomicBoolean f14402v = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    private final List<Pair<Integer, ByteBuffer>> f14406z = new ArrayList();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.g();
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14408a;

        /* renamed from: b, reason: collision with root package name */
        private final FileDescriptor f14409b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14410c;

        /* renamed from: d, reason: collision with root package name */
        private final int f14411d;

        /* renamed from: e, reason: collision with root package name */
        private final int f14412e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f14413f;

        /* renamed from: g, reason: collision with root package name */
        private int f14414g;

        /* renamed from: h, reason: collision with root package name */
        private int f14415h;

        /* renamed from: i, reason: collision with root package name */
        private int f14416i;

        /* renamed from: j, reason: collision with root package name */
        private int f14417j;

        /* renamed from: k, reason: collision with root package name */
        private Handler f14418k;

        public b(String str, int i10, int i11, int i12) {
            this(str, null, i10, i11, i12);
        }

        private b(String str, FileDescriptor fileDescriptor, int i10, int i11, int i12) {
            this.f14413f = true;
            this.f14414g = 100;
            this.f14415h = 1;
            this.f14416i = 0;
            this.f14417j = 0;
            if (i10 <= 0 || i11 <= 0) {
                throw new IllegalArgumentException("Invalid image size: " + i10 + "x" + i11);
            }
            this.f14408a = str;
            this.f14409b = fileDescriptor;
            this.f14410c = i10;
            this.f14411d = i11;
            this.f14412e = i12;
        }

        public e a() {
            return new e(this.f14408a, this.f14409b, this.f14410c, this.f14411d, this.f14417j, this.f14413f, this.f14414g, this.f14415h, this.f14416i, this.f14412e, this.f14418k);
        }

        public b b(int i10) {
            if (i10 > 0) {
                this.f14415h = i10;
                return this;
            }
            throw new IllegalArgumentException("Invalid maxImage: " + i10);
        }

        public b c(int i10) {
            if (i10 >= 0 && i10 <= 100) {
                this.f14414g = i10;
                return this;
            }
            throw new IllegalArgumentException("Invalid quality: " + i10);
        }
    }

    /* loaded from: classes.dex */
    class c extends d.c {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14419a;

        c() {
        }

        private void e(Exception exc) {
            if (this.f14419a) {
                return;
            }
            this.f14419a = true;
            e.this.f14399s.a(exc);
        }

        @Override // e1.d.c
        public void a(e1.d dVar) {
            e(null);
        }

        @Override // e1.d.c
        public void b(e1.d dVar, ByteBuffer byteBuffer) {
            if (this.f14419a) {
                return;
            }
            e eVar = e.this;
            if (eVar.f14403w == null) {
                e(new IllegalStateException("Output buffer received before format info"));
                return;
            }
            if (eVar.f14404x < eVar.f14397f * eVar.f14395d) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), 0L, 0);
                e eVar2 = e.this;
                eVar2.f14400t.writeSampleData(eVar2.f14403w[eVar2.f14404x / eVar2.f14395d], byteBuffer, bufferInfo);
            }
            e eVar3 = e.this;
            int i10 = eVar3.f14404x + 1;
            eVar3.f14404x = i10;
            if (i10 == eVar3.f14397f * eVar3.f14395d) {
                e(null);
            }
        }

        @Override // e1.d.c
        public void c(e1.d dVar, MediaCodec.CodecException codecException) {
            e(codecException);
        }

        @Override // e1.d.c
        public void d(e1.d dVar, MediaFormat mediaFormat) {
            if (this.f14419a) {
                return;
            }
            if (e.this.f14403w != null) {
                e(new IllegalStateException("Output format changed after muxer started"));
                return;
            }
            try {
                e.this.f14395d = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
            } catch (ClassCastException | NullPointerException unused) {
                e.this.f14395d = 1;
            }
            e eVar = e.this;
            eVar.f14403w = new int[eVar.f14397f];
            if (eVar.f14396e > 0) {
                Log.d("HeifWriter", "setting rotation: " + e.this.f14396e);
                e eVar2 = e.this;
                eVar2.f14400t.setOrientationHint(eVar2.f14396e);
            }
            int i10 = 0;
            while (true) {
                e eVar3 = e.this;
                if (i10 >= eVar3.f14403w.length) {
                    eVar3.f14400t.start();
                    e.this.f14402v.set(true);
                    e.this.i();
                    return;
                } else {
                    mediaFormat.setInteger("is-default", i10 == eVar3.f14398r ? 1 : 0);
                    e eVar4 = e.this;
                    eVar4.f14403w[i10] = eVar4.f14400t.addTrack(mediaFormat);
                    i10++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14421a;

        /* renamed from: b, reason: collision with root package name */
        private Exception f14422b;

        d() {
        }

        synchronized void a(Exception exc) {
            if (!this.f14421a) {
                this.f14421a = true;
                this.f14422b = exc;
                notifyAll();
            }
        }

        synchronized void b(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("timeoutMs is negative");
            }
            if (j10 == 0) {
                while (!this.f14421a) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                while (!this.f14421a && j10 > 0) {
                    try {
                        wait(j10);
                    } catch (InterruptedException unused2) {
                    }
                    j10 -= System.currentTimeMillis() - currentTimeMillis;
                }
            }
            if (!this.f14421a) {
                this.f14421a = true;
                this.f14422b = new TimeoutException("timed out waiting for result");
            }
            Exception exc = this.f14422b;
            if (exc != null) {
                throw exc;
            }
        }
    }

    e(String str, FileDescriptor fileDescriptor, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, Handler handler) {
        if (i15 >= i14) {
            throw new IllegalArgumentException("Invalid maxImages (" + i14 + ") or primaryIndex (" + i15 + ")");
        }
        MediaFormat.createVideoFormat("image/vnd.android.heic", i10, i11);
        this.f14395d = 1;
        this.f14396e = i12;
        this.f14392a = i16;
        this.f14397f = i14;
        this.f14398r = i15;
        Looper looper = handler != null ? handler.getLooper() : null;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
            this.f14393b = handlerThread;
            handlerThread.start();
            looper = handlerThread.getLooper();
        } else {
            this.f14393b = null;
        }
        Handler handler2 = new Handler(looper);
        this.f14394c = handler2;
        this.f14400t = str != null ? new MediaMuxer(str, 3) : new MediaMuxer(fileDescriptor, 3);
        this.f14401u = new e1.d(i10, i11, z10, i13, i16, handler2, new c());
    }

    private void b(int i10) {
        if (this.f14392a == i10) {
            return;
        }
        throw new IllegalStateException("Not valid in input mode " + this.f14392a);
    }

    private void e(boolean z10) {
        if (this.f14405y != z10) {
            throw new IllegalStateException("Already started");
        }
    }

    private void f(int i10) {
        e(true);
        b(i10);
    }

    public void a(Bitmap bitmap) {
        f(2);
        synchronized (this) {
            e1.d dVar = this.f14401u;
            if (dVar != null) {
                dVar.b(bitmap);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f14394c.postAtFrontOfQueue(new a());
    }

    void g() {
        MediaMuxer mediaMuxer = this.f14400t;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.f14400t.release();
            this.f14400t = null;
        }
        e1.d dVar = this.f14401u;
        if (dVar != null) {
            dVar.close();
            synchronized (this) {
                this.f14401u = null;
            }
        }
    }

    void i() {
        Pair<Integer, ByteBuffer> remove;
        if (!this.f14402v.get()) {
            return;
        }
        while (true) {
            synchronized (this.f14406z) {
                if (this.f14406z.isEmpty()) {
                    return;
                } else {
                    remove = this.f14406z.remove(0);
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(((ByteBuffer) remove.second).position(), ((ByteBuffer) remove.second).remaining(), 0L, 16);
            this.f14400t.writeSampleData(this.f14403w[((Integer) remove.first).intValue()], (ByteBuffer) remove.second, bufferInfo);
        }
    }

    public void j() {
        e(false);
        this.f14405y = true;
        this.f14401u.o();
    }

    public void l(long j10) {
        e(true);
        synchronized (this) {
            e1.d dVar = this.f14401u;
            if (dVar != null) {
                dVar.q();
            }
        }
        this.f14399s.b(j10);
        i();
        g();
    }
}
