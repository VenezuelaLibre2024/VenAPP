package p320r;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.core.util.C0984h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p320r.C10553b;
import p407w.C12048y;

/* renamed from: r.c */
/* loaded from: classes.dex */
class C10554c implements C10553b.a {

    /* renamed from: a */
    private final DynamicRangeProfiles f26567a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10554c(Object obj) {
        this.f26567a = (DynamicRangeProfiles) obj;
    }

    /* renamed from: d */
    private Long m32046d(C12048y c12048y) {
        return C10552a.m32036a(c12048y, this.f26567a);
    }

    /* renamed from: e */
    private static Set<C12048y> m32047e(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m32048f(it.next().longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: f */
    private static C12048y m32048f(long j10) {
        return (C12048y) C0984h.m4834l(C10552a.m32037b(j10), "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    @Override // p320r.C10553b.a
    /* renamed from: a */
    public DynamicRangeProfiles mo32043a() {
        return this.f26567a;
    }

    @Override // p320r.C10553b.a
    /* renamed from: b */
    public Set<C12048y> mo32044b(C12048y c12048y) {
        Long m32046d = m32046d(c12048y);
        C0984h.m4824b(m32046d != null, "DynamicRange is not supported: " + c12048y);
        return m32047e(this.f26567a.getProfileCaptureRequestConstraints(m32046d.longValue()));
    }

    @Override // p320r.C10553b.a
    /* renamed from: c */
    public Set<C12048y> mo32045c() {
        return m32047e(this.f26567a.getSupportedProfiles());
    }
}
