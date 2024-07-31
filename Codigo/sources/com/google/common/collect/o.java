package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final o f11146a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final o f11147b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final o f11148c = new b(1);

    /* loaded from: classes2.dex */
    class a extends o {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.o
        public o d(int i10, int i11) {
            return k(hb.e.e(i10, i11));
        }

        @Override // com.google.common.collect.o
        public o e(long j10, long j11) {
            return k(hb.g.a(j10, j11));
        }

        @Override // com.google.common.collect.o
        public <T> o f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.o
        public o g(boolean z10, boolean z11) {
            return k(hb.a.a(z10, z11));
        }

        @Override // com.google.common.collect.o
        public o h(boolean z10, boolean z11) {
            return k(hb.a.a(z11, z10));
        }

        @Override // com.google.common.collect.o
        public int i() {
            return 0;
        }

        o k(int i10) {
            return i10 < 0 ? o.f11147b : i10 > 0 ? o.f11148c : o.f11146a;
        }
    }

    /* loaded from: classes2.dex */
    private static final class b extends o {

        /* renamed from: d, reason: collision with root package name */
        final int f11149d;

        b(int i10) {
            super(null);
            this.f11149d = i10;
        }

        @Override // com.google.common.collect.o
        public o d(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.o
        public o e(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.o
        public <T> o f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.o
        public o g(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.o
        public o h(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.o
        public int i() {
            return this.f11149d;
        }
    }

    private o() {
    }

    /* synthetic */ o(a aVar) {
        this();
    }

    public static o j() {
        return f11146a;
    }

    public abstract o d(int i10, int i11);

    public abstract o e(long j10, long j11);

    public abstract <T> o f(T t10, T t11, Comparator<T> comparator);

    public abstract o g(boolean z10, boolean z11);

    public abstract o h(boolean z10, boolean z11);

    public abstract int i();
}
