package p260o0;

import java.util.ArrayList;
import p243n0.C9621d;
import p243n0.C9622e;
import p243n0.C9624g;
import p243n0.C9626i;

/* renamed from: o0.i */
/* loaded from: classes.dex */
public class C9761i {
    /* renamed from: a */
    public static C9767o m29273a(C9622e c9622e, int i10, ArrayList<C9767o> arrayList, C9767o c9767o) {
        C9621d c9621d;
        int m28819p1;
        int i11 = i10 == 0 ? c9622e.f23470I0 : c9622e.f23472J0;
        if (i11 != -1 && (c9767o == null || i11 != c9767o.f24046b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                C9767o c9767o2 = arrayList.get(i12);
                if (c9767o2.m29290c() == i11) {
                    if (c9767o != null) {
                        c9767o.m29293g(i10, c9767o2);
                        arrayList.remove(c9767o);
                    }
                    c9767o = c9767o2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return c9767o;
        }
        if (c9767o == null) {
            if ((c9622e instanceof C9626i) && (m28819p1 = ((C9626i) c9622e).m28819p1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    C9767o c9767o3 = arrayList.get(i13);
                    if (c9767o3.m29290c() == m28819p1) {
                        c9767o = c9767o3;
                        break;
                    }
                    i13++;
                }
            }
            if (c9767o == null) {
                c9767o = new C9767o(i10);
            }
            arrayList.add(c9767o);
        }
        if (c9767o.m29288a(c9622e)) {
            if (c9622e instanceof C9624g) {
                C9624g c9624g = (C9624g) c9622e;
                c9624g.m28805o1().m28644b(c9624g.m28806p1() == 0 ? 1 : 0, arrayList, c9767o);
            }
            int m29290c = c9767o.m29290c();
            if (i10 == 0) {
                c9622e.f23470I0 = m29290c;
                c9622e.f23477O.m28644b(i10, arrayList, c9767o);
                c9621d = c9622e.f23479Q;
            } else {
                c9622e.f23472J0 = m29290c;
                c9622e.f23478P.m28644b(i10, arrayList, c9767o);
                c9622e.f23481S.m28644b(i10, arrayList, c9767o);
                c9621d = c9622e.f23480R;
            }
            c9621d.m28644b(i10, arrayList, c9767o);
            c9622e.f23484V.m28644b(i10, arrayList, c9767o);
        }
        return c9767o;
    }

    /* renamed from: b */
    private static C9767o m29274b(ArrayList<C9767o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C9767o c9767o = arrayList.get(i11);
            if (i10 == c9767o.f24046b) {
                return c9767o;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0388  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m29275c(p243n0.C9623f r16, p260o0.C9754b.b r17) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9761i.m29275c(n0.f, o0.b$b):boolean");
    }

    /* renamed from: d */
    public static boolean m29276d(C9622e.b bVar, C9622e.b bVar2, C9622e.b bVar3, C9622e.b bVar4) {
        C9622e.b bVar5;
        C9622e.b bVar6;
        C9622e.b bVar7 = C9622e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C9622e.b.WRAP_CONTENT) || (bVar3 == C9622e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C9622e.b.WRAP_CONTENT) || (bVar4 == C9622e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
