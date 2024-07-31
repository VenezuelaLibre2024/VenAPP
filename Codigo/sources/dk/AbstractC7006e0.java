package dk;

import java.util.Iterator;
import pk.InterfaceC10201a;

/* renamed from: dk.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7006e0 implements Iterator<Integer>, InterfaceC10201a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
