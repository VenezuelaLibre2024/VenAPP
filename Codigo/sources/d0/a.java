package d0;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.s1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class a implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Pair<String, String>> f13682a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f13682a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int a() {
        return 1;
    }
}
