package com.google.protobuf;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface r0 extends s0 {

    /* loaded from: classes2.dex */
    public interface a extends s0, Cloneable {
        a a0(r0 r0Var);

        r0 build();

        a c0(h hVar, o oVar);

        r0 f();
    }

    a a();

    g b();

    int c();

    a d();

    z0<? extends r0> g();

    byte[] h();

    void l(j jVar);

    void writeTo(OutputStream outputStream);
}
