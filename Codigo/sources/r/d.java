package r;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import r.b;
import w.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements b.a {

    /* renamed from: a */
    static final b f24454a = new b(new d());

    /* renamed from: b */
    private static final Set<y> f24455b = Collections.singleton(y.f29577d);

    d() {
    }

    @Override // r.b.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // r.b.a
    public Set<y> b(y yVar) {
        androidx.core.util.h.b(y.f29577d.equals(yVar), "DynamicRange is not supported: " + yVar);
        return f24455b;
    }

    @Override // r.b.a
    public Set<y> c() {
        return f24455b;
    }
}
