package dk;

import java.util.AbstractCollection;
import java.util.Collection;
import pk.InterfaceC10201a;

/* renamed from: dk.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7003d<E> extends AbstractCollection<E> implements Collection<E>, InterfaceC10201a {
    /* renamed from: c */
    public abstract int mo20342c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return mo20342c();
    }
}
