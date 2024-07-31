package p072e1;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p072e1.C7094d;

/* renamed from: e1.e */
/* loaded from: classes.dex */
public final class C7095e implements AutoCloseable {

    /* renamed from: a */
    private final int f15764a;

    /* renamed from: b */
    private final HandlerThread f15765b;

    /* renamed from: c */
    private final Handler f15766c;

    /* renamed from: d */
    int f15767d;

    /* renamed from: e */
    final int f15768e;

    /* renamed from: f */
    final int f15769f;

    /* renamed from: r */
    final int f15770r;

    /* renamed from: t */
    MediaMuxer f15772t;

    /* renamed from: u */
    private C7094d f15773u;

    /* renamed from: w */
    int[] f15775w;

    /* renamed from: x */
    int f15776x;

    /* renamed from: y */
    private boolean f15777y;

    /* renamed from: s */
    final d f15771s = new d();

    /* renamed from: v */
    final AtomicBoolean f15774v = new AtomicBoolean(false);

    /* renamed from: z */
    private final List<Pair<Integer, ByteBuffer>> f15778z = new ArrayList();

    /* renamed from: e1.e$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C7095e.this.m20906g();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e1.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f15780a;

        /* renamed from: b */
        private final FileDescriptor f15781b;

        /* renamed from: c */
        private final int f15782c;

        /* renamed from: d */
        private final int f15783d;

        /* renamed from: e */
        private final int f15784e;

        /* renamed from: f */
        private boolean f15785f;

        /* renamed from: g */
        private int f15786g;

        /* renamed from: h */
        private int f15787h;

        /* renamed from: i */
        private int f15788i;

        /* renamed from: j */
        private int f15789j;

        /* renamed from: k */
        private Handler f15790k;

        public b(String str, int i10, int i11, int i12) {
            this(str, null, i10, i11, i12);
        }

        private b(String str, FileDescriptor fileDescriptor, int i10, int i11, int i12) {
            this.f15785f = true;
            this.f15786g = 100;
            this.f15787h = 1;
            this.f15788i = 0;
            this.f15789j = 0;
            if (i10 <= 0 || i11 <= 0) {
                throw new IllegalArgumentException("Invalid image size: " + i10 + "x" + i11);
            }
            this.f15780a = str;
            this.f15781b = fileDescriptor;
            this.f15782c = i10;
            this.f15783d = i11;
            this.f15784e = i12;
        }

        /* renamed from: a */
        public C7095e m20910a() {
            return new C7095e(this.f15780a, this.f15781b, this.f15782c, this.f15783d, this.f15789j, this.f15785f, this.f15786g, this.f15787h, this.f15788i, this.f15784e, this.f15790k);
        }

        /* renamed from: b */
        public b m20911b(int i10) {
            if (i10 > 0) {
                this.f15787h = i10;
                return this;
            }
            throw new IllegalArgumentException("Invalid maxImage: " + i10);
        }

