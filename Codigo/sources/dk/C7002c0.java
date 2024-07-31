package dk;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import pk.InterfaceC10201a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.c0 */
/* loaded from: classes3.dex */
public final class C7002c0 implements Map, Serializable, InterfaceC10201a {

    /* renamed from: a */
    public static final C7002c0 f15576a = new C7002c0();
    private static final long serialVersionUID = 8246714829545688274L;

    private C7002c0() {
    }

    private final Object readResolve() {
        return f15576a;
    }

    /* renamed from: a */
    public boolean m20335a(Void value) {
        C9322n.m27781e(value, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> m20337c() {
        return C7004d0.f15577a;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m20335a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set<Object> m20338d() {
        return C7004d0.f15577a;
    }

    /* renamed from: e */
    public int m20339e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m20337c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection m20340f() {
        return C7000b0.f15568a;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m20338d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m20339e();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m20340f();
    }
}
