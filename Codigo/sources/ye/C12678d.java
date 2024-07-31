package ye;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ye.d */
/* loaded from: classes.dex */
public class C12678d {

    /* renamed from: b */
    private static volatile C12678d f34373b;

    /* renamed from: a */
    private final Set<AbstractC12680f> f34374a = new HashSet();

    C12678d() {
    }

    /* renamed from: a */
    public static C12678d m41720a() {
        C12678d c12678d = f34373b;
        if (c12678d == null) {
            synchronized (C12678d.class) {
                c12678d = f34373b;
                if (c12678d == null) {
                    c12678d = new C12678d();
                    f34373b = c12678d;
                }
            }
        }
        return c12678d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<AbstractC12680f> m41721b() {
        Set<AbstractC12680f> unmodifiableSet;
        synchronized (this.f34374a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f34374a);
        }
        return unmodifiableSet;
    }
}
