package dk;

import java.util.AbstractSet;
import java.util.Set;
import pk.InterfaceC10201a;

/* renamed from: dk.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7007f<E> extends AbstractSet<E> implements Set<E>, InterfaceC10201a {
    /* renamed from: c */
    public abstract int mo20347c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return mo20347c();
    }
}
