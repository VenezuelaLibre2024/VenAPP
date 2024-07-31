package s;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.s1;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class r implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Pair<String, String>> f25065a = new HashSet();

    static {
        a("sprd", "lemp");
        a("sprd", "DM20C");
    }

    private static void a(String str, String str2) {
        Set<Pair<String, String>> set = f25065a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        Set<Pair<String, String>> set = f25065a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
