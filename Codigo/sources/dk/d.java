package dk;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class d<E> extends AbstractCollection<E> implements Collection<E>, pk.a {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }
}
