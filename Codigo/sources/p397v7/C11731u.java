package p397v7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p351s8.C10835n;

/* renamed from: v7.u */
/* loaded from: classes.dex */
public final class C11731u {

    /* renamed from: h */
    private static final AtomicLong f30882h = new AtomicLong();

    /* renamed from: a */
    public final long f30883a;

    /* renamed from: b */
    public final C10835n f30884b;

    /* renamed from: c */
    public final Uri f30885c;

    /* renamed from: d */
    public final Map<String, List<String>> f30886d;

    /* renamed from: e */
    public final long f30887e;

    /* renamed from: f */
    public final long f30888f;

    /* renamed from: g */
    public final long f30889g;

    public C11731u(long j10, C10835n c10835n, long j11) {
        this(j10, c10835n, c10835n.f27407a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public C11731u(long j10, C10835n c10835n, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f30883a = j10;
        this.f30884b = c10835n;
        this.f30885c = uri;
        this.f30886d = map;
        this.f30887e = j11;
        this.f30888f = j12;
        this.f30889g = j13;
    }

    /* renamed from: a */
    public static long m37025a() {
        return f30882h.getAndIncrement();
    }
}
