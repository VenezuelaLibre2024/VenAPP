package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.u3;
import androidx.concurrent.futures.c;
import q.a;
import w.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b2 implements u3.b {

    /* renamed from: a */
    private final androidx.camera.camera2.internal.compat.d0 f1820a;

    /* renamed from: c */
    private c.a<Void> f1822c;

    /* renamed from: b */
    private Rect f1821b = null;

    /* renamed from: d */
    private Rect f1823d = null;

    public b2(androidx.camera.camera2.internal.compat.d0 d0Var) {
        this.f1820a = d0Var;
    }

    private static Rect g(Rect rect, float f10) {
        float width = rect.width() / f10;
        float height = rect.height() / f10;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    private Rect h() {
        return (Rect) androidx.core.util.h.k((Rect) this.f1820a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f1822c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f1823d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f1822c.c(null);
            this.f1822c = null;
            this.f1823d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void b(float f10, c.a<Void> aVar) {
        this.f1821b = g(h(), f10);
        c.a<Void> aVar2 = this.f1822c;
        if (aVar2 != null) {
            aVar2.f(new j.a("There is a new zoomRatio being set"));
        }
        this.f1823d = this.f1821b;
        this.f1822c = aVar;
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void c(a.C0388a c0388a) {
        Rect rect = this.f1821b;
        if (rect != null) {
            c0388a.e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public float d() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public void e() {
        this.f1823d = null;
        this.f1821b = null;
        c.a<Void> aVar = this.f1822c;
        if (aVar != null) {
            aVar.f(new j.a("Camera is not active."));
            this.f1822c = null;
        }
    }

    @Override // androidx.camera.camera2.internal.u3.b
    public float f() {
        Float f10 = (Float) this.f1820a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < d() ? d() : f10.floatValue();
    }
}
