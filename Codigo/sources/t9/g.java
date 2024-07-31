package t9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: r, reason: collision with root package name */
    private static final HashMap f26833r;

    /* renamed from: a, reason: collision with root package name */
    final Set f26834a;

    /* renamed from: b, reason: collision with root package name */
    final int f26835b;

    /* renamed from: c, reason: collision with root package name */
    private i f26836c;

    /* renamed from: d, reason: collision with root package name */
    private String f26837d;

    /* renamed from: e, reason: collision with root package name */
    private String f26838e;

    /* renamed from: f, reason: collision with root package name */
    private String f26839f;

    static {
        HashMap hashMap = new HashMap();
        f26833r = hashMap;
        hashMap.put("authenticatorInfo", a.C0150a.v1("authenticatorInfo", 2, i.class));
        hashMap.put("signature", a.C0150a.y1("signature", 3));
        hashMap.put("package", a.C0150a.y1("package", 4));
    }

    public g() {
        this.f26834a = new HashSet(3);
        this.f26835b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Set set, int i10, i iVar, String str, String str2, String str3) {
        this.f26834a = set;
        this.f26835b = i10;
        this.f26836c = iVar;
        this.f26837d = str;
        this.f26838e = str2;
        this.f26839f = str3;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0150a c0150a, String str, com.google.android.gms.common.server.response.a aVar) {
        int A1 = c0150a.A1();
        if (A1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(A1), aVar.getClass().getCanonicalName()));
        }
        this.f26836c = (i) aVar;
        this.f26834a.add(Integer.valueOf(A1));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f26833r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final Object getFieldValue(a.C0150a c0150a) {
        int A1 = c0150a.A1();
        if (A1 == 1) {
            return Integer.valueOf(this.f26835b);
        }
        if (A1 == 2) {
            return this.f26836c;
        }
        if (A1 == 3) {
            return this.f26837d;
        }
        if (A1 == 4) {
            return this.f26838e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0150a.A1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final boolean isFieldSet(a.C0150a c0150a) {
        return this.f26834a.contains(Integer.valueOf(c0150a.A1()));
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0150a c0150a, String str, String str2) {
        int A1 = c0150a.A1();
        if (A1 == 3) {
            this.f26837d = str2;
        } else {
            if (A1 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(A1)));
            }
            this.f26838e = str2;
        }
        this.f26834a.add(Integer.valueOf(A1));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        Set set = this.f26834a;
        if (set.contains(1)) {
            ea.c.u(parcel, 1, this.f26835b);
        }
        if (set.contains(2)) {
            ea.c.E(parcel, 2, this.f26836c, i10, true);
        }
        if (set.contains(3)) {
            ea.c.G(parcel, 3, this.f26837d, true);
        }
        if (set.contains(4)) {
            ea.c.G(parcel, 4, this.f26838e, true);
        }
        if (set.contains(5)) {
            ea.c.G(parcel, 5, this.f26839f, true);
        }
        ea.c.b(parcel, a10);
    }
}
