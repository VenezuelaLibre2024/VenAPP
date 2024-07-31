package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.InterfaceC0644l2;
import java.util.List;
import p407w.C12048y;

/* renamed from: androidx.camera.core.impl.a */
/* loaded from: classes.dex */
public abstract class AbstractC0597a {
    /* renamed from: a */
    public static AbstractC0597a m2971a(AbstractC0612d2 abstractC0612d2, int i10, Size size, C12048y c12048y, List<InterfaceC0644l2.b> list, InterfaceC0649n0 interfaceC0649n0, Range<Integer> range) {
        return new C0601b(abstractC0612d2, i10, size, c12048y, list, interfaceC0649n0, range);
    }

    /* renamed from: b */
    public abstract List<InterfaceC0644l2.b> mo2972b();

    /* renamed from: c */
    public abstract C12048y mo2973c();

    /* renamed from: d */
    public abstract int mo2974d();

    /* renamed from: e */
    public abstract InterfaceC0649n0 mo2975e();

    /* renamed from: f */
    public abstract Size mo2976f();

    /* renamed from: g */
    public abstract AbstractC0612d2 mo2977g();

    /* renamed from: h */
    public abstract Range<Integer> mo2978h();

    /* renamed from: i */
    public AbstractC0604b2 m2979i(InterfaceC0649n0 interfaceC0649n0) {
        AbstractC0604b2.a mo2994d = AbstractC0604b2.m2985a(mo2976f()).mo2992b(mo2973c()).mo2994d(interfaceC0649n0);
        if (mo2978h() != null) {
            mo2994d.mo2993c(mo2978h());
        }
        return mo2994d.mo2991a();
    }
}
