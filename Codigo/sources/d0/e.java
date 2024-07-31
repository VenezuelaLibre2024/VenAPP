package d0;

import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f13684a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A725F", "SM-A725M", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f13684a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
