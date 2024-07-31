package v7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f28468h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f28469a;

    /* renamed from: b, reason: collision with root package name */
    public final s8.n f28470b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f28471c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f28472d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28473e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28474f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28475g;

    public u(long j10, s8.n nVar, long j11) {
        this(j10, nVar, nVar.f25288a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public u(long j10, s8.n nVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f28469a = j10;
        this.f28470b = nVar;
        this.f28471c = uri;
        this.f28472d = map;
        this.f28473e = j11;
        this.f28474f = j12;
        this.f28475g = j13;
    }

    public static long a() {
        return f28468h.getAndIncrement();
    }
}
