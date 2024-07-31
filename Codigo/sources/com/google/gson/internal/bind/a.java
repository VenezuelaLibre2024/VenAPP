package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends nf.a {
    private static final Reader E = new C0182a();
    private static final Object F = new Object();
    private Object[] A;
    private int B;
    private String[] C;
    private int[] D;

    /* renamed from: com.google.gson.internal.bind.a$a */
    /* loaded from: classes2.dex */
    class C0182a extends Reader {
        C0182a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public a(j jVar) {
        super(E);
        this.A = new Object[32];
        this.B = 0;
        this.C = new String[32];
        this.D = new int[32];
        a1(jVar);
    }

    private String B() {
        return " at path " + f0();
    }

    private void L0(nf.b bVar) {
        if (h0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + h0() + B());
    }

    private Object T0() {
        return this.A[this.B - 1];
    }

    private Object W0() {
        Object[] objArr = this.A;
        int i10 = this.B - 1;
        this.B = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void a1(Object obj) {
        int i10 = this.B;
        Object[] objArr = this.A;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.A = Arrays.copyOf(objArr, i11);
            this.D = Arrays.copyOf(this.D, i11);
            this.C = (String[]) Arrays.copyOf(this.C, i11);
        }
        Object[] objArr2 = this.A;
        int i12 = this.B;
        this.B = i12 + 1;
        objArr2[i12] = obj;
    }

    private String n(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.B;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.A;
            Object obj = objArr[i10];
            if (obj instanceof g) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.D[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof m) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.C[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // nf.a
    public boolean E() {
        L0(nf.b.BOOLEAN);
        boolean p10 = ((o) W0()).p();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return p10;
    }

    @Override // nf.a
    public double H() {
        nf.b h02 = h0();
        nf.b bVar = nf.b.NUMBER;
        if (h02 != bVar && h02 != nf.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + h02 + B());
        }
        double q10 = ((o) T0()).q();
        if (!r() && (Double.isNaN(q10) || Double.isInfinite(q10))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + q10);
        }
        W0();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return q10;
    }

    @Override // nf.a
    public int I() {
        nf.b h02 = h0();
        nf.b bVar = nf.b.NUMBER;
        if (h02 != bVar && h02 != nf.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + h02 + B());
        }
        int r10 = ((o) T0()).r();
        W0();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return r10;
    }

    @Override // nf.a
    public void I0() {
        if (h0() == nf.b.NAME) {
            Q();
            this.C[this.B - 2] = "null";
        } else {
            W0();
            int i10 = this.B;
            if (i10 > 0) {
                this.C[i10 - 1] = "null";
            }
        }
        int i11 = this.B;
        if (i11 > 0) {
            int[] iArr = this.D;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // nf.a
    public long O() {
        nf.b h02 = h0();
        nf.b bVar = nf.b.NUMBER;
        if (h02 != bVar && h02 != nf.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + h02 + B());
        }
        long h10 = ((o) T0()).h();
        W0();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return h10;
    }

    @Override // nf.a
    public String Q() {
        L0(nf.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) T0()).next();
        String str = (String) entry.getKey();
        this.C[this.B - 1] = str;
        a1(entry.getValue());
        return str;
    }

    public j R0() {
        nf.b h02 = h0();
        if (h02 != nf.b.NAME && h02 != nf.b.END_ARRAY && h02 != nf.b.END_OBJECT && h02 != nf.b.END_DOCUMENT) {
            j jVar = (j) T0();
            I0();
            return jVar;
        }
        throw new IllegalStateException("Unexpected " + h02 + " when reading a JsonElement.");
    }

    @Override // nf.a
    public void S() {
        L0(nf.b.NULL);
        W0();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void Y0() {
        L0(nf.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) T0()).next();
        a1(entry.getValue());
        a1(new o((String) entry.getKey()));
    }

    @Override // nf.a
    public void a() {
        L0(nf.b.BEGIN_ARRAY);
        a1(((g) T0()).iterator());
        this.D[this.B - 1] = 0;
    }

    @Override // nf.a
    public String a0() {
        nf.b h02 = h0();
        nf.b bVar = nf.b.STRING;
        if (h02 == bVar || h02 == nf.b.NUMBER) {
            String k10 = ((o) W0()).k();
            int i10 = this.B;
            if (i10 > 0) {
                int[] iArr = this.D;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return k10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + h02 + B());
    }

    @Override // nf.a
    public void b() {
        L0(nf.b.BEGIN_OBJECT);
        a1(((m) T0()).q().iterator());
    }

    @Override // nf.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A = new Object[]{F};
        this.B = 1;
    }

    @Override // nf.a
    public String f0() {
        return n(false);
    }

    @Override // nf.a
    public nf.b h0() {
        if (this.B == 0) {
            return nf.b.END_DOCUMENT;
        }
        Object T0 = T0();
        if (T0 instanceof Iterator) {
            boolean z10 = this.A[this.B - 2] instanceof m;
            Iterator it = (Iterator) T0;
            if (!it.hasNext()) {
                return z10 ? nf.b.END_OBJECT : nf.b.END_ARRAY;
            }
            if (z10) {
                return nf.b.NAME;
            }
            a1(it.next());
            return h0();
        }
        if (T0 instanceof m) {
            return nf.b.BEGIN_OBJECT;
        }
        if (T0 instanceof g) {
            return nf.b.BEGIN_ARRAY;
        }
        if (!(T0 instanceof o)) {
            if (T0 instanceof l) {
                return nf.b.NULL;
            }
            if (T0 == F) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        o oVar = (o) T0;
        if (oVar.w()) {
            return nf.b.STRING;
        }
        if (oVar.t()) {
            return nf.b.BOOLEAN;
        }
        if (oVar.v()) {
            return nf.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // nf.a
    public void i() {
        L0(nf.b.END_ARRAY);
        W0();
        W0();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // nf.a
    public void j() {
        L0(nf.b.END_OBJECT);
        W0();
        W0();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // nf.a
    public String o() {
        return n(true);
    }

    @Override // nf.a
    public boolean q() {
        nf.b h02 = h0();
        return (h02 == nf.b.END_OBJECT || h02 == nf.b.END_ARRAY || h02 == nf.b.END_DOCUMENT) ? false : true;
    }

    @Override // nf.a
    public String toString() {
        return a.class.getSimpleName() + B();
    }
}
