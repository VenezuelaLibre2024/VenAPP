package androidx.work;

import android.net.Network;
import android.net.Uri;
import f2.f;
import f2.o;
import f2.v;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    private UUID f5668a;

    /* renamed from: b */
    private b f5669b;

    /* renamed from: c */
    private Set<String> f5670c;

    /* renamed from: d */
    private a f5671d;

    /* renamed from: e */
    private int f5672e;

    /* renamed from: f */
    private Executor f5673f;

    /* renamed from: g */
    private m2.b f5674g;

    /* renamed from: h */
    private v f5675h;

    /* renamed from: i */
    private o f5676i;

    /* renamed from: j */
    private f f5677j;

    /* renamed from: k */
    private int f5678k;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public List<String> f5679a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f5680b = Collections.emptyList();

        /* renamed from: c */
        public Network f5681c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, m2.b bVar2, v vVar, o oVar, f fVar) {
        this.f5668a = uuid;
        this.f5669b = bVar;
        this.f5670c = new HashSet(collection);
        this.f5671d = aVar;
        this.f5672e = i10;
        this.f5678k = i11;
        this.f5673f = executor;
        this.f5674g = bVar2;
        this.f5675h = vVar;
        this.f5676i = oVar;
        this.f5677j = fVar;
    }

    public Executor a() {
        return this.f5673f;
    }

    public f b() {
        return this.f5677j;
    }

    public UUID c() {
        return this.f5668a;
    }

    public b d() {
        return this.f5669b;
    }

    public Network e() {
        return this.f5671d.f5681c;
    }

    public o f() {
        return this.f5676i;
    }

    public int g() {
        return this.f5672e;
    }

    public Set<String> h() {
        return this.f5670c;
    }

    public m2.b i() {
        return this.f5674g;
    }

    public List<String> j() {
        return this.f5671d.f5679a;
    }

    public List<Uri> k() {
        return this.f5671d.f5680b;
    }

    public v l() {
        return this.f5675h;
    }
}
