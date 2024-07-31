package ik;

import dk.m;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c<T extends Enum<T>> extends dk.c<T> implements a<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final T[] f17814b;

    public c(T[] entries) {
        n.e(entries, "entries");
        this.f17814b = entries;
    }

    private final Object writeReplace() {
        return new d(this.f17814b);
    }

    @Override // dk.a
    public int c() {
        return this.f17814b.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return d((Enum) obj);
        }
        return false;
    }

    public boolean d(T element) {
        Object z10;
        n.e(element, "element");
        z10 = m.z(this.f17814b, element.ordinal());
        return ((Enum) z10) == element;
    }

    @Override // dk.c, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        dk.c.f14211a.b(i10, this.f17814b.length);
        return this.f17814b[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }

    public int k(T element) {
        Object z10;
        n.e(element, "element");
        int ordinal = element.ordinal();
        z10 = m.z(this.f17814b, ordinal);
        if (((Enum) z10) == element) {
            return ordinal;
        }
        return -1;
    }

    public int l(T element) {
        n.e(element, "element");
        return indexOf(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return -1;
    }
}
