package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import ea.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ra.e;

@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f9749a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f9750b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f9751c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f9752d;

    /* renamed from: e, reason: collision with root package name */
    private final List f9753e;

    /* renamed from: f, reason: collision with root package name */
    private final ra.a f9754f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9755r;

    /* renamed from: s, reason: collision with root package name */
    private final Set f9756s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, List list, ra.a aVar, String str) {
        this.f9749a = num;
        this.f9750b = d10;
        this.f9751c = uri;
        this.f9752d = bArr;
        s.b((list == null || list.isEmpty()) ? false : true, "registeredKeys must not be null or empty");
        this.f9753e = list;
        this.f9754f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            s.b((eVar.u1() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            eVar.v1();
            s.b(true, "register request has null challenge and no default challenge isprovided");
            if (eVar.u1() != null) {
                hashSet.add(Uri.parse(eVar.u1()));
            }
        }
        this.f9756s = hashSet;
        s.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f9755r = str;
    }

    public Double A1() {
        return this.f9750b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return q.b(this.f9749a, signRequestParams.f9749a) && q.b(this.f9750b, signRequestParams.f9750b) && q.b(this.f9751c, signRequestParams.f9751c) && Arrays.equals(this.f9752d, signRequestParams.f9752d) && this.f9753e.containsAll(signRequestParams.f9753e) && signRequestParams.f9753e.containsAll(this.f9753e) && q.b(this.f9754f, signRequestParams.f9754f) && q.b(this.f9755r, signRequestParams.f9755r);
    }

    public int hashCode() {
        return q.c(this.f9749a, this.f9751c, this.f9750b, this.f9753e, this.f9754f, this.f9755r, Integer.valueOf(Arrays.hashCode(this.f9752d)));
    }

    public Uri u1() {
        return this.f9751c;
    }

    public ra.a v1() {
        return this.f9754f;
    }

    public byte[] w1() {
        return this.f9752d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.x(parcel, 2, z1(), false);
        c.p(parcel, 3, A1(), false);
        c.E(parcel, 4, u1(), i10, false);
        c.l(parcel, 5, w1(), false);
        c.K(parcel, 6, y1(), false);
        c.E(parcel, 7, v1(), i10, false);
        c.G(parcel, 8, x1(), false);
        c.b(parcel, a10);
    }

    public String x1() {
        return this.f9755r;
    }

    public List<e> y1() {
        return this.f9753e;
    }

    public Integer z1() {
        return this.f9749a;
    }
}
