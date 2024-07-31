package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.camera.core.impl.AbstractC0597a;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0612d2;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0702z;
import androidx.core.util.C0984h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.g1 */
/* loaded from: classes.dex */
public final class C0489g1 implements InterfaceC0702z {

    /* renamed from: a */
    private final Map<String, C0570w2> f2296a;

    /* renamed from: b */
    private final InterfaceC0482f f2297b;

    /* renamed from: androidx.camera.camera2.internal.g1$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0482f {
        a() {
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0482f
        /* renamed from: a */
        public CamcorderProfile mo2368a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0482f
        /* renamed from: b */
        public boolean mo2369b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    C0489g1(Context context, InterfaceC0482f interfaceC0482f, Object obj, Set<String> set) {
        this.f2296a = new HashMap();
        C0984h.m4833k(interfaceC0482f);
        this.f2297b = interfaceC0482f;
        m2387c(context, obj instanceof C0455r0 ? (C0455r0) obj : C0455r0.m2274a(context), set);
    }

    public C0489g1(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    /* renamed from: c */
    private void m2387c(Context context, C0455r0 c0455r0, Set<String> set) {
        C0984h.m4833k(context);
        for (String str : set) {
            this.f2296a.put(str, new C0570w2(context, str, c0455r0, this.f2297b));
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0702z
    /* renamed from: a */
    public Pair<Map<InterfaceC0640k2<?>, AbstractC0604b2>, Map<AbstractC0597a, AbstractC0604b2>> mo2388a(int i10, String str, List<AbstractC0597a> list, Map<InterfaceC0640k2<?>, List<Size>> map) {
        C0984h.m4824b(!map.isEmpty(), "No new use cases to be bound.");
        C0570w2 c0570w2 = this.f2296a.get(str);
        if (c0570w2 != null) {
            return c0570w2.m2842y(i10, list, map);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // androidx.camera.core.impl.InterfaceC0702z
    /* renamed from: b */
    public AbstractC0612d2 mo2389b(int i10, String str, int i11, Size size) {
        C0570w2 c0570w2 = this.f2296a.get(str);
        if (c0570w2 != null) {
            return c0570w2.m2838I(i10, i11, size);
        }
        return null;
    }
}
