package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.List;

/* renamed from: s.v */
/* loaded from: classes.dex */
public class C10760v implements InterfaceC0665s1 {

    /* renamed from: a */
    public static final List<String> f27189a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32737a() {
        return f27189a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
