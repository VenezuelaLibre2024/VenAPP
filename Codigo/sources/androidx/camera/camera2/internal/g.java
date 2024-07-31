package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.utils.j;
import java.nio.BufferUnderflowException;

/* loaded from: classes.dex */
public class g implements androidx.camera.core.impl.s {

    /* renamed from: a */
    private final androidx.camera.core.impl.f2 f1989a;

    /* renamed from: b */
    private final CaptureResult f1990b;

    public g(CaptureResult captureResult) {
        this(androidx.camera.core.impl.f2.b(), captureResult);
    }

    public g(androidx.camera.core.impl.f2 f2Var, CaptureResult captureResult) {
        this.f1989a = f2Var;
        this.f1990b = captureResult;
    }

    @Override // androidx.camera.core.impl.s
    public void a(j.b bVar) {
        super.a(bVar);
        Rect rect = (Rect) this.f1990b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.j(rect.width()).i(rect.height());
        }
        try {
            Integer num = (Integer) this.f1990b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            w.o0.k("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f1990b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f1990b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer num2 = (Integer) this.f1990b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) this.f1990b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f11 = (Float) this.f1990b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num3 = (Integer) this.f1990b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            j.c cVar = j.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = j.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.s
    public androidx.camera.core.impl.f2 b() {
        return this.f1989a;
    }

    @Override // androidx.camera.core.impl.s
    public long c() {
        Long l10 = (Long) this.f1990b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // androidx.camera.core.impl.s
    public androidx.camera.core.impl.r d() {
        Integer num = (Integer) this.f1990b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return androidx.camera.core.impl.r.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return androidx.camera.core.impl.r.NONE;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.r.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return androidx.camera.core.impl.r.FIRED;
        }
        w.o0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return androidx.camera.core.impl.r.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.s
    public CaptureResult e() {
        return this.f1990b;
    }

    @Override // androidx.camera.core.impl.s
    public androidx.camera.core.impl.p f() {
        Integer num = (Integer) this.f1990b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return androidx.camera.core.impl.p.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return androidx.camera.core.impl.p.INACTIVE;
            case 1:
            case 3:
                return androidx.camera.core.impl.p.SCANNING;
            case 2:
                return androidx.camera.core.impl.p.PASSIVE_FOCUSED;
            case 4:
                return androidx.camera.core.impl.p.LOCKED_FOCUSED;
            case 5:
                return androidx.camera.core.impl.p.LOCKED_NOT_FOCUSED;
            case 6:
                return androidx.camera.core.impl.p.PASSIVE_NOT_FOCUSED;
            default:
                w.o0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return androidx.camera.core.impl.p.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.s
    public androidx.camera.core.impl.q g() {
        Integer num = (Integer) this.f1990b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return androidx.camera.core.impl.q.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.q.INACTIVE;
        }
        if (intValue == 1) {
            return androidx.camera.core.impl.q.METERING;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.q.CONVERGED;
        }
        if (intValue == 3) {
            return androidx.camera.core.impl.q.LOCKED;
        }
        w.o0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return androidx.camera.core.impl.q.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.s
    public androidx.camera.core.impl.n h() {
        Integer num = (Integer) this.f1990b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return androidx.camera.core.impl.n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.n.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return androidx.camera.core.impl.n.CONVERGED;
            }
            if (intValue == 3) {
                return androidx.camera.core.impl.n.LOCKED;
            }
            if (intValue == 4) {
                return androidx.camera.core.impl.n.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                w.o0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return androidx.camera.core.impl.n.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.n.SEARCHING;
    }

    public androidx.camera.core.impl.o i() {
        Integer num = (Integer) this.f1990b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return androidx.camera.core.impl.o.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return androidx.camera.core.impl.o.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return androidx.camera.core.impl.o.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                w.o0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return androidx.camera.core.impl.o.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.o.OFF;
    }
}
