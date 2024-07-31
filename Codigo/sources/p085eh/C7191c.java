package p085eh;

import java.util.Map;
import kg.AbstractC9274l;
import kg.C9264b;
import kg.C9269g;
import kg.C9277o;
import p066dg.C6952m;
import p066dg.C6958s;
import p066dg.EnumC6944e;
import p066dg.InterfaceC6959t;
import p067dh.C6971j;
import p222lg.C9506a;

/* renamed from: eh.c */
/* loaded from: classes2.dex */
public class C7191c {

    /* renamed from: a */
    private final C9264b f16094a;

    /* renamed from: b */
    private InterfaceC6959t f16095b;

    public C7191c(C9264b c9264b) {
        this.f16094a = c9264b;
    }

    /* renamed from: b */
    private float m21406b(C6958s c6958s, C6958s c6958s2) {
        float m21411j = m21411j((int) c6958s.m20119c(), (int) c6958s.m20120d(), (int) c6958s2.m20119c(), (int) c6958s2.m20120d());
        float m21411j2 = m21411j((int) c6958s2.m20119c(), (int) c6958s2.m20120d(), (int) c6958s.m20119c(), (int) c6958s.m20120d());
        return Float.isNaN(m21411j) ? m21411j2 / 7.0f : Float.isNaN(m21411j2) ? m21411j / 7.0f : (m21411j + m21411j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m21407c(C6958s c6958s, C6958s c6958s2, C6958s c6958s3, float f10) {
        int m28273c = ((C9506a.m28273c(C6958s.m20117b(c6958s, c6958s2) / f10) + C9506a.m28273c(C6958s.m20117b(c6958s, c6958s3) / f10)) / 2) + 7;
        int i10 = m28273c & 3;
        if (i10 == 0) {
            return m28273c + 1;
        }
        if (i10 == 2) {
            return m28273c - 1;
        }
        if (i10 != 3) {
            return m28273c;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: d */
    private static C9277o m21408d(C6958s c6958s, C6958s c6958s2, C6958s c6958s3, C6958s c6958s4, int i10) {
        float m20119c;
        float m20120d;
        float f10;
        float f11 = i10 - 3.5f;
        if (c6958s4 != null) {
            m20119c = c6958s4.m20119c();
            m20120d = c6958s4.m20120d();
            f10 = f11 - 3.0f;
        } else {
            m20119c = (c6958s2.m20119c() - c6958s.m20119c()) + c6958s3.m20119c();
            m20120d = (c6958s2.m20120d() - c6958s.m20120d()) + c6958s3.m20120d();
            f10 = f11;
        }
        return C9277o.m27678b(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, c6958s.m20119c(), c6958s.m20120d(), c6958s2.m20119c(), c6958s2.m20120d(), m20119c, m20120d, c6958s3.m20119c(), c6958s3.m20120d());
    }

    /* renamed from: h */
    private static C9264b m21409h(C9264b c9264b, C9277o c9277o, int i10) {
        return AbstractC9274l.m27662b().mo27640d(c9264b, i10, i10, c9277o);
    }

    /* renamed from: i */
    private float m21410i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C7191c c7191c;
        boolean z10;
        int i20;
        int i21 = 1;
        boolean z11 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z11) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 < i17 ? 1 : -1;
        int i26 = i16 + i24;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 == i26) {
                i18 = i26;
                i19 = i22;
                break;
            }
            int i30 = z11 ? i28 : i27;
            int i31 = z11 ? i27 : i28;
            if (i29 == i21) {
                z10 = z11;
                i20 = i21;
                i18 = i26;
                c7191c = this;
            } else {
                c7191c = this;
                z10 = z11;
                i18 = i26;
                i20 = 0;
            }
            if (i20 == c7191c.f16094a.m27603g(i30, i31)) {
                if (i29 == 2) {
                    return C9506a.m28272b(i27, i28, i14, i15);
                }
                i29++;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i28 == i17) {
                    i19 = 2;
                    break;
                }
                i28 += i25;
                i23 -= abs;
            }
            i27 += i24;
            i26 = i18;
            z11 = z10;
            i21 = 1;
            i22 = 2;
        }
        if (i29 == i19) {
            return C9506a.m28272b(i18, i17, i14, i15);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m21411j(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float m21410i = m21410i(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else if (i14 >= this.f16094a.m27609m()) {
            f10 = ((this.f16094a.m27609m() - 1) - i10) / (i14 - i10);
            i14 = this.f16094a.m27609m() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = i11;
        int i16 = (int) (f12 - ((i13 - i11) * f10));
        if (i16 < 0) {
            f11 = f12 / (i11 - i16);
        } else if (i16 >= this.f16094a.m27606j()) {
            f11 = ((this.f16094a.m27606j() - 1) - i11) / (i16 - i11);
            i15 = this.f16094a.m27606j() - 1;
        } else {
            i15 = i16;
            f11 = 1.0f;
        }
        return (m21410i + m21410i(i10, i11, (int) (i10 + ((i14 - i10) * f11)), i15)) - 1.0f;
    }

    /* renamed from: a */
    protected final float m21412a(C6958s c6958s, C6958s c6958s2, C6958s c6958s3) {
        return (m21406b(c6958s, c6958s2) + m21406b(c6958s, c6958s3)) / 2.0f;
    }

    /* renamed from: e */
    public final C9269g m21413e(Map<EnumC6944e, ?> map) {
        this.f16095b = map == null ? null : (InterfaceC6959t) map.get(EnumC6944e.NEED_RESULT_POINT_CALLBACK);
        return m21415g(new C7193e(this.f16094a, this.f16095b).m21433g(map));
    }

    /* renamed from: f */
    protected final C7189a m21414f(float f10, int i10, int i11, float f11) {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f16094a.m27609m() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw C6952m.m20106a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(this.f16094a.m27606j() - 1, i11 + i12) - max2;
        if (min2 >= f12) {
            return new C7190b(this.f16094a, max, max2, min, min2, f10, this.f16095b).m21405c();
        }
        throw C6952m.m20106a();
    }

    /* renamed from: g */
    protected final C9269g m21415g(C7194f c7194f) {
        C7189a c7189a;
        C7192d m21437b = c7194f.m21437b();
        C7192d m21438c = c7194f.m21438c();
        C7192d m21436a = c7194f.m21436a();
        float m21412a = m21412a(m21437b, m21438c, m21436a);
        if (m21412a < 1.0f) {
            throw C6952m.m20106a();
        }
        int m21407c = m21407c(m21437b, m21438c, m21436a, m21412a);
        C6971j m20158g = C6971j.m20158g(m21407c);
        int m20162e = m20158g.m20162e() - 7;
        if (m20158g.m20161d().length > 0) {
            float m20119c = (m21438c.m20119c() - m21437b.m20119c()) + m21436a.m20119c();
            float m20120d = (m21438c.m20120d() - m21437b.m20120d()) + m21436a.m20120d();
            float f10 = 1.0f - (3.0f / m20162e);
            int m20119c2 = (int) (m21437b.m20119c() + ((m20119c - m21437b.m20119c()) * f10));
            int m20120d2 = (int) (m21437b.m20120d() + (f10 * (m20120d - m21437b.m20120d())));
            for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                try {
                    c7189a = m21414f(m21412a, m20119c2, m20120d2, i10);
                    break;
                } catch (C6952m unused) {
                }
            }
        }
        c7189a = null;
        return new C9269g(m21409h(this.f16094a, m21408d(m21437b, m21438c, m21436a, c7189a, m21407c), m21407c), c7189a == null ? new C6958s[]{m21436a, m21437b, m21438c} : new C6958s[]{m21436a, m21437b, m21438c, c7189a});
    }
}
