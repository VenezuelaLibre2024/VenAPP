package androidx.activity.result;

import kotlin.jvm.internal.C9322n;
import p091f.C7258d;

/* renamed from: androidx.activity.result.f */
/* loaded from: classes.dex */
public final class C0213f {

    /* renamed from: a */
    private C7258d.f f753a = C7258d.b.f16260a;

    /* renamed from: androidx.activity.result.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C7258d.f f754a = C7258d.b.f16260a;

        /* renamed from: a */
        public final C0213f m848a() {
            C0213f c0213f = new C0213f();
            c0213f.m847b(this.f754a);
            return c0213f;
        }

        /* renamed from: b */
        public final a m849b(C7258d.f mediaType) {
            C9322n.m27781e(mediaType, "mediaType");
            this.f754a = mediaType;
            return this;
        }
    }

    /* renamed from: a */
    public final C7258d.f m846a() {
        return this.f753a;
    }

    /* renamed from: b */
    public final void m847b(C7258d.f fVar) {
        C9322n.m27781e(fVar, "<set-?>");
        this.f753a = fVar;
    }
}
