package s;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class z implements d0.h {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f25074a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return f25074a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
