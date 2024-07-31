package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC5300a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p081ea.C7140c;

/* renamed from: t9.b */
/* loaded from: classes.dex */
public final class C11183b extends zzbz {
    public static final Parcelable.Creator<C11183b> CREATOR = new C11184c();

    /* renamed from: f */
    private static final HashMap f29116f;

    /* renamed from: a */
    final Set f29117a;

    /* renamed from: b */
    final int f29118b;

    /* renamed from: c */
    private ArrayList f29119c;

    /* renamed from: d */
    private int f29120d;

    /* renamed from: e */
    private C11186e f29121e;

    static {
        HashMap hashMap = new HashMap();
        f29116f = hashMap;
        hashMap.put("authenticatorData", AbstractC5300a.a.m13373w1("authenticatorData", 2, C11188g.class));
        hashMap.put("progress", AbstractC5300a.a.m13372v1("progress", 4, C11186e.class));
    }

    public C11183b() {
        this.f29117a = new HashSet(1);
        this.f29118b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11183b(Set set, int i10, ArrayList arrayList, int i11, C11186e c11186e) {
        this.f29117a = set;
        this.f29118b = i10;
        this.f29119c = arrayList;
        this.f29120d = i11;
        this.f29121e = c11186e;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final void addConcreteTypeArrayInternal(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(m13377A1), arrayList.getClass().getCanonicalName()));
        }
        this.f29119c = arrayList;
        this.f29117a.add(Integer.valueOf(m13377A1));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final void addConcreteTypeInternal(AbstractC5300a.a aVar, String str, AbstractC5300a abstractC5300a) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m13377A1), abstractC5300a.getClass().getCanonicalName()));
        }
        this.f29121e = (C11186e) abstractC5300a;
        this.f29117a.add(Integer.valueOf(m13377A1));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final /* synthetic */ Map getFieldMappings() {
        return f29116f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final Object getFieldValue(AbstractC5300a.a aVar) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 == 1) {
            return Integer.valueOf(this.f29118b);
        }
        if (m13377A1 == 2) {
            return this.f29119c;
        }
        if (m13377A1 == 4) {
            return this.f29121e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13377A1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final boolean isFieldSet(AbstractC5300a.a aVar) {
        return this.f29117a.contains(Integer.valueOf(aVar.m13377A1()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        Set set = this.f29117a;
        if (set.contains(1)) {
            C7140c.m21229u(parcel, 1, this.f29118b);
        }
        if (set.contains(2)) {
            C7140c.m21204K(parcel, 2, this.f29119c, true);
        }
        if (set.contains(3)) {
            C7140c.m21229u(parcel, 3, this.f29120d);
        }
        if (set.contains(4)) {
            C7140c.m21198E(parcel, 4, this.f29121e, i10, true);
        }
        C7140c.m21210b(parcel, m21209a);
    }
}
