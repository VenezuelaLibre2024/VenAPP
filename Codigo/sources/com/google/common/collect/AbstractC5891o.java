package com.google.common.collect;

import java.util.Comparator;
import p137hb.C7686a;
import p137hb.C7690e;
import p137hb.C7692g;

/* renamed from: com.google.common.collect.o */
/* loaded from: classes2.dex */
public abstract class AbstractC5891o {

    /* renamed from: a */
    private static final AbstractC5891o f12361a = new a();

    /* renamed from: b */
    private static final AbstractC5891o f12362b = new b(-1);

    /* renamed from: c */
    private static final AbstractC5891o f12363c = new b(1);

    /* renamed from: com.google.common.collect.o$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5891o {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: d */
        public AbstractC5891o mo15019d(int i10, int i11) {
            return m15025k(C7690e.m23414e(i10, i11));
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: e */
        public AbstractC5891o mo15020e(long j10, long j11) {
            return m15025k(C7692g.m23425a(j10, j11));
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: f */
        public <T> AbstractC5891o mo15021f(T t10, T t11, Comparator<T> comparator) {
            return m15025k(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: g */
        public AbstractC5891o mo15022g(boolean z10, boolean z11) {
            return m15025k(C7686a.m23404a(z10, z11));
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: h */
        public AbstractC5891o mo15023h(boolean z10, boolean z11) {
            return m15025k(C7686a.m23404a(z11, z10));
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: i */
        public int mo15024i() {
            return 0;
        }

        /* renamed from: k */
        AbstractC5891o m15025k(int i10) {
            return i10 < 0 ? AbstractC5891o.f12362b : i10 > 0 ? AbstractC5891o.f12363c : AbstractC5891o.f12361a;
        }
    }

    /* renamed from: com.google.common.collect.o$b */
    /* loaded from: classes2.dex */
    private static final class b extends AbstractC5891o {

        /* renamed from: d */
        final int f12364d;

        b(int i10) {
            super(null);
            this.f12364d = i10;
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: d */
        public AbstractC5891o mo15019d(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: e */
        public AbstractC5891o mo15020e(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: f */
        public <T> AbstractC5891o mo15021f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: g */
        public AbstractC5891o mo15022g(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: h */
        public AbstractC5891o mo15023h(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC5891o
        /* renamed from: i */
        public int mo15024i() {
            return this.f12364d;
        }
    }

    private AbstractC5891o() {
    }

    /* synthetic */ AbstractC5891o(a aVar) {
        this();
    }

    /* renamed from: j */
    public static AbstractC5891o m15018j() {
        return f12361a;
    }

    /* renamed from: d */
    public abstract AbstractC5891o mo15019d(int i10, int i11);

    /* renamed from: e */
    public abstract AbstractC5891o mo15020e(long j10, long j11);

    /* renamed from: f */
    public abstract <T> AbstractC5891o mo15021f(T t10, T t11, Comparator<T> comparator);

    /* renamed from: g */
    public abstract AbstractC5891o mo15022g(boolean z10, boolean z11);

    /* renamed from: h */
    public abstract AbstractC5891o mo15023h(boolean z10, boolean z11);

    /* renamed from: i */
    public abstract int mo15024i();
}
