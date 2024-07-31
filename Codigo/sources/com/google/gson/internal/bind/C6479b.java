package com.google.gson.internal.bind;

import com.google.gson.AbstractC6494j;
import com.google.gson.C6424g;
import com.google.gson.C6496l;
import com.google.gson.C6497m;
import com.google.gson.C6499o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import nf.C9714c;

/* renamed from: com.google.gson.internal.bind.b */
/* loaded from: classes2.dex */
public final class C6479b extends C9714c {

    /* renamed from: A */
    private static final Writer f14198A = new a();

    /* renamed from: B */
    private static final C6499o f14199B = new C6499o("closed");

    /* renamed from: x */
    private final List<AbstractC6494j> f14200x;

    /* renamed from: y */
    private String f14201y;

    /* renamed from: z */
    private AbstractC6494j f14202z;

    /* renamed from: com.google.gson.internal.bind.b$a */
    /* loaded from: classes2.dex */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public C6479b() {
        super(f14198A);
        this.f14200x = new ArrayList();
        this.f14202z = C6496l.f14280a;
    }

    /* renamed from: B0 */
    private AbstractC6494j m18217B0() {
        return this.f14200x.get(r0.size() - 1);
    }

    /* renamed from: D0 */
    private void m18218D0(AbstractC6494j abstractC6494j) {
        if (this.f14201y != null) {
            if (!abstractC6494j.m18280m() || m29140l()) {
                ((C6497m) m18217B0()).m18283p(this.f14201y, abstractC6494j);
            }
            this.f14201y = null;
            return;
        }
        if (this.f14200x.isEmpty()) {
            this.f14202z = abstractC6494j;
            return;
        }
        AbstractC6494j m18217B0 = m18217B0();
        if (!(m18217B0 instanceof C6424g)) {
            throw new IllegalStateException();
        }
        ((C6424g) m18217B0).m18060p(abstractC6494j);
    }

    @Override // nf.C9714c
    /* renamed from: B */
    public C9714c mo18219B() {
        m18218D0(C6496l.f14280a);
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: c0 */
    public C9714c mo18220c0(long j10) {
        m18218D0(new C6499o(Long.valueOf(j10)));
        return this;
    }

    @Override // nf.C9714c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f14200x.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f14200x.add(f14199B);
    }

    @Override // nf.C9714c
    /* renamed from: e */
    public C9714c mo18221e() {
        C6424g c6424g = new C6424g();
        m18218D0(c6424g);
        this.f14200x.add(c6424g);
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: f */
    public C9714c mo18222f() {
        C6497m c6497m = new C6497m();
        m18218D0(c6497m);
        this.f14200x.add(c6497m);
        return this;
    }

    @Override // nf.C9714c, java.io.Flushable
    public void flush() {
    }

    @Override // nf.C9714c
    /* renamed from: h0 */
    public C9714c mo18223h0(Boolean bool) {
        if (bool == null) {
            return mo18219B();
        }
        m18218D0(new C6499o(bool));
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: i */
    public C9714c mo18224i() {
        if (this.f14200x.isEmpty() || this.f14201y != null) {
            throw new IllegalStateException();
        }
        if (!(m18217B0() instanceof C6424g)) {
            throw new IllegalStateException();
        }
        this.f14200x.remove(r0.size() - 1);
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: i0 */
    public C9714c mo18225i0(Number number) {
        if (number == null) {
            return mo18219B();
        }
        if (!m29142o()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m18218D0(new C6499o(number));
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: j */
    public C9714c mo18226j() {
        if (this.f14200x.isEmpty() || this.f14201y != null) {
            throw new IllegalStateException();
        }
        if (!(m18217B0() instanceof C6497m)) {
            throw new IllegalStateException();
        }
        this.f14200x.remove(r0.size() - 1);
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: j0 */
    public C9714c mo18227j0(String str) {
        if (str == null) {
            return mo18219B();
        }
        m18218D0(new C6499o(str));
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: m0 */
    public C9714c mo18228m0(boolean z10) {
        m18218D0(new C6499o(Boolean.valueOf(z10)));
        return this;
    }

    @Override // nf.C9714c
    /* renamed from: r */
    public C9714c mo18229r(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f14200x.isEmpty() || this.f14201y != null) {
            throw new IllegalStateException();
        }
        if (!(m18217B0() instanceof C6497m)) {
            throw new IllegalStateException();
        }
        this.f14201y = str;
        return this;
    }

    /* renamed from: z0 */
    public AbstractC6494j m18230z0() {
        if (this.f14200x.isEmpty()) {
            return this.f14202z;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f14200x);
    }
}
