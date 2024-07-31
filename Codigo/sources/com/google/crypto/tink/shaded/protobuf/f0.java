package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class f0 extends c<String> implements g0, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final f0 f11373c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f11374d;

    /* renamed from: b, reason: collision with root package name */
    private final List<Object> f11375b;

    static {
        f0 f0Var = new f0();
        f11373c = f0Var;
        f0Var.b();
        f11374d = f0Var;
    }

    public f0() {
        this(10);
    }

    public f0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private f0(ArrayList<Object> arrayList) {
        this.f11375b = arrayList;
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h ? ((h) obj).A() : a0.j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof g0) {
            collection = ((g0) collection).e();
        }
        boolean addAll = this.f11375b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f11375b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        c();
        this.f11375b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public List<?> e() {
        return Collections.unmodifiableList(this.f11375b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, com.google.crypto.tink.shaded.protobuf.a0.i
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f11375b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String A = hVar.A();
            if (hVar.p()) {
                this.f11375b.set(i10, A);
            }
            return A;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = a0.j(bArr);
        if (a0.g(bArr)) {
            this.f11375b.set(i10, j10);
        }
        return j10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public g0 i() {
        return g() ? new q1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public Object j(int i10) {
        return this.f11375b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public void j1(h hVar) {
        c();
        this.f11375b.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public f0 a(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f11375b);
        return new f0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        c();
        Object remove = this.f11375b.remove(i10);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        c();
        return f(this.f11375b.set(i10, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11375b.size();
    }
}
