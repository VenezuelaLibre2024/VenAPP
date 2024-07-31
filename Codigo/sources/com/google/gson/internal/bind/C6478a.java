package com.google.gson.internal.bind;

import com.google.gson.AbstractC6494j;
import com.google.gson.C6424g;
import com.google.gson.C6496l;
import com.google.gson.C6497m;
import com.google.gson.C6499o;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import nf.C9712a;
import nf.EnumC9713b;

/* renamed from: com.google.gson.internal.bind.a */
/* loaded from: classes2.dex */
public final class C6478a extends C9712a {

    /* renamed from: E */
    private static final Reader f14192E = new a();

    /* renamed from: F */
    private static final Object f14193F = new Object();

    /* renamed from: A */
    private Object[] f14194A;

    /* renamed from: B */
    private int f14195B;

    /* renamed from: C */
    private String[] f14196C;

    /* renamed from: D */
    private int[] f14197D;

    /* renamed from: com.google.gson.internal.bind.a$a */
    /* loaded from: classes2.dex */
    class a extends Reader {
        a() {
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

    public C6478a(AbstractC6494j abstractC6494j) {
        super(f14192E);
        this.f14194A = new Object[32];
        this.f14195B = 0;
        this.f14196C = new String[32];
        this.f14197D = new int[32];
        m18197a1(abstractC6494j);
    }

    /* renamed from: B */
    private String m18193B() {
        return " at path " + mo18211f0();
    }

    /* renamed from: L0 */
    private void m18194L0(EnumC9713b enumC9713b) {
        if (mo18212h0() == enumC9713b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC9713b + " but was " + mo18212h0() + m18193B());
    }

    /* renamed from: T0 */
    private Object m18195T0() {
        return this.f14194A[this.f14195B - 1];
    }

    /* renamed from: W0 */
    private Object m18196W0() {
        Object[] objArr = this.f14194A;
        int i10 = this.f14195B - 1;
        this.f14195B = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    /* renamed from: a1 */
    private void m18197a1(Object obj) {
        int i10 = this.f14195B;
        Object[] objArr = this.f14194A;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f14194A = Arrays.copyOf(objArr, i11);
            this.f14197D = Arrays.copyOf(this.f14197D, i11);
            this.f14196C = (String[]) Arrays.copyOf(this.f14196C, i11);
        }
        Object[] objArr2 = this.f14194A;
        int i12 = this.f14195B;
        this.f14195B = i12 + 1;
        objArr2[i12] = obj;
    }

    /* renamed from: n */
    private String m18198n(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f14195B;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f14194A;
            Object obj = objArr[i10];
            if (obj instanceof C6424g) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f14197D[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof C6497m) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f14196C[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // nf.C9712a
    /* renamed from: E */
    public boolean mo18199E() {
        m18194L0(EnumC9713b.BOOLEAN);
        boolean m18289p = ((C6499o) m18196W0()).m18289p();
        int i10 = this.f14195B;
        if (i10 > 0) {
            int[] iArr = this.f14197D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m18289p;
    }

    @Override // nf.C9712a
    /* renamed from: H */
    public double mo18200H() {
        EnumC9713b mo18212h0 = mo18212h0();
        EnumC9713b enumC9713b = EnumC9713b.NUMBER;
        if (mo18212h0 != enumC9713b && mo18212h0 != EnumC9713b.STRING) {
            throw new IllegalStateException("Expected " + enumC9713b + " but was " + mo18212h0 + m18193B());
        }
        double m18290q = ((C6499o) m18195T0()).m18290q();
        if (!m29123r() && (Double.isNaN(m18290q) || Double.isInfinite(m18290q))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m18290q);
        }
        m18196W0();
        int i10 = this.f14195B;
        if (i10 > 0) {
            int[] iArr = this.f14197D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m18290q;
    }

    @Override // nf.C9712a
    /* renamed from: I */
    public int mo18201I() {
        EnumC9713b mo18212h0 = mo18212h0();
        EnumC9713b enumC9713b = EnumC9713b.NUMBER;
        if (mo18212h0 != enumC9713b && mo18212h0 != EnumC9713b.STRING) {
            throw new IllegalStateException("Expected " + enumC9713b + " but was " + mo18212h0 + m18193B());
        }
        int m18291r = ((C6499o) m18195T0()).m18291r();
        m18196W0();
        int i10 = this.f14195B;
        if (i10 > 0) {
            int[] iArr = this.f14197D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m18291r;
    }

    @Override // nf.C9712a
    /* renamed from: I0 */
    public void mo18202I0() {
        if (mo18212h0() == EnumC9713b.NAME) {
            mo18204Q();
            this.f14196C[this.f14195B - 2] = "null";
        } else {
            m18196W0();
            int i10 = this.f14195B;
            if (i10 > 0) {
                this.f14196C[i10 - 1] = "null";
            }
        }
        int i11 = this.f14195B;
        if (i11 > 0) {
            int[] iArr = this.f14197D;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // nf.C9712a
    /* renamed from: O */
    public long mo18203O() {
        EnumC9713b mo18212h0 = mo18212h0();
        EnumC9713b enumC9713b = EnumC9713b.NUMBER;
        if (mo18212h0 != enumC9713b && mo18212h0 != EnumC9713b.STRING) {
            throw new IllegalStateException("Expected " + enumC9713b + " but was " + mo18212h0 + m18193B());
        }
        long mo18058h = ((C6499o) m18195T0()).mo18058h();
        m18196W0();
        int i10 = this.f14195B;
        if (i10 > 0) {
            int[] iArr = this.f14197D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return mo18058h;
    }

    @Override // nf.C9712a
    /* renamed from: Q */
    public String mo18204Q() {
        m18194L0(EnumC9713b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m18195T0()).next();
        String str = (String) entry.getKey();
        this.f14196C[this.f14195B - 1] = str;
        m18197a1(entry.getValue());
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public AbstractC6494j m18205R0() {
        EnumC9713b mo18212h0 = mo18212h0();
        if (mo18212h0 != EnumC9713b.NAME && mo18212h0 != EnumC9713b.END_ARRAY && mo18212h0 != EnumC9713b.END_OBJECT && mo18212h0 != EnumC9713b.END_DOCUMENT) {
            AbstractC6494j abstractC6494j = (AbstractC6494j) m18195T0();
            mo18202I0();
            return abstractC6494j;
        }
        throw new IllegalStateException("Unexpected " + mo18212h0 + " when reading a JsonElement.");
    }

    @Override // nf.C9712a
    /* renamed from: S */
    public void mo18206S() {
        m18194L0(EnumC9713b.NULL);
        m18196W0();
        int i10 = this.f14195B;
        if (i10 > 0) {
            int[] iArr = this.f14197D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    /* renamed from: Y0 */
    public void m18207Y0() {
        m18194L0(EnumC9713b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m18195T0()).next();
        m18197a1(entry.getValue());
        m18197a1(new C6499o((String) entry.getKey()));
    }

    @Override // nf.C9712a
    /* renamed from: a */
    public void mo18208a() {
        m18194L0(EnumC9713b.BEGIN_ARRAY);
        m18197a1(((C6424g) m18195T0()).iterator());
        this.f14197D[this.f14195B - 1] = 0;
    }

    @Override // nf.C9712a
    /* renamed from: a0 */
    public String mo18209a0() {
        EnumC9713b mo18212h0 = mo18212h0();
        EnumC9713b enumC9713b = EnumC9713b.STRING;
        if (mo18212h0 == enumC9713b || mo18212h0 == EnumC9713b.NUMBER) {
            String mo18059k = ((C6499o) m18196W0()).mo18059k();
            int i10 = this.f14195B;
            if (i10 > 0) {
                int[] iArr = this.f14197D;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return mo18059k;
        }
        throw new IllegalStateException("Expected " + enumC9713b + " but was " + mo18212h0 + m18193B());
    }

    @Override // nf.C9712a
    /* renamed from: b */
    public void mo18210b() {
        m18194L0(EnumC9713b.BEGIN_OBJECT);
        m18197a1(((C6497m) m18195T0()).m18284q().iterator());
    }

    @Override // nf.C9712a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14194A = new Object[]{f14193F};
        this.f14195B = 1;
    }

    @Override // nf.C9712a
    /* renamed from: f0 */
    public String mo18211f0() {
        return m18198n(false);
    }

    @Override // nf.C9712a
    /* renamed from: h0 */
    public EnumC9713b mo18212h0() {
        if (this.f14195B == 0) {
            return EnumC9713b.END_DOCUMENT;
        }
        Object m18195T0 = m18195T0();
        if (m18195T0 instanceof Iterator) {
            boolean z10 = this.f14194A[this.f14195B - 2] instanceof C6497m;
            Iterator it = (Iterator) m18195T0;
            if (!it.hasNext()) {
                return z10 ? EnumC9713b.END_OBJECT : EnumC9713b.END_ARRAY;
            }
            if (z10) {
                return EnumC9713b.NAME;
            }
            m18197a1(it.next());
            return mo18212h0();
        }
        if (m18195T0 instanceof C6497m) {
            return EnumC9713b.BEGIN_OBJECT;
        }
        if (m18195T0 instanceof C6424g) {
            return EnumC9713b.BEGIN_ARRAY;
        }
        if (!(m18195T0 instanceof C6499o)) {
            if (m18195T0 instanceof C6496l) {
                return EnumC9713b.NULL;
            }
            if (m18195T0 == f14193F) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        C6499o c6499o = (C6499o) m18195T0;
        if (c6499o.m18295w()) {
            return EnumC9713b.STRING;
        }
        if (c6499o.m18293t()) {
            return EnumC9713b.BOOLEAN;
        }
        if (c6499o.m18294v()) {
            return EnumC9713b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // nf.C9712a
    /* renamed from: i */
    public void mo18213i() {
        m18194L0(EnumC9713b.END_ARRAY);
        m18196W0();
        m18196W0();
        int i10 = this.f14195B;
        if (i10 > 0) {
            int[] iArr = this.f14197D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // nf.C9712a
    /* renamed from: j */
    public void mo18214j() {
        m18194L0(EnumC9713b.END_OBJECT);
        m18196W0();
        m18196W0();
        int i10 = this.f14195B;
        if (i10 > 0) {
            int[] iArr = this.f14197D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // nf.C9712a
    /* renamed from: o */
    public String mo18215o() {
        return m18198n(true);
    }

    @Override // nf.C9712a
    /* renamed from: q */
    public boolean mo18216q() {
        EnumC9713b mo18212h0 = mo18212h0();
        return (mo18212h0 == EnumC9713b.END_OBJECT || mo18212h0 == EnumC9713b.END_ARRAY || mo18212h0 == EnumC9713b.END_DOCUMENT) ? false : true;
    }

    @Override // nf.C9712a
    public String toString() {
        return C6478a.class.getSimpleName() + m18193B();
    }
}
