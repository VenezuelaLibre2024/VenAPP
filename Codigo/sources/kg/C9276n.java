package kg;

import com.facebook.ads.AdError;
import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: kg.n */
/* loaded from: classes2.dex */
public class C9276n implements InterfaceC9271i {

    /* renamed from: a */
    private final int[] f22514a;

    /* renamed from: b */
    private final int f22515b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kg.n$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final char f22516a;

        /* renamed from: b */
        private final int f22517b;

        /* renamed from: c */
        private final b f22518c;

        /* renamed from: d */
        private final int f22519d;

        private b(char c10, C9270h c9270h, int i10, b bVar, int i11) {
            char c11 = c10 == i11 ? (char) 1000 : c10;
            this.f22516a = c11;
            this.f22517b = i10;
            this.f22518c = bVar;
            int length = c11 == 1000 ? 1 : c9270h.m27644b(c10, i10).length;
            length = (bVar == null ? 0 : bVar.f22517b) != i10 ? length + 3 : length;
            this.f22519d = bVar != null ? length + bVar.f22519d : length;
        }

        /* renamed from: e */
        boolean m27677e() {
            return this.f22516a == 1000;
        }
    }

    public C9276n(String str, Charset charset, int i10) {
        this.f22515b = i10;
        C9270h c9270h = new C9270h(str, charset, i10);
        if (c9270h.m27649g() != 1) {
            this.f22514a = m27669e(str, c9270h, i10);
            return;
        }
        this.f22514a = new int[str.length()];
        for (int i11 = 0; i11 < this.f22514a.length; i11++) {
            char charAt = str.charAt(i11);
            int[] iArr = this.f22514a;
            if (charAt == i10) {
                charAt = 1000;
            }
            iArr[i11] = charAt;
        }
    }

    /* renamed from: c */
    static void m27667c(b[][] bVarArr, int i10, b bVar) {
        if (bVarArr[i10][bVar.f22517b] == null || bVarArr[i10][bVar.f22517b].f22519d > bVar.f22519d) {
            bVarArr[i10][bVar.f22517b] = bVar;
        }
    }

    /* renamed from: d */
    static void m27668d(String str, C9270h c9270h, b[][] bVarArr, int i10, b bVar, int i11) {
        int i12;
        int i13;
        char charAt = str.charAt(i10);
        int m27649g = c9270h.m27649g();
        if (c9270h.m27648f() < 0 || !(charAt == i11 || c9270h.m27643a(charAt, c9270h.m27648f()))) {
            i12 = m27649g;
            i13 = 0;
        } else {
            i13 = c9270h.m27648f();
            i12 = i13 + 1;
        }
        for (int i14 = i13; i14 < i12; i14++) {
            if (charAt == i11 || c9270h.m27643a(charAt, i14)) {
                m27667c(bVarArr, i10 + 1, new b(charAt, c9270h, i14, bVar, i11));
            }
        }
    }

    /* renamed from: e */
    static int[] m27669e(String str, C9270h c9270h, int i10) {
        int length = str.length();
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, c9270h.m27649g());
        m27668d(str, c9270h, bVarArr, 0, null, i10);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < c9270h.m27649g(); i12++) {
                b bVar = bVarArr[i11][i12];
                if (bVar != null && i11 < length) {
                    m27668d(str, c9270h, bVarArr, i11, bVar, i10);
                }
            }
            for (int i13 = 0; i13 < c9270h.m27649g(); i13++) {
                bVarArr[i11 - 1][i13] = null;
            }
        }
        int i14 = -1;
        int i15 = C5101a.e.API_PRIORITY_OTHER;
        for (int i16 = 0; i16 < c9270h.m27649g(); i16++) {
            b bVar2 = bVarArr[length][i16];
            if (bVar2 != null && bVar2.f22519d < i15) {
                i15 = bVar2.f22519d;
                i14 = i16;
            }
        }
        if (i14 < 0) {
            throw new RuntimeException("Internal error: failed to encode \"" + str + "\"");
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 = bVarArr[length][i14]; bVar3 != null; bVar3 = bVar3.f22518c) {
            if (bVar3.m27677e()) {
                arrayList.add(0, Integer.valueOf(AdError.NETWORK_ERROR_CODE));
            } else {
                byte[] m27644b = c9270h.m27644b(bVar3.f22516a, bVar3.f22517b);
                for (int length2 = m27644b.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(m27644b[length2] & 255));
                }
            }
            if ((bVar3.f22518c == null ? 0 : bVar3.f22518c.f22517b) != bVar3.f22517b) {
                arrayList.add(0, Integer.valueOf(c9270h.m27647e(bVar3.f22517b) + RecognitionOptions.QR_CODE));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((Integer) arrayList.get(i17)).intValue();
        }
        return iArr;
    }

    @Override // kg.InterfaceC9271i
    /* renamed from: a */
    public boolean mo9545a(int i10) {
        if (i10 >= 0 && i10 < length()) {
            int i11 = this.f22514a[i10];
            return i11 > 255 && i11 <= 999;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    @Override // kg.InterfaceC9271i
    /* renamed from: b */
    public int mo9546b(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        if (mo9545a(i10)) {
            return this.f22514a[i10] - 256;
        }
        throw new IllegalArgumentException("value at " + i10 + " is not an ECI but a character");
    }

    @Override // kg.InterfaceC9271i
    public char charAt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        if (!mo9545a(i10)) {
            return (char) (m27672h(i10) ? this.f22515b : this.f22514a[i10]);
        }
        throw new IllegalArgumentException("value at " + i10 + " is not a character but an ECI");
    }

    /* renamed from: f */
    public int m27670f() {
        return this.f22515b;
    }

    /* renamed from: g */
    public boolean m27671g(int i10, int i11) {
        if ((i10 + i11) - 1 >= this.f22514a.length) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (mo9545a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean m27672h(int i10) {
        if (i10 >= 0 && i10 < length()) {
            return this.f22514a[i10] == 1000;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    @Override // kg.InterfaceC9271i
    public int length() {
        return this.f22514a.length;
    }

    @Override // kg.InterfaceC9271i
    public CharSequence subSequence(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < i11) {
            if (mo9545a(i10)) {
                throw new IllegalArgumentException("value at " + i10 + " is not a character but an ECI");
            }
            sb2.append(charAt(i10));
            i10++;
        }
        return sb2;
    }

    public String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < length(); i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            if (mo9545a(i10)) {
                sb2.append("ECI(");
                sb2.append(mo9546b(i10));
                c10 = ')';
            } else if (charAt(i10) < 128) {
                c10 = '\'';
                sb2.append('\'');
                sb2.append(charAt(i10));
            } else {
                sb2.append((int) charAt(i10));
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
