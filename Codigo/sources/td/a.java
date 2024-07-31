package td;

import com.google.android.gms.common.api.a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class a {
    private static int a(int i10) {
        return i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    public static <K, V> LinkedHashMap<K, V> b(int i10) {
        return new LinkedHashMap<>(a(i10));
    }
}
