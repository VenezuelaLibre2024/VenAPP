package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import ea.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ra.d;
import ra.e;

@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f9741a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f9742b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f9743c;

    /* renamed from: d, reason: collision with root package name */
    private final List f9744d;

    /* renamed from: e, reason: collision with root package name */
    private final List f9745e;

    /* renamed from: f, reason: collision with root package name */
    private final ra.a f9746f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9747r;

    /* renamed from: s, reason: collision with root package name */
    private Set f9748s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegisterRequestParams(Integer num, Double d10, Uri uri, List list, List list2, ra.a aVar, String str) {
        this.f9741a = num;
        this.f9742b = d10;
        this.f9743c = uri;
        s.b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f9744d = list;
        this.f9745e = list2;
        this.f9746f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            s.b((uri == null && dVar.u1() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (dVar.u1() != null) {
                hashSet.add(Uri.parse(dVar.u1()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            s.b((uri == null && eVar.u1() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (eVar.u1() != null) {
                hashSet.add(Uri.parse(eVar.u1()));
            }
        }
        this.f9748s = hashSet;
        s.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f9747r = str;
    }

    public Double A1() {
        return this.f9742b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return q.b(this.f9741a, registerRequestParams.f9741a) && q.b(this.f9742b, registerRequestParams.f9742b) && q.b(this.f9743c, registerRequestParams.f9743c) && q.b(this.f9744d, registerRequestParams.f9744d) && (((list = this.f9745e) == null && registerRequestParams.f9745e == null) || (list != null && (list2 = registerRequestParams.f9745e) != null && list.containsAll(list2) && registerRequestParams.f9745e.containsAll(this.f9745e))) && q.b(this.f9746f, registerRequestParams.f9746f) && q.b(this.f9747r, registerRequestParams.f9747r);
    }

    public int hashCode() {
        return q.c(this.f9741a, this.f9743c, this.f9742b, this.f9744d, this.f9745e, this.f9746f, this.f9747r);
    }

    public Uri u1() {
        return this.f9743c;
    }

    public ra.a v1() {
        return this.f9746f;
    }

    public String w1() {
        return this.f9747r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.x(parcel, 2, z1(), false);
        c.p(parcel, 3, A1(), false);
        c.E(parcel, 4, u1(), i10, false);
        c.K(parcel, 5, x1(), false);
        c.K(parcel, 6, y1(), false);
        c.E(parcel, 7, v1(), i10, false);
        c.G(parcel, 8, w1(), false);
        c.b(parcel, a10);
    }

    public List<d> x1() {
        return this.f9744d;
    }

    public List<e> y1() {
        return this.f9745e;
    }

    public Integer z1() {
        return this.f9741a;
    }
}
