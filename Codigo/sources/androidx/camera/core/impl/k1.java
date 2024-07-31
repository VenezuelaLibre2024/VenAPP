package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class k1<C> {

    /* renamed from: a, reason: collision with root package name */
    private Set<C> f2525a = new HashSet();

    public void a(List<C> list) {
        this.f2525a.addAll(list);
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract k1<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f2525a));
    }
}
