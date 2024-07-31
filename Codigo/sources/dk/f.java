package dk;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class f<E> extends AbstractSet<E> implements Set<E>, pk.a {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
