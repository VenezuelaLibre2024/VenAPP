package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Locale;

/* renamed from: s.f0 */
/* loaded from: classes.dex */
public class C10739f0 implements InterfaceC0665s1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32684a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
