package r;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import r.b;
import w.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements b.a {

    /* renamed from: a */
    private final DynamicRangeProfiles f24453a;

    public c(Object obj) {
        this.f24453a = (DynamicRangeProfiles) obj;
    }

    private Long d(y yVar) {
        return a.a(yVar, this.f24453a);
    }

    private static Set<y> e(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(it.next().longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static y f(long j10) {
        return (y) androidx.core.util.h.l(a.b(j10), "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    @Override // r.b.a
    public DynamicRangeProfiles a() {
        return this.f24453a;
    }

    @Override // r.b.a
    public Set<y> b(y yVar) {
        Long d10 = d(yVar);
        androidx.core.util.h.b(d10 != null, "DynamicRange is not supported: " + yVar);
        return e(this.f24453a.getProfileCaptureRequestConstraints(d10.longValue()));
    }

    @Override // r.b.a
    public Set<y> c() {
        return e(this.f24453a.getSupportedProfiles());
    }
}
