package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.c0 */
/* loaded from: classes.dex */
public class C10733c0 implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final List<String> f27169a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32677a() {
        return "Google".equals(Build.MANUFACTURER) && f27169a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
