package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.p */
/* loaded from: classes2.dex */
public final class C5391p extends AbstractC7138a {
    public static final Parcelable.Creator<C5391p> CREATOR = new C5412z0();

    /* renamed from: a */
    private final List f10984a;

    /* renamed from: b */
    private final boolean f10985b;

    /* renamed from: c */
    private final boolean f10986c;

    /* renamed from: com.google.android.gms.location.p$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final ArrayList f10987a = new ArrayList();

        /* renamed from: b */
        private boolean f10988b = false;

        /* renamed from: c */
        private boolean f10989c = false;

        /* renamed from: a */
        public a m13534a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f10987a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: b */
        public C5391p m13535b() {
            return new C5391p(this.f10987a, this.f10988b, this.f10989c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5391p(List list, boolean z10, boolean z11) {
        this.f10984a = list;
        this.f10985b = z10;
        this.f10986c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, Collections.unmodifiableList(this.f10984a), false);
        C7140c.m21215g(parcel, 2, this.f10985b);
        C7140c.m21215g(parcel, 3, this.f10986c);
        C7140c.m21210b(parcel, m21209a);
    }
}
