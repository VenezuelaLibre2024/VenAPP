package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import java.security.GeneralSecurityException;
import p400vb.C11821y;
import p400vb.EnumC11802i0;
import p441xb.C12413a;

/* renamed from: com.google.crypto.tink.internal.o */
/* loaded from: classes2.dex */
public final class C5943o implements InterfaceC5945q {

    /* renamed from: a */
    private final String f12529a;

    /* renamed from: b */
    private final C12413a f12530b;

    /* renamed from: c */
    private final AbstractC5970h f12531c;

    /* renamed from: d */
    private final C11821y.c f12532d;

    /* renamed from: e */
    private final EnumC11802i0 f12533e;

    /* renamed from: f */
    private final Integer f12534f;

    private C5943o(String str, AbstractC5970h abstractC5970h, C11821y.c cVar, EnumC11802i0 enumC11802i0, Integer num) {
        this.f12529a = str;
        this.f12530b = C5948t.m15290e(str);
        this.f12531c = abstractC5970h;
        this.f12532d = cVar;
        this.f12533e = enumC11802i0;
        this.f12534f = num;
    }

    /* renamed from: b */
    public static C5943o m15264b(String str, AbstractC5970h abstractC5970h, C11821y.c cVar, EnumC11802i0 enumC11802i0, Integer num) {
        if (enumC11802i0 == EnumC11802i0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C5943o(str, abstractC5970h, cVar, enumC11802i0, num);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5945q
    /* renamed from: a */
    public C12413a mo15265a() {
        return this.f12530b;
    }

    /* renamed from: c */
    public Integer m15266c() {
        return this.f12534f;
    }

    /* renamed from: d */
    public C11821y.c m15267d() {
        return this.f12532d;
    }

    /* renamed from: e */
    public EnumC11802i0 m15268e() {
        return this.f12533e;
    }

    /* renamed from: f */
    public String m15269f() {
        return this.f12529a;
    }

    /* renamed from: g */
    public AbstractC5970h m15270g() {
        return this.f12531c;
    }
}
