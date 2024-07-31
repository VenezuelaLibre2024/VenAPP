package s;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.s1;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class o implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Range<Integer>> f25058a;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25059a;

        static {
            int[] iArr = new int[d2.b.values().length];
            f25059a = iArr;
            try {
                iArr[d2.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25059a[d2.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25059a[d2.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f25058a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    private static boolean b() {
        if (!("samsung".equalsIgnoreCase(Build.BRAND) && f25058a.containsKey(Build.MODEL.toUpperCase(Locale.US)))) {
            return false;
        }
        Range<Integer> range = f25058a.get(Build.MODEL.toUpperCase(Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains((Range<Integer>) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return b();
    }

    public Size a(d2.b bVar) {
        if (!b()) {
            return null;
        }
        int i10 = a.f25059a[bVar.ordinal()];
        if (i10 == 1) {
            return new Size(1920, 1080);
        }
        if (i10 == 2) {
            return new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720);
        }
        if (i10 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
