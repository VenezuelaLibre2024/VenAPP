package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C0625h;
import p407w.C12048y;

/* renamed from: androidx.camera.core.impl.b2 */
/* loaded from: classes.dex */
public abstract class AbstractC0604b2 {

    /* renamed from: a */
    public static final Range<Integer> f2766a = new Range<>(0, 0);

    /* renamed from: androidx.camera.core.impl.b2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0604b2 mo2991a();

        /* renamed from: b */
        public abstract a mo2992b(C12048y c12048y);

        /* renamed from: c */
        public abstract a mo2993c(Range<Integer> range);

        /* renamed from: d */
        public abstract a mo2994d(InterfaceC0649n0 interfaceC0649n0);

        /* renamed from: e */
        public abstract a mo2995e(Size size);
    }

    /* renamed from: a */
    public static a m2985a(Size size) {
        return new C0625h.b().mo2995e(size).mo2993c(f2766a).mo2992b(C12048y.f32040d);
    }

    /* renamed from: b */
    public abstract C12048y mo2986b();

    /* renamed from: c */
    public abstract Range<Integer> mo2987c();

    /* renamed from: d */
    public abstract InterfaceC0649n0 mo2988d();

    /* renamed from: e */
    public abstract Size mo2989e();

    /* renamed from: f */
    public abstract a mo2990f();
}
