package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f0 */
/* loaded from: classes2.dex */
public class C5965f0 extends AbstractC5955c<String> implements InterfaceC5968g0, RandomAccess {

    /* renamed from: c */
    private static final C5965f0 f12588c;

    /* renamed from: d */
    public static final InterfaceC5968g0 f12589d;

    /* renamed from: b */
    private final List<Object> f12590b;

    static {
        C5965f0 c5965f0 = new C5965f0();
        f12588c = c5965f0;
        c5965f0.mo15316b();
        f12589d = c5965f0;
    }

    public C5965f0() {
        this(10);
    }

    public C5965f0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private C5965f0(ArrayList<Object> arrayList) {
        this.f12590b = arrayList;
    }

    /* renamed from: f */
    private static String m15417f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC5970h ? ((AbstractC5970h) obj).m15491A() : C5950a0.m15311j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        m15336c();
        if (collection instanceof InterfaceC5968g0) {
            collection = ((InterfaceC5968g0) collection).mo15419e();
        }
        boolean addAll = this.f12590b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m15336c();
        this.f12590b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        m15336c();
        this.f12590b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: e */
    public List<?> mo15419e() {
        return Collections.unmodifiableList(this.f12590b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo15317g() {
        return super.mo15317g();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f12590b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5970h) {
            AbstractC5970h abstractC5970h = (AbstractC5970h) obj;
            String m15491A = abstractC5970h.m15491A();
            if (abstractC5970h.mo15496p()) {
                this.f12590b.set(i10, m15491A);
            }
            return m15491A;
        }
        byte[] bArr = (byte[]) obj;
        String m15311j = C5950a0.m15311j(bArr);
        if (C5950a0.m15308g(bArr)) {
            this.f12590b.set(i10, m15311j);
        }
        return m15311j;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: i */
    public InterfaceC5968g0 mo15421i() {
        return mo15317g() ? new C5999q1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: j */
    public Object mo15422j(int i10) {
        return this.f12590b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: j1 */
    public void mo15423j1(AbstractC5970h abstractC5970h) {
        m15336c();
        this.f12590b.add(abstractC5970h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5965f0 mo15315a(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f12590b);
        return new C5965f0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        m15336c();
        Object remove = this.f12590b.remove(i10);
        ((AbstractList) this).modCount++;
        return m15417f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        m15336c();
        return m15417f(this.f12590b.set(i10, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12590b.size();
    }
}
