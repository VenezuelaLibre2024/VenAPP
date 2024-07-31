package jh;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    private static final String f19929n = "h";

    /* renamed from: a, reason: collision with root package name */
    private Camera f19930a;

    /* renamed from: b, reason: collision with root package name */
    private Camera.CameraInfo f19931b;

    /* renamed from: c, reason: collision with root package name */
    private jh.a f19932c;

    /* renamed from: d, reason: collision with root package name */
    private ig.b f19933d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19934e;

    /* renamed from: f, reason: collision with root package name */
    private String f19935f;

    /* renamed from: h, reason: collision with root package name */
    private m f19937h;

    /* renamed from: i, reason: collision with root package name */
    private ih.p f19938i;

    /* renamed from: j, reason: collision with root package name */
    private ih.p f19939j;

    /* renamed from: l, reason: collision with root package name */
    private Context f19941l;

    /* renamed from: g, reason: collision with root package name */
    private i f19936g = new i();

    /* renamed from: k, reason: collision with root package name */
    private int f19940k = -1;

    /* renamed from: m, reason: collision with root package name */
    private final a f19942m = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class a implements Camera.PreviewCallback {

        /* renamed from: a, reason: collision with root package name */
        private p f19943a;

        /* renamed from: b, reason: collision with root package name */
        private ih.p f19944b;

        public a() {
        }

        public void a(p pVar) {
            this.f19943a = pVar;
        }

        public void b(ih.p pVar) {
            this.f19944b = pVar;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e10;
            ih.p pVar = this.f19944b;
            p pVar2 = this.f19943a;
            if (pVar == null || pVar2 == null) {
                Log.d(h.f19929n, "Got preview callback, but no handler or resolution available");
                if (pVar2 == null) {
                    return;
                } else {
                    e10 = new Exception("No resolution available");
                }
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    ih.q qVar = new ih.q(bArr, pVar.f17804a, pVar.f17805b, camera.getParameters().getPreviewFormat(), h.this.f());
                    if (h.this.f19931b.facing == 1) {
                        qVar.e(true);
                    }
                    pVar2.a(qVar);
                    return;
                } catch (RuntimeException e11) {
                    e10 = e11;
                    Log.e(h.f19929n, "Camera preview failed", e10);
                }
            }
            pVar2.b(e10);
        }
    }

    public h(Context context) {
        this.f19941l = context;
    }

    private int c() {
        int c10 = this.f19937h.c();
        int i10 = 0;
        if (c10 != 0) {
            if (c10 == 1) {
                i10 = 90;
            } else if (c10 == 2) {
                i10 = 180;
            } else if (c10 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f19931b;
        int i11 = cameraInfo.facing;
        int i12 = cameraInfo.orientation;
        int i13 = (i11 == 1 ? 360 - ((i12 + i10) % 360) : (i12 - i10) + 360) % 360;
        Log.i(f19929n, "Camera Display Orientation: " + i13);
        return i13;
    }

    private Camera.Parameters g() {
        Camera.Parameters parameters = this.f19930a.getParameters();
        String str = this.f19935f;
        if (str == null) {
            this.f19935f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    private static List<ih.p> i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new ih.p(previewSize.width, previewSize.height);
                arrayList.add(new ih.p(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new ih.p(size.width, size.height));
        }
        return arrayList;
    }

    private void n(int i10) {
        this.f19930a.setDisplayOrientation(i10);
    }

    private void p(boolean z10) {
        Camera.Parameters g10 = g();
        if (g10 == null) {
            Log.w(f19929n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f19929n;
        Log.i(str, "Initial camera parameters: " + g10.flatten());
        if (z10) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        c.g(g10, this.f19936g.a(), z10);
        if (!z10) {
            c.k(g10, false);
            if (this.f19936g.h()) {
                c.i(g10);
            }
            if (this.f19936g.e()) {
                c.c(g10);
            }
            if (this.f19936g.g()) {
                c.l(g10);
                c.h(g10);
                c.j(g10);
            }
        }
        List<ih.p> i10 = i(g10);
        if (i10.size() == 0) {
            this.f19938i = null;
        } else {
            ih.p a10 = this.f19937h.a(i10, j());
            this.f19938i = a10;
            g10.setPreviewSize(a10.f17804a, a10.f17805b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            c.e(g10);
        }
        Log.i(str, "Final camera parameters: " + g10.flatten());
        this.f19930a.setParameters(g10);
    }

    private void r() {
        try {
            int c10 = c();
            this.f19940k = c10;
            n(c10);
        } catch (Exception unused) {
            Log.w(f19929n, "Failed to set rotation.");
        }
        try {
            p(false);
        } catch (Exception unused2) {
            try {
                p(true);
            } catch (Exception unused3) {
                Log.w(f19929n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f19930a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f19939j = this.f19938i;
        } else {
            this.f19939j = new ih.p(previewSize.width, previewSize.height);
        }
        this.f19942m.b(this.f19939j);
    }

    public void d() {
        Camera camera = this.f19930a;
        if (camera != null) {
            camera.release();
            this.f19930a = null;
        }
    }

    public void e() {
        if (this.f19930a == null) {
            throw new RuntimeException("Camera not open");
        }
        r();
    }

    public int f() {
        return this.f19940k;
    }

    public ih.p h() {
        if (this.f19939j == null) {
            return null;
        }
        return j() ? this.f19939j.h() : this.f19939j;
    }

    public boolean j() {
        int i10 = this.f19940k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean k() {
        String flashMode;
        Camera.Parameters parameters = this.f19930a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void l() {
        Camera b10 = jg.a.b(this.f19936g.b());
        this.f19930a = b10;
        if (b10 == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int a10 = jg.a.a(this.f19936g.b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f19931b = cameraInfo;
        Camera.getCameraInfo(a10, cameraInfo);
    }

    public void m(p pVar) {
        Camera camera = this.f19930a;
        if (camera == null || !this.f19934e) {
            return;
        }
        this.f19942m.a(pVar);
        camera.setOneShotPreviewCallback(this.f19942m);
    }

    public void o(i iVar) {
        this.f19936g = iVar;
    }

    public void q(m mVar) {
        this.f19937h = mVar;
    }

    public void s(j jVar) {
        jVar.a(this.f19930a);
    }

    public void t(boolean z10) {
        if (this.f19930a != null) {
            try {
                if (z10 != k()) {
                    jh.a aVar = this.f19932c;
                    if (aVar != null) {
                        aVar.j();
                    }
                    Camera.Parameters parameters = this.f19930a.getParameters();
                    c.k(parameters, z10);
                    if (this.f19936g.f()) {
                        c.d(parameters, z10);
                    }
                    this.f19930a.setParameters(parameters);
                    jh.a aVar2 = this.f19932c;
                    if (aVar2 != null) {
                        aVar2.i();
                    }
                }
            } catch (RuntimeException e10) {
                Log.e(f19929n, "Failed to set torch", e10);
            }
        }
    }

    public void u() {
        Camera camera = this.f19930a;
        if (camera == null || this.f19934e) {
            return;
        }
        camera.startPreview();
        this.f19934e = true;
        this.f19932c = new jh.a(this.f19930a, this.f19936g);
        ig.b bVar = new ig.b(this.f19941l, this, this.f19936g);
        this.f19933d = bVar;
        bVar.d();
    }

    public void v() {
        jh.a aVar = this.f19932c;
        if (aVar != null) {
            aVar.j();
            this.f19932c = null;
        }
        ig.b bVar = this.f19933d;
        if (bVar != null) {
            bVar.e();
            this.f19933d = null;
        }
        Camera camera = this.f19930a;
        if (camera == null || !this.f19934e) {
            return;
        }
        camera.stopPreview();
        this.f19942m.a(null);
        this.f19934e = false;
    }
}
