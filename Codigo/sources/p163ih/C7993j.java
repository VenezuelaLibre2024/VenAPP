package p163ih;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import p066dg.C6950k;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;

/* renamed from: ih.j */
/* loaded from: classes3.dex */
public class C7993j implements InterfaceC7990g {

    /* renamed from: a */
    private Collection<EnumC6940a> f19454a;

    /* renamed from: b */
    private Map<EnumC6944e, ?> f19455b;

    /* renamed from: c */
    private String f19456c;

    /* renamed from: d */
    private int f19457d;

    public C7993j() {
    }

    public C7993j(Collection<EnumC6940a> collection, Map<EnumC6944e, ?> map, String str, int i10) {
        this.f19454a = collection;
        this.f19455b = map;
        this.f19456c = str;
        this.f19457d = i10;
    }

    @Override // p163ih.InterfaceC7990g
    /* renamed from: a */
    public C7989f mo24538a(Map<EnumC6944e, ?> map) {
        EnumMap enumMap = new EnumMap(EnumC6944e.class);
        enumMap.putAll(map);
        Map<EnumC6944e, ?> map2 = this.f19455b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<EnumC6940a> collection = this.f19454a;
        if (collection != null) {
            enumMap.put((EnumMap) EnumC6944e.POSSIBLE_FORMATS, (EnumC6944e) collection);
        }
        String str = this.f19456c;
        if (str != null) {
            enumMap.put((EnumMap) EnumC6944e.CHARACTER_SET, (EnumC6944e) str);
        }
        C6950k c6950k = new C6950k();
        c6950k.m20105e(enumMap);
        int i10 = this.f19457d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new C7989f(c6950k) : new C7995l(c6950k) : new C7994k(c6950k) : new C7989f(c6950k);
    }
}
