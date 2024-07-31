package p166ik;

import dk.AbstractC7001c;
import dk.C7021m;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ik.c */
/* loaded from: classes3.dex */
public final class C8006c<T extends Enum<T>> extends AbstractC7001c<T> implements InterfaceC8004a<T>, Serializable {

    /* renamed from: b */
    private final T[] f19477b;

    public C8006c(T[] entries) {
        C9322n.m27781e(entries, "entries");
        this.f19477b = entries;
    }

    private final Object writeReplace() {
        return new C8007d(this.f19477b);
    }

    @Override // dk.AbstractC6997a
    /* renamed from: c */
    public int mo20314c() {
        return this.f19477b.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.AbstractC6997a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m24583d((Enum) obj);
        }
        return false;
    }

    /* renamed from: d */
    public boolean m24583d(T element) {
        Object m20498z;
        C9322n.m27781e(element, "element");
        m20498z = C7021m.m20498z(this.f19477b, element.ordinal());
        return ((Enum) m20498z) == element;
    }

    @Override // dk.AbstractC7001c, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        AbstractC7001c.f15569a.m20328b(i10, this.f19477b.length);
        return this.f19477b[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.AbstractC7001c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m24585k((Enum) obj);
        }
        return -1;
    }

    /* renamed from: k */
    public int m24585k(T element) {
        Object m20498z;
        C9322n.m27781e(element, "element");
        int ordinal = element.ordinal();
        m20498z = C7021m.m20498z(this.f19477b, ordinal);
        if (((Enum) m20498z) == element) {
            return ordinal;
        }
        return -1;
    }

    /* renamed from: l */
    public int m24586l(T element) {
        C9322n.m27781e(element, "element");
        return indexOf(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.AbstractC7001c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m24586l((Enum) obj);
        }
        return -1;
    }
}
