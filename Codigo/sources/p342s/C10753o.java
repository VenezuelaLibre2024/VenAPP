package p342s;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0612d2;
import androidx.camera.core.impl.InterfaceC0665s1;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: s.o */
/* loaded from: classes.dex */
public class C10753o implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final Map<String, Range<Integer>> f27177a;

    /* renamed from: s.o$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27178a;

        static {
            int[] iArr = new int[AbstractC0612d2.b.values().length];
            f27178a = iArr;
            try {
                iArr[AbstractC0612d2.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27178a[AbstractC0612d2.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27178a[AbstractC0612d2.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f27177a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    /* renamed from: b */
    private static boolean m32714b() {
        if (!("samsung".equalsIgnoreCase(Build.BRAND) && f27177a.containsKey(Build.MODEL.toUpperCase(Locale.US)))) {
            return false;
        }
        Range<Integer> range = f27177a.get(Build.MODEL.toUpperCase(Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains((Range<Integer>) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m32715c() {
        return m32714b();
    }

    /* renamed from: a */
    public Size m32716a(AbstractC0612d2.b bVar) {
        if (!m32714b()) {
            return null;
        }
        int i10 = a.f27178a[bVar.ordinal()];
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
