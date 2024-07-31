package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.C6493a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.e */
/* loaded from: classes2.dex */
public final class C6422e {

    /* renamed from: a */
    private Excluder f14023a = Excluder.f14043r;

    /* renamed from: b */
    private EnumC6504s f14024b = EnumC6504s.DEFAULT;

    /* renamed from: c */
    private InterfaceC6421d f14025c = EnumC6420c.IDENTITY;

    /* renamed from: d */
    private final Map<Type, InterfaceC6423f<?>> f14026d = new HashMap();

    /* renamed from: e */
    private final List<InterfaceC6507v> f14027e = new ArrayList();

    /* renamed from: f */
    private final List<InterfaceC6507v> f14028f = new ArrayList();

    /* renamed from: g */
    private boolean f14029g = false;

    /* renamed from: h */
    private String f14030h = Gson.f13990y;

    /* renamed from: i */
    private int f14031i = 2;

    /* renamed from: j */
    private int f14032j = 2;

    /* renamed from: k */
    private boolean f14033k = false;

    /* renamed from: l */
    private boolean f14034l = false;

    /* renamed from: m */
    private boolean f14035m = true;

    /* renamed from: n */
    private boolean f14036n = false;

    /* renamed from: o */
    private boolean f14037o = false;

    /* renamed from: p */
    private boolean f14038p = false;

    /* renamed from: q */
    private boolean f14039q = true;

    /* renamed from: r */
    private InterfaceC6506u f14040r = Gson.f13987A;

    /* renamed from: s */
    private InterfaceC6506u f14041s = Gson.f13988B;

    /* renamed from: a */
    private void m18054a(String str, int i10, int i11, List<InterfaceC6507v> list) {
        InterfaceC6507v interfaceC6507v;
        InterfaceC6507v interfaceC6507v2;
        boolean z10 = C6493a.f14274a;
        InterfaceC6507v interfaceC6507v3 = null;
        if (str != null && !str.trim().isEmpty()) {
            interfaceC6507v = DefaultDateTypeAdapter.AbstractC6433b.f14073b.m18107b(str);
            if (z10) {
                interfaceC6507v3 = C6493a.f14276c.m18107b(str);
                interfaceC6507v2 = C6493a.f14275b.m18107b(str);
            }
            interfaceC6507v2 = null;
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            InterfaceC6507v m18106a = DefaultDateTypeAdapter.AbstractC6433b.f14073b.m18106a(i10, i11);
            if (z10) {
                interfaceC6507v3 = C6493a.f14276c.m18106a(i10, i11);
                InterfaceC6507v m18106a2 = C6493a.f14275b.m18106a(i10, i11);
                interfaceC6507v = m18106a;
                interfaceC6507v2 = m18106a2;
            } else {
                interfaceC6507v = m18106a;
                interfaceC6507v2 = null;
            }
        }
        list.add(interfaceC6507v);
        if (z10) {
            list.add(interfaceC6507v3);
            list.add(interfaceC6507v2);
        }
    }

    /* renamed from: b */
    public Gson m18055b() {
        List<InterfaceC6507v> arrayList = new ArrayList<>(this.f14027e.size() + this.f14028f.size() + 3);
        arrayList.addAll(this.f14027e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f14028f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m18054a(this.f14030h, this.f14031i, this.f14032j, arrayList);
        return new Gson(this.f14023a, this.f14025c, this.f14026d, this.f14029g, this.f14033k, this.f14037o, this.f14035m, this.f14036n, this.f14038p, this.f14034l, this.f14039q, this.f14024b, this.f14030h, this.f14031i, this.f14032j, this.f14027e, this.f14028f, arrayList, this.f14040r, this.f14041s);
    }

    /* renamed from: c */
    public C6422e m18056c(InterfaceC6507v interfaceC6507v) {
        this.f14027e.add(interfaceC6507v);
        return this;
    }
}
