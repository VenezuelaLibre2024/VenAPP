package q;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.p1;
import v.j;
import w.z;

/* loaded from: classes.dex */
public final class a extends j {
    public static final n0.a<Integer> H = n0.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final n0.a<Long> I = n0.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);
    public static final n0.a<CameraDevice.StateCallback> J = n0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final n0.a<CameraCaptureSession.StateCallback> K = n0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final n0.a<CameraCaptureSession.CaptureCallback> L = n0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final n0.a<c> M = n0.a.a("camera2.cameraEvent.callback", c.class);
    public static final n0.a<Object> N = n0.a.a("camera2.captureRequest.tag", Object.class);
    public static final n0.a<String> O = n0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: q.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0388a implements z<a> {

        /* renamed from: a, reason: collision with root package name */
        private final m1 f23306a = m1.a0();

        @Override // w.z
        public l1 a() {
            return this.f23306a;
        }

        public a c() {
            return new a(p1.Y(this.f23306a));
        }

        public C0388a d(n0 n0Var) {
            for (n0.a<?> aVar : n0Var.e()) {
                this.f23306a.r(aVar, n0Var.a(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> C0388a e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f23306a.r(a.W(key), valuet);
            return this;
        }
    }

    public a(n0 n0Var) {
        super(n0Var);
    }

    public static n0.a<Object> W(CaptureRequest.Key<?> key) {
        return n0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public c X(c cVar) {
        return (c) m().g(M, cVar);
    }

    public j Y() {
        return j.a.e(m()).d();
    }

    public Object Z(Object obj) {
        return m().g(N, obj);
    }

    public int a0(int i10) {
        return ((Integer) m().g(H, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback b0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) m().g(J, stateCallback);
    }

    public String c0(String str) {
        return (String) m().g(O, str);
    }

    public CameraCaptureSession.CaptureCallback d0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) m().g(L, captureCallback);
    }

    public CameraCaptureSession.StateCallback e0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) m().g(K, stateCallback);
    }

    public long f0(long j10) {
        return ((Long) m().g(I, Long.valueOf(j10))).longValue();
    }
}
