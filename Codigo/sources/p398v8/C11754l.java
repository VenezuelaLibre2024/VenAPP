package p398v8;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p363t8.C11137a;
import p363t8.C11163n;
import p363t8.C11172r0;
import p378u8.InterfaceC11458k;
import p398v8.C11746d;
import p398v8.ViewOnTouchListenerC11755m;

/* renamed from: v8.l */
/* loaded from: classes.dex */
public final class C11754l extends GLSurfaceView {

    /* renamed from: a */
    private final CopyOnWriteArrayList<b> f31060a;

    /* renamed from: b */
    private final SensorManager f31061b;

    /* renamed from: c */
    private final Sensor f31062c;

    /* renamed from: d */
    private final C11746d f31063d;

    /* renamed from: e */
    private final Handler f31064e;

    /* renamed from: f */
    private final ViewOnTouchListenerC11755m f31065f;

    /* renamed from: r */
    private final C11751i f31066r;

    /* renamed from: s */
    private SurfaceTexture f31067s;

    /* renamed from: t */
    private Surface f31068t;

    /* renamed from: u */
    private boolean f31069u;

    /* renamed from: v */
    private boolean f31070v;

    /* renamed from: w */
    private boolean f31071w;

    /* renamed from: v8.l$a */
    /* loaded from: classes.dex */
    final class a implements GLSurfaceView.Renderer, ViewOnTouchListenerC11755m.a, C11746d.a {

        /* renamed from: a */
        private final C11751i f31072a;

        /* renamed from: d */
        private final float[] f31075d;

        /* renamed from: e */
        private final float[] f31076e;

        /* renamed from: f */
        private final float[] f31077f;

        /* renamed from: r */
        private float f31078r;

        /* renamed from: s */
        private float f31079s;

        /* renamed from: b */
        private final float[] f31073b = new float[16];

        /* renamed from: c */
        private final float[] f31074c = new float[16];

        /* renamed from: t */
        private final float[] f31080t = new float[16];

        /* renamed from: u */
        private final float[] f31081u = new float[16];

        public a(C11751i c11751i) {
            float[] fArr = new float[16];
            this.f31075d = fArr;
            float[] fArr2 = new float[16];
            this.f31076e = fArr2;
            float[] fArr3 = new float[16];
            this.f31077f = fArr3;
            this.f31072a = c11751i;
            C11163n.m34820j(fArr);
            C11163n.m34820j(fArr2);
            C11163n.m34820j(fArr3);
            this.f31079s = 3.1415927f;
        }

        /* renamed from: c */
        private float m37164c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        /* renamed from: d */
        private void m37165d() {
            Matrix.setRotateM(this.f31076e, 0, -this.f31078r, (float) Math.cos(this.f31079s), (float) Math.sin(this.f31079s), 0.0f);
        }

        @Override // p398v8.C11746d.a
        /* renamed from: a */
        public synchronized void mo37128a(float[] fArr, float f10) {
            float[] fArr2 = this.f31075d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f31079s = -f10;
            m37165d();
        }

        @Override // p398v8.ViewOnTouchListenerC11755m.a
        /* renamed from: b */
        public synchronized void mo37166b(PointF pointF) {
            this.f31078r = pointF.y;
            m37165d();
            Matrix.setRotateM(this.f31077f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f31081u, 0, this.f31075d, 0, this.f31077f, 0);
                Matrix.multiplyMM(this.f31080t, 0, this.f31076e, 0, this.f31081u, 0);
            }
            Matrix.multiplyMM(this.f31074c, 0, this.f31073b, 0, this.f31080t, 0);
            this.f31072a.m37152e(this.f31074c, false);
        }

        @Override // p398v8.ViewOnTouchListenerC11755m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return C11754l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f31073b, 0, m37164c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C11754l.this.m37160f(this.f31072a.m37153f());
        }
    }

    /* renamed from: v8.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: w */
        void mo33986w(Surface surface);

        /* renamed from: x */
        void mo33987x(Surface surface);
    }

    public C11754l(Context context) {
        this(context, null);
    }

    public C11754l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31060a = new CopyOnWriteArrayList<>();
        this.f31064e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C11137a.m34603e(context.getSystemService("sensor"));
        this.f31061b = sensorManager;
        Sensor defaultSensor = C11172r0.f29040a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f31062c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C11751i c11751i = new C11751i();
        this.f31066r = c11751i;
        a aVar = new a(c11751i);
        ViewOnTouchListenerC11755m viewOnTouchListenerC11755m = new ViewOnTouchListenerC11755m(context, aVar, 25.0f);
        this.f31065f = viewOnTouchListenerC11755m;
        this.f31063d = new C11746d(((WindowManager) C11137a.m34603e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), viewOnTouchListenerC11755m, aVar);
        this.f31069u = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(viewOnTouchListenerC11755m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m37158d() {
        Surface surface = this.f31068t;
        if (surface != null) {
            Iterator<b> it = this.f31060a.iterator();
            while (it.hasNext()) {
                it.next().mo33986w(surface);
            }
        }
        m37161g(this.f31067s, surface);
        this.f31067s = null;
        this.f31068t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m37159e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f31067s;
        Surface surface = this.f31068t;
        Surface surface2 = new Surface(surfaceTexture);
        this.f31067s = surfaceTexture;
        this.f31068t = surface2;
        Iterator<b> it = this.f31060a.iterator();
        while (it.hasNext()) {
            it.next().mo33987x(surface2);
        }
        m37161g(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m37160f(final SurfaceTexture surfaceTexture) {
        this.f31064e.post(new Runnable() { // from class: v8.j
            @Override // java.lang.Runnable
            public final void run() {
                C11754l.this.m37159e(surfaceTexture);
            }
        });
    }

    /* renamed from: g */
    private static void m37161g(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: i */
    private void m37162i() {
        boolean z10 = this.f31069u && this.f31070v;
        Sensor sensor = this.f31062c;
        if (sensor == null || z10 == this.f31071w) {
            return;
        }
        if (z10) {
            this.f31061b.registerListener(this.f31063d, sensor, 0);
        } else {
            this.f31061b.unregisterListener(this.f31063d);
        }
        this.f31071w = z10;
    }

    public InterfaceC11743a getCameraMotionListener() {
        return this.f31066r;
    }

    public InterfaceC11458k getVideoFrameMetadataListener() {
        return this.f31066r;
    }

    public Surface getVideoSurface() {
        return this.f31068t;
    }

    /* renamed from: h */
    public void m37163h(b bVar) {
        this.f31060a.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31064e.post(new Runnable() { // from class: v8.k
            @Override // java.lang.Runnable
            public final void run() {
                C11754l.this.m37158d();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f31070v = false;
        m37162i();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f31070v = true;
        m37162i();
    }

    public void setDefaultStereoMode(int i10) {
        this.f31066r.m37154h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f31069u = z10;
        m37162i();
    }
}
