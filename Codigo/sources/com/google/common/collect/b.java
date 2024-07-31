package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b<T> extends h1<T> {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0160b f11036a = EnumC0160b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private T f11037b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11038a;

        static {
            int[] iArr = new int[EnumC0160b.values().length];
            f11038a = iArr;
            try {
                iArr[EnumC0160b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11038a[EnumC0160b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0160b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f11036a = EnumC0160b.FAILED;
        this.f11037b = a();
        if (this.f11036a == EnumC0160b.DONE) {
            return false;
        }
        this.f11036a = EnumC0160b.READY;
        return true;
    }

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T c() {
        this.f11036a = EnumC0160b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        eb.o.u(this.f11036a != EnumC0160b.FAILED);
        int i10 = a.f11038a[this.f11036a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11036a = EnumC0160b.NOT_READY;
        T t10 = (T) p0.a(this.f11037b);
        this.f11037b = null;
        return t10;
    }
}
