package p395v5;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: v5.d */
/* loaded from: classes.dex */
public final class C11630d {

    /* renamed from: f */
    public static final a f30256f = new a(null);

    /* renamed from: a */
    private final int f30257a;

    /* renamed from: b */
    private final int f30258b;

    /* renamed from: c */
    private final Bitmap.CompressFormat f30259c;

    /* renamed from: d */
    private final int f30260d;

    /* renamed from: e */
    private final long f30261e;

    /* renamed from: v5.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C11630d m36456a(Map<?, ?> map) {
            C9322n.m27781e(map, "map");
            Object obj = map.get("width");
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = map.get("height");
            C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj2).intValue();
            Object obj3 = map.get("format");
            C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue3 = ((Integer) obj3).intValue();
            Object obj4 = map.get("quality");
            C9322n.m27779c(obj4, "null cannot be cast to non-null type kotlin.Int");
            int intValue4 = ((Integer) obj4).intValue();
            C9322n.m27779c(map.get("frame"), "null cannot be cast to non-null type kotlin.Int");
            return new C11630d(intValue, intValue2, intValue3 == 0 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, intValue4, ((Integer) r10).intValue());
        }
    }

    public C11630d(int i10, int i11, Bitmap.CompressFormat format, int i12, long j10) {
        C9322n.m27781e(format, "format");
        this.f30257a = i10;
        this.f30258b = i11;
        this.f30259c = format;
        this.f30260d = i12;
        this.f30261e = j10;
    }

    /* renamed from: a */
    public final Bitmap.CompressFormat m36451a() {
        return this.f30259c;
    }

    /* renamed from: b */
    public final long m36452b() {
        return this.f30261e;
    }

    /* renamed from: c */
    public final int m36453c() {
        return this.f30258b;
    }

    /* renamed from: d */
    public final int m36454d() {
        return this.f30260d;
    }

    /* renamed from: e */
    public final int m36455e() {
        return this.f30257a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11630d)) {
            return false;
        }
        C11630d c11630d = (C11630d) obj;
        return this.f30257a == c11630d.f30257a && this.f30258b == c11630d.f30258b && this.f30259c == c11630d.f30259c && this.f30260d == c11630d.f30260d && this.f30261e == c11630d.f30261e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f30257a) * 31) + Integer.hashCode(this.f30258b)) * 31) + this.f30259c.hashCode()) * 31) + Integer.hashCode(this.f30260d)) * 31) + Long.hashCode(this.f30261e);
    }

    public String toString() {
        return "ThumbLoadOption(width=" + this.f30257a + ", height=" + this.f30258b + ", format=" + this.f30259c + ", quality=" + this.f30260d + ", frame=" + this.f30261e + ')';
    }
}
