package p433x3;

import java.util.ArrayList;
import java.util.List;
import p129h3.InterfaceC7627k;

/* renamed from: x3.f */
/* loaded from: classes.dex */
public class C12273f {

    /* renamed from: a */
    private final List<a<?>> f32892a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        private final Class<T> f32893a;

        /* renamed from: b */
        final InterfaceC7627k<T> f32894b;

        a(Class<T> cls, InterfaceC7627k<T> interfaceC7627k) {
            this.f32893a = cls;
            this.f32894b = interfaceC7627k;
        }

        /* renamed from: a */
        boolean m39518a(Class<?> cls) {
            return this.f32893a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void m39516a(Class<Z> cls, InterfaceC7627k<Z> interfaceC7627k) {
        this.f32892a.add(new a<>(cls, interfaceC7627k));
    }

    /* renamed from: b */
    public synchronized <Z> InterfaceC7627k<Z> m39517b(Class<Z> cls) {
        int size = this.f32892a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f32892a.get(i10);
            if (aVar.m39518a(cls)) {
                return (InterfaceC7627k<Z>) aVar.f32894b;
            }
        }
        return null;
    }
}
