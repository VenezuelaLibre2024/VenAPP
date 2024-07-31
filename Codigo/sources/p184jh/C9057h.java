package p184jh;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p162ig.C7970b;
import p163ih.C7999p;
import p163ih.C8000q;
import p183jg.C9049a;

/* renamed from: jh.h */
/* loaded from: classes3.dex */
public final class C9057h {

    /* renamed from: n */
    private static final String f21708n = "h";

    /* renamed from: a */
    private Camera f21709a;

    /* renamed from: b */
    private Camera.CameraInfo f21710b;

    /* renamed from: c */
    private C9050a f21711c;

    /* renamed from: d */
    private C7970b f21712d;

    /* renamed from: e */
    private boolean f21713e;

    /* renamed from: f */
    private String f21714f;

    /* renamed from: h */
    private C9062m f21716h;

    /* renamed from: i */
    private C7999p f21717i;

    /* renamed from: j */
    private C7999p f21718j;

    /* renamed from: l */
    private Context f21720l;

    /* renamed from: g */
    private C9058i f21715g = new C9058i();

    /* renamed from: k */
    private int f21719k = -1;

    /* renamed from: m */
    private final a f21721m = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jh.h$a */
    /* loaded from: classes3.dex */
    public final class a implements Camera.PreviewCallback {

        /* renamed from: a */
        private InterfaceC9065p f21722a;

        /* renamed from: b */
        private C7999p f21723b;

        public a() {
        }

        /* renamed from: a */
        public void m26639a(InterfaceC9065p interfaceC9065p) {
            this.f21722a = interfaceC9065p;
        }

