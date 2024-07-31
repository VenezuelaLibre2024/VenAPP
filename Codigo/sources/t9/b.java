package t9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f26820f;

    /* renamed from: a, reason: collision with root package name */
    final Set f26821a;

    /* renamed from: b, reason: collision with root package name */
    final int f26822b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f26823c;

    /* renamed from: d, reason: collision with root package name */
    private int f26824d;

    /* renamed from: e, reason: collision with root package name */
    private e f26825e;

    static {
        HashMap hashMap = new HashMap();
        f26820f = hashMap;
        hashMap.put("authenticatorData", a.C0150a.w1("authenticatorData", 2, g.class));
        hashMap.put("progress", a.C0150a.v1("progress", 4, e.class));
    }

    public b() {
        this.f26821a = new HashSet(1);
        this.f26822b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Set set, int i10, ArrayList arrayList, int i11, e eVar) {
        this.f26821a = set;
        this.f26822b = i10;
        this.f26823c = arrayList;
        this.f26824d = i11;
        this.f26825e = eVar;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeArrayInternal(a.C0150a c0150a, String str, ArrayList arrayList) {
        int A1 = c0150a.A1();
        if (A1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(A1), arrayList.getClass().getCanonicalName()));
        }
        this.f26823c = arrayList;
        this.f26821a.add(Integer.valueOf(A1));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0150a c0150a, String str, com.google.android.gms.common.server.response.a aVar) {
        int A1 = c0150a.A1();
        if (A1 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(A1), aVar.getClass().getCanonicalName()));
        }
        this.f26825e = (e) aVar;
        this.f26821a.add(Integer.valueOf(A1));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f26820f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final Object getFieldValue(a.C0150a c0150a) {
        int A1 = c0150a.A1();
        if (A1 == 1) {
            return Integer.valueOf(this.f26822b);
        }
        if (A1 == 2) {
            return this.f26823c;
        }
        if (A1 == 4) {
            return this.f26825e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0150a.A1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final boolean isFieldSet(a.C0150a c0150a) {
        return this.f26821a.contains(Integer.valueOf(c0150a.A1()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        Set set = this.f26821a;
        if (set.contains(1)) {
            ea.c.u(parcel, 1, this.f26822b);
        }
        if (set.contains(2)) {
            ea.c.K(parcel, 2, this.f26823c, true);
        }
        if (set.contains(3)) {
            ea.c.u(parcel, 3, this.f26824d);
        }
        if (set.contains(4)) {
            ea.c.E(parcel, 4, this.f26825e, i10, true);
        }
        ea.c.b(parcel, a10);
    }
}
