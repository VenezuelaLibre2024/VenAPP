package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.InterfaceC0665s1;
import com.facebook.ads.AdError;

/* renamed from: s.a */
/* loaded from: classes.dex */
public class C10728a implements InterfaceC0665s1 {

    /* renamed from: a */
    private final Range<Integer> f27167a;

    public C10728a(C0427d0 c0427d0) {
        this.f27167a = m32669d((Range[]) c0427d0.m2215a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: a */
    private Range<Integer> m32667a(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / AdError.NETWORK_ERROR_CODE;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / AdError.NETWORK_ERROR_CODE;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m32668c(C0427d0 c0427d0) {
        Integer num = (Integer) c0427d0.m2215a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: d */
    private Range<Integer> m32669d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> m32667a = m32667a(range2);
                if (m32667a.getUpper().intValue() == 30 && (range == null || m32667a.getLower().intValue() < range.getLower().intValue())) {
                    range = m32667a;
                }
            }
        }
        return range;
    }

    /* renamed from: b */
    public Range<Integer> m32670b() {
        return this.f27167a;
    }
}