        /* renamed from: c */
        public b m20912c(int i10) {
            if (i10 >= 0 && i10 <= 100) {
                this.f15786g = i10;
                return this;
            }
            throw new IllegalArgumentException("Invalid quality: " + i10);
        }
    }

    /* renamed from: e1.e$c */
    /* loaded from: classes.dex */
    class c extends C7094d.c {

        /* renamed from: a */
        private boolean f15791a;

        c() {
        }

        /* renamed from: e */
        private void m20913e(Exception exc) {
            if (this.f15791a) {
                return;
            }
            this.f15791a = true;
            C7095e.this.f15771s.m20914a(exc);
        }

        @Override // p072e1.C7094d.c
        /* renamed from: a */
        public void mo20892a(C7094d c7094d) {
            m20913e(null);
        }

        @Override // p072e1.C7094d.c
        /* renamed from: b */
        public void mo20893b(C7094d c7094d, ByteBuffer byteBuffer) {
            if (this.f15791a) {
                return;
            }
            C7095e c7095e = C7095e.this;
            if (c7095e.f15775w == null) {
                m20913e(new IllegalStateException("Output buffer received before format info"));
                return;
            }
            if (c7095e.f15776x < c7095e.f15769f * c7095e.f15767d) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), 0L, 0);
                C7095e c7095e2 = C7095e.this;
                c7095e2.f15772t.writeSampleData(c7095e2.f15775w[c7095e2.f15776x / c7095e2.f15767d], byteBuffer, bufferInfo);
            }
            C7095e c7095e3 = C7095e.this;
            int i10 = c7095e3.f15776x + 1;
            c7095e3.f15776x = i10;
            if (i10 == c7095e3.f15769f * c7095e3.f15767d) {
                m20913e(null);
            }
        }

        @Override // p072e1.C7094d.c
        /* renamed from: c */
        public void mo20894c(C7094d c7094d, MediaCodec.CodecException codecException) {
            m20913e(codecException);
        }

        @Override // p072e1.C7094d.c
        /* renamed from: d */
        public void mo20895d(C7094d c7094d, MediaFormat mediaFormat) {
            if (this.f15791a) {
                return;
            }
            if (C7095e.this.f15775w != null) {
                m20913e(new IllegalStateException("Output format changed after muxer started"));
                return;
            }
            try {
                C7095e.this.f15767d = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
            } catch (ClassCastException | NullPointerException unused) {
                C7095e.this.f15767d = 1;
            }
            C7095e c7095e = C7095e.this;
            c7095e.f15775w = new int[c7095e.f15769f];
            if (c7095e.f15768e > 0) {
                Log.d("HeifWriter", "setting rotation: " + C7095e.this.f15768e);
                C7095e c7095e2 = C7095e.this;
                c7095e2.f15772t.setOrientationHint(c7095e2.f15768e);
            }
            int i10 = 0;
            while (true) {
                C7095e c7095e3 = C7095e.this;
                if (i10 >= c7095e3.f15775w.length) {
                    c7095e3.f15772t.start();
                    C7095e.this.f15774v.set(true);
                    C7095e.this.m20907i();
                    return;
                } else {
                    mediaFormat.setInteger("is-default", i10 == c7095e3.f15770r ? 1 : 0);
                    C7095e c7095e4 = C7095e.this;
                    c7095e4.f15775w[i10] = c7095e4.f15772t.addTrack(mediaFormat);
                    i10++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1.e$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private boolean f15793a;

        /* renamed from: b */
        private Exception f15794b;

        d() {
        }

        /* renamed from: a */
        synchronized void m20914a(Exception exc) {
            if (!this.f15793a) {
                this.f15793a = true;
                this.f15794b = exc;
                notifyAll();
            }
        }

        /* renamed from: b */
        synchronized void m20915b(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("timeoutMs is negative");
            }
            if (j10 == 0) {
                while (!this.f15793a) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                while (!this.f15793a && j10 > 0) {
                    try {
                        wait(j10);
                    } catch (InterruptedException unused2) {
                    }
                    j10 -= System.currentTimeMillis() - currentTimeMillis;
                }
            }
            if (!this.f15793a) {
                this.f15793a = true;
                this.f15794b = new TimeoutException("timed out waiting for result");
            }
            Exception exc = this.f15794b;
            if (exc != null) {
                throw exc;
            }
        }
    }

    C7095e(String str, FileDescriptor fileDescriptor, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, Handler handler) {
        if (i15 >= i14) {
            throw new IllegalArgumentException("Invalid maxImages (" + i14 + ") or primaryIndex (" + i15 + ")");
        }
        MediaFormat.createVideoFormat("image/vnd.android.heic", i10, i11);
        this.f15767d = 1;
        this.f15768e = i12;
        this.f15764a = i16;
        this.f15769f = i14;
        this.f15770r = i15;
        Looper looper = handler != null ? handler.getLooper() : null;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
            this.f15765b = handlerThread;
            handlerThread.start();
            looper = handlerThread.getLooper();
        } else {
            this.f15765b = null;
        }
        Handler handler2 = new Handler(looper);
        this.f15766c = handler2;
        this.f15772t = str != null ? new MediaMuxer(str, 3) : new MediaMuxer(fileDescriptor, 3);
        this.f15773u = new C7094d(i10, i11, z10, i13, i16, handler2, new c());
    }

    /* renamed from: b */
    private void m20902b(int i10) {
        if (this.f15764a == i10) {
            return;
        }
        throw new IllegalStateException("Not valid in input mode " + this.f15764a);
    }

    /* renamed from: e */
    private void m20903e(boolean z10) {
        if (this.f15777y != z10) {
            throw new IllegalStateException("Already started");
        }
    }

    /* renamed from: f */
    private void m20904f(int i10) {
        m20903e(true);
        m20902b(i10);
    }

    /* renamed from: a */
    public void m20905a(Bitmap bitmap) {
        m20904f(2);
        synchronized (this) {
            C7094d c7094d = this.f15773u;
            if (c7094d != null) {
                c7094d.m20887b(bitmap);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f15766c.postAtFrontOfQueue(new a());
    }

    /* renamed from: g */
    void m20906g() {
        MediaMuxer mediaMuxer = this.f15772t;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.f15772t.release();
            this.f15772t = null;
        }
        C7094d c7094d = this.f15773u;
        if (c7094d != null) {
            c7094d.close();
            synchronized (this) {
                this.f15773u = null;
            }
        }
    }

    /* renamed from: i */
    void m20907i() {
        Pair<Integer, ByteBuffer> remove;
        if (!this.f15774v.get()) {
            return;
        }
        while (true) {
            synchronized (this.f15778z) {
                if (this.f15778z.isEmpty()) {
                    return;
                } else {
                    remove = this.f15778z.remove(0);
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(((ByteBuffer) remove.second).position(), ((ByteBuffer) remove.second).remaining(), 0L, 16);
            this.f15772t.writeSampleData(this.f15775w[((Integer) remove.first).intValue()], (ByteBuffer) remove.second, bufferInfo);
        }
    }

    /* renamed from: j */
    public void m20908j() {
        m20903e(false);
        this.f15777y = true;
        this.f15773u.m20889o();
    }

    /* renamed from: l */
    public void m20909l(long j10) {
        m20903e(true);
        synchronized (this) {
            C7094d c7094d = this.f15773u;
            if (c7094d != null) {
                c7094d.m20890q();
            }
        }
        this.f15771s.m20915b(j10);
        m20907i();
        m20906g();
    }
}
