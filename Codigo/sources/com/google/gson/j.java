package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class j {
    public g c() {
        if (l()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m d() {
        if (n()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o f() {
        if (o()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean l() {
        return this instanceof g;
    }

    public boolean m() {
        return this instanceof l;
    }

    public boolean n() {
        return this instanceof m;
    }

    public boolean o() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            nf.c cVar = new nf.c(stringWriter);
            cVar.S(true);
            com.google.gson.internal.k.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
