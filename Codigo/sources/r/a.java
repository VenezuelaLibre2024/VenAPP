package r;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.y;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Long, y> f24450a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<y, List<Long>> f24451b;

    static {
        HashMap hashMap = new HashMap();
        f24450a = hashMap;
        HashMap hashMap2 = new HashMap();
        f24451b = hashMap2;
        y yVar = y.f29577d;
        hashMap.put(1L, yVar);
        hashMap2.put(yVar, Collections.singletonList(1L));
        hashMap.put(2L, y.f29579f);
        hashMap2.put((y) hashMap.get(2L), Collections.singletonList(2L));
        y yVar2 = y.f29580g;
        hashMap.put(4L, yVar2);
        hashMap2.put(yVar2, Collections.singletonList(4L));
        y yVar3 = y.f29581h;
        hashMap.put(8L, yVar3);
        hashMap2.put(yVar3, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = asList.iterator();
        while (it.hasNext()) {
            f24450a.put(it.next(), y.f29582i);
        }
        f24451b.put(y.f29582i, asList);
        List<Long> asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator<Long> it2 = asList2.iterator();
        while (it2.hasNext()) {
            f24450a.put(it2.next(), y.f29583j);
        }
        f24451b.put(y.f29583j, asList2);
    }

    public static Long a(y yVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f24451b.get(yVar);
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

    public static y b(long j10) {
        return f24450a.get(Long.valueOf(j10));
    }
}
