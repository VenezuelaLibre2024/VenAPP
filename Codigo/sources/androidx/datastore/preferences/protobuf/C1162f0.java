package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.f0 */
/* loaded from: classes.dex */
public class C1162f0 extends AbstractC1152c<String> implements InterfaceC1165g0, RandomAccess {

    /* renamed from: c */
    private static final C1162f0 f4828c;

    /* renamed from: d */
    public static final InterfaceC1165g0 f4829d;

    /* renamed from: b */
    private final List<Object> f4830b;

    static {
        C1162f0 c1162f0 = new C1162f0();
        f4828c = c1162f0;
        c1162f0.mo5657b();
        f4829d = c1162f0;
    }

    public C1162f0() {
        this(10);
    }

    public C1162f0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private C1162f0(ArrayList<Object> arrayList) {
        this.f4830b = arrayList;
    }

    /* renamed from: f */
    private static String m5781f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1167h ? ((AbstractC1167h) obj).m5811A() : C1147a0.m5652j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: J0 */
    public void mo5782J0(AbstractC1167h abstractC1167h) {
        m5675c();
        this.f4830b.add(abstractC1167h);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        m5675c();
        if (collection instanceof InterfaceC1165g0) {
            collection = ((InterfaceC1165g0) collection).mo5784e();
        }
        boolean addAll = this.f4830b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m5675c();
        this.f4830b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        m5675c();
        this.f4830b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: e */
    public List<?> mo5784e() {
        return Collections.unmodifiableList(this.f4830b);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, androidx.datastore.preferences.protobuf.C1147a0.i
    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo5658g() {
        return super.mo5658g();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f4830b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1167h) {
            AbstractC1167h abstractC1167h = (AbstractC1167h) obj;
            String m5811A = abstractC1167h.m5811A();
            if (abstractC1167h.mo5816p()) {
                this.f4830b.set(i10, m5811A);
            }
            return m5811A;
        }
        byte[] bArr = (byte[]) obj;
        String m5652j = C1147a0.m5652j(bArr);
        if (C1147a0.m5649g(bArr)) {
            this.f4830b.set(i10, m5652j);
        }
        return m5652j;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: i */
    public InterfaceC1165g0 mo5786i() {
        return mo5658g() ? new C1196q1(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: j */
    public Object mo5787j(int i10) {
        return this.f4830b.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.C1147a0.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C1162f0 mo5656a(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f4830b);
        return new C1162f0((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        m5675c();
        Object remove = this.f4830b.remove(i10);
        ((AbstractList) this).modCount++;
        return m5781f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        m5675c();
        return m5781f(this.f4830b.set(i10, str));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4830b.size();
    }
}
