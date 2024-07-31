package s;

import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class a0 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f25049a = Arrays.asList("NEXUS 4");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int a() {
        return 2;
    }
}
