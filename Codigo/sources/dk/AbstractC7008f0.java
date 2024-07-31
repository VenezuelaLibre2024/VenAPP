package dk;

import java.util.Iterator;
import pk.InterfaceC10201a;

/* renamed from: dk.f0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7008f0 implements Iterator<Long>, InterfaceC10201a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
