package tg;

import java.util.Collection;
import java.util.Map;
import kg.C9263a;
import p066dg.AbstractC6955p;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;

/* renamed from: tg.q */
/* loaded from: classes2.dex */
public final class C11273q extends AbstractC11274r {

    /* renamed from: b */
    private static final AbstractC11281y[] f29238b = new AbstractC11281y[0];

    /* renamed from: a */
    private final AbstractC11281y[] f29239a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11273q(java.util.Map<p066dg.EnumC6944e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            dg.e r0 = p066dg.EnumC6944e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            dg.a r1 = p066dg.EnumC6940a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            tg.i r1 = new tg.i
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            dg.a r1 = p066dg.EnumC6940a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            tg.t r1 = new tg.t
            r1.<init>()
            goto L23
        L35:
            dg.a r1 = p066dg.EnumC6940a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            tg.k r1 = new tg.k
            r1.<init>()
            r0.add(r1)
        L45:
            dg.a r1 = p066dg.EnumC6940a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            tg.a0 r3 = new tg.a0
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            tg.i r3 = new tg.i
            r3.<init>()
            r0.add(r3)
            tg.k r3 = new tg.k
            r3.<init>()
            r0.add(r3)
            tg.a0 r3 = new tg.a0
            r3.<init>()
            r0.add(r3)
        L73:
            tg.y[] r3 = tg.C11273q.f29238b
            java.lang.Object[] r3 = r0.toArray(r3)
            tg.y[] r3 = (tg.AbstractC11281y[]) r3
            r2.f29239a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C11273q.<init>(java.util.Map):void");
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        boolean z10;
        int[] m35248p = AbstractC11281y.m35248p(c9263a);
        for (AbstractC11281y abstractC11281y : this.f29239a) {
            try {
                C6956q mo35233m = abstractC11281y.mo35233m(i10, c9263a, m35248p, map);
                boolean z11 = mo35233m.m20109b() == EnumC6940a.EAN_13 && mo35233m.m20113f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(EnumC6944e.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(EnumC6940a.UPC_A)) {
                    z10 = false;
                    if (z11 || !z10) {
                        return mo35233m;
                    }
                    C6956q c6956q = new C6956q(mo35233m.m20113f().substring(1), mo35233m.m20110c(), mo35233m.m20112e(), EnumC6940a.UPC_A);
                    c6956q.m20114g(mo35233m.m20111d());
                    return c6956q;
                }
                z10 = true;
                if (z11) {
                }
                return mo35233m;
            } catch (AbstractC6955p unused) {
            }
        }
        throw C6952m.m20106a();
    }

    @Override // tg.AbstractC11274r, p066dg.InterfaceC6954o
    public void reset() {
        for (AbstractC11281y abstractC11281y : this.f29239a) {
            abstractC11281y.reset();
        }
    }
}
