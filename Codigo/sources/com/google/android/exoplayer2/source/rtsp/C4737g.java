package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.C4737g;
import java.util.Comparator;
import java.util.TreeSet;
import p040c8.C1885a;

/* renamed from: com.google.android.exoplayer2.source.rtsp.g */
/* loaded from: classes.dex */
final class C4737g {

    /* renamed from: a */
    private final TreeSet<a> f9384a = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m12048d;
            m12048d = C4737g.m12048d((C4737g.a) obj, (C4737g.a) obj2);
            return m12048d;
        }
    });

    /* renamed from: b */
    private int f9385b;

    /* renamed from: c */
    private int f9386c;

    /* renamed from: d */
    private boolean f9387d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C1885a f9388a;

        /* renamed from: b */
        public final long f9389b;

        public a(C1885a c1885a, long j10) {
            this.f9388a = c1885a;
            this.f9389b = j10;
        }
    }

    public C4737g() {
        m12051g();
    }

    /* renamed from: b */
    private synchronized void m12046b(a aVar) {
        this.f9385b = aVar.f9388a.f7858g;
        this.f9384a.add(aVar);
    }

    /* renamed from: c */
    private static int m12047c(int i10, int i11) {
        int min;
        int i12 = i10 - i11;
        return (Math.abs(i12) <= 1000 || (min = (Math.min(i10, i11) - Math.max(i10, i11)) + 65535) >= 1000) ? i12 : i10 < i11 ? min : -min;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ int m12048d(a aVar, a aVar2) {
        return m12047c(aVar.f9388a.f7858g, aVar2.f9388a.f7858g);
    }

    /* renamed from: e */
    public synchronized boolean m12049e(C1885a c1885a, long j10) {
        if (this.f9384a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i10 = c1885a.f7858g;
        if (!this.f9387d) {
            m12051g();
            this.f9386c = C1885a.m10011c(i10);
            this.f9387d = true;
            m12046b(new a(c1885a, j10));
            return true;
        }
        if (Math.abs(m12047c(i10, C1885a.m10010b(this.f9385b))) < 1000) {
            if (m12047c(i10, this.f9386c) <= 0) {
                return false;
            }
            m12046b(new a(c1885a, j10));
            return true;
        }
        this.f9386c = C1885a.m10011c(i10);
        this.f9384a.clear();
        m12046b(new a(c1885a, j10));
        return true;
    }

    /* renamed from: f */
    public synchronized C1885a m12050f(long j10) {
        if (this.f9384a.isEmpty()) {
            return null;
        }
        a first = this.f9384a.first();
        int i10 = first.f9388a.f7858g;
        if (i10 != C1885a.m10010b(this.f9386c) && j10 < first.f9389b) {
            return null;
        }
        this.f9384a.pollFirst();
        this.f9386c = i10;
        return first.f9388a;
    }

    /* renamed from: g */
    public synchronized void m12051g() {
        this.f9384a.clear();
        this.f9387d = false;
        this.f9386c = -1;
        this.f9385b = -1;
    }
}
