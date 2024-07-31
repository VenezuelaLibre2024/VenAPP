package dk;

import java.util.Iterator;
import pk.InterfaceC10201a;

/* renamed from: dk.o */
/* loaded from: classes3.dex */
public abstract class AbstractC7025o implements Iterator<Character>, InterfaceC10201a {
    /* renamed from: a */
    public abstract char mo20507a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(mo20507a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
