package p197k7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p363t8.C11137a;
import p363t8.C11149g;
import p363t8.C11172r0;
import p414w6.C12078c;

/* renamed from: k7.e */
/* loaded from: classes.dex */
class C9183e {

    /* renamed from: g */
    private static final ArrayDeque<b> f22188g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f22189h = new Object();

    /* renamed from: a */
    private final MediaCodec f22190a;

    /* renamed from: b */
    private final HandlerThread f22191b;

    /* renamed from: c */
    private Handler f22192c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f22193d;

    /* renamed from: e */
    private final C11149g f22194e;

    /* renamed from: f */
    private boolean f22195f;

    /* renamed from: k7.e$a */
    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C9183e.this.m27210f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f22197a;

        /* renamed from: b */
        public int f22198b;

        /* renamed from: c */
        public int f22199c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f22200d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f22201e;

        /* renamed from: f */
        public int f22202f;

        b() {
        }

        /* renamed from: a */
        public void m27223a(int i10, int i11, int i12, long j10, int i13) {
            this.f22197a = i10;
            this.f22198b = i11;
            this.f22199c = i12;
            this.f22201e = j10;
            this.f22202f = i13;
        }
    }

    public C9183e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C11149g());
    }

    C9183e(MediaCodec mediaCodec, HandlerThread handlerThread, C11149g c11149g) {
        this.f22190a = mediaCodec;
        this.f22191b = handlerThread;
        this.f22194e = c11149g;
        this.f22193d = new AtomicReference<>();
    }

    /* renamed from: b */
    private void m27206b() {
        this.f22194e.m34719c();
        ((Handler) C11137a.m34603e(this.f22192c)).obtainMessage(2).sendToTarget();
        this.f22194e.m34717a();
    }

    /* renamed from: c */
    private static void m27207c(C12078c c12078c, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c12078c.f32122f;
        cryptoInfo.numBytesOfClearData = m27209e(c12078c.f32120d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m27209e(c12078c.f32121e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C11137a.m34603e(m27208d(c12078c.f32118b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C11137a.m34603e(m27208d(c12078c.f32117a, cryptoInfo.iv));
        cryptoInfo.mode = c12078c.f32119c;
        if (C11172r0.f29040a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c12078c.f32123g, c12078c.f32124h));
        }
    }

    /* renamed from: d */
    private static byte[] m27208d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    private static int[] m27209e(int[] iArr, int[] iArr2) {
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
    /* renamed from: f */
    public void m27210f(Message message) {
        b bVar;
        int i10 = message.what;
        if (i10 == 0) {
            bVar = (b) message.obj;
            m27211g(bVar.f22197a, bVar.f22198b, bVar.f22199c, bVar.f22201e, bVar.f22202f);
        } else if (i10 != 1) {
            bVar = null;
            if (i10 != 2) {
                C7099c.m20926a(this.f22193d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f22194e.m34721e();
            }
        } else {
            bVar = (b) message.obj;
            m27212h(bVar.f22197a, bVar.f22198b, bVar.f22200d, bVar.f22201e, bVar.f22202f);
        }
        if (bVar != null) {
            m27215o(bVar);
        }
    }

    /* renamed from: g */
    private void m27211g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f22190a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            C7099c.m20926a(this.f22193d, null, e10);
        }
    }

    /* renamed from: h */
    private void m27212h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f22189h) {
                this.f22190a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            C7099c.m20926a(this.f22193d, null, e10);
        }
    }

    /* renamed from: j */
    private void m27213j() {
        ((Handler) C11137a.m34603e(this.f22192c)).removeCallbacksAndMessages(null);
        m27206b();
    }

    /* renamed from: k */
    private static b m27214k() {
        ArrayDeque<b> arrayDeque = f22188g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: o */
    private static void m27215o(b bVar) {
        ArrayDeque<b> arrayDeque = f22188g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    /* renamed from: i */
    public void m27216i() {
        if (this.f22195f) {
            try {
                m27213j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: l */
    public void m27217l() {
        RuntimeException andSet = this.f22193d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: m */
    public void m27218m(int i10, int i11, int i12, long j10, int i13) {
        m27217l();
        b m27214k = m27214k();
        m27214k.m27223a(i10, i11, i12, j10, i13);
        ((Handler) C11172r0.m34928j(this.f22192c)).obtainMessage(0, m27214k).sendToTarget();
    }

    /* renamed from: n */
    public void m27219n(int i10, int i11, C12078c c12078c, long j10, int i12) {
        m27217l();
        b m27214k = m27214k();
        m27214k.m27223a(i10, i11, 0, j10, i12);
        m27207c(c12078c, m27214k.f22200d);
        ((Handler) C11172r0.m34928j(this.f22192c)).obtainMessage(1, m27214k).sendToTarget();
    }

    /* renamed from: p */
    public void m27220p() {
        if (this.f22195f) {
            m27216i();
            this.f22191b.quit();
        }
        this.f22195f = false;
    }

    /* renamed from: q */
    public void m27221q() {
        if (this.f22195f) {
            return;
        }
        this.f22191b.start();
        this.f22192c = new a(this.f22191b.getLooper());
        this.f22195f = true;
    }

    /* renamed from: r */
    public void m27222r() {
        m27206b();
    }
}
