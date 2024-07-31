package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0561u3;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import p298q.C10214a;
import p407w.InterfaceC12016j;

/* renamed from: androidx.camera.camera2.internal.b2 */
/* loaded from: classes.dex */
final class C0410b2 implements C0561u3.b {

    /* renamed from: a */
    private final C0427d0 f2123a;

    /* renamed from: c */
    private C0742c.a<Void> f2125c;

    /* renamed from: b */
    private Rect f2124b = null;

    /* renamed from: d */
    private Rect f2126d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0410b2(C0427d0 c0427d0) {
        this.f2123a = c0427d0;
    }

    /* renamed from: g */
    private static Rect m2184g(Rect rect, float f10) {
        float width = rect.width() / f10;
        float height = rect.height() / f10;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    /* renamed from: h */
    private Rect m2185h() {
        return (Rect) C0984h.m4833k((Rect) this.f2123a.m2215a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: a */
    public void mo2186a(TotalCaptureResult totalCaptureResult) {
        if (this.f2125c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f2126d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f2125c.m3756c(null);
            this.f2125c = null;
            this.f2126d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: b */
    public void mo2187b(float f10, C0742c.a<Void> aVar) {
        this.f2124b = m2184g(m2185h(), f10);
        C0742c.a<Void> aVar2 = this.f2125c;
        if (aVar2 != null) {
            aVar2.m3758f(new InterfaceC12016j.a("There is a new zoomRatio being set"));
        }
        this.f2126d = this.f2124b;
        this.f2125c = aVar;
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: c */
    public void mo2188c(C10214a.a aVar) {
        Rect rect = this.f2124b;
        if (rect != null) {
            aVar.m30571e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: d */
    public float mo2189d() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: e */
    public void mo2190e() {
        this.f2126d = null;
        this.f2124b = null;
        C0742c.a<Void> aVar = this.f2125c;
        if (aVar != null) {
            aVar.m3758f(new InterfaceC12016j.a("Camera is not active."));
            this.f2125c = null;
        }
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: f */
    public float mo2191f() {
        Float f10 = (Float) this.f2123a.m2215a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < mo2189d() ? mo2189d() : f10.floatValue();
    }
}
