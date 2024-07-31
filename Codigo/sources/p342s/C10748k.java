package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.k */
/* loaded from: classes.dex */
public class C10748k implements InterfaceC0665s1 {

    /* renamed from: a */
    static final List<String> f27175a = Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32695a() {
        return f27175a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
