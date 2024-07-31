package kg;

import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class n implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f20692a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20693b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final char f20694a;

        /* renamed from: b, reason: collision with root package name */
        private final int f20695b;

        /* renamed from: c, reason: collision with root package name */
        private final b f20696c;

        /* renamed from: d, reason: collision with root package name */
        private final int f20697d;

        private b(char c10, h hVar, int i10, b bVar, int i11) {
            char c11 = c10 == i11 ? (char) 1000 : c10;
            this.f20694a = c11;
            this.f20695b = i10;
            this.f20696c = bVar;
            int length = c11 == 1000 ? 1 : hVar.b(c10, i10).length;
            length = (bVar == null ? 0 : bVar.f20695b) != i10 ? length + 3 : length;
            this.f20697d = bVar != null ? length + bVar.f20697d : length;
        }

        boolean e() {
            return this.f20694a == 1000;
        }
    }

    public n(String str, Charset charset, int i10) {
        this.f20693b = i10;
        h hVar = new h(str, charset, i10);
        if (hVar.g() != 1) {
            this.f20692a = e(str, hVar, i10);
            return;
        }
        this.f20692a = new int[str.length()];
        for (int i11 = 0; i11 < this.f20692a.length; i11++) {
            char charAt = str.charAt(i11);
            int[] iArr = this.f20692a;
            if (charAt == i10) {
                charAt = 1000;
            }
            iArr[i11] = charAt;
        }
    }

    static void c(b[][] bVarArr, int i10, b bVar) {
        if (bVarArr[i10][bVar.f20695b] == null || bVarArr[i10][bVar.f20695b].f20697d > bVar.f20697d) {
            bVarArr[i10][bVar.f20695b] = bVar;
        }
    }

    static void d(String str, h hVar, b[][] bVarArr, int i10, b bVar, int i11) {
        int i12;
        int i13;
        char charAt = str.charAt(i10);
        int g10 = hVar.g();
        if (hVar.f() < 0 || !(charAt == i11 || hVar.a(charAt, hVar.f()))) {
            i12 = g10;
            i13 = 0;
        } else {
            i13 = hVar.f();
            i12 = i13 + 1;
        }
        for (int i14 = i13; i14 < i12; i14++) {
            if (charAt == i11 || hVar.a(charAt, i14)) {
                c(bVarArr, i10 + 1, new b(charAt, hVar, i14, bVar, i11));
            }
        }
    }

    static int[] e(String str, h hVar, int i10) {
        int length = str.length();
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, hVar.g());
        d(str, hVar, bVarArr, 0, null, i10);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < hVar.g(); i12++) {
                b bVar = bVarArr[i11][i12];
                if (bVar != null && i11 < length) {
                    d(str, hVar, bVarArr, i11, bVar, i10);
                }
            }
            for (int i13 = 0; i13 < hVar.g(); i13++) {
                bVarArr[i11 - 1][i13] = null;
            }
        }
        int i14 = -1;
        int i15 = a.e.API_PRIORITY_OTHER;
        for (int i16 = 0; i16 < hVar.g(); i16++) {
            b bVar2 = bVarArr[length][i16];
            if (bVar2 != null && bVar2.f20697d < i15) {
                i15 = bVar2.f20697d;
                i14 = i16;
            }
        }
        if (i14 < 0) {
            throw new RuntimeException("Internal error: failed to encode \"" + str + "\"");
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 = bVarArr[length][i14]; bVar3 != null; bVar3 = bVar3.f20696c) {
            if (bVar3.e()) {
                arrayList.add(0, Integer.valueOf(AdError.NETWORK_ERROR_CODE));
            } else {
                byte[] b10 = hVar.b(bVar3.f20694a, bVar3.f20695b);
                for (int length2 = b10.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(b10[length2] & 255));
                }
            }
            if ((bVar3.f20696c == null ? 0 : bVar3.f20696c.f20695b) != bVar3.f20695b) {
                arrayList.add(0, Integer.valueOf(hVar.e(bVar3.f20695b) + RecognitionOptions.QR_CODE));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((Integer) arrayList.get(i17)).intValue();
        }
        return iArr;
    }

    @Override // kg.i
    public boolean a(int i10) {
        if (i10 >= 0 && i10 < length()) {
            int i11 = this.f20692a[i10];
            return i11 > 255 && i11 <= 999;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    @Override // kg.i
    public int b(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        if (a(i10)) {
            return this.f20692a[i10] - 256;
        }
        throw new IllegalArgumentException("value at " + i10 + " is not an ECI but a character");
    }

    @Override // kg.i
    public char charAt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        if (!a(i10)) {
            return (char) (h(i10) ? this.f20693b : this.f20692a[i10]);
        }
        throw new IllegalArgumentException("value at " + i10 + " is not a character but an ECI");
    }

    public int f() {
        return this.f20693b;
    }

    public boolean g(int i10, int i11) {
        if ((i10 + i11) - 1 >= this.f20692a.length) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i10) {
        if (i10 >= 0 && i10 < length()) {
            return this.f20692a[i10] == 1000;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    @Override // kg.i
    public int length() {
        return this.f20692a.length;
    }

    @Override // kg.i
    public CharSequence subSequence(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < i11) {
            if (a(i10)) {
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
            if (a(i10)) {
                sb2.append("ECI(");
                sb2.append(b(i10));
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
