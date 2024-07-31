package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.collection.C0732b;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import za.C12854a;

/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes.dex */
public final class C5234e {

    /* renamed from: a */
    private final Account f10650a;

    /* renamed from: b */
    private final Set f10651b;

    /* renamed from: c */
    private final Set f10652c;

    /* renamed from: d */
    private final Map f10653d;

    /* renamed from: e */
    private final int f10654e;

    /* renamed from: f */
    private final View f10655f;

    /* renamed from: g */
    private final String f10656g;

    /* renamed from: h */
    private final String f10657h;

    /* renamed from: i */
    private final C12854a f10658i;

    /* renamed from: j */
    private Integer f10659j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Account f10660a;

        /* renamed from: b */
        private C0732b f10661b;

        /* renamed from: c */
        private String f10662c;

        /* renamed from: d */
        private String f10663d;

        /* renamed from: e */
        private C12854a f10664e = C12854a.f35042u;

        /* renamed from: a */
        public C5234e m13242a() {
            return new C5234e(this.f10660a, this.f10661b, null, 0, null, this.f10662c, this.f10663d, this.f10664e, false);
        }

        /* renamed from: b */
        public a m13243b(String str) {
            this.f10662c = str;
            return this;
        }

        /* renamed from: c */
        public final a m13244c(Collection collection) {
            if (this.f10661b == null) {
                this.f10661b = new C0732b();
            }
            this.f10661b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final a m13245d(Account account) {
            this.f10660a = account;
            return this;
        }

        /* renamed from: e */
        public final a m13246e(String str) {
            this.f10663d = str;
            return this;
        }
    }

    public C5234e(Account account, Set set, Map map, int i10, View view, String str, String str2, C12854a c12854a, boolean z10) {
        this.f10650a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f10651b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f10653d = map;
        this.f10655f = view;
        this.f10654e = i10;
        this.f10656g = str;
        this.f10657h = str2;
        this.f10658i = c12854a == null ? C12854a.f35042u : c12854a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C5235e0) it.next()).f10665a);
        }
        this.f10652c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m13231a() {
        return this.f10650a;
    }

    @Deprecated
    /* renamed from: b */
    public String m13232b() {
        Account account = this.f10650a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m13233c() {
        Account account = this.f10650a;
        return account != null ? account : new Account(AbstractC5228c.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: d */
    public Set<Scope> m13234d() {
        return this.f10652c;
    }

    /* renamed from: e */
    public Set<Scope> m13235e(C5101a<?> c5101a) {
        C5235e0 c5235e0 = (C5235e0) this.f10653d.get(c5101a);
        if (c5235e0 == null || c5235e0.f10665a.isEmpty()) {
            return this.f10651b;
        }
        HashSet hashSet = new HashSet(this.f10651b);
        hashSet.addAll(c5235e0.f10665a);
        return hashSet;
    }

    /* renamed from: f */
    public String m13236f() {
        return this.f10656g;
    }

    /* renamed from: g */
    public Set<Scope> m13237g() {
        return this.f10651b;
    }

    /* renamed from: h */
    public final C12854a m13238h() {
        return this.f10658i;
    }

    /* renamed from: i */
    public final Integer m13239i() {
        return this.f10659j;
    }

    /* renamed from: j */
    public final String m13240j() {
        return this.f10657h;
    }

    /* renamed from: k */
    public final void m13241k(Integer num) {
        this.f10659j = num;
    }
}
