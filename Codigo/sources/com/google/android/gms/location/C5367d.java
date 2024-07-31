package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.d */
/* loaded from: classes2.dex */
public class C5367d extends AbstractC7138a {
    public static final Parcelable.Creator<C5367d> CREATOR = new C5382k0();

    /* renamed from: e */
    public static final Comparator<C5365c> f10915e = new C5380j0();

    /* renamed from: a */
    private final List f10916a;

    /* renamed from: b */
    private final String f10917b;

    /* renamed from: c */
    private final List f10918c;

    /* renamed from: d */
    private String f10919d;

    public C5367d(List list, String str, List list2, String str2) {
        C5276s.m13325k(list, "transitions can't be null");
        C5276s.m13316b(list.size() > 0, "transitions can't be empty.");
        C5276s.m13324j(list);
        TreeSet treeSet = new TreeSet(f10915e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5365c c5365c = (C5365c) it.next();
            C5276s.m13316b(treeSet.add(c5365c), String.format("Found duplicated transition: %s.", c5365c));
        }
        this.f10916a = Collections.unmodifiableList(list);
        this.f10917b = str;
        this.f10918c = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f10919d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C5367d c5367d = (C5367d) obj;
            if (C5270q.m13304b(this.f10916a, c5367d.f10916a) && C5270q.m13304b(this.f10917b, c5367d.f10917b) && C5270q.m13304b(this.f10919d, c5367d.f10919d) && C5270q.m13304b(this.f10918c, c5367d.f10918c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f10916a.hashCode() * 31;
        String str = this.f10917b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f10918c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f10919d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.f10916a) + ", mTag='" + this.f10917b + "', mClients=" + String.valueOf(this.f10918c) + ", mAttributionTag=" + this.f10919d + "]";
    }

    /* renamed from: u1 */
    public final C5367d m13510u1(String str) {
        this.f10919d = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C5276s.m13324j(parcel);
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, this.f10916a, false);
        C7140c.m21200G(parcel, 2, this.f10917b, false);
        C7140c.m21204K(parcel, 3, this.f10918c, false);
        C7140c.m21200G(parcel, 4, this.f10919d, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
