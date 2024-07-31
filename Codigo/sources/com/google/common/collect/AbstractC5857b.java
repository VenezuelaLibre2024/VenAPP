package com.google.common.collect;

import java.util.NoSuchElementException;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5857b<T> extends AbstractC5877h1<T> {

    /* renamed from: a */
    private b f12251a = b.NOT_READY;

    /* renamed from: b */
    private T f12252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.b$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12253a;

        static {
            int[] iArr = new int[b.values().length];
            f12253a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12253a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.b$b */
    /* loaded from: classes2.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: d */
    private boolean m14728d() {
        this.f12251a = b.FAILED;
        this.f12252b = mo14729a();
        if (this.f12251a == b.DONE) {
            return false;
        }
        this.f12251a = b.READY;
        return true;
    }

    /* renamed from: a */
    protected abstract T mo14729a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final T m14730c() {
        this.f12251a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C7159o.m21318u(this.f12251a != b.FAILED);
        int i10 = a.f12253a[this.f12251a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m14728d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12251a = b.NOT_READY;
        T t10 = (T) C5894p0.m15029a(this.f12252b);
        this.f12252b = null;
        return t10;
    }
}
