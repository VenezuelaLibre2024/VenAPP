package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import nf.c;

/* loaded from: classes2.dex */
public final class b extends c {
    private static final Writer A = new a();
    private static final o B = new o("closed");

    /* renamed from: x, reason: collision with root package name */
    private final List<j> f12926x;

    /* renamed from: y, reason: collision with root package name */
    private String f12927y;

    /* renamed from: z, reason: collision with root package name */
    private j f12928z;

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

    public b() {
        super(A);
        this.f12926x = new ArrayList();
        this.f12928z = l.f13006a;
    }

    private j B0() {
        return this.f12926x.get(r0.size() - 1);
    }

    private void D0(j jVar) {
        if (this.f12927y != null) {
            if (!jVar.m() || l()) {
                ((m) B0()).p(this.f12927y, jVar);
            }
            this.f12927y = null;
            return;
        }
        if (this.f12926x.isEmpty()) {
            this.f12928z = jVar;
            return;
        }
        j B0 = B0();
        if (!(B0 instanceof g)) {
            throw new IllegalStateException();
        }
        ((g) B0).p(jVar);
    }

    @Override // nf.c
    public c B() {
        D0(l.f13006a);
        return this;
    }

    @Override // nf.c
    public c c0(long j10) {
        D0(new o(Long.valueOf(j10)));
        return this;
    }

    @Override // nf.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f12926x.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f12926x.add(B);
    }

    @Override // nf.c
    public c e() {
        g gVar = new g();
        D0(gVar);
        this.f12926x.add(gVar);
        return this;
    }

    @Override // nf.c
    public c f() {
        m mVar = new m();
        D0(mVar);
        this.f12926x.add(mVar);
        return this;
    }

    @Override // nf.c, java.io.Flushable
    public void flush() {
    }

    @Override // nf.c
    public c h0(Boolean bool) {
        if (bool == null) {
            return B();
        }
        D0(new o(bool));
        return this;
    }

    @Override // nf.c
    public c i() {
        if (this.f12926x.isEmpty() || this.f12927y != null) {
            throw new IllegalStateException();
        }
        if (!(B0() instanceof g)) {
            throw new IllegalStateException();
        }
        this.f12926x.remove(r0.size() - 1);
        return this;
    }

    @Override // nf.c
    public c i0(Number number) {
        if (number == null) {
            return B();
        }
        if (!o()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        D0(new o(number));
        return this;
    }

    @Override // nf.c
    public c j() {
        if (this.f12926x.isEmpty() || this.f12927y != null) {
            throw new IllegalStateException();
        }
        if (!(B0() instanceof m)) {
            throw new IllegalStateException();
        }
        this.f12926x.remove(r0.size() - 1);
        return this;
    }

    @Override // nf.c
    public c j0(String str) {
        if (str == null) {
            return B();
        }
        D0(new o(str));
        return this;
    }

    @Override // nf.c
    public c m0(boolean z10) {
        D0(new o(Boolean.valueOf(z10)));
        return this;
    }

    @Override // nf.c
    public c r(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f12926x.isEmpty() || this.f12927y != null) {
            throw new IllegalStateException();
        }
        if (!(B0() instanceof m)) {
            throw new IllegalStateException();
        }
        this.f12927y = str;
        return this;
    }

    public j z0() {
        if (this.f12926x.isEmpty()) {
            return this.f12928z;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f12926x);
    }
}
