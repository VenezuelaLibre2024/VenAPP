package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C0731a;
import com.google.android.gms.common.server.response.AbstractC5300a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p081ea.C7140c;

/* renamed from: t9.e */
/* loaded from: classes.dex */
public final class C11186e extends zzbz {
    public static final Parcelable.Creator<C11186e> CREATOR = new C11187f();

    /* renamed from: r */
    private static final C0731a f29122r;

    /* renamed from: a */
    final int f29123a;

    /* renamed from: b */
    private List f29124b;

    /* renamed from: c */
    private List f29125c;

    /* renamed from: d */
    private List f29126d;

    /* renamed from: e */
    private List f29127e;

    /* renamed from: f */
    private List f29128f;

    static {
        C0731a c0731a = new C0731a();
        f29122r = c0731a;
        c0731a.put("registered", AbstractC5300a.a.m13376z1("registered", 2));
        c0731a.put("in_progress", AbstractC5300a.a.m13376z1("in_progress", 3));
        c0731a.put("success", AbstractC5300a.a.m13376z1("success", 4));
        c0731a.put("failed", AbstractC5300a.a.m13376z1("failed", 5));
        c0731a.put("escrowed", AbstractC5300a.a.m13376z1("escrowed", 6));
    }

    public C11186e() {
        this.f29123a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11186e(int i10, List list, List list2, List list3, List list4, List list5) {
        this.f29123a = i10;
        this.f29124b = list;
        this.f29125c = list2;
        this.f29126d = list3;
        this.f29127e = list4;
        this.f29128f = list5;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final Map getFieldMappings() {
        return f29122r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final Object getFieldValue(AbstractC5300a.a aVar) {
        switch (aVar.m13377A1()) {
            case 1:
                return Integer.valueOf(this.f29123a);
            case 2:
                return this.f29124b;
            case 3:
                return this.f29125c;
            case 4:
                return this.f29126d;
            case 5:
                return this.f29127e;
            case 6:
                return this.f29128f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13377A1());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final boolean isFieldSet(AbstractC5300a.a aVar) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setStringsInternal(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 == 2) {
            this.f29124b = arrayList;
            return;
        }
        if (m13377A1 == 3) {
            this.f29125c = arrayList;
            return;
        }
        if (m13377A1 == 4) {
            this.f29126d = arrayList;
        } else if (m13377A1 == 5) {
            this.f29127e = arrayList;
        } else {
            if (m13377A1 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(m13377A1)));
            }
            this.f29128f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f29123a);
        C7140c.m21202I(parcel, 2, this.f29124b, false);
        C7140c.m21202I(parcel, 3, this.f29125c, false);
        C7140c.m21202I(parcel, 4, this.f29126d, false);
        C7140c.m21202I(parcel, 5, this.f29127e, false);
        C7140c.m21202I(parcel, 6, this.f29128f, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
