package s;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.impl.s1;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public class a implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private final Range<Integer> f25048a;

    public a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        this.f25048a = d((Range[]) d0Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range<Integer> a(Range<Integer> range) {
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
    public static boolean c(androidx.camera.camera2.internal.compat.d0 d0Var) {
        Integer num = (Integer) d0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range<Integer> d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> a10 = a(range2);
                if (a10.getUpper().intValue() == 30 && (range == null || a10.getLower().intValue() < range.getLower().intValue())) {
                    range = a10;
                }
            }
        }
        return range;
    }

    public Range<Integer> b() {
        return this.f25048a;
    }
}
