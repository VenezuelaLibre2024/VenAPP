package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g1 implements androidx.camera.core.impl.z {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, w2> f1993a;

    /* renamed from: b, reason: collision with root package name */
    private final f f1994b;

    /* loaded from: classes.dex */
    class a implements f {
        a() {
        }

        @Override // androidx.camera.camera2.internal.f
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // androidx.camera.camera2.internal.f
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    g1(Context context, f fVar, Object obj, Set<String> set) {
        this.f1993a = new HashMap();
        androidx.core.util.h.k(fVar);
        this.f1994b = fVar;
        c(context, obj instanceof androidx.camera.camera2.internal.compat.r0 ? (androidx.camera.camera2.internal.compat.r0) obj : androidx.camera.camera2.internal.compat.r0.a(context), set);
    }

    public g1(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    private void c(Context context, androidx.camera.camera2.internal.compat.r0 r0Var, Set<String> set) {
        androidx.core.util.h.k(context);
        for (String str : set) {
            this.f1993a.put(str, new w2(context, str, r0Var, this.f1994b));
        }
    }

    @Override // androidx.camera.core.impl.z
    public Pair<Map<androidx.camera.core.impl.k2<?>, androidx.camera.core.impl.b2>, Map<androidx.camera.core.impl.a, androidx.camera.core.impl.b2>> a(int i10, String str, List<androidx.camera.core.impl.a> list, Map<androidx.camera.core.impl.k2<?>, List<Size>> map) {
        androidx.core.util.h.b(!map.isEmpty(), "No new use cases to be bound.");
        w2 w2Var = this.f1993a.get(str);
        if (w2Var != null) {
            return w2Var.y(i10, list, map);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // androidx.camera.core.impl.z
    public androidx.camera.core.impl.d2 b(int i10, String str, int i11, Size size) {
        w2 w2Var = this.f1993a.get(str);
        if (w2Var != null) {
            return w2Var.I(i10, i11, size);
        }
        return null;
    }
}
