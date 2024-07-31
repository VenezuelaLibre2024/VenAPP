package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.f0 */
/* loaded from: classes2.dex */
public class C6578f0 extends AbstractC6568c<String> implements InterfaceC6581g0, RandomAccess {

    /* renamed from: c */
    private static final C6578f0 f14456c;

    /* renamed from: d */
    public static final InterfaceC6581g0 f14457d;

    /* renamed from: b */
    private final List<Object> f14458b;

    static {
        C6578f0 c6578f0 = new C6578f0();
        f14456c = c6578f0;
        c6578f0.mo18411b();
        f14457d = c6578f0;
    }

    public C6578f0() {
        this(10);
    }

    public C6578f0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private C6578f0(ArrayList<Object> arrayList) {
        this.f14458b = arrayList;
    }

    /* renamed from: f */
    private static String m18455f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC6580g ? ((AbstractC6580g) obj).m18518A() : C6633z.m19356j((byte[]) obj);
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: B */
    public void mo18456B(AbstractC6580g abstractC6580g) {
        m18412c();
        this.f14458b.add(abstractC6580g);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        m18412c();
        if (collection instanceof InterfaceC6581g0) {
            collection = ((InterfaceC6581g0) collection).mo18458e();
        }
        boolean addAll = this.f14458b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m18412c();
        this.f14458b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        m18412c();
        this.f14458b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: e */
    public List<?> mo18458e() {
        return Collections.unmodifiableList(this.f14458b);
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.AbstractC6568c, com.google.protobuf.C6633z.i
    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo18413g() {
        return super.mo18413g();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f14458b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6580g) {
            AbstractC6580g abstractC6580g = (AbstractC6580g) obj;
            String m18518A = abstractC6580g.m18518A();
            if (abstractC6580g.mo18523p()) {
                this.f14458b.set(i10, m18518A);
            }
            return m18518A;
        }
        byte[] bArr = (byte[]) obj;
        String m19356j = C6633z.m19356j(bArr);
        if (C6633z.m19353g(bArr)) {
            this.f14458b.set(i10, m19356j);
        }
        return m19356j;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: i */
    public InterfaceC6581g0 mo18460i() {
        return mo18413g() ? new C6612q1(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: j */
    public Object mo18461j(int i10) {
        return this.f14458b.get(i10);
    }

    @Override // com.google.protobuf.C6633z.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C6578f0 mo18430a(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f14458b);
        return new C6578f0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        m18412c();
        Object remove = this.f14458b.remove(i10);
        ((AbstractList) this).modCount++;
        return m18455f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        m18412c();
        return m18455f(this.f14458b.set(i10, str));
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14458b.size();
    }
}
