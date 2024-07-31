package td;

import com.google.android.gms.common.api.C5101a;
import java.util.LinkedHashMap;

/* renamed from: td.a */
/* loaded from: classes.dex */
public final class C11243a {
    /* renamed from: a */
    private static int m35122a(int i10) {
        return i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : C5101a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m35123b(int i10) {
        return new LinkedHashMap<>(m35122a(i10));
    }
}
