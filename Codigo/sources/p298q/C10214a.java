package p298q;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.InterfaceC0643l1;
import androidx.camera.core.impl.InterfaceC0649n0;
import p389v.C11600j;
import p407w.InterfaceC12050z;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C10214a extends C11600j {

    /* renamed from: H */
    public static final InterfaceC0649n0.a<Integer> f25245H = InterfaceC0649n0.a.m3199a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: I */
    public static final InterfaceC0649n0.a<Long> f25246I = InterfaceC0649n0.a.m3199a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: J */
    public static final InterfaceC0649n0.a<CameraDevice.StateCallback> f25247J = InterfaceC0649n0.a.m3199a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: K */
    public static final InterfaceC0649n0.a<CameraCaptureSession.StateCallback> f25248K = InterfaceC0649n0.a.m3199a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: L */
    public static final InterfaceC0649n0.a<CameraCaptureSession.CaptureCallback> f25249L = InterfaceC0649n0.a.m3199a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: M */
    public static final InterfaceC0649n0.a<C10216c> f25250M = InterfaceC0649n0.a.m3199a("camera2.cameraEvent.callback", C10216c.class);

    /* renamed from: N */
    public static final InterfaceC0649n0.a<Object> f25251N = InterfaceC0649n0.a.m3199a("camera2.captureRequest.tag", Object.class);

    /* renamed from: O */
    public static final InterfaceC0649n0.a<String> f25252O = InterfaceC0649n0.a.m3199a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: q.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC12050z<C10214a> {

        /* renamed from: a */
        private final C0647m1 f25253a = C0647m1.m3184a0();

        @Override // p407w.InterfaceC12050z
        /* renamed from: a */
        public InterfaceC0643l1 mo2932a() {
            return this.f25253a;
        }

        /* renamed from: c */
        public C10214a m30569c() {
            return new C10214a(C0656p1.m3211Y(this.f25253a));
        }

        /* renamed from: d */
        public a m30570d(InterfaceC0649n0 interfaceC0649n0) {
            for (InterfaceC0649n0.a<?> aVar : interfaceC0649n0.mo3195e()) {
                this.f25253a.mo3178r(aVar, interfaceC0649n0.mo3191a(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public <ValueT> a m30571e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f25253a.mo3178r(C10214a.m30559W(key), valuet);
            return this;
        }
    }

    public C10214a(InterfaceC0649n0 interfaceC0649n0) {
        super(interfaceC0649n0);
    }

    /* renamed from: W */
    public static InterfaceC0649n0.a<Object> m30559W(CaptureRequest.Key<?> key) {
        return InterfaceC0649n0.a.m3200b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* renamed from: X */
    public C10216c m30560X(C10216c c10216c) {
        return (C10216c) mo2589m().mo3197g(f25250M, c10216c);
    }

    /* renamed from: Y */
    public C11600j m30561Y() {
        return C11600j.a.m36367e(mo2589m()).m36369d();
    }

    /* renamed from: Z */
    public Object m30562Z(Object obj) {
        return mo2589m().mo3197g(f25251N, obj);
    }

    /* renamed from: a0 */
    public int m30563a0(int i10) {
        return ((Integer) mo2589m().mo3197g(f25245H, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: b0 */
    public CameraDevice.StateCallback m30564b0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo2589m().mo3197g(f25247J, stateCallback);
    }

    /* renamed from: c0 */
    public String m30565c0(String str) {
        return (String) mo2589m().mo3197g(f25252O, str);
    }

    /* renamed from: d0 */
    public CameraCaptureSession.CaptureCallback m30566d0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo2589m().mo3197g(f25249L, captureCallback);
    }

    /* renamed from: e0 */
    public CameraCaptureSession.StateCallback m30567e0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo2589m().mo3197g(f25248K, stateCallback);
    }

    /* renamed from: f0 */
    public long m30568f0(long j10) {
        return ((Long) mo2589m().mo3197g(f25246I, Long.valueOf(j10))).longValue();
    }
}
