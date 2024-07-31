package p361t6;

import android.os.Bundle;
import p082eb.C7155k;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: t6.w3 */
/* loaded from: classes.dex */
public final class C11120w3 extends AbstractC11085p3 {

    /* renamed from: e */
    private static final String f28860e = C11172r0.m34945r0(1);

    /* renamed from: f */
    private static final String f28861f = C11172r0.m34945r0(2);

    /* renamed from: r */
    public static final InterfaceC11076o.a<C11120w3> f28862r = new InterfaceC11076o.a() { // from class: t6.v3
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11120w3 m34565e;
            m34565e = C11120w3.m34565e(bundle);
            return m34565e;
        }
    };

    /* renamed from: c */
    private final int f28863c;

    /* renamed from: d */
    private final float f28864d;

    public C11120w3(int i10) {
        C11137a.m34600b(i10 > 0, "maxStars must be a positive integer");
        this.f28863c = i10;
        this.f28864d = -1.0f;
    }

    public C11120w3(int i10, float f10) {
        C11137a.m34600b(i10 > 0, "maxStars must be a positive integer");
        C11137a.m34600b(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f28863c = i10;
        this.f28864d = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static C11120w3 m34565e(Bundle bundle) {
        C11137a.m34599a(bundle.getInt(AbstractC11085p3.f28581a, -1) == 2);
        int i10 = bundle.getInt(f28860e, 5);
        float f10 = bundle.getFloat(f28861f, -1.0f);
        return f10 == -1.0f ? new C11120w3(i10) : new C11120w3(i10, f10);
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC11085p3.f28581a, 2);
        bundle.putInt(f28860e, this.f28863c);
        bundle.putFloat(f28861f, this.f28864d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11120w3)) {
            return false;
        }
        C11120w3 c11120w3 = (C11120w3) obj;
        return this.f28863c == c11120w3.f28863c && this.f28864d == c11120w3.f28864d;
    }

    public int hashCode() {
        return C7155k.m21290b(Integer.valueOf(this.f28863c), Float.valueOf(this.f28864d));
    }
}
