package p051d0;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: d0.e */
/* loaded from: classes.dex */
public final class C6810e implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final Set<String> f15038a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A725F", "SM-A725M", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19700a() {
        return f15038a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
