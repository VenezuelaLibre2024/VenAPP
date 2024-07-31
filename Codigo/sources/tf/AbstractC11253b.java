package tf;

import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.internal.mlkit_common.zzaa;
import com.google.android.gms.internal.mlkit_common.zzz;
import com.google.mlkit.common.sdkinternal.EnumC6530l;
import java.util.EnumMap;
import java.util.Map;
import p384uf.EnumC11552a;

/* renamed from: tf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC11253b {

    /* renamed from: e */
    private static final Map f29180e = new EnumMap(EnumC11552a.class);

    /* renamed from: f */
    public static final Map f29181f = new EnumMap(EnumC11552a.class);

    /* renamed from: a */
    private final String f29182a;

    /* renamed from: b */
    private final EnumC11552a f29183b;

    /* renamed from: c */
    private final EnumC6530l f29184c;

    /* renamed from: d */
    private String f29185d;

    /* renamed from: a */
    public String m35163a() {
        return this.f29185d;
    }

    /* renamed from: b */
    public String m35164b() {
        String str = this.f29182a;
        return str != null ? str : (String) f29181f.get(this.f29183b);
    }

    /* renamed from: c */
    public EnumC6530l m35165c() {
        return this.f29184c;
    }

    /* renamed from: d */
    public String m35166d() {
        String str = this.f29182a;
        return str != null ? str : "COM.GOOGLE.BASE_".concat(String.valueOf((String) f29181f.get(this.f29183b)));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11253b)) {
            return false;
        }
        AbstractC11253b abstractC11253b = (AbstractC11253b) obj;
        return C5270q.m13304b(this.f29182a, abstractC11253b.f29182a) && C5270q.m13304b(this.f29183b, abstractC11253b.f29183b) && C5270q.m13304b(this.f29184c, abstractC11253b.f29184c);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f29182a, this.f29183b, this.f29184c);
    }

    public String toString() {
        zzz zzb = zzaa.zzb("RemoteModel");
        zzb.zza("modelName", this.f29182a);
        zzb.zza("baseModel", this.f29183b);
        zzb.zza("modelType", this.f29184c);
        return zzb.toString();
    }
}
