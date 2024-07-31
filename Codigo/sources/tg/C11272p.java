package tg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kg.C9263a;
import p066dg.AbstractC6955p;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import ug.C11558e;
import vg.C11893d;

/* renamed from: tg.p */
/* loaded from: classes2.dex */
public final class C11272p extends AbstractC11274r {

    /* renamed from: b */
    private static final AbstractC11274r[] f29236b = new AbstractC11274r[0];

    /* renamed from: a */
    private final AbstractC11274r[] f29237a;

    public C11272p(Map<EnumC6944e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC6944e.POSSIBLE_FORMATS);
        boolean z10 = (map == null || map.get(EnumC6944e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC6940a.EAN_13) || collection.contains(EnumC6940a.UPC_A) || collection.contains(EnumC6940a.EAN_8) || collection.contains(EnumC6940a.UPC_E)) {
                arrayList.add(new C11273q(map));
            }
            if (collection.contains(EnumC6940a.CODE_39)) {
                arrayList.add(new C11261e(z10));
            }
            if (collection.contains(EnumC6940a.CODE_93)) {
                arrayList.add(new C11263g());
            }
            if (collection.contains(EnumC6940a.CODE_128)) {
                arrayList.add(new C11259c());
            }
            if (collection.contains(EnumC6940a.ITF)) {
                arrayList.add(new C11270n());
            }
            if (collection.contains(EnumC6940a.CODABAR)) {
                arrayList.add(new C11255a());
            }
            if (collection.contains(EnumC6940a.RSS_14)) {
                arrayList.add(new C11558e());
            }
            if (collection.contains(EnumC6940a.RSS_EXPANDED)) {
                arrayList.add(new C11893d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C11273q(map));
            arrayList.add(new C11261e());
            arrayList.add(new C11255a());
            arrayList.add(new C11263g());
            arrayList.add(new C11259c());
            arrayList.add(new C11270n());
            arrayList.add(new C11558e());
            arrayList.add(new C11893d());
        }
        this.f29237a = (AbstractC11274r[]) arrayList.toArray(f29236b);
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        for (AbstractC11274r abstractC11274r : this.f29237a) {
            try {
                return abstractC11274r.mo35175c(i10, c9263a, map);
            } catch (AbstractC6955p unused) {
            }
        }
        throw C6952m.m20106a();
    }

    @Override // tg.AbstractC11274r, p066dg.InterfaceC6954o
    public void reset() {
        for (AbstractC11274r abstractC11274r : this.f29237a) {
            abstractC11274r.reset();
        }
    }
}
