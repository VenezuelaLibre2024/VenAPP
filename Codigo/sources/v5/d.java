package v5;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f27932f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f27933a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27934b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.CompressFormat f27935c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27936d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27937e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d a(Map<?, ?> map) {
            n.e(map, "map");
            Object obj = map.get("width");
            n.c(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = map.get("height");
            n.c(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj2).intValue();
            Object obj3 = map.get("format");
            n.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue3 = ((Integer) obj3).intValue();
            Object obj4 = map.get("quality");
            n.c(obj4, "null cannot be cast to non-null type kotlin.Int");
            int intValue4 = ((Integer) obj4).intValue();
            n.c(map.get("frame"), "null cannot be cast to non-null type kotlin.Int");
            return new d(intValue, intValue2, intValue3 == 0 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, intValue4, ((Integer) r10).intValue());
        }
    }

    public d(int i10, int i11, Bitmap.CompressFormat format, int i12, long j10) {
        n.e(format, "format");
        this.f27933a = i10;
        this.f27934b = i11;
        this.f27935c = format;
        this.f27936d = i12;
        this.f27937e = j10;
    }

    public final Bitmap.CompressFormat a() {
        return this.f27935c;
    }

    public final long b() {
        return this.f27937e;
    }

    public final int c() {
        return this.f27934b;
    }

    public final int d() {
        return this.f27936d;
    }

    public final int e() {
        return this.f27933a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f27933a == dVar.f27933a && this.f27934b == dVar.f27934b && this.f27935c == dVar.f27935c && this.f27936d == dVar.f27936d && this.f27937e == dVar.f27937e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f27933a) * 31) + Integer.hashCode(this.f27934b)) * 31) + this.f27935c.hashCode()) * 31) + Integer.hashCode(this.f27936d)) * 31) + Long.hashCode(this.f27937e);
    }

    public String toString() {
        return "ThumbLoadOption(width=" + this.f27933a + ", height=" + this.f27934b + ", format=" + this.f27935c + ", quality=" + this.f27936d + ", frame=" + this.f27937e + ')';
    }
}
