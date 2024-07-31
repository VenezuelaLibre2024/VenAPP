package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import vb.i0;
import vb.y;

/* loaded from: classes2.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    private final String f11314a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.a f11315b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.crypto.tink.shaded.protobuf.h f11316c;

    /* renamed from: d, reason: collision with root package name */
    private final y.c f11317d;

    /* renamed from: e, reason: collision with root package name */
    private final i0 f11318e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f11319f;

    private o(String str, com.google.crypto.tink.shaded.protobuf.h hVar, y.c cVar, i0 i0Var, Integer num) {
        this.f11314a = str;
        this.f11315b = t.e(str);
        this.f11316c = hVar;
        this.f11317d = cVar;
        this.f11318e = i0Var;
        this.f11319f = num;
    }

    public static o b(String str, com.google.crypto.tink.shaded.protobuf.h hVar, y.c cVar, i0 i0Var, Integer num) {
        if (i0Var == i0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, hVar, cVar, i0Var, num);
    }

    @Override // com.google.crypto.tink.internal.q
    public xb.a a() {
        return this.f11315b;
    }

    public Integer c() {
        return this.f11319f;
    }

    public y.c d() {
        return this.f11317d;
    }

    public i0 e() {
        return this.f11318e;
    }

    public String f() {
        return this.f11314a;
    }

    public com.google.crypto.tink.shaded.protobuf.h g() {
        return this.f11316c;
    }
}
