package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.k1 */
/* loaded from: classes.dex */
public abstract class AbstractC0639k1<C> {

    /* renamed from: a */
    private Set<C> f2863a = new HashSet();

    /* renamed from: a */
    public void m3135a(List<C> list) {
        this.f2863a.addAll(list);
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0639k1<C> clone();

    /* renamed from: c */
    public List<C> m3137c() {
        return Collections.unmodifiableList(new ArrayList(this.f2863a));
    }
}
