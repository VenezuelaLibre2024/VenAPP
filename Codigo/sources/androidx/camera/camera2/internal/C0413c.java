package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.internal.C0561u3;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.concurrent.futures.C0742c;
import p298q.C10214a;
import p407w.InterfaceC12016j;

/* renamed from: androidx.camera.camera2.internal.c */
/* loaded from: classes.dex */
final class C0413c implements C0561u3.b {

    /* renamed from: a */
    private final C0427d0 f2128a;

    /* renamed from: b */
    private final Range<Float> f2129b;

    /* renamed from: d */
    private C0742c.a<Void> f2131d;

    /* renamed from: c */
    private float f2130c = 1.0f;

    /* renamed from: e */
    private float f2132e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0413c(C0427d0 c0427d0) {
        CameraCharacteristics.Key key;
        this.f2128a = c0427d0;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f2129b = (Range) c0427d0.m2215a(key);
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: a */
    public void mo2186a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f10;
        if (this.f2131d != null) {
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
            if (this.f2132e == f10.floatValue()) {
                this.f2131d.m3756c(null);
                this.f2131d = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: b */
    public void mo2187b(float f10, C0742c.a<Void> aVar) {
        this.f2130c = f10;
        C0742c.a<Void> aVar2 = this.f2131d;
        if (aVar2 != null) {
            aVar2.m3758f(new InterfaceC12016j.a("There is a new zoomRatio being set"));
        }
        this.f2132e = this.f2130c;
        this.f2131d = aVar;
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: c */
    public void mo2188c(C10214a.a aVar) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        aVar.m30571e(key, Float.valueOf(this.f2130c));
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: d */
    public float mo2189d() {
        return this.f2129b.getLower().floatValue();
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: e */
    public void mo2190e() {
        this.f2130c = 1.0f;
        C0742c.a<Void> aVar = this.f2131d;
        if (aVar != null) {
            aVar.m3758f(new InterfaceC12016j.a("Camera is not active."));
            this.f2131d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.C0561u3.b
    /* renamed from: f */
    public float mo2191f() {
        return this.f2129b.getUpper().floatValue();
    }
}
