package p320r;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.core.util.C0984h;
import java.util.Collections;
import java.util.Set;
import p320r.C10553b;
import p407w.C12048y;

/* renamed from: r.d */
/* loaded from: classes.dex */
class C10555d implements C10553b.a {

    /* renamed from: a */
    static final C10553b f26568a = new C10553b(new C10555d());

    /* renamed from: b */
    private static final Set<C12048y> f26569b = Collections.singleton(C12048y.f32040d);

    C10555d() {
    }

    @Override // p320r.C10553b.a
    /* renamed from: a */
    public DynamicRangeProfiles mo32043a() {
        return null;
    }

    @Override // p320r.C10553b.a
    /* renamed from: b */
    public Set<C12048y> mo32044b(C12048y c12048y) {
        C0984h.m4824b(C12048y.f32040d.equals(c12048y), "DynamicRange is not supported: " + c12048y);
        return f26569b;
    }

    @Override // p320r.C10553b.a
    /* renamed from: c */
    public Set<C12048y> mo32045c() {
        return f26569b;
    }
}
