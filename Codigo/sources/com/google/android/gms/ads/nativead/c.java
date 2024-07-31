package com.google.android.gms.ads.nativead;

import x8.c0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9141a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9142b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9143c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9144d;

    /* renamed from: e, reason: collision with root package name */
    private final c0 f9145e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9146f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9147g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9148h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9149i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private c0 f9153d;

        /* renamed from: a, reason: collision with root package name */
        private boolean f9150a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f9151b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9152c = false;

        /* renamed from: e, reason: collision with root package name */
        private int f9154e = 1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9155f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9156g = false;

        /* renamed from: h, reason: collision with root package name */
        private int f9157h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f9158i = 1;

        public c a() {
            return new c(this, null);
        }

        public a b(int i10, boolean z10) {
            this.f9156g = z10;
            this.f9157h = i10;
            return this;
        }

        public a c(int i10) {
            this.f9154e = i10;
            return this;
        }

        public a d(int i10) {
            this.f9151b = i10;
            return this;
        }

        public a e(boolean z10) {
            this.f9155f = z10;
            return this;
        }

        public a f(boolean z10) {
            this.f9152c = z10;
            return this;
        }

        public a g(boolean z10) {
            this.f9150a = z10;
            return this;
        }

        public a h(c0 c0Var) {
            this.f9153d = c0Var;
            return this;
        }

        public final a q(int i10) {
            this.f9158i = i10;
            return this;
        }
    }

    /* synthetic */ c(a aVar, e eVar) {
        this.f9141a = aVar.f9150a;
        this.f9142b = aVar.f9151b;
        this.f9143c = aVar.f9152c;
        this.f9144d = aVar.f9154e;
        this.f9145e = aVar.f9153d;
        this.f9146f = aVar.f9155f;
        this.f9147g = aVar.f9156g;
        this.f9148h = aVar.f9157h;
        this.f9149i = aVar.f9158i;
    }

    public int a() {
        return this.f9144d;
    }

    public int b() {
        return this.f9142b;
    }

    public c0 c() {
        return this.f9145e;
    }

    public boolean d() {
        return this.f9143c;
    }

    public boolean e() {
        return this.f9141a;
    }

    public final int f() {
        return this.f9148h;
    }

    public final boolean g() {
        return this.f9147g;
    }

    public final boolean h() {
        return this.f9146f;
    }

    public final int i() {
        return this.f9149i;
    }
}
