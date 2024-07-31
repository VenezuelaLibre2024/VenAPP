package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0604b2;
import p407w.C12048y;

/* renamed from: androidx.camera.core.impl.h */
/* loaded from: classes.dex */
final class C0625h extends AbstractC0604b2 {

    /* renamed from: b */
    private final Size f2823b;

    /* renamed from: c */
    private final C12048y f2824c;

    /* renamed from: d */
    private final Range<Integer> f2825d;

    /* renamed from: e */
    private final InterfaceC0649n0 f2826e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.h$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0604b2.a {

        /* renamed from: a */
        private Size f2827a;

        /* renamed from: b */
        private C12048y f2828b;

        /* renamed from: c */
        private Range<Integer> f2829c;

        /* renamed from: d */
        private InterfaceC0649n0 f2830d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC0604b2 abstractC0604b2) {
            this.f2827a = abstractC0604b2.mo2989e();
            this.f2828b = abstractC0604b2.mo2986b();
            this.f2829c = abstractC0604b2.mo2987c();
            this.f2830d = abstractC0604b2.mo2988d();
        }

        @Override // androidx.camera.core.impl.AbstractC0604b2.a
        /* renamed from: a */
        public AbstractC0604b2 mo2991a() {
            String str = "";
            if (this.f2827a == null) {
                str = " resolution";
            }
            if (this.f2828b == null) {
                str = str + " dynamicRange";
            }
            if (this.f2829c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (str.isEmpty()) {
                return new C0625h(this.f2827a, this.f2828b, this.f2829c, this.f2830d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.AbstractC0604b2.a
        /* renamed from: b */
        public AbstractC0604b2.a mo2992b(C12048y c12048y) {
            if (c12048y == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f2828b = c12048y;
            return this;
        }

        @Override // androidx.camera.core.impl.AbstractC0604b2.a
        /* renamed from: c */
        public AbstractC0604b2.a mo2993c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f2829c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.AbstractC0604b2.a
        /* renamed from: d */
        public AbstractC0604b2.a mo2994d(InterfaceC0649n0 interfaceC0649n0) {
            this.f2830d = interfaceC0649n0;
            return this;
        }

        @Override // androidx.camera.core.impl.AbstractC0604b2.a
        /* renamed from: e */
        public AbstractC0604b2.a mo2995e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f2827a = size;
            return this;
        }
    }

    private C0625h(Size size, C12048y c12048y, Range<Integer> range, InterfaceC0649n0 interfaceC0649n0) {
        this.f2823b = size;
        this.f2824c = c12048y;
        this.f2825d = range;
        this.f2826e = interfaceC0649n0;
    }

    @Override // androidx.camera.core.impl.AbstractC0604b2
    /* renamed from: b */
    public C12048y mo2986b() {
        return this.f2824c;
    }

    @Override // androidx.camera.core.impl.AbstractC0604b2
    /* renamed from: c */
    public Range<Integer> mo2987c() {
        return this.f2825d;
    }

    @Override // androidx.camera.core.impl.AbstractC0604b2
    /* renamed from: d */
    public InterfaceC0649n0 mo2988d() {
        return this.f2826e;
    }

    @Override // androidx.camera.core.impl.AbstractC0604b2
    /* renamed from: e */
    public Size mo2989e() {
        return this.f2823b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0604b2)) {
            return false;
        }
        AbstractC0604b2 abstractC0604b2 = (AbstractC0604b2) obj;
        if (this.f2823b.equals(abstractC0604b2.mo2989e()) && this.f2824c.equals(abstractC0604b2.mo2986b()) && this.f2825d.equals(abstractC0604b2.mo2987c())) {
            InterfaceC0649n0 interfaceC0649n0 = this.f2826e;
            InterfaceC0649n0 mo2988d = abstractC0604b2.mo2988d();
            if (interfaceC0649n0 == null) {
                if (mo2988d == null) {
                    return true;
                }
            } else if (interfaceC0649n0.equals(mo2988d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AbstractC0604b2
    /* renamed from: f */
    public AbstractC0604b2.a mo2990f() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (((((this.f2823b.hashCode() ^ 1000003) * 1000003) ^ this.f2824c.hashCode()) * 1000003) ^ this.f2825d.hashCode()) * 1000003;
        InterfaceC0649n0 interfaceC0649n0 = this.f2826e;
        return hashCode ^ (interfaceC0649n0 == null ? 0 : interfaceC0649n0.hashCode());
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f2823b + ", dynamicRange=" + this.f2824c + ", expectedFrameRateRange=" + this.f2825d + ", implementationOptions=" + this.f2826e + "}";
    }
}
