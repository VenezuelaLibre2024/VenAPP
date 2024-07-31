package p320r;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p407w.C12048y;

/* renamed from: r.a */
/* loaded from: classes.dex */
public final class C10552a {

    /* renamed from: a */
    private static final Map<Long, C12048y> f26564a;

    /* renamed from: b */
    private static final Map<C12048y, List<Long>> f26565b;

    static {
        HashMap hashMap = new HashMap();
        f26564a = hashMap;
        HashMap hashMap2 = new HashMap();
        f26565b = hashMap2;
        C12048y c12048y = C12048y.f32040d;
        hashMap.put(1L, c12048y);
        hashMap2.put(c12048y, Collections.singletonList(1L));
        hashMap.put(2L, C12048y.f32042f);
        hashMap2.put((C12048y) hashMap.get(2L), Collections.singletonList(2L));
        C12048y c12048y2 = C12048y.f32043g;
        hashMap.put(4L, c12048y2);
        hashMap2.put(c12048y2, Collections.singletonList(4L));
        C12048y c12048y3 = C12048y.f32044h;
        hashMap.put(8L, c12048y3);
        hashMap2.put(c12048y3, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = asList.iterator();
        while (it.hasNext()) {
            f26564a.put(it.next(), C12048y.f32045i);
        }
        f26565b.put(C12048y.f32045i, asList);
        List<Long> asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator<Long> it2 = asList2.iterator();
        while (it2.hasNext()) {
            f26564a.put(it2.next(), C12048y.f32046j);
        }
        f26565b.put(C12048y.f32046j, asList2);
    }

    /* renamed from: a */
    public static Long m32036a(C12048y c12048y, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f26565b.get(c12048y);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C12048y m32037b(long j10) {
        return f26564a.get(Long.valueOf(j10));
    }
}
