package t6;

import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public final class d3 extends p3 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26041d = t8.r0.r0(1);

    /* renamed from: e, reason: collision with root package name */
    public static final o.a<d3> f26042e = new o.a() { // from class: t6.c3
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            d3 e10;
            e10 = d3.e(bundle);
            return e10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final float f26043c;

    public d3() {
        this.f26043c = -1.0f;
    }

    public d3(float f10) {
        t8.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f26043c = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d3 e(Bundle bundle) {
        t8.a.a(bundle.getInt(p3.f26354a, -1) == 1);
        float f10 = bundle.getFloat(f26041d, -1.0f);
        return f10 == -1.0f ? new d3() : new d3(f10);
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(p3.f26354a, 1);
        bundle.putFloat(f26041d, this.f26043c);
        return bundle;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d3) && this.f26043c == ((d3) obj).f26043c;
    }

    public int hashCode() {
        return eb.k.b(Float.valueOf(this.f26043c));
    }
}
