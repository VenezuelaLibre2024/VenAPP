package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC5300a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p081ea.C7140c;

/* renamed from: t9.g */
/* loaded from: classes.dex */
public final class C11188g extends zzbz {
    public static final Parcelable.Creator<C11188g> CREATOR = new C11189h();

    /* renamed from: r */
    private static final HashMap f29129r;

    /* renamed from: a */
    final Set f29130a;

    /* renamed from: b */
    final int f29131b;

    /* renamed from: c */
    private C11190i f29132c;

    /* renamed from: d */
    private String f29133d;

    /* renamed from: e */
    private String f29134e;

    /* renamed from: f */
    private String f29135f;

    static {
        HashMap hashMap = new HashMap();
        f29129r = hashMap;
        hashMap.put("authenticatorInfo", AbstractC5300a.a.m13372v1("authenticatorInfo", 2, C11190i.class));
        hashMap.put("signature", AbstractC5300a.a.m13375y1("signature", 3));
        hashMap.put("package", AbstractC5300a.a.m13375y1("package", 4));
    }

    public C11188g() {
        this.f29130a = new HashSet(3);
        this.f29131b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11188g(Set set, int i10, C11190i c11190i, String str, String str2, String str3) {
        this.f29130a = set;
        this.f29131b = i10;
        this.f29132c = c11190i;
        this.f29133d = str;
        this.f29134e = str2;
        this.f29135f = str3;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final void addConcreteTypeInternal(AbstractC5300a.a aVar, String str, AbstractC5300a abstractC5300a) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m13377A1), abstractC5300a.getClass().getCanonicalName()));
        }
        this.f29132c = (C11190i) abstractC5300a;
        this.f29130a.add(Integer.valueOf(m13377A1));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final /* synthetic */ Map getFieldMappings() {
        return f29129r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final Object getFieldValue(AbstractC5300a.a aVar) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 == 1) {
            return Integer.valueOf(this.f29131b);
        }
        if (m13377A1 == 2) {
            return this.f29132c;
        }
        if (m13377A1 == 3) {
            return this.f29133d;
        }
        if (m13377A1 == 4) {
            return this.f29134e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13377A1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final boolean isFieldSet(AbstractC5300a.a aVar) {
        return this.f29130a.contains(Integer.valueOf(aVar.m13377A1()));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setStringInternal(AbstractC5300a.a aVar, String str, String str2) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 == 3) {
            this.f29133d = str2;
        } else {
            if (m13377A1 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m13377A1)));
            }
            this.f29134e = str2;
        }
        this.f29130a.add(Integer.valueOf(m13377A1));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        Set set = this.f29130a;
        if (set.contains(1)) {
            C7140c.m21229u(parcel, 1, this.f29131b);
        }
        if (set.contains(2)) {
            C7140c.m21198E(parcel, 2, this.f29132c, i10, true);
        }
        if (set.contains(3)) {
            C7140c.m21200G(parcel, 3, this.f29133d, true);
        }
        if (set.contains(4)) {
            C7140c.m21200G(parcel, 4, this.f29134e, true);
        }
        if (set.contains(5)) {
            C7140c.m21200G(parcel, 5, this.f29135f, true);
        }
        C7140c.m21210b(parcel, m21209a);
    }
}
