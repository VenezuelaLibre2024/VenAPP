package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.source.rtsp.b;
import s8.e0;
import t8.r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements e0.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f8309a;

    /* renamed from: b, reason: collision with root package name */
    public final r f8310b;

    /* renamed from: c, reason: collision with root package name */
    private final a f8311c;

    /* renamed from: d, reason: collision with root package name */
    private final y6.m f8312d;

    /* renamed from: f, reason: collision with root package name */
    private final b.a f8314f;

    /* renamed from: g, reason: collision with root package name */
    private e f8315g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f8316h;

    /* renamed from: j, reason: collision with root package name */
    private volatile long f8318j;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f8313e = r0.w();

    /* renamed from: i, reason: collision with root package name */
    private volatile long f8317i = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, b bVar);
    }

    public d(int i10, r rVar, a aVar, y6.m mVar, b.a aVar2) {
        this.f8309a = i10;
        this.f8310b = rVar;
        this.f8311c = aVar;
        this.f8312d = mVar;
        this.f8314f = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str, b bVar) {
        this.f8311c.a(str, bVar);
    }

    @Override // s8.e0.e
    public void b() {
        final b bVar = null;
        try {
            bVar = this.f8314f.a(this.f8309a);
            final String b10 = bVar.b();
            this.f8313e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.d(b10, bVar);
                }
            });
            y6.e eVar = new y6.e((s8.h) t8.a.e(bVar), 0L, -1L);
            e eVar2 = new e(this.f8310b.f8419a, this.f8309a);
            this.f8315g = eVar2;
            eVar2.b(this.f8312d);
            while (!this.f8316h) {
                if (this.f8317i != -9223372036854775807L) {
                    this.f8315g.a(this.f8318j, this.f8317i);
                    this.f8317i = -9223372036854775807L;
                }
                if (this.f8315g.f(eVar, new y6.y()) == -1) {
                    break;
                }
            }
        } finally {
            s8.m.a(bVar);
        }
    }

    @Override // s8.e0.e
    public void c() {
        this.f8316h = true;
    }

    public void e() {
        ((e) t8.a.e(this.f8315g)).g();
    }

    public void f(long j10, long j11) {
        this.f8317i = j10;
        this.f8318j = j11;
    }

    public void g(int i10) {
        if (((e) t8.a.e(this.f8315g)).d()) {
            return;
        }
        this.f8315g.h(i10);
    }

    public void h(long j10) {
        if (j10 == -9223372036854775807L || ((e) t8.a.e(this.f8315g)).d()) {
            return;
        }
        this.f8315g.i(j10);
    }
}
