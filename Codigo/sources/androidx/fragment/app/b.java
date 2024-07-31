package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v;
import androidx.lifecycle.f;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f4546a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<String> f4547b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f4548c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f4549d;

    /* renamed from: e, reason: collision with root package name */
    final int f4550e;

    /* renamed from: f, reason: collision with root package name */
    final String f4551f;

    /* renamed from: r, reason: collision with root package name */
    final int f4552r;

    /* renamed from: s, reason: collision with root package name */
    final int f4553s;

    /* renamed from: t, reason: collision with root package name */
    final CharSequence f4554t;

    /* renamed from: u, reason: collision with root package name */
    final int f4555u;

    /* renamed from: v, reason: collision with root package name */
    final CharSequence f4556v;

    /* renamed from: w, reason: collision with root package name */
    final ArrayList<String> f4557w;

    /* renamed from: x, reason: collision with root package name */
    final ArrayList<String> f4558x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f4559y;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f4546a = parcel.createIntArray();
        this.f4547b = parcel.createStringArrayList();
        this.f4548c = parcel.createIntArray();
        this.f4549d = parcel.createIntArray();
        this.f4550e = parcel.readInt();
        this.f4551f = parcel.readString();
        this.f4552r = parcel.readInt();
        this.f4553s = parcel.readInt();
        this.f4554t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4555u = parcel.readInt();
        this.f4556v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4557w = parcel.createStringArrayList();
        this.f4558x = parcel.createStringArrayList();
        this.f4559y = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f4773c.size();
        this.f4546a = new int[size * 5];
        if (!aVar.f4779i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4547b = new ArrayList<>(size);
        this.f4548c = new int[size];
        this.f4549d = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            v.a aVar2 = aVar.f4773c.get(i10);
            int i12 = i11 + 1;
            this.f4546a[i11] = aVar2.f4790a;
            ArrayList<String> arrayList = this.f4547b;
            Fragment fragment = aVar2.f4791b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f4546a;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f4792c;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f4793d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f4794e;
            iArr[i15] = aVar2.f4795f;
            this.f4548c[i10] = aVar2.f4796g.ordinal();
            this.f4549d[i10] = aVar2.f4797h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f4550e = aVar.f4778h;
        this.f4551f = aVar.f4781k;
        this.f4552r = aVar.f4543v;
        this.f4553s = aVar.f4782l;
        this.f4554t = aVar.f4783m;
        this.f4555u = aVar.f4784n;
        this.f4556v = aVar.f4785o;
        this.f4557w = aVar.f4786p;
        this.f4558x = aVar.f4787q;
        this.f4559y = aVar.f4788r;
    }

    public androidx.fragment.app.a a(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f4546a.length) {
            v.a aVar2 = new v.a();
            int i12 = i10 + 1;
            aVar2.f4790a = this.f4546a[i10];
            if (n.E0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f4546a[i12]);
            }
            String str = this.f4547b.get(i11);
            aVar2.f4791b = str != null ? nVar.f0(str) : null;
            aVar2.f4796g = f.b.values()[this.f4548c[i11]];
            aVar2.f4797h = f.b.values()[this.f4549d[i11]];
            int[] iArr = this.f4546a;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f4792c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f4793d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f4794e = i18;
            int i19 = iArr[i17];
            aVar2.f4795f = i19;
            aVar.f4774d = i14;
            aVar.f4775e = i16;
            aVar.f4776f = i18;
            aVar.f4777g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f4778h = this.f4550e;
        aVar.f4781k = this.f4551f;
        aVar.f4543v = this.f4552r;
        aVar.f4779i = true;
        aVar.f4782l = this.f4553s;
        aVar.f4783m = this.f4554t;
        aVar.f4784n = this.f4555u;
        aVar.f4785o = this.f4556v;
        aVar.f4786p = this.f4557w;
        aVar.f4787q = this.f4558x;
        aVar.f4788r = this.f4559y;
        aVar.m(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f4546a);
        parcel.writeStringList(this.f4547b);
        parcel.writeIntArray(this.f4548c);
        parcel.writeIntArray(this.f4549d);
        parcel.writeInt(this.f4550e);
        parcel.writeString(this.f4551f);
        parcel.writeInt(this.f4552r);
        parcel.writeInt(this.f4553s);
        TextUtils.writeToParcel(this.f4554t, parcel, 0);
        parcel.writeInt(this.f4555u);
        TextUtils.writeToParcel(this.f4556v, parcel, 0);
        parcel.writeStringList(this.f4557w);
        parcel.writeStringList(this.f4558x);
        parcel.writeInt(this.f4559y ? 1 : 0);
    }
}
