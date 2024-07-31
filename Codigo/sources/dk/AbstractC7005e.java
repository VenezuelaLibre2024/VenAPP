package dk;

import java.util.AbstractList;
import java.util.List;
import pk.InterfaceC10202b;

/* renamed from: dk.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7005e<E> extends AbstractList<E> implements List<E>, InterfaceC10202b {
    /* renamed from: c */
    public abstract int mo20345c();

    /* renamed from: d */
    public abstract E mo20346d(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return mo20346d(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo20345c();
    }
}
