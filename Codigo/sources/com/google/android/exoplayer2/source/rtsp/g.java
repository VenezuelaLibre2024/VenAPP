package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.g;
import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final TreeSet<a> f8340a = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int d10;
            d10 = g.d((g.a) obj, (g.a) obj2);
            return d10;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private int f8341b;

    /* renamed from: c, reason: collision with root package name */
    private int f8342c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8343d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c8.a f8344a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8345b;

        public a(c8.a aVar, long j10) {
            this.f8344a = aVar;
            this.f8345b = j10;
        }
    }

    public g() {
        g();
    }

    private synchronized void b(a aVar) {
        this.f8341b = aVar.f8344a.f6909g;
        this.f8340a.add(aVar);
    }

    private static int c(int i10, int i11) {
        int min;
        int i12 = i10 - i11;
        return (Math.abs(i12) <= 1000 || (min = (Math.min(i10, i11) - Math.max(i10, i11)) + 65535) >= 1000) ? i12 : i10 < i11 ? min : -min;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(a aVar, a aVar2) {
        return c(aVar.f8344a.f6909g, aVar2.f8344a.f6909g);
    }

    public synchronized boolean e(c8.a aVar, long j10) {
        if (this.f8340a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i10 = aVar.f6909g;
        if (!this.f8343d) {
            g();
            this.f8342c = c8.a.c(i10);
            this.f8343d = true;
            b(new a(aVar, j10));
            return true;
        }
        if (Math.abs(c(i10, c8.a.b(this.f8341b))) < 1000) {
            if (c(i10, this.f8342c) <= 0) {
                return false;
            }
            b(new a(aVar, j10));
            return true;
        }
        this.f8342c = c8.a.c(i10);
        this.f8340a.clear();
        b(new a(aVar, j10));
        return true;
    }

    public synchronized c8.a f(long j10) {
        if (this.f8340a.isEmpty()) {
            return null;
        }
        a first = this.f8340a.first();
        int i10 = first.f8344a.f6909g;
        if (i10 != c8.a.b(this.f8342c) && j10 < first.f8345b) {
            return null;
        }
        this.f8340a.pollFirst();
        this.f8342c = i10;
        return first.f8344a;
    }

    public synchronized void g() {
        this.f8340a.clear();
        this.f8343d = false;
        this.f8342c = -1;
        this.f8341b = -1;
    }
}
