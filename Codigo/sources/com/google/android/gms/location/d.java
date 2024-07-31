package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new k0();

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator<c> f9800e = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final List f9801a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9802b;

    /* renamed from: c, reason: collision with root package name */
    private final List f9803c;

    /* renamed from: d, reason: collision with root package name */
    private String f9804d;

    public d(List list, String str, List list2, String str2) {
        com.google.android.gms.common.internal.s.k(list, "transitions can't be null");
        com.google.android.gms.common.internal.s.b(list.size() > 0, "transitions can't be empty.");
        com.google.android.gms.common.internal.s.j(list);
        TreeSet treeSet = new TreeSet(f9800e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            com.google.android.gms.common.internal.s.b(treeSet.add(cVar), String.format("Found duplicated transition: %s.", cVar));
        }
        this.f9801a = Collections.unmodifiableList(list);
        this.f9802b = str;
        this.f9803c = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f9804d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (com.google.android.gms.common.internal.q.b(this.f9801a, dVar.f9801a) && com.google.android.gms.common.internal.q.b(this.f9802b, dVar.f9802b) && com.google.android.gms.common.internal.q.b(this.f9804d, dVar.f9804d) && com.google.android.gms.common.internal.q.b(this.f9803c, dVar.f9803c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f9801a.hashCode() * 31;
        String str = this.f9802b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f9803c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f9804d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.f9801a) + ", mTag='" + this.f9802b + "', mClients=" + String.valueOf(this.f9803c) + ", mAttributionTag=" + this.f9804d + "]";
    }

    public final d u1(String str) {
        this.f9804d = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.s.j(parcel);
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, this.f9801a, false);
        ea.c.G(parcel, 2, this.f9802b, false);
        ea.c.K(parcel, 3, this.f9803c, false);
        ea.c.G(parcel, 4, this.f9804d, false);
        ea.c.b(parcel, a10);
    }
}
