package fd;

import android.net.Uri;
import android.os.Bundle;
import la.i;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final gd.c f15104a;

    /* renamed from: b, reason: collision with root package name */
    private final gd.a f15105b;

    public c(gd.a aVar) {
        if (aVar == null) {
            this.f15105b = null;
            this.f15104a = null;
        } else {
            if (aVar.u1() == 0) {
                aVar.A1(i.d().a());
            }
            this.f15105b = aVar;
            this.f15104a = new gd.c(aVar);
        }
    }

    public long a() {
        gd.a aVar = this.f15105b;
        if (aVar == null) {
            return 0L;
        }
        return aVar.u1();
    }

    public Uri b() {
        String v12;
        gd.a aVar = this.f15105b;
        if (aVar == null || (v12 = aVar.v1()) == null) {
            return null;
        }
        return Uri.parse(v12);
    }

    public int c() {
        gd.a aVar = this.f15105b;
        if (aVar == null) {
            return 0;
        }
        return aVar.y1();
    }

    public Bundle d() {
        gd.c cVar = this.f15104a;
        return cVar == null ? new Bundle() : cVar.a();
    }
}
