package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.location.zzdh;
import java.util.ArrayList;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.k */
/* loaded from: classes2.dex */
public class C5381k extends AbstractC7138a {
    public static final Parcelable.Creator<C5381k> CREATOR = new C5388n0();

    /* renamed from: a */
    private final List f10951a;

    /* renamed from: b */
    private final int f10952b;

    /* renamed from: c */
    private final String f10953c;

    /* renamed from: d */
    private final String f10954d;

    /* renamed from: com.google.android.gms.location.k$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final List f10955a = new ArrayList();

        /* renamed from: b */
        private int f10956b = 5;

        /* renamed from: c */
        private String f10957c = "";

        /* renamed from: a */
        public a m13523a(InterfaceC5375h interfaceC5375h) {
            C5276s.m13325k(interfaceC5375h, "geofence can't be null.");
            C5276s.m13316b(interfaceC5375h instanceof zzdh, "Geofence must be created using Geofence.Builder.");
            this.f10955a.add((zzdh) interfaceC5375h);
            return this;
        }

        /* renamed from: b */
        public a m13524b(List<InterfaceC5375h> list) {
            if (list != null && !list.isEmpty()) {
                for (InterfaceC5375h interfaceC5375h : list) {
                    if (interfaceC5375h != null) {
                        m13523a(interfaceC5375h);
                    }
                }
            }
            return this;
        }

        /* renamed from: c */
        public C5381k m13525c() {
            C5276s.m13316b(!this.f10955a.isEmpty(), "No geofence has been added to this request.");
            return new C5381k(this.f10955a, this.f10956b, this.f10957c, null);
        }

        /* renamed from: d */
        public a m13526d(int i10) {
            this.f10956b = i10 & 7;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5381k(List list, int i10, String str, String str2) {
        this.f10951a = list;
        this.f10952b = i10;
        this.f10953c = str;
        this.f10954d = str2;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f10951a + ", initialTrigger=" + this.f10952b + ", tag=" + this.f10953c + ", attributionTag=" + this.f10954d + "]";
    }

    /* renamed from: u1 */
    public int m13521u1() {
        return this.f10952b;
    }

    /* renamed from: v1 */
    public final C5381k m13522v1(String str) {
        return new C5381k(this.f10951a, this.f10952b, this.f10953c, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, this.f10951a, false);
        C7140c.m21229u(parcel, 2, m13521u1());
        C7140c.m21200G(parcel, 3, this.f10953c, false);
        C7140c.m21200G(parcel, 4, this.f10954d, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
