package p088ek;

import dk.AbstractC7007f;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.j */
/* loaded from: classes3.dex */
public final class C7207j<E> extends AbstractC7007f<E> implements Serializable {

    /* renamed from: b */
    private static final a f16176b = new a(null);

    /* renamed from: c */
    private static final C7207j f16177c = new C7207j(C7201d.f16149x.m21527e());

    /* renamed from: a */
    private final C7201d<E, ?> f16178a;

    /* renamed from: ek.j$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C7207j() {
        this(new C7201d());
    }

    public C7207j(int i10) {
        this(new C7201d(i10));
    }

    public C7207j(C7201d<E, ?> backing) {
        C9322n.m27781e(backing, "backing");
        this.f16178a = backing;
    }

    private final Object writeReplace() {
        if (this.f16178a.m21507C()) {
            return new C7205h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        return this.f16178a.m21513i(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16178a.m21515l();
        return super.addAll(elements);
    }

    @Override // dk.AbstractC7007f
    /* renamed from: c */
    public int mo20347c() {
        return this.f16178a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f16178a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f16178a.containsKey(obj);
    }

    /* renamed from: d */
    public final Set<E> m21538d() {
        this.f16178a.m21514k();
        return size() > 0 ? this : f16177c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f16178a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f16178a.m21508D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f16178a.m21510K(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16178a.m21515l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16178a.m21515l();
        return super.retainAll(elements);
    }
}
