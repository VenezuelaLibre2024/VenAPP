package s;

import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class c0 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f25050a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return "Google".equals(Build.MANUFACTURER) && f25050a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
