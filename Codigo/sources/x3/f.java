package x3;

import h3.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?>> f30380a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f30381a;

        /* renamed from: b, reason: collision with root package name */
        final k<T> f30382b;

        a(Class<T> cls, k<T> kVar) {
            this.f30381a = cls;
            this.f30382b = kVar;
        }

        boolean a(Class<?> cls) {
            return this.f30381a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, k<Z> kVar) {
        this.f30380a.add(new a<>(cls, kVar));
    }

    public synchronized <Z> k<Z> b(Class<Z> cls) {
        int size = this.f30380a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f30380a.get(i10);
            if (aVar.a(cls)) {
                return (k<Z>) aVar.f30382b;
            }
        }
        return null;
    }
}
