package g7;

import eb.s;
import java.util.ArrayList;
import java.util.List;
import l7.a;
import r7.c;
import t6.b3;
import t8.e0;
import y6.y;

/* loaded from: classes.dex */
final class m {

    /* renamed from: d, reason: collision with root package name */
    private static final s f15991d = s.d(':');

    /* renamed from: e, reason: collision with root package name */
    private static final s f15992e = s.d('*');

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f15993a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f15994b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f15995c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15996a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15997b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15998c;

        public a(int i10, long j10, int i11) {
            this.f15996a = i10;
            this.f15997b = j10;
            this.f15998c = i11;
        }
    }

    private void a(y6.l lVar, y yVar) {
        e0 e0Var = new e0(8);
        lVar.readFully(e0Var.e(), 0, 8);
        this.f15995c = e0Var.u() + 8;
        if (e0Var.q() != 1397048916) {
            yVar.f31795a = 0L;
        } else {
            yVar.f31795a = lVar.getPosition() - (this.f15995c - 12);
            this.f15994b = 2;
        }
    }

    private static int b(String str) {
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
                throw b3.a("Invalid SEF name", null);
        }
    }

    private void d(y6.l lVar, y yVar) {
        long j10;
        long length = lVar.getLength();
        int i10 = (this.f15995c - 12) - 8;
        e0 e0Var = new e0(i10);
        lVar.readFully(e0Var.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            e0Var.V(2);
            short w10 = e0Var.w();
            if (w10 == 2192 || w10 == 2816 || w10 == 2817 || w10 == 2819 || w10 == 2820) {
                this.f15993a.add(new a(w10, (length - this.f15995c) - e0Var.u(), e0Var.u()));
            } else {
                e0Var.V(8);
            }
        }
        if (this.f15993a.isEmpty()) {
            j10 = 0;
        } else {
            this.f15994b = 3;
            j10 = this.f15993a.get(0).f15997b;
        }
        yVar.f31795a = j10;
    }

    private void e(y6.l lVar, List<a.b> list) {
        long position = lVar.getPosition();
        int length = (int) ((lVar.getLength() - lVar.getPosition()) - this.f15995c);
        e0 e0Var = new e0(length);
        lVar.readFully(e0Var.e(), 0, length);
        for (int i10 = 0; i10 < this.f15993a.size(); i10++) {
            a aVar = this.f15993a.get(i10);
            e0Var.U((int) (aVar.f15997b - position));
            e0Var.V(4);
            int u10 = e0Var.u();
            int b10 = b(e0Var.E(u10));
            int i11 = aVar.f15998c - (u10 + 8);
            if (b10 == 2192) {
                list.add(f(e0Var, i11));
            } else if (b10 != 2816 && b10 != 2817 && b10 != 2819 && b10 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static r7.c f(e0 e0Var, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = f15992e.f(e0Var.E(i10));
        for (int i11 = 0; i11 < f10.size(); i11++) {
            List<String> f11 = f15991d.f(f10.get(i11));
            if (f11.size() != 3) {
                throw b3.a(null, null);
            }
            try {
                arrayList.add(new c.b(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw b3.a(null, e10);
            }
        }
        return new r7.c(arrayList);
    }

    public int c(y6.l lVar, y yVar, List<a.b> list) {
        int i10 = this.f15994b;
        long j10 = 0;
        if (i10 == 0) {
            long length = lVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            yVar.f31795a = j10;
            this.f15994b = 1;
        } else if (i10 == 1) {
            a(lVar, yVar);
        } else if (i10 == 2) {
            d(lVar, yVar);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(lVar, list);
            yVar.f31795a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f15993a.clear();
        this.f15994b = 0;
    }
}
