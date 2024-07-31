package d0;

import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class f implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f13685a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f13685a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
