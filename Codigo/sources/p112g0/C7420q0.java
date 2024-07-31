package p112g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.utils.C0686o;
import androidx.camera.core.impl.utils.C0689r;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p407w.C12029o0;
import p407w.InterfaceC12047x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g0.q0 */
/* loaded from: classes.dex */
public final class C7420q0 implements InterfaceC12047x0 {

    /* renamed from: A */
    private final InterfaceFutureC5920f<Void> f17219A;

    /* renamed from: B */
    private C0742c.a<Void> f17220B;

    /* renamed from: C */
    private InterfaceC0606c0 f17221C;

    /* renamed from: D */
    private Matrix f17222D;

    /* renamed from: b */
    private final Surface f17224b;

    /* renamed from: c */
    private final int f17225c;

    /* renamed from: d */
    private final int f17226d;

    /* renamed from: e */
    private final Size f17227e;

    /* renamed from: f */
    private final Size f17228f;

    /* renamed from: r */
    private final Rect f17229r;

    /* renamed from: s */
    private final int f17230s;

    /* renamed from: t */
    private final boolean f17231t;

    /* renamed from: w */
    private InterfaceC0977a<InterfaceC12047x0.a> f17234w;

    /* renamed from: x */
    private Executor f17235x;

    /* renamed from: a */
    private final Object f17223a = new Object();

    /* renamed from: u */
    private final float[] f17232u = new float[16];

    /* renamed from: v */
    private final float[] f17233v = new float[16];

    /* renamed from: y */
    private boolean f17236y = false;

    /* renamed from: z */
    private boolean f17237z = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7420q0(Surface surface, int i10, int i11, Size size, Size size2, Rect rect, int i12, boolean z10, InterfaceC0606c0 interfaceC0606c0, Matrix matrix) {
        this.f17224b = surface;
        this.f17225c = i10;
        this.f17226d = i11;
        this.f17227e = size;
        this.f17228f = size2;
        this.f17229r = new Rect(rect);
        this.f17231t = z10;
        this.f17230s = i12;
        this.f17221C = interfaceC0606c0;
        this.f17222D = matrix;
        m22363e();
        this.f17219A = C0742c.m3752a(new C0742c.c() { // from class: g0.o0
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m22365i;
                m22365i = C7420q0.this.m22365i(aVar);
                return m22365i;
            }
        });
    }

    /* renamed from: e */
    private void m22363e() {
        android.opengl.Matrix.setIdentityM(this.f17232u, 0);
        C0686o.m3337d(this.f17232u, 0.5f);
        C0686o.m3336c(this.f17232u, this.f17230s, 0.5f, 0.5f);
        if (this.f17231t) {
            android.opengl.Matrix.translateM(this.f17232u, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(this.f17232u, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix m3345c = C0689r.m3345c(C0689r.m3356n(this.f17228f), C0689r.m3356n(C0689r.m3353k(this.f17228f, this.f17230s)), this.f17230s, this.f17231t);
        RectF rectF = new RectF(this.f17229r);
        m3345c.mapRect(rectF);
        float width = rectF.left / r0.getWidth();
        float height = ((r0.getHeight() - rectF.height()) - rectF.top) / r0.getHeight();
        float width2 = rectF.width() / r0.getWidth();
        float height2 = rectF.height() / r0.getHeight();
        android.opengl.Matrix.translateM(this.f17232u, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(this.f17232u, 0, width2, height2, 1.0f);
        m22364f();
        float[] fArr = this.f17232u;
        android.opengl.Matrix.multiplyMM(fArr, 0, this.f17233v, 0, fArr, 0);
    }

    /* renamed from: f */
    private void m22364f() {
        android.opengl.Matrix.setIdentityM(this.f17233v, 0);
        C0686o.m3337d(this.f17233v, 0.5f);
        InterfaceC0606c0 interfaceC0606c0 = this.f17221C;
        if (interfaceC0606c0 != null) {
            C0984h.m4836n(interfaceC0606c0.mo3001m(), "Camera has no transform.");
            C0686o.m3336c(this.f17233v, this.f17221C.mo2999b().mo2558a(), 0.5f, 0.5f);
            if (this.f17221C.m3000j()) {
                android.opengl.Matrix.translateM(this.f17233v, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(this.f17233v, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        float[] fArr = this.f17233v;
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m22365i(C0742c.a aVar) {
        this.f17220B = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m22366j(AtomicReference atomicReference) {
        ((InterfaceC0977a) atomicReference.get()).accept(InterfaceC12047x0.a.m38698c(0, this));
    }

    @Override // p407w.InterfaceC12047x0
    /* renamed from: A0 */
    public Surface mo22367A0(Executor executor, InterfaceC0977a<InterfaceC12047x0.a> interfaceC0977a) {
        boolean z10;
        synchronized (this.f17223a) {
            this.f17235x = executor;
            this.f17234w = interfaceC0977a;
            z10 = this.f17236y;
        }
        if (z10) {
            m22369l();
        }
        return this.f17224b;
    }

    @Override // p407w.InterfaceC12047x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f17223a) {
            if (!this.f17237z) {
                this.f17237z = true;
            }
        }
        this.f17220B.m3756c(null);
    }

    /* renamed from: g */
    public InterfaceFutureC5920f<Void> m22368g() {
        return this.f17219A;
    }

    @Override // p407w.InterfaceC12047x0
    public int getFormat() {
        return this.f17226d;
    }

    /* renamed from: l */
    public void m22369l() {
        Executor executor;
        InterfaceC0977a<InterfaceC12047x0.a> interfaceC0977a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f17223a) {
            if (this.f17235x != null && (interfaceC0977a = this.f17234w) != null) {
                if (!this.f17237z) {
                    atomicReference.set(interfaceC0977a);
                    executor = this.f17235x;
                    this.f17236y = false;
                }
                executor = null;
            }
            this.f17236y = true;
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: g0.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7420q0.this.m22366j(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                C12029o0.m38639b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // p407w.InterfaceC12047x0
    /* renamed from: p */
    public Size mo22370p() {
        return this.f17227e;
    }

    @Override // p407w.InterfaceC12047x0
    /* renamed from: y0 */
    public void mo22371y0(float[] fArr, float[] fArr2) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f17232u, 0);
    }
}
