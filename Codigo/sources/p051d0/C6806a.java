package p051d0;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: d0.a */
/* loaded from: classes.dex */
public class C6806a implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final Set<Pair<String, String>> f15036a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m19690b() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f15036a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    /* renamed from: a */
    public int m19691a() {
        return 1;
    }
}
