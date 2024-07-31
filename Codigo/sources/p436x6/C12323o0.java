package p436x6;

import android.util.Pair;
import java.util.Map;

/* renamed from: x6.o0 */
/* loaded from: classes.dex */
public final class C12323o0 {
    /* renamed from: a */
    private static long m39851a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair<Long, Long> m39852b(InterfaceC12320n interfaceC12320n) {
        Map<String, String> mo39704h = interfaceC12320n.mo39704h();
        if (mo39704h == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m39851a(mo39704h, "LicenseDurationRemaining")), Long.valueOf(m39851a(mo39704h, "PlaybackDurationRemaining")));
    }
}
