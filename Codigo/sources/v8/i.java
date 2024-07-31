package v8;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import t6.u1;
import t8.m0;
import t8.n;
import t8.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i implements u8.k, a {

    /* renamed from: t, reason: collision with root package name */
    private int f28618t;

    /* renamed from: u, reason: collision with root package name */
    private SurfaceTexture f28619u;

    /* renamed from: x, reason: collision with root package name */
    private byte[] f28622x;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f28610a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f28611b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private final g f28612c = new g();

    /* renamed from: d, reason: collision with root package name */
    private final c f28613d = new c();

    /* renamed from: e, reason: collision with root package name */
    private final m0<Long> f28614e = new m0<>();

    /* renamed from: f, reason: collision with root package name */
    private final m0<e> f28615f = new m0<>();

    /* renamed from: r, reason: collision with root package name */
    private final float[] f28616r = new float[16];

    /* renamed from: s, reason: collision with root package name */
    private final float[] f28617s = new float[16];

    /* renamed from: v, reason: collision with root package name */
    private volatile int f28620v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f28621w = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f28610a.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f28622x;
        int i11 = this.f28621w;
        this.f28622x = bArr;
        if (i10 == -1) {
            i10 = this.f28620v;
        }
        this.f28621w = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f28622x)) {
            return;
        }
        byte[] bArr3 = this.f28622x;
        e a10 = bArr3 != null ? f.a(bArr3, this.f28621w) : null;
        if (a10 == null || !g.c(a10)) {
            a10 = e.b(this.f28621w);
        }
        this.f28615f.a(j10, a10);
    }

    @Override // u8.k
    public void a(long j10, long j11, u1 u1Var, MediaFormat mediaFormat) {
        this.f28614e.a(j11, Long.valueOf(j10));
        i(u1Var.G, u1Var.H, j11);
    }

    @Override // v8.a
    public void b(long j10, float[] fArr) {
        this.f28613d.e(j10, fArr);
    }

    @Override // v8.a
    public void c() {
        this.f28614e.c();
        this.f28613d.d();
        this.f28611b.set(true);
    }

    public void e(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            n.b();
        } catch (n.a e10) {
            s.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f28610a.compareAndSet(true, false)) {
            ((SurfaceTexture) t8.a.e(this.f28619u)).updateTexImage();
            try {
                n.b();
            } catch (n.a e11) {
                s.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f28611b.compareAndSet(true, false)) {
                n.j(this.f28616r);
            }
            long timestamp = this.f28619u.getTimestamp();
            Long g10 = this.f28614e.g(timestamp);
            if (g10 != null) {
                this.f28613d.c(this.f28616r, g10.longValue());
            }
            e j10 = this.f28615f.j(timestamp);
            if (j10 != null) {
                this.f28612c.d(j10);
            }
        }
        Matrix.multiplyMM(this.f28617s, 0, fArr, 0, this.f28616r, 0);
        this.f28612c.a(this.f28618t, this.f28617s, z10);
    }

    public SurfaceTexture f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            n.b();
            this.f28612c.b();
            n.b();
            this.f28618t = n.f();
        } catch (n.a e10) {
            s.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28618t);
        this.f28619u = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: v8.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.g(surfaceTexture2);
            }
        });
        return this.f28619u;
    }

    public void h(int i10) {
        this.f28620v = i10;
    }
}
