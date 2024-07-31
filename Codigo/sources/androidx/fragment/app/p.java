package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    ArrayList<s> f4731a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<String> f4732b;

    /* renamed from: c, reason: collision with root package name */
    b[] f4733c;

    /* renamed from: d, reason: collision with root package name */
    int f4734d;

    /* renamed from: e, reason: collision with root package name */
    String f4735e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f4736f;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<Bundle> f4737r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<n.m> f4738s;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p() {
        this.f4735e = null;
        this.f4736f = new ArrayList<>();
        this.f4737r = new ArrayList<>();
    }

    public p(Parcel parcel) {
        this.f4735e = null;
        this.f4736f = new ArrayList<>();
        this.f4737r = new ArrayList<>();
        this.f4731a = parcel.createTypedArrayList(s.CREATOR);
        this.f4732b = parcel.createStringArrayList();
        this.f4733c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f4734d = parcel.readInt();
        this.f4735e = parcel.readString();
        this.f4736f = parcel.createStringArrayList();
        this.f4737r = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f4738s = parcel.createTypedArrayList(n.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f4731a);
        parcel.writeStringList(this.f4732b);
        parcel.writeTypedArray(this.f4733c, i10);
        parcel.writeInt(this.f4734d);
        parcel.writeString(this.f4735e);
        parcel.writeStringList(this.f4736f);
        parcel.writeTypedList(this.f4737r);
        parcel.writeTypedList(this.f4738s);
    }
}
