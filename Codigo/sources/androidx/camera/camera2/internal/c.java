package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.internal.u3;
import androidx.concurrent.futures.c;
import q.a;
import w.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements u3.b {

    /* renamed from: a */
    private final androidx.camera.camera2.internal.compat.d0 f1825a;

    /* renamed from: b */
    private final Range<Float> f1826b;

    /* renamed from: d */
    private c.a<Void> f1828d;

    /* renamed from: c */
    private float f1827c = 1.0f;

    /* renamed from: e */
    private float f1829e = 1.0f;

    public c(androidx.camera.camera2.internal.compat.d0 d0Var) {
        CameraCharacteristics.Key key;
        this.f1825a = d0Var;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f1826b = (Range) d0Var.a(key);
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f10;
        if (this.f1828d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f10 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f10 = (Float) request.get(key);
            }
            if (f10 == null) {
                return;
            }
            if (this.f1829e == f10.floatValue()) {
                this.f1828d.c(null);
                this.f1828d = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void b(float f10, c.a<Void> aVar) {
        this.f1827c = f10;
        c.a<Void> aVar2 = this.f1828d;
        if (aVar2 != null) {
            aVar2.f(new j.a("There is a new zoomRatio being set"));
        }
        this.f1829e = this.f1827c;
        this.f1828d = aVar;
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void c(a.C0388a c0388a) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        c0388a.e(key, Float.valueOf(this.f1827c));
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public float d() {
        return this.f1826b.getLower().floatValue();
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void e() {
        this.f1827c = 1.0f;
        c.a<Void> aVar = this.f1828d;
        if (aVar != null) {
            aVar.f(new j.a("Camera is not active."));
            this.f1828d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public float f() {
        return this.f1826b.getUpper().floatValue();
    }
}
