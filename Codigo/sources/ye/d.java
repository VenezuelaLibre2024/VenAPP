package ye;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f31837b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f31838a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f31837b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f31837b;
                if (dVar == null) {
                    dVar = new d();
                    f31837b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f31838a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f31838a);
        }
        return unmodifiableSet;
    }
}
