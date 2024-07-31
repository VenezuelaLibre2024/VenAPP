package p112g0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.utils.C0686o;
import androidx.camera.core.impl.utils.C0689r;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import ck.C2032q;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p002a0.C0009f;
import p227m.InterfaceC9531a;
import p407w.C12015i1;
import p407w.C12029o0;
import p407w.C12048y;
import p407w.InterfaceC12047x0;
import p474z.C12747a;

/* renamed from: g0.u */
/* loaded from: classes.dex */
public class C7427u implements InterfaceC7422r0, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    private final C7388a0 f17245a;

    /* renamed from: b */
    final HandlerThread f17246b;

    /* renamed from: c */
    private final Executor f17247c;

    /* renamed from: d */
    final Handler f17248d;

    /* renamed from: e */
    private final AtomicBoolean f17249e;

    /* renamed from: f */
    private final float[] f17250f;

    /* renamed from: r */
    private final float[] f17251r;

    /* renamed from: s */
    final Map<InterfaceC12047x0, Surface> f17252s;

    /* renamed from: t */
    private int f17253t;

    /* renamed from: u */
    private boolean f17254u;

    /* renamed from: v */
    private final List<b> f17255v;

    /* renamed from: g0.u$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static InterfaceC9531a<C12048y, InterfaceC7422r0> f17256a = new InterfaceC9531a() { // from class: g0.t
            @Override // p227m.InterfaceC9531a
            public final Object apply(Object obj) {
                return new C7427u((C12048y) obj);
            }
        };

        /* renamed from: a */
        public static InterfaceC7422r0 m22407a(C12048y c12048y) {
            return f17256a.apply(c12048y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0.u$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: d */
        static C7387a m22408d(int i10, int i11, C0742c.a<Void> aVar) {
            return new C7387a(i10, i11, aVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0742c.a<Void> mo22260a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract int mo22261b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo22262c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7427u(C12048y c12048y) {
        this(c12048y, InterfaceC7394d0.f17147a);
    }

    C7427u(C12048y c12048y, InterfaceC7394d0 interfaceC7394d0) {
        this.f17249e = new AtomicBoolean(false);
        this.f17250f = new float[16];
        this.f17251r = new float[16];
        this.f17252s = new LinkedHashMap();
        this.f17253t = 0;
        this.f17254u = false;
        this.f17255v = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f17246b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f17248d = handler;
        this.f17247c = C12747a.m42284e(handler);
        this.f17245a = new C7388a0();
        try {
            m22399u(c12048y, interfaceC7394d0);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m22374A(C12015i1 c12015i1) {
        this.f17253t++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17245a.m22298v());
        surfaceTexture.setDefaultBufferSize(c12015i1.m38612k().getWidth(), c12015i1.m38612k().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        c12015i1.m38613v(surface, this.f17247c, new InterfaceC0977a() { // from class: g0.h
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C7427u.this.m22404z(surfaceTexture, surface, (C12015i1.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f17248d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m22375B(InterfaceC12047x0 interfaceC12047x0, InterfaceC12047x0.a aVar) {
        interfaceC12047x0.close();
        Surface remove = this.f17252s.remove(interfaceC12047x0);
        if (remove != null) {
            this.f17245a.m22297J(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m22376C(final InterfaceC12047x0 interfaceC12047x0) {
        Surface mo22367A0 = interfaceC12047x0.mo22367A0(this.f17247c, new InterfaceC0977a() { // from class: g0.g
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C7427u.this.m22375B(interfaceC12047x0, (InterfaceC12047x0.a) obj);
            }
        });
        this.f17245a.m22293C(mo22367A0);
        this.f17252s.put(interfaceC12047x0, mo22367A0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m22377D() {
        this.f17254u = true;
        m22394p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m22378E(b bVar) {
        this.f17255v.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ void m22379F(C0742c.a aVar) {
        aVar.m3758f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ Object m22380G(int i10, int i11, final C0742c.a aVar) {
        final C7387a m22408d = b.m22408d(i10, i11, aVar);
        m22396r(new Runnable() { // from class: g0.i
            @Override // java.lang.Runnable
            public final void run() {
                C7427u.this.m22378E(m22408d);
            }
        }, new Runnable() { // from class: g0.j
            @Override // java.lang.Runnable
            public final void run() {
                C7427u.m22379F(C0742c.a.this);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    /* renamed from: H */
    private void m22381H(C2032q<Surface, Size, float[]> c2032q) {
        if (this.f17255v.isEmpty()) {
            return;
        }
        if (c2032q == null) {
            m22397s(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f17255v.iterator();
                int i10 = -1;
                int i11 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (i10 != next.mo22262c() || bitmap == null) {
                        i10 = next.mo22262c();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = m22398t(c2032q.m10351b(), c2032q.m10352c(), i10);
                        i11 = -1;
                    }
                    if (i11 != next.mo22261b()) {
                        byteArrayOutputStream.reset();
                        i11 = next.mo22261b();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Surface m10350a = c2032q.m10350a();
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.m2880p(m10350a, bArr);
                    next.mo22260a().m3756c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            m22397s(e10);
        }
    }

    /* renamed from: p */
    private void m22394p() {
        if (this.f17254u && this.f17253t == 0) {
            Iterator<InterfaceC12047x0> it = this.f17252s.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it2 = this.f17255v.iterator();
            while (it2.hasNext()) {
                it2.next().mo22260a().m3758f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f17252s.clear();
            this.f17245a.m22294D();
            this.f17246b.quit();
        }
    }

    /* renamed from: q */
    private void m22395q(Runnable runnable) {
        m22396r(runnable, new Runnable() { // from class: g0.s
            @Override // java.lang.Runnable
            public final void run() {
                C7427u.m22400v();
            }
        });
    }

    /* renamed from: r */
    private void m22396r(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f17247c.execute(new Runnable() { // from class: g0.q
                @Override // java.lang.Runnable
                public final void run() {
                    C7427u.this.m22401w(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            C12029o0.m38649l("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    /* renamed from: s */
    private void m22397s(Throwable th2) {
        Iterator<b> it = this.f17255v.iterator();
        while (it.hasNext()) {
            it.next().mo22260a().m3758f(th2);
        }
        this.f17255v.clear();
    }

    /* renamed from: t */
    private Bitmap m22398t(Size size, float[] fArr, int i10) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        C0686o.m3337d(fArr2, 0.5f);
        C0686o.m3336c(fArr2, i10, 0.5f, 0.5f);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        return this.f17245a.m22296H(C0689r.m3353k(size, i10), fArr2);
    }

    /* renamed from: u */
    private void m22399u(final C12048y c12048y, final InterfaceC7394d0 interfaceC7394d0) {
        try {
            C0742c.m3752a(new C0742c.c() { // from class: g0.o
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m22403y;
                    m22403y = C7427u.this.m22403y(c12048y, interfaceC7394d0, aVar);
                    return m22403y;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m22400v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m22401w(Runnable runnable, Runnable runnable2) {
        if (this.f17254u) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m22402x(C12048y c12048y, InterfaceC7394d0 interfaceC7394d0, C0742c.a aVar) {
        try {
            this.f17245a.m22299w(c12048y, interfaceC7394d0);
            aVar.m3756c(null);
        } catch (RuntimeException e10) {
            aVar.m3758f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ Object m22403y(final C12048y c12048y, final InterfaceC7394d0 interfaceC7394d0, final C0742c.a aVar) {
        m22395q(new Runnable() { // from class: g0.p
            @Override // java.lang.Runnable
            public final void run() {
                C7427u.this.m22402x(c12048y, interfaceC7394d0, aVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m22404z(SurfaceTexture surfaceTexture, Surface surface, C12015i1.g gVar) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f17253t--;
        m22394p();
    }

    @Override // p407w.InterfaceC12049y0
    /* renamed from: a */
    public void mo22405a(final InterfaceC12047x0 interfaceC12047x0) {
        if (this.f17249e.get()) {
            interfaceC12047x0.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: g0.f
            @Override // java.lang.Runnable
            public final void run() {
                C7427u.this.m22376C(interfaceC12047x0);
            }
        };
        Objects.requireNonNull(interfaceC12047x0);
        m22396r(runnable, new Runnable() { // from class: g0.k
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC12047x0.this.close();
            }
        });
    }

    @Override // p407w.InterfaceC12049y0
    /* renamed from: b */
    public void mo22406b(final C12015i1 c12015i1) {
        if (this.f17249e.get()) {
            c12015i1.m38616y();
            return;
        }
        Runnable runnable = new Runnable() { // from class: g0.l
            @Override // java.lang.Runnable
            public final void run() {
                C7427u.this.m22374A(c12015i1);
            }
        };
        Objects.requireNonNull(c12015i1);
        m22396r(runnable, new Runnable() { // from class: g0.m
            @Override // java.lang.Runnable
            public final void run() {
                C12015i1.this.m38616y();
            }
        });
    }

    @Override // p112g0.InterfaceC7422r0
    /* renamed from: c */
    public InterfaceFutureC5920f<Void> mo22372c(final int i10, final int i11) {
        return C0009f.m24j(C0742c.m3752a(new C0742c.c() { // from class: g0.r
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m22380G;
                m22380G = C7427u.this.m22380G(i10, i11, aVar);
                return m22380G;
            }
        }));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f17249e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f17250f);
        C2032q<Surface, Size, float[]> c2032q = null;
        for (Map.Entry<InterfaceC12047x0, Surface> entry : this.f17252s.entrySet()) {
            Surface value = entry.getValue();
            InterfaceC12047x0 key = entry.getKey();
            key.mo22371y0(this.f17251r, this.f17250f);
            if (key.getFormat() == 34) {
                try {
                    this.f17245a.m22295G(surfaceTexture.getTimestamp(), this.f17251r, value);
                } catch (RuntimeException e10) {
                    C12029o0.m38641d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                C0984h.m4836n(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                C0984h.m4836n(c2032q == null, "Only one JPEG output is supported.");
                c2032q = new C2032q<>(value, key.mo22370p(), (float[]) this.f17251r.clone());
            }
        }
        try {
            m22381H(c2032q);
        } catch (RuntimeException e11) {
            m22397s(e11);
        }
    }

    @Override // p112g0.InterfaceC7422r0
    public void release() {
        if (this.f17249e.getAndSet(true)) {
            return;
        }
        m22395q(new Runnable() { // from class: g0.n
            @Override // java.lang.Runnable
            public final void run() {
                C7427u.this.m22377D();
            }
        });
    }
}
