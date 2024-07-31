package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final Account f9536a;

    /* renamed from: b */
    private final Set f9537b;

    /* renamed from: c */
    private final Set f9538c;

    /* renamed from: d */
    private final Map f9539d;

    /* renamed from: e */
    private final int f9540e;

    /* renamed from: f */
    private final View f9541f;

    /* renamed from: g */
    private final String f9542g;

    /* renamed from: h */
    private final String f9543h;

    /* renamed from: i */
    private final za.a f9544i;

    /* renamed from: j */
    private Integer f9545j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Account f9546a;

        /* renamed from: b */
        private androidx.collection.b f9547b;

        /* renamed from: c */
        private String f9548c;

        /* renamed from: d */
        private String f9549d;

        /* renamed from: e */
        private za.a f9550e = za.a.f32491u;

        public e a() {
            return new e(this.f9546a, this.f9547b, null, 0, null, this.f9548c, this.f9549d, this.f9550e, false);
        }

        public a b(String str) {
            this.f9548c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f9547b == null) {
                this.f9547b = new androidx.collection.b();
            }
            this.f9547b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f9546a = account;
            return this;
        }

        public final a e(String str) {
            this.f9549d = str;
            return this;
        }
    }

    public e(Account account, Set set, Map map, int i10, View view, String str, String str2, za.a aVar, boolean z10) {
        this.f9536a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f9537b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f9539d = map;
        this.f9541f = view;
        this.f9540e = i10;
        this.f9542g = str;
        this.f9543h = str2;
        this.f9544i = aVar == null ? za.a.f32491u : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((e0) it.next()).f9551a);
        }
        this.f9538c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f9536a;
    }

    @Deprecated
    public String b() {
        Account account = this.f9536a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f9536a;
        return account != null ? account : new Account(c.DEFAULT_ACCOUNT, "com.google");
    }

    public Set<Scope> d() {
        return this.f9538c;
    }

    public Set<Scope> e(com.google.android.gms.common.api.a<?> aVar) {
        e0 e0Var = (e0) this.f9539d.get(aVar);
        if (e0Var == null || e0Var.f9551a.isEmpty()) {
            return this.f9537b;
        }
        HashSet hashSet = new HashSet(this.f9537b);
        hashSet.addAll(e0Var.f9551a);
        return hashSet;
    }

    public String f() {
        return this.f9542g;
    }

    public Set<Scope> g() {
        return this.f9537b;
    }

    public final za.a h() {
        return this.f9544i;
    }

    public final Integer i() {
        return this.f9545j;
    }

    public final String j() {
        return this.f9543h;
    }

    public final void k(Integer num) {
        this.f9545j = num;
    }
}
