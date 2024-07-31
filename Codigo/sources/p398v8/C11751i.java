package p398v8;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11162m0;
import p363t8.C11163n;
import p363t8.C11173s;
import p378u8.InterfaceC11458k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v8.i */
/* loaded from: classes.dex */
public final class C11751i implements InterfaceC11458k, InterfaceC11743a {

    /* renamed from: t */
    private int f31052t;

    /* renamed from: u */
    private SurfaceTexture f31053u;

    /* renamed from: x */
    private byte[] f31056x;

    /* renamed from: a */
    private final AtomicBoolean f31044a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f31045b = new AtomicBoolean(true);

    /* renamed from: c */
    private final C11749g f31046c = new C11749g();

    /* renamed from: d */
    private final C11745c f31047d = new C11745c();

    /* renamed from: e */
    private final C11162m0<Long> f31048e = new C11162m0<>();

    /* renamed from: f */
    private final C11162m0<C11747e> f31049f = new C11162m0<>();

    /* renamed from: r */
    private final float[] f31050r = new float[16];

    /* renamed from: s */
    private final float[] f31051s = new float[16];

    /* renamed from: v */
    private volatile int f31054v = 0;

    /* renamed from: w */
    private int f31055w = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m37150g(SurfaceTexture surfaceTexture) {
        this.f31044a.set(true);
    }

    /* renamed from: i */
    private void m37151i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f31056x;
        int i11 = this.f31055w;
        this.f31056x = bArr;
        if (i10 == -1) {
            i10 = this.f31054v;
        }
        this.f31055w = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f31056x)) {
            return;
        }
        byte[] bArr3 = this.f31056x;
        C11747e m37134a = bArr3 != null ? C11748f.m37134a(bArr3, this.f31055w) : null;
        if (m37134a == null || !C11749g.m37141c(m37134a)) {
            m37134a = C11747e.m37130b(this.f31055w);
        }
        this.f31049f.m34805a(j10, m37134a);
    }

    @Override // p378u8.InterfaceC11458k
    /* renamed from: a */
    public void mo33989a(long j10, long j11, C11108u1 c11108u1, MediaFormat mediaFormat) {
        this.f31048e.m34805a(j11, Long.valueOf(j10));
        m37151i(c11108u1.f28773G, c11108u1.f28774H, j11);
    }

    @Override // p398v8.InterfaceC11743a
    /* renamed from: b */
    public void mo33990b(long j10, float[] fArr) {
        this.f31047d.m37122e(j10, fArr);
    }

    @Override // p398v8.InterfaceC11743a
    /* renamed from: c */
    public void mo33991c() {
        this.f31048e.m34806c();
        this.f31047d.m37121d();
        this.f31045b.set(true);
    }

    /* renamed from: e */
    public void m37152e(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            C11163n.m34812b();
        } catch (C11163n.a e10) {
            C11173s.m34965d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f31044a.compareAndSet(true, false)) {
            ((SurfaceTexture) C11137a.m34603e(this.f31053u)).updateTexImage();
            try {
                C11163n.m34812b();
            } catch (C11163n.a e11) {
                C11173s.m34965d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f31045b.compareAndSet(true, false)) {
                C11163n.m34820j(this.f31050r);
            }
            long timestamp = this.f31053u.getTimestamp();
            Long m34807g = this.f31048e.m34807g(timestamp);
            if (m34807g != null) {
                this.f31047d.m37120c(this.f31050r, m34807g.longValue());
            }
            C11747e m34809j = this.f31049f.m34809j(timestamp);
            if (m34809j != null) {
                this.f31046c.m37144d(m34809j);
            }
        }
        Matrix.multiplyMM(this.f31051s, 0, fArr, 0, this.f31050r, 0);
        this.f31046c.m37142a(this.f31052t, this.f31051s, z10);
    }

    /* renamed from: f */
    public SurfaceTexture m37153f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C11163n.m34812b();
            this.f31046c.m37143b();
            C11163n.m34812b();
            this.f31052t = C11163n.m34816f();
        } catch (C11163n.a e10) {
            C11173s.m34965d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f31052t);
        this.f31053u = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: v8.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C11751i.this.m37150g(surfaceTexture2);
            }
        });
        return this.f31053u;
    }

    /* renamed from: h */
    public void m37154h(int i10) {
        this.f31054v = i10;
    }
}
