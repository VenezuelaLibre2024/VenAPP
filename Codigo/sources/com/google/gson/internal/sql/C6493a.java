package com.google.gson.internal.sql;

import com.google.gson.InterfaceC6507v;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.google.gson.internal.sql.a */
/* loaded from: classes2.dex */
public final class C6493a {

    /* renamed from: a */
    public static final boolean f14274a;

    /* renamed from: b */
    public static final DefaultDateTypeAdapter.AbstractC6433b<? extends Date> f14275b;

    /* renamed from: c */
    public static final DefaultDateTypeAdapter.AbstractC6433b<? extends Date> f14276c;

    /* renamed from: d */
    public static final InterfaceC6507v f14277d;

    /* renamed from: e */
    public static final InterfaceC6507v f14278e;

    /* renamed from: f */
    public static final InterfaceC6507v f14279f;

    /* renamed from: com.google.gson.internal.sql.a$a */
    /* loaded from: classes2.dex */
    class a extends DefaultDateTypeAdapter.AbstractC6433b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.AbstractC6433b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date mo18108d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* renamed from: com.google.gson.internal.sql.a$b */
    /* loaded from: classes2.dex */
    class b extends DefaultDateTypeAdapter.AbstractC6433b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.AbstractC6433b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp mo18108d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        InterfaceC6507v interfaceC6507v;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14274a = z10;
        if (z10) {
            f14275b = new a(java.sql.Date.class);
            f14276c = new b(Timestamp.class);
            f14277d = SqlDateTypeAdapter.f14268b;
            f14278e = SqlTimeTypeAdapter.f14270b;
            interfaceC6507v = SqlTimestampTypeAdapter.f14272b;
        } else {
            interfaceC6507v = null;
            f14275b = null;
            f14276c = null;
            f14277d = null;
            f14278e = null;
        }
        f14279f = interfaceC6507v;
    }
}
