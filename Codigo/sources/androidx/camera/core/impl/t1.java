package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<s1> f2584a;

    public t1(List<s1> list) {
        this.f2584a = new ArrayList(list);
    }

    public boolean a(Class<? extends s1> cls) {
        Iterator<s1> it = this.f2584a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends s1> T b(Class<T> cls) {
        Iterator<s1> it = this.f2584a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }
}
