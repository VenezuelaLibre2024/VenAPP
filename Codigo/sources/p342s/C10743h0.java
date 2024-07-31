package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.h0 */
/* loaded from: classes.dex */
public class C10743h0 implements InterfaceC0665s1 {

    /* renamed from: a */
    public static final List<String> f27174a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi 6 pro");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32688a() {
        return f27174a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
