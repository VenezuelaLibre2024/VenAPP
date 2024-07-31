package p155i7;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.List;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11145e;
import p363t8.C11146e0;

/* renamed from: i7.j */
/* loaded from: classes.dex */
public final class C7880j implements InterfaceC7879i0.c {

    /* renamed from: a */
    private final int f18991a;

    /* renamed from: b */
    private final List<C11108u1> f18992b;

    public C7880j(int i10) {
        this(i10, AbstractC5907w.m15081v());
    }

    public C7880j(int i10, List<C11108u1> list) {
        this.f18991a = i10;
        this.f18992b = list;
    }

    /* renamed from: c */
    private C7869d0 m24266c(InterfaceC7879i0.b bVar) {
        return new C7869d0(m24268e(bVar));
    }

    /* renamed from: d */
    private C7883k0 m24267d(InterfaceC7879i0.b bVar) {
        return new C7883k0(m24268e(bVar));
    }

    /* renamed from: e */
    private List<C11108u1> m24268e(InterfaceC7879i0.b bVar) {
        String str;
        int i10;
        if (m24269f(32)) {
            return this.f18992b;
        }
        C11146e0 c11146e0 = new C11146e0(bVar.f18985d);
        List<C11108u1> list = this.f18992b;
        while (c11146e0.m34679a() > 0) {
            int m34664H = c11146e0.m34664H();
            int m34683f = c11146e0.m34683f() + c11146e0.m34664H();
            if (m34664H == 134) {
                list = new ArrayList<>();
                int m34664H2 = c11146e0.m34664H() & 31;
                for (int i11 = 0; i11 < m34664H2; i11++) {
                    String m34661E = c11146e0.m34661E(3);
                    int m34664H3 = c11146e0.m34664H();
                    boolean z10 = (m34664H3 & RecognitionOptions.ITF) != 0;
                    if (z10) {
                        i10 = m34664H3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte m34664H4 = (byte) c11146e0.m34664H();
                    c11146e0.m34678V(1);
                    list.add(new C11108u1.b().m34552g0(str).m34543X(m34661E).m34527H(i10).m34541V(z10 ? C11145e.m34645b((m34664H4 & 64) != 0) : null).m34526G());
                }
            }
            c11146e0.m34677U(m34683f);
        }
        return list;
    }

    /* renamed from: f */
    private boolean m24269f(int i10) {
        return (i10 & this.f18991a) != 0;
    }

    @Override // p155i7.InterfaceC7879i0.c
    /* renamed from: a */
    public SparseArray<InterfaceC7879i0> mo24260a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x002e. Please report as an issue. */
    @Override // p155i7.InterfaceC7879i0.c
    /* renamed from: b */
    public InterfaceC7879i0 mo24261b(int i10, InterfaceC7879i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new C7895w(new C7892t(bVar.f18983b));
            }
            if (i10 == 21) {
                return new C7895w(new C7890r());
            }
            if (i10 == 27) {
                if (m24269f(4)) {
                    return null;
                }
                return new C7895w(new C7888p(m24266c(bVar), m24269f(1), m24269f(8)));
            }
            if (i10 == 36) {
                return new C7895w(new C7889q(m24266c(bVar)));
            }
            if (i10 == 89) {
                return new C7895w(new C7884l(bVar.f18984c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new C7895w(new C7872f(bVar.f18983b));
                }
                if (i10 == 257) {
                    return new C7867c0(new C7894v("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (m24269f(16)) {
                        return null;
                    }
                    return new C7867c0(new C7894v("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (m24269f(2)) {
                                return null;
                            }
                            return new C7895w(new C7878i(false, bVar.f18983b));
                        case 16:
                            return new C7895w(new C7887o(m24267d(bVar)));
                        case 17:
                            if (m24269f(2)) {
                                return null;
                            }
                            return new C7895w(new C7891s(bVar.f18983b));
                        default:
                            switch (i10) {
                                case RecognitionOptions.ITF /* 128 */:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!m24269f(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new C7895w(new C7866c(bVar.f18983b));
            }
            return new C7895w(new C7882k(bVar.f18983b));
        }
        return new C7895w(new C7886n(m24267d(bVar)));
    }
}
