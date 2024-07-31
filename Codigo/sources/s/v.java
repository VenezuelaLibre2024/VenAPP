package s;

import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class v implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f25070a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f25070a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
