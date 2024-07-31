package k7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import t8.r0;

/* loaded from: classes.dex */
class e {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f20406g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f20407h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f20408a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f20409b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f20410c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f20411d;

    /* renamed from: e, reason: collision with root package name */
    private final t8.g f20412e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20413f;

    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f20415a;

        /* renamed from: b, reason: collision with root package name */
        public int f20416b;

        /* renamed from: c, reason: collision with root package name */
        public int f20417c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f20418d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f20419e;

        /* renamed from: f, reason: collision with root package name */
        public int f20420f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f20415a = i10;
            this.f20416b = i11;
            this.f20417c = i12;
            this.f20419e = j10;
            this.f20420f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new t8.g());
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, t8.g gVar) {
        this.f20408a = mediaCodec;
        this.f20409b = handlerThread;
        this.f20412e = gVar;
        this.f20411d = new AtomicReference<>();
    }

    private void b() {
        this.f20412e.c();
        ((Handler) t8.a.e(this.f20410c)).obtainMessage(2).sendToTarget();
        this.f20412e.a();
    }

    private static void c(w6.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f29659f;
        cryptoInfo.numBytesOfClearData = e(cVar.f29657d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f29658e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) t8.a.e(d(cVar.f29655b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) t8.a.e(d(cVar.f29654a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f29656c;
        if (r0.f26744a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f29660g, cVar.f29661h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        b bVar;
        int i10 = message.what;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f20415a, bVar.f20416b, bVar.f20417c, bVar.f20419e, bVar.f20420f);
        } else if (i10 != 1) {
            bVar = null;
            if (i10 != 2) {
                e2.c.a(this.f20411d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f20412e.e();
            }
        } else {
            bVar = (b) message.obj;
            h(bVar.f20415a, bVar.f20416b, bVar.f20418d, bVar.f20419e, bVar.f20420f);
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f20408a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            e2.c.a(this.f20411d, null, e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f20407h) {
                this.f20408a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            e2.c.a(this.f20411d, null, e10);
        }
    }

    private void j() {
        ((Handler) t8.a.e(this.f20410c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f20406g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f20406g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f20413f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void l() {
        RuntimeException andSet = this.f20411d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) r0.j(this.f20410c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, w6.c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f20418d);
        ((Handler) r0.j(this.f20410c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f20413f) {
            i();
            this.f20409b.quit();
        }
        this.f20413f = false;
    }

    public void q() {
        if (this.f20413f) {
            return;
        }
        this.f20409b.start();
        this.f20410c = new a(this.f20409b.getLooper());
        this.f20413f = true;
    }

    public void r() {
        b();
    }
}
