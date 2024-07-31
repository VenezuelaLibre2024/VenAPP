package vi;

import java.util.Map;
import vi.p0;
import vi.y0;

/* loaded from: classes3.dex */
public abstract class q0 extends p0.c {

    /* renamed from: a, reason: collision with root package name */
    private static final y0.c f29195a = y0.c.a(new a());

    /* loaded from: classes3.dex */
    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public y0.c e(Map<String, ?> map) {
        return f29195a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return eb.i.c(this).d("policy", b()).b("priority", c()).e("available", d()).toString();
    }
}
