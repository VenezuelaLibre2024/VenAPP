package p066dg;

import ch.C2006a;
import eg.C7187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import ng.C9716a;
import p336rg.C10707a;
import p446xg.C12484b;
import tg.C11272p;

/* renamed from: dg.k */
/* loaded from: classes2.dex */
public final class C6950k implements InterfaceC6954o {

    /* renamed from: c */
    private static final InterfaceC6954o[] f15490c = new InterfaceC6954o[0];

    /* renamed from: a */
    private Map<EnumC6944e, ?> f15491a;

    /* renamed from: b */
    private InterfaceC6954o[] f15492b;

    /* renamed from: c */
    private C6956q m20103c(C6942c c6942c) {
        InterfaceC6954o[] interfaceC6954oArr = this.f15492b;
        if (interfaceC6954oArr != null) {
            for (InterfaceC6954o interfaceC6954o : interfaceC6954oArr) {
                try {
                    return interfaceC6954o.mo10301b(c6942c, this.f15491a);
                } catch (AbstractC6955p unused) {
                }
            }
            Map<EnumC6944e, ?> map = this.f15491a;
            if (map != null && map.containsKey(EnumC6944e.ALSO_INVERTED)) {
                c6942c.m20084a().m27601d();
                for (InterfaceC6954o interfaceC6954o2 : this.f15492b) {
                    try {
                        return interfaceC6954o2.mo10301b(c6942c, this.f15491a);
                    } catch (AbstractC6955p unused2) {
                    }
                }
            }
        }
        throw C6952m.m20106a();
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        m20105e(null);
        return m20103c(c6942c);
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: b */
    public C6956q mo10301b(C6942c c6942c, Map<EnumC6944e, ?> map) {
        m20105e(map);
        return m20103c(c6942c);
    }

    /* renamed from: d */
    public C6956q m20104d(C6942c c6942c) {
        if (this.f15492b == null) {
            m20105e(null);
        }
        return m20103c(c6942c);
    }

    /* renamed from: e */
    public void m20105e(Map<EnumC6944e, ?> map) {
        this.f15491a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(EnumC6944e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(EnumC6944e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC6940a.UPC_A) && !collection.contains(EnumC6940a.UPC_E) && !collection.contains(EnumC6940a.EAN_13) && !collection.contains(EnumC6940a.EAN_8) && !collection.contains(EnumC6940a.CODABAR) && !collection.contains(EnumC6940a.CODE_39) && !collection.contains(EnumC6940a.CODE_93) && !collection.contains(EnumC6940a.CODE_128) && !collection.contains(EnumC6940a.ITF) && !collection.contains(EnumC6940a.RSS_14) && !collection.contains(EnumC6940a.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new C11272p(map));
            }
            if (collection.contains(EnumC6940a.QR_CODE)) {
                arrayList.add(new C2006a());
            }
            if (collection.contains(EnumC6940a.DATA_MATRIX)) {
                arrayList.add(new C9716a());
            }
            if (collection.contains(EnumC6940a.AZTEC)) {
                arrayList.add(new C7187b());
            }
            if (collection.contains(EnumC6940a.PDF_417)) {
                arrayList.add(new C12484b());
            }
            if (collection.contains(EnumC6940a.MAXICODE)) {
                arrayList.add(new C10707a());
            }
            if (z10 && z11) {
                arrayList.add(new C11272p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new C11272p(map));
            }
            arrayList.add(new C2006a());
            arrayList.add(new C9716a());
            arrayList.add(new C7187b());
            arrayList.add(new C12484b());
            arrayList.add(new C10707a());
            if (z11) {
                arrayList.add(new C11272p(map));
            }
        }
        this.f15492b = (InterfaceC6954o[]) arrayList.toArray(f15490c);
    }

    @Override // p066dg.InterfaceC6954o
    public void reset() {
        InterfaceC6954o[] interfaceC6954oArr = this.f15492b;
        if (interfaceC6954oArr != null) {
            for (InterfaceC6954o interfaceC6954o : interfaceC6954oArr) {
                interfaceC6954o.reset();
            }
        }
    }
}
