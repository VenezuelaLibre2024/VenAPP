package p051d0;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: d0.f */
/* loaded from: classes.dex */
public class C6811f implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final Set<String> f15039a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19701a() {
        return f15039a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
