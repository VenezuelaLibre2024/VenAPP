package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0434h;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.camera.core.impl.AbstractC0630i0;
import androidx.camera.core.impl.C0626h0;
import androidx.camera.core.impl.InterfaceC0598a0;
import androidx.camera.core.impl.InterfaceC0606c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p369u.C11293a;
import p407w.C12027n0;
import p407w.C12029o0;
import p407w.C12030p;
import p429x.InterfaceC12249a;

/* renamed from: androidx.camera.camera2.internal.w */
/* loaded from: classes.dex */
public final class C0567w implements InterfaceC0598a0 {

    /* renamed from: a */
    private final InterfaceC12249a f2625a;

    /* renamed from: b */
    private final AbstractC0630i0 f2626b;

    /* renamed from: c */
    private final C0626h0 f2627c;

    /* renamed from: d */
    private final C0455r0 f2628d;

    /* renamed from: e */
    private final List<String> f2629e;

    /* renamed from: f */
    private final C0416c2 f2630f;

    /* renamed from: g */
    private final Map<String, C0523n0> f2631g = new HashMap();

    public C0567w(Context context, AbstractC0630i0 abstractC0630i0, C12030p c12030p) {
        this.f2626b = abstractC0630i0;
        C0455r0 m2275b = C0455r0.m2275b(context, abstractC0630i0.mo2997c());
        this.f2628d = m2275b;
        this.f2630f = C0416c2.m2195c(context);
        this.f2629e = m2797e(C0529o1.m2595b(this, c12030p));
        C11293a c11293a = new C11293a(m2275b);
        this.f2625a = c11293a;
        C0626h0 c0626h0 = new C0626h0(c11293a, 1);
        this.f2627c = c0626h0;
        c11293a.mo35291d(c0626h0);
    }

    /* renamed from: e */
    private List<String> m2797e(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1") || m2798h(str)) {
                arrayList.add(str);
            } else {
                C12029o0.m38638a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private boolean m2798h(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f2628d.m2276c(str).m2215a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C0434h e10) {
            throw new C12027n0(C0539q1.m2610a(e10));
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0598a0
    /* renamed from: a */
    public InterfaceC0606c0 mo2799a(String str) {
        if (this.f2629e.contains(str)) {
            return new C0503j0(this.f2628d, str, m2803f(str), this.f2625a, this.f2627c, this.f2626b.mo2996b(), this.f2626b.mo2997c(), this.f2630f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0598a0
    /* renamed from: b */
    public Set<String> mo2800b() {
        return new LinkedHashSet(this.f2629e);
    }

    @Override // androidx.camera.core.impl.InterfaceC0598a0
    /* renamed from: d */
    public InterfaceC12249a mo2802d() {
        return this.f2625a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C0523n0 m2803f(String str) {
        try {
            C0523n0 c0523n0 = this.f2631g.get(str);
            if (c0523n0 != null) {
                return c0523n0;
            }
            C0523n0 c0523n02 = new C0523n0(str, this.f2628d);
            this.f2631g.put(str, c0523n02);
            return c0523n02;
        } catch (C0434h e10) {
            throw C0539q1.m2610a(e10);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0598a0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0455r0 mo2801c() {
        return this.f2628d;
    }
}
