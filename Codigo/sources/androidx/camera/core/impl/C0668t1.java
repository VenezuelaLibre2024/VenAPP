package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.t1 */
/* loaded from: classes.dex */
public class C0668t1 {

    /* renamed from: a */
    private final List<InterfaceC0665s1> f2928a;

    public C0668t1(List<InterfaceC0665s1> list) {
        this.f2928a = new ArrayList(list);
    }

    /* renamed from: a */
    public boolean m3237a(Class<? extends InterfaceC0665s1> cls) {
        Iterator<InterfaceC0665s1> it = this.f2928a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public <T extends InterfaceC0665s1> T m3238b(Class<T> cls) {
        Iterator<InterfaceC0665s1> it = this.f2928a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }
}
