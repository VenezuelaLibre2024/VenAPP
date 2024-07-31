package p088ek;

import dk.AbstractC7007f;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7198a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC7007f<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m21455d((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m21455d(E element) {
        C9322n.m27781e(element, "element");
        return mo21456f(element);
    }

    /* renamed from: f */
    public abstract boolean mo21456f(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: k */
    public abstract /* bridge */ boolean mo21457k(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo21457k((Map.Entry) obj);
        }
        return false;
    }
}
