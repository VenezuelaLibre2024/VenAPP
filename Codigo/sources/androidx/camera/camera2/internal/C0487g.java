package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.C0620f2;
import androidx.camera.core.impl.EnumC0648n;
import androidx.camera.core.impl.EnumC0651o;
import androidx.camera.core.impl.EnumC0654p;
import androidx.camera.core.impl.EnumC0657q;
import androidx.camera.core.impl.EnumC0660r;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.camera.core.impl.utils.C0681j;
import java.nio.BufferUnderflowException;
import p407w.C12029o0;

/* renamed from: androidx.camera.camera2.internal.g */
/* loaded from: classes.dex */
public class C0487g implements InterfaceC0663s {

    /* renamed from: a */
    private final C0620f2 f2292a;

    /* renamed from: b */
    private final CaptureResult f2293b;

    public C0487g(CaptureResult captureResult) {
        this(C0620f2.m3069b(), captureResult);
    }

    public C0487g(C0620f2 c0620f2, CaptureResult captureResult) {
        this.f2292a = c0620f2;
        this.f2293b = captureResult;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: a */
    public void mo2378a(C0681j.b bVar) {
        super.mo2378a(bVar);
        Rect rect = (Rect) this.f2293b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.m3319j(rect.width()).m3318i(rect.height());
        }
        try {
            Integer num = (Integer) this.f2293b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m3322m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C12029o0.m38648k("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f2293b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.m3315f(l10.longValue());
        }
        Float f10 = (Float) this.f2293b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.m3321l(f10.floatValue());
        }
        Integer num2 = (Integer) this.f2293b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) this.f2293b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.m3320k(num2.intValue());
        }
        Float f11 = (Float) this.f2293b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.m3317h(f11.floatValue());
        }
        Integer num3 = (Integer) this.f2293b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            C0681j.c cVar = C0681j.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = C0681j.c.MANUAL;
            }
            bVar.m3323n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: b */
    public C0620f2 mo2379b() {
        return this.f2292a;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: c */
    public long mo2380c() {
        Long l10 = (Long) this.f2293b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: d */
    public EnumC0660r mo2381d() {
        Integer num = (Integer) this.f2293b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC0660r.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC0660r.NONE;
        }
        if (intValue == 2) {
            return EnumC0660r.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return EnumC0660r.FIRED;
        }
        C12029o0.m38640c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC0660r.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: e */
    public CaptureResult mo2382e() {
        return this.f2293b;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: f */
    public EnumC0654p mo2383f() {
        Integer num = (Integer) this.f2293b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC0654p.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC0654p.INACTIVE;
            case 1:
            case 3:
                return EnumC0654p.SCANNING;
            case 2:
                return EnumC0654p.PASSIVE_FOCUSED;
            case 4:
                return EnumC0654p.LOCKED_FOCUSED;
            case 5:
                return EnumC0654p.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC0654p.PASSIVE_NOT_FOCUSED;
            default:
                C12029o0.m38640c("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC0654p.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: g */
    public EnumC0657q mo2384g() {
        Integer num = (Integer) this.f2293b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC0657q.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC0657q.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC0657q.METERING;
        }
        if (intValue == 2) {
            return EnumC0657q.CONVERGED;
        }
        if (intValue == 3) {
            return EnumC0657q.LOCKED;
        }
        C12029o0.m38640c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC0657q.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: h */
    public EnumC0648n mo2385h() {
        Integer num = (Integer) this.f2293b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC0648n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC0648n.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return EnumC0648n.CONVERGED;
            }
            if (intValue == 3) {
                return EnumC0648n.LOCKED;
            }
            if (intValue == 4) {
                return EnumC0648n.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C12029o0.m38640c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC0648n.UNKNOWN;
            }
        }
        return EnumC0648n.SEARCHING;
    }

    /* renamed from: i */
    public EnumC0651o m2386i() {
        Integer num = (Integer) this.f2293b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC0651o.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return EnumC0651o.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return EnumC0651o.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C12029o0.m38640c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC0651o.UNKNOWN;
            }
        }
        return EnumC0651o.OFF;
    }
}
