package x6;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final s8.n f30546a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f30547b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f30548c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30549d;

    public m0(s8.n nVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.f30546a = nVar;
        this.f30547b = uri;
        this.f30548c = map;
        this.f30549d = j10;
    }
}
