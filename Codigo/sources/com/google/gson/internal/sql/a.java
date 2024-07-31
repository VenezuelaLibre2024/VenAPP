package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f13000a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b<? extends Date> f13001b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b<? extends Date> f13002c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f13003d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f13004e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f13005f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0185a extends DefaultDateTypeAdapter.b<java.sql.Date> {
        C0185a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* loaded from: classes2.dex */
    class b extends DefaultDateTypeAdapter.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        v vVar;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f13000a = z10;
        if (z10) {
            f13001b = new C0185a(java.sql.Date.class);
            f13002c = new b(Timestamp.class);
            f13003d = SqlDateTypeAdapter.f12994b;
            f13004e = SqlTimeTypeAdapter.f12996b;
            vVar = SqlTimestampTypeAdapter.f12998b;
        } else {
            vVar = null;
            f13001b = null;
            f13002c = null;
            f13003d = null;
            f13004e = null;
        }
        f13005f = vVar;
    }
}