        /* renamed from: b */
        public void m26640b(C7999p c7999p) {
            this.f21723b = c7999p;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e10;
            C7999p c7999p = this.f21723b;
            InterfaceC9065p interfaceC9065p = this.f21722a;
            if (c7999p == null || interfaceC9065p == null) {
                Log.d(C9057h.f21708n, "Got preview callback, but no handler or resolution available");
                if (interfaceC9065p == null) {
                    return;
                } else {
                    e10 = new Exception("No resolution available");
                }
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    C8000q c8000q = new C8000q(bArr, c7999p.f19467a, c7999p.f19468b, camera.getParameters().getPreviewFormat(), C9057h.this.m26627f());
                    if (C9057h.this.f21710b.facing == 1) {
                        c8000q.m24576e(true);
                    }
                    interfaceC9065p.mo24552a(c8000q);
                    return;
                } catch (RuntimeException e11) {
                    e10 = e11;
                    Log.e(C9057h.f21708n, "Camera preview failed", e10);
                }
            }
            interfaceC9065p.mo24553b(e10);
        }
    }

    public C9057h(Context context) {
        this.f21720l = context;
    }

    /* renamed from: c */
    private int m26619c() {
        int m26663c = this.f21716h.m26663c();
        int i10 = 0;
        if (m26663c != 0) {
            if (m26663c == 1) {
                i10 = 90;
            } else if (m26663c == 2) {
                i10 = 180;
            } else if (m26663c == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f21710b;
        int i11 = cameraInfo.facing;
        int i12 = cameraInfo.orientation;
        int i13 = (i11 == 1 ? 360 - ((i12 + i10) % 360) : (i12 - i10) + 360) % 360;
        Log.i(f21708n, "Camera Display Orientation: " + i13);
        return i13;
    }

    /* renamed from: g */
    private Camera.Parameters m26620g() {
        Camera.Parameters parameters = this.f21709a.getParameters();
        String str = this.f21714f;
        if (str == null) {
            this.f21714f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: i */
    private static List<C7999p> m26621i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new C7999p(previewSize.width, previewSize.height);
                arrayList.add(new C7999p(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new C7999p(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: n */
    private void m26622n(int i10) {
        this.f21709a.setDisplayOrientation(i10);
    }

    /* renamed from: p */
    private void m26623p(boolean z10) {
        Camera.Parameters m26620g = m26620g();
        if (m26620g == null) {
            Log.w(f21708n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f21708n;
        Log.i(str, "Initial camera parameters: " + m26620g.flatten());
        if (z10) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        C9052c.m26580g(m26620g, this.f21715g.m26641a(), z10);
        if (!z10) {
            C9052c.m26584k(m26620g, false);
            if (this.f21715g.m26648h()) {
                C9052c.m26582i(m26620g);
            }
            if (this.f21715g.m26645e()) {
                C9052c.m26576c(m26620g);
            }
            if (this.f21715g.m26647g()) {
                C9052c.m26585l(m26620g);
                C9052c.m26581h(m26620g);
                C9052c.m26583j(m26620g);
            }
        }
        List<C7999p> m26621i = m26621i(m26620g);
        if (m26621i.size() == 0) {
            this.f21717i = null;
        } else {
            C7999p m26661a = this.f21716h.m26661a(m26621i, m26629j());
            this.f21717i = m26661a;
            m26620g.setPreviewSize(m26661a.f19467a, m26661a.f19468b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C9052c.m26578e(m26620g);
        }
        Log.i(str, "Final camera parameters: " + m26620g.flatten());
        this.f21709a.setParameters(m26620g);
    }

    /* renamed from: r */
    private void m26624r() {
        try {
            int m26619c = m26619c();
            this.f21719k = m26619c;
            m26622n(m26619c);
        } catch (Exception unused) {
            Log.w(f21708n, "Failed to set rotation.");
        }
        try {
            m26623p(false);
        } catch (Exception unused2) {
            try {
                m26623p(true);
            } catch (Exception unused3) {
                Log.w(f21708n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f21709a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f21718j = this.f21717i;
        } else {
            this.f21718j = new C7999p(previewSize.width, previewSize.height);
        }
        this.f21721m.m26640b(this.f21718j);
    }

    /* renamed from: d */
    public void m26625d() {
        Camera camera = this.f21709a;
        if (camera != null) {
            camera.release();
            this.f21709a = null;
        }
    }

    /* renamed from: e */
    public void m26626e() {
        if (this.f21709a == null) {
            throw new RuntimeException("Camera not open");
        }
        m26624r();
    }

    /* renamed from: f */
    public int m26627f() {
        return this.f21719k;
    }

    /* renamed from: h */
    public C7999p m26628h() {
        if (this.f21718j == null) {
            return null;
        }
        return m26629j() ? this.f21718j.m24569h() : this.f21718j;
    }

    /* renamed from: j */
    public boolean m26629j() {
        int i10 = this.f21719k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* renamed from: k */
    public boolean m26630k() {
        String flashMode;
        Camera.Parameters parameters = this.f21709a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* renamed from: l */
    public void m26631l() {
        Camera m26561b = C9049a.m26561b(this.f21715g.m26642b());
        this.f21709a = m26561b;
        if (m26561b == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int m26560a = C9049a.m26560a(this.f21715g.m26642b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f21710b = cameraInfo;
        Camera.getCameraInfo(m26560a, cameraInfo);
    }

    /* renamed from: m */
    public void m26632m(InterfaceC9065p interfaceC9065p) {
        Camera camera = this.f21709a;
        if (camera == null || !this.f21713e) {
            return;
        }
        this.f21721m.m26639a(interfaceC9065p);
        camera.setOneShotPreviewCallback(this.f21721m);
    }

    /* renamed from: o */
    public void m26633o(C9058i c9058i) {
        this.f21715g = c9058i;
    }

    /* renamed from: q */
    public void m26634q(C9062m c9062m) {
        this.f21716h = c9062m;
    }

    /* renamed from: s */
    public void m26635s(C9059j c9059j) {
        c9059j.m26652a(this.f21709a);
    }

    /* renamed from: t */
    public void m26636t(boolean z10) {
        if (this.f21709a != null) {
            try {
                if (z10 != m26630k()) {
                    C9050a c9050a = this.f21711c;
                    if (c9050a != null) {
                        c9050a.m26571j();
                    }
                    Camera.Parameters parameters = this.f21709a.getParameters();
                    C9052c.m26584k(parameters, z10);
                    if (this.f21715g.m26646f()) {
                        C9052c.m26577d(parameters, z10);
                    }
                    this.f21709a.setParameters(parameters);
                    C9050a c9050a2 = this.f21711c;
                    if (c9050a2 != null) {
                        c9050a2.m26570i();
                    }
                }
            } catch (RuntimeException e10) {
                Log.e(f21708n, "Failed to set torch", e10);
            }
        }
    }

    /* renamed from: u */
    public void m26637u() {
        Camera camera = this.f21709a;
        if (camera == null || this.f21713e) {
            return;
        }
        camera.startPreview();
        this.f21713e = true;
        this.f21711c = new C9050a(this.f21709a, this.f21715g);
        C7970b c7970b = new C7970b(this.f21720l, this, this.f21715g);
        this.f21712d = c7970b;
        c7970b.m24505d();
    }

    /* renamed from: v */
    public void m26638v() {
        C9050a c9050a = this.f21711c;
        if (c9050a != null) {
            c9050a.m26571j();
            this.f21711c = null;
        }
        C7970b c7970b = this.f21712d;
        if (c7970b != null) {
            c7970b.m24506e();
            this.f21712d = null;
        }
        Camera camera = this.f21709a;
        if (camera == null || !this.f21713e) {
            return;
        }
        camera.stopPreview();
        this.f21721m.m26639a(null);
        this.f21713e = false;
    }
}
