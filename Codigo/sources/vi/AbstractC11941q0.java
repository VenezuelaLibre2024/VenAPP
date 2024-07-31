package vi;

import java.util.Map;
import p082eb.C7153i;
import vi.AbstractC11939p0;
import vi.AbstractC11957y0;

/* renamed from: vi.q0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11941q0 extends AbstractC11939p0.c {

    /* renamed from: a */
    private static final AbstractC11957y0.c f31630a = AbstractC11957y0.c.m38371a(new a());

    /* renamed from: vi.q0$a */
    /* loaded from: classes3.dex */
    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    /* renamed from: b */
    public abstract String mo9649b();

    /* renamed from: c */
    public abstract int mo9650c();

    /* renamed from: d */
    public abstract boolean mo9651d();

    /* renamed from: e */
    public AbstractC11957y0.c mo9652e(Map<String, ?> map) {
        return f31630a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return C7153i.m21274c(this).m21284d("policy", mo9649b()).m21282b("priority", mo9650c()).m21285e("available", mo9651d()).toString();
    }
}
