package androidx.activity.result;

import f.d;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private d.f f688a = d.b.f14837a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private d.f f689a = d.b.f14837a;

        public final f a() {
            f fVar = new f();
            fVar.b(this.f689a);
            return fVar;
        }

        public final a b(d.f mediaType) {
            n.e(mediaType, "mediaType");
            this.f689a = mediaType;
            return this;
        }
    }

    public final d.f a() {
        return this.f688a;
    }

    public final void b(d.f fVar) {
        n.e(fVar, "<set-?>");
        this.f688a = fVar;
    }
}
