package tf;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.mlkit_common.zzaa;
import com.google.android.gms.internal.mlkit_common.zzz;
import com.google.mlkit.common.sdkinternal.l;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f26884e = new EnumMap(uf.a.class);

    /* renamed from: f, reason: collision with root package name */
    public static final Map f26885f = new EnumMap(uf.a.class);

    /* renamed from: a, reason: collision with root package name */
    private final String f26886a;

    /* renamed from: b, reason: collision with root package name */
    private final uf.a f26887b;

    /* renamed from: c, reason: collision with root package name */
    private final l f26888c;

    /* renamed from: d, reason: collision with root package name */
    private String f26889d;

    public String a() {
        return this.f26889d;
    }

    public String b() {
        String str = this.f26886a;
        return str != null ? str : (String) f26885f.get(this.f26887b);
    }

    public l c() {
        return this.f26888c;
    }

    public String d() {
        String str = this.f26886a;
        return str != null ? str : "COM.GOOGLE.BASE_".concat(String.valueOf((String) f26885f.get(this.f26887b)));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return q.b(this.f26886a, bVar.f26886a) && q.b(this.f26887b, bVar.f26887b) && q.b(this.f26888c, bVar.f26888c);
    }

    public int hashCode() {
        return q.c(this.f26886a, this.f26887b, this.f26888c);
    }

    public String toString() {
        zzz zzb = zzaa.zzb("RemoteModel");
        zzb.zza("modelName", this.f26886a);
        zzb.zza("baseModel", this.f26887b);
        zzb.zza("modelType", this.f26888c);
        return zzb.toString();
    }
}
