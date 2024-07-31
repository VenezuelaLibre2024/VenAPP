package p342s;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: s.r */
/* loaded from: classes.dex */
public class C10756r implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final Set<Pair<String, String>> f27184a = new HashSet();

    static {
        m32731a("sprd", "lemp");
        m32731a("sprd", "DM20C");
    }

    /* renamed from: a */
    private static void m32731a(String str, String str2) {
        Set<Pair<String, String>> set = f27184a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m32732b() {
        Set<Pair<String, String>> set = f27184a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
