package p119g7;

import java.util.ArrayList;
import java.util.List;
import p082eb.C7163s;
import p216l7.C9400a;
import p328r7.C10633c;
import p361t6.C11005b3;
import p363t8.C11146e0;
import p459y6.C12635y;
import p459y6.InterfaceC12622l;

/* renamed from: g7.m */
/* loaded from: classes.dex */
final class C7477m {

    /* renamed from: d */
    private static final C7163s f17584d = C7163s.m21330d(':');

    /* renamed from: e */
    private static final C7163s f17585e = C7163s.m21330d('*');

    /* renamed from: a */
    private final List<a> f17586a = new ArrayList();

    /* renamed from: b */
    private int f17587b = 0;

    /* renamed from: c */
    private int f17588c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.m$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f17589a;

        /* renamed from: b */
        public final long f17590b;

        /* renamed from: c */
        public final int f17591c;

        public a(int i10, long j10, int i11) {
            this.f17589a = i10;
            this.f17590b = j10;
            this.f17591c = i11;
        }
    }

    /* renamed from: a */
    private void m22737a(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        C11146e0 c11146e0 = new C11146e0(8);
        interfaceC12622l.readFully(c11146e0.m34682e(), 0, 8);
        this.f17588c = c11146e0.m34696u() + 8;
        if (c11146e0.m34692q() != 1397048916) {
            c12635y.f34331a = 0L;
        } else {
            c12635y.f34331a = interfaceC12622l.getPosition() - (this.f17588c - 12);
            this.f17587b = 2;
        }
    }

    /* renamed from: b */
    private static int m22738b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw C11005b3.m33715a("Invalid SEF name", null);
        }
    }

    /* renamed from: d */
    private void m22739d(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        long j10;
        long length = interfaceC12622l.getLength();
        int i10 = (this.f17588c - 12) - 8;
        C11146e0 c11146e0 = new C11146e0(i10);
        interfaceC12622l.readFully(c11146e0.m34682e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            c11146e0.m34678V(2);
            short m34698w = c11146e0.m34698w();
            if (m34698w == 2192 || m34698w == 2816 || m34698w == 2817 || m34698w == 2819 || m34698w == 2820) {
                this.f17586a.add(new a(m34698w, (length - this.f17588c) - c11146e0.m34696u(), c11146e0.m34696u()));
            } else {
                c11146e0.m34678V(8);
            }
        }
        if (this.f17586a.isEmpty()) {
            j10 = 0;
        } else {
            this.f17587b = 3;
            j10 = this.f17586a.get(0).f17590b;
        }
        c12635y.f34331a = j10;
    }

    /* renamed from: e */
    private void m22740e(InterfaceC12622l interfaceC12622l, List<C9400a.b> list) {
        long position = interfaceC12622l.getPosition();
        int length = (int) ((interfaceC12622l.getLength() - interfaceC12622l.getPosition()) - this.f17588c);
        C11146e0 c11146e0 = new C11146e0(length);
        interfaceC12622l.readFully(c11146e0.m34682e(), 0, length);
        for (int i10 = 0; i10 < this.f17586a.size(); i10++) {
            a aVar = this.f17586a.get(i10);
            c11146e0.m34677U((int) (aVar.f17590b - position));
            c11146e0.m34678V(4);
            int m34696u = c11146e0.m34696u();
            int m22738b = m22738b(c11146e0.m34661E(m34696u));
            int i11 = aVar.f17591c - (m34696u + 8);
            if (m22738b == 2192) {
                list.add(m22741f(c11146e0, i11));
            } else if (m22738b != 2816 && m22738b != 2817 && m22738b != 2819 && m22738b != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: f */
    private static C10633c m22741f(C11146e0 c11146e0, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> m21333f = f17585e.m21333f(c11146e0.m34661E(i10));
        for (int i11 = 0; i11 < m21333f.size(); i11++) {
            List<String> m21333f2 = f17584d.m21333f(m21333f.get(i11));
            if (m21333f2.size() != 3) {
                throw C11005b3.m33715a(null, null);
            }
            try {
                arrayList.add(new C10633c.b(Long.parseLong(m21333f2.get(0)), Long.parseLong(m21333f2.get(1)), 1 << (Integer.parseInt(m21333f2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw C11005b3.m33715a(null, e10);
            }
        }
        return new C10633c(arrayList);
    }

    /* renamed from: c */
    public int m22742c(InterfaceC12622l interfaceC12622l, C12635y c12635y, List<C9400a.b> list) {
        int i10 = this.f17587b;
        long j10 = 0;
        if (i10 == 0) {
            long length = interfaceC12622l.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            c12635y.f34331a = j10;
            this.f17587b = 1;
        } else if (i10 == 1) {
            m22737a(interfaceC12622l, c12635y);
        } else if (i10 == 2) {
            m22739d(interfaceC12622l, c12635y);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            m22740e(interfaceC12622l, list);
            c12635y.f34331a = 0L;
        }
        return 1;
    }

    /* renamed from: g */
    public void m22743g() {
        this.f17586a.clear();
        this.f17587b = 0;
    }
}
