package t6;

import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public final class v implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final v f26557d = new v(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    private static final String f26558e = t8.r0.r0(0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f26559f = t8.r0.r0(1);

    /* renamed from: r, reason: collision with root package name */
    private static final String f26560r = t8.r0.r0(2);

    /* renamed from: s, reason: collision with root package name */
    public static final o.a<v> f26561s = new o.a() { // from class: t6.u
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            v c10;
            c10 = v.c(bundle);
            return c10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f26562a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26563b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26564c;

    public v(int i10, int i11, int i12) {
        this.f26562a = i10;
        this.f26563b = i11;
        this.f26564c = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v c(Bundle bundle) {
        return new v(bundle.getInt(f26558e, 0), bundle.getInt(f26559f, 0), bundle.getInt(f26560r, 0));
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f26558e, this.f26562a);
        bundle.putInt(f26559f, this.f26563b);
        bundle.putInt(f26560r, this.f26564c);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f26562a == vVar.f26562a && this.f26563b == vVar.f26563b && this.f26564c == vVar.f26564c;
    }

    public int hashCode() {
        return ((((527 + this.f26562a) * 31) + this.f26563b) * 31) + this.f26564c;
    }
}
