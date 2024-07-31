package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractC1272n;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public final class C1274p implements Parcelable {
    public static final Parcelable.Creator<C1274p> CREATOR = new a();

    /* renamed from: a */
    ArrayList<C1277s> f5485a;

    /* renamed from: b */
    ArrayList<String> f5486b;

    /* renamed from: c */
    C1257b[] f5487c;

    /* renamed from: d */
    int f5488d;

    /* renamed from: e */
    String f5489e;

    /* renamed from: f */
    ArrayList<String> f5490f;

    /* renamed from: r */
    ArrayList<Bundle> f5491r;

    /* renamed from: s */
    ArrayList<AbstractC1272n.m> f5492s;

    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C1274p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1274p createFromParcel(Parcel parcel) {
            return new C1274p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1274p[] newArray(int i10) {
            return new C1274p[i10];
        }
    }

    public C1274p() {
        this.f5489e = null;
        this.f5490f = new ArrayList<>();
        this.f5491r = new ArrayList<>();
    }

    public C1274p(Parcel parcel) {
        this.f5489e = null;
        this.f5490f = new ArrayList<>();
        this.f5491r = new ArrayList<>();
        this.f5485a = parcel.createTypedArrayList(C1277s.CREATOR);
        this.f5486b = parcel.createStringArrayList();
        this.f5487c = (C1257b[]) parcel.createTypedArray(C1257b.CREATOR);
        this.f5488d = parcel.readInt();
        this.f5489e = parcel.readString();
        this.f5490f = parcel.createStringArrayList();
        this.f5491r = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f5492s = parcel.createTypedArrayList(AbstractC1272n.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f5485a);
        parcel.writeStringList(this.f5486b);
        parcel.writeTypedArray(this.f5487c, i10);
        parcel.writeInt(this.f5488d);
        parcel.writeString(this.f5489e);
        parcel.writeStringList(this.f5490f);
        parcel.writeTypedList(this.f5491r);
        parcel.writeTypedList(this.f5492s);
    }
}
