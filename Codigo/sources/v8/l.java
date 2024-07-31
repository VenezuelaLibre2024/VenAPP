package v8;

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
import t8.n;
import t8.r0;
import v8.d;
import v8.m;

/* loaded from: classes.dex */
public final class l extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f28626a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f28627b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f28628c;

    /* renamed from: d, reason: collision with root package name */
    private final d f28629d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f28630e;

    /* renamed from: f, reason: collision with root package name */
    private final m f28631f;

    /* renamed from: r, reason: collision with root package name */
    private final i f28632r;

    /* renamed from: s, reason: collision with root package name */
    private SurfaceTexture f28633s;

    /* renamed from: t, reason: collision with root package name */
    private Surface f28634t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f28635u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f28636v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f28637w;

    /* loaded from: classes.dex */
    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* renamed from: a, reason: collision with root package name */
        private final i f28638a;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f28641d;

        /* renamed from: e, reason: collision with root package name */
        private final float[] f28642e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f28643f;

        /* renamed from: r, reason: collision with root package name */
        private float f28644r;

        /* renamed from: s, reason: collision with root package name */
        private float f28645s;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f28639b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        private final float[] f28640c = new float[16];

        /* renamed from: t, reason: collision with root package name */
        private final float[] f28646t = new float[16];

        /* renamed from: u, reason: collision with root package name */
        private final float[] f28647u = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f28641d = fArr;
            float[] fArr2 = new float[16];
            this.f28642e = fArr2;
            float[] fArr3 = new float[16];
            this.f28643f = fArr3;
            this.f28638a = iVar;
            n.j(fArr);
            n.j(fArr2);
            n.j(fArr3);
            this.f28645s = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f28642e, 0, -this.f28644r, (float) Math.cos(this.f28645s), (float) Math.sin(this.f28645s), 0.0f);
        }

        @Override // v8.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f28641d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f28645s = -f10;
            d();
        }

        @Override // v8.m.a
        public synchronized void b(PointF pointF) {
            this.f28644r = pointF.y;
            d();
            Matrix.setRotateM(this.f28643f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f28647u, 0, this.f28641d, 0, this.f28643f, 0);
                Matrix.multiplyMM(this.f28646t, 0, this.f28642e, 0, this.f28647u, 0);
            }
            Matrix.multiplyMM(this.f28640c, 0, this.f28639b, 0, this.f28646t, 0);
            this.f28638a.e(this.f28640c, false);
        }

        @Override // v8.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f28639b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.f(this.f28638a.f());
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void w(Surface surface);

        void x(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28626a = new CopyOnWriteArrayList<>();
        this.f28630e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) t8.a.e(context.getSystemService("sensor"));
        this.f28627b = sensorManager;
        Sensor defaultSensor = r0.f26744a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f28628c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f28632r = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f28631f = mVar;
        this.f28629d = new d(((WindowManager) t8.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f28635u = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Surface surface = this.f28634t;
        if (surface != null) {
            Iterator<b> it = this.f28626a.iterator();
            while (it.hasNext()) {
                it.next().w(surface);
            }
        }
        g(this.f28633s, surface);
        this.f28633s = null;
        this.f28634t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f28633s;
        Surface surface = this.f28634t;
        Surface surface2 = new Surface(surfaceTexture);
        this.f28633s = surfaceTexture;
        this.f28634t = surface2;
        Iterator<b> it = this.f28626a.iterator();
        while (it.hasNext()) {
            it.next().x(surface2);
        }
        g(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(final SurfaceTexture surfaceTexture) {
        this.f28630e.post(new Runnable() { // from class: v8.j
            @Override // java.lang.Runnable
            public final void run() {
                l.this.e(surfaceTexture);
            }
        });
    }

    private static void g(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void i() {
        boolean z10 = this.f28635u && this.f28636v;
        Sensor sensor = this.f28628c;
        if (sensor == null || z10 == this.f28637w) {
            return;
        }
        if (z10) {
            this.f28627b.registerListener(this.f28629d, sensor, 0);
        } else {
            this.f28627b.unregisterListener(this.f28629d);
        }
        this.f28637w = z10;
    }

    public v8.a getCameraMotionListener() {
        return this.f28632r;
    }

    public u8.k getVideoFrameMetadataListener() {
        return this.f28632r;
    }

    public Surface getVideoSurface() {
        return this.f28634t;
    }

    public void h(b bVar) {
        this.f28626a.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28630e.post(new Runnable() { // from class: v8.k
            @Override // java.lang.Runnable
            public final void run() {
                l.this.d();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f28636v = false;
        i();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f28636v = true;
        i();
    }

    public void setDefaultStereoMode(int i10) {
        this.f28632r.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f28635u = z10;
        i();
    }
}
