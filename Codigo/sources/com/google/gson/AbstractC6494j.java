package com.google.gson;

import com.google.gson.internal.C6488k;
import java.io.IOException;
import java.io.StringWriter;
import nf.C9714c;

/* renamed from: com.google.gson.j */
/* loaded from: classes2.dex */
public abstract class AbstractC6494j {
    /* renamed from: c */
    public C6424g m18276c() {
        if (m18279l()) {
            return (C6424g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: d */
    public C6497m m18277d() {
        if (m18281n()) {
            return (C6497m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: f */
    public C6499o m18278f() {
        if (m18282o()) {
            return (C6499o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public long mo18058h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: k */
    public String mo18059k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: l */
    public boolean m18279l() {
        return this instanceof C6424g;
    }

    /* renamed from: m */
    public boolean m18280m() {
        return this instanceof C6496l;
    }

    /* renamed from: n */
    public boolean m18281n() {
        return this instanceof C6497m;
    }

    /* renamed from: o */
    public boolean m18282o() {
        return this instanceof C6499o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C9714c c9714c = new C9714c(stringWriter);
            c9714c.m29138S(true);
            C6488k.m18263b(this, c9714c);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
