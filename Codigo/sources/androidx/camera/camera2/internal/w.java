package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w implements androidx.camera.core.impl.a0 {

    /* renamed from: a, reason: collision with root package name */
    private final x.a f2304a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.i0 f2305b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.h0 f2306c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.camera2.internal.compat.r0 f2307d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f2308e;

    /* renamed from: f, reason: collision with root package name */
    private final c2 f2309f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, n0> f2310g = new HashMap();

    public w(Context context, androidx.camera.core.impl.i0 i0Var, w.p pVar) {
        this.f2305b = i0Var;
        androidx.camera.camera2.internal.compat.r0 b10 = androidx.camera.camera2.internal.compat.r0.b(context, i0Var.c());
        this.f2307d = b10;
        this.f2309f = c2.c(context);
        this.f2308e = e(o1.b(this, pVar));
        u.a aVar = new u.a(b10);
        this.f2304a = aVar;
        androidx.camera.core.impl.h0 h0Var = new androidx.camera.core.impl.h0(aVar, 1);
        this.f2306c = h0Var;
        aVar.d(h0Var);
    }

    private List<String> e(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1") || h(str)) {
                arrayList.add(str);
            } else {
                w.o0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    private boolean h(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f2307d.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (androidx.camera.camera2.internal.compat.h e10) {
            throw new w.n0(q1.a(e10));
        }
    }

    @Override // androidx.camera.core.impl.a0
    public androidx.camera.core.impl.c0 a(String str) {
        if (this.f2308e.contains(str)) {
            return new j0(this.f2307d, str, f(str), this.f2304a, this.f2306c, this.f2305b.b(), this.f2305b.c(), this.f2309f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // androidx.camera.core.impl.a0
    public Set<String> b() {
        return new LinkedHashSet(this.f2308e);
    }

    @Override // androidx.camera.core.impl.a0
    public x.a d() {
        return this.f2304a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0 f(String str) {
        try {
            n0 n0Var = this.f2310g.get(str);
            if (n0Var != null) {
                return n0Var;
            }
            n0 n0Var2 = new n0(str, this.f2307d);
            this.f2310g.put(str, n0Var2);
            return n0Var2;
        } catch (androidx.camera.camera2.internal.compat.h e10) {
            throw q1.a(e10);
        }
    }

    @Override // androidx.camera.core.impl.a0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public androidx.camera.camera2.internal.compat.r0 c() {
        return this.f2307d;
    }
}
