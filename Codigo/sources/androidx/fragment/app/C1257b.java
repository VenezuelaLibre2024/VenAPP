package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC1280v;
import androidx.lifecycle.AbstractC1300f;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C1257b implements Parcelable {
    public static final Parcelable.Creator<C1257b> CREATOR = new a();

    /* renamed from: a */
    final int[] f5283a;

    /* renamed from: b */
    final ArrayList<String> f5284b;

    /* renamed from: c */
    final int[] f5285c;

    /* renamed from: d */
    final int[] f5286d;

    /* renamed from: e */
    final int f5287e;

    /* renamed from: f */
    final String f5288f;

    /* renamed from: r */
    final int f5289r;

    /* renamed from: s */
    final int f5290s;

    /* renamed from: t */
    final CharSequence f5291t;

    /* renamed from: u */
    final int f5292u;

    /* renamed from: v */
    final CharSequence f5293v;

    /* renamed from: w */
    final ArrayList<String> f5294w;

    /* renamed from: x */
    final ArrayList<String> f5295x;

    /* renamed from: y */
    final boolean f5296y;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C1257b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1257b createFromParcel(Parcel parcel) {
            return new C1257b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1257b[] newArray(int i10) {
            return new C1257b[i10];
        }
    }

    public C1257b(Parcel parcel) {
        this.f5283a = parcel.createIntArray();
        this.f5284b = parcel.createStringArrayList();
        this.f5285c = parcel.createIntArray();
        this.f5286d = parcel.createIntArray();
        this.f5287e = parcel.readInt();
        this.f5288f = parcel.readString();
        this.f5289r = parcel.readInt();
        this.f5290s = parcel.readInt();
        this.f5291t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5292u = parcel.readInt();
        this.f5293v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5294w = parcel.createStringArrayList();
        this.f5295x = parcel.createStringArrayList();
        this.f5296y = parcel.readInt() != 0;
    }

    public C1257b(C1255a c1255a) {
        int size = c1255a.f5527c.size();
        this.f5283a = new int[size * 5];
        if (!c1255a.f5533i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5284b = new ArrayList<>(size);
        this.f5285c = new int[size];
        this.f5286d = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            AbstractC1280v.a aVar = c1255a.f5527c.get(i10);
            int i12 = i11 + 1;
            this.f5283a[i11] = aVar.f5544a;
            ArrayList<String> arrayList = this.f5284b;
            Fragment fragment = aVar.f5545b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f5283a;
            int i13 = i12 + 1;
            iArr[i12] = aVar.f5546c;
            int i14 = i13 + 1;
            iArr[i13] = aVar.f5547d;
            int i15 = i14 + 1;
            iArr[i14] = aVar.f5548e;
            iArr[i15] = aVar.f5549f;
            this.f5285c[i10] = aVar.f5550g.ordinal();
            this.f5286d[i10] = aVar.f5551h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f5287e = c1255a.f5532h;
        this.f5288f = c1255a.f5535k;
        this.f5289r = c1255a.f5280v;
        this.f5290s = c1255a.f5536l;
        this.f5291t = c1255a.f5537m;
        this.f5292u = c1255a.f5538n;
        this.f5293v = c1255a.f5539o;
        this.f5294w = c1255a.f5540p;
        this.f5295x = c1255a.f5541q;
        this.f5296y = c1255a.f5542r;
    }

    /* renamed from: a */
    public C1255a m6860a(AbstractC1272n abstractC1272n) {
        C1255a c1255a = new C1255a(abstractC1272n);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f5283a.length) {
            AbstractC1280v.a aVar = new AbstractC1280v.a();
            int i12 = i10 + 1;
            aVar.f5544a = this.f5283a[i10];
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1255a + " op #" + i11 + " base fragment #" + this.f5283a[i12]);
            }
            String str = this.f5284b.get(i11);
            aVar.f5545b = str != null ? abstractC1272n.m7076f0(str) : null;
            aVar.f5550g = AbstractC1300f.b.values()[this.f5285c[i11]];
            aVar.f5551h = AbstractC1300f.b.values()[this.f5286d[i11]];
            int[] iArr = this.f5283a;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar.f5546c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar.f5547d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar.f5548e = i18;
            int i19 = iArr[i17];
            aVar.f5549f = i19;
            c1255a.f5528d = i14;
            c1255a.f5529e = i16;
            c1255a.f5530f = i18;
            c1255a.f5531g = i19;
            c1255a.m7207e(aVar);
            i11++;
            i10 = i17 + 1;
        }
        c1255a.f5532h = this.f5287e;
        c1255a.f5535k = this.f5288f;
        c1255a.f5280v = this.f5289r;
        c1255a.f5533i = true;
        c1255a.f5536l = this.f5290s;
        c1255a.f5537m = this.f5291t;
        c1255a.f5538n = this.f5292u;
        c1255a.f5539o = this.f5293v;
        c1255a.f5540p = this.f5294w;
        c1255a.f5541q = this.f5295x;
        c1255a.f5542r = this.f5296y;
        c1255a.m6846m(1);
        return c1255a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f5283a);
        parcel.writeStringList(this.f5284b);
        parcel.writeIntArray(this.f5285c);
        parcel.writeIntArray(this.f5286d);
        parcel.writeInt(this.f5287e);
        parcel.writeString(this.f5288f);
        parcel.writeInt(this.f5289r);
        parcel.writeInt(this.f5290s);
        TextUtils.writeToParcel(this.f5291t, parcel, 0);
        parcel.writeInt(this.f5292u);
        TextUtils.writeToParcel(this.f5293v, parcel, 0);
        parcel.writeStringList(this.f5294w);
        parcel.writeStringList(this.f5295x);
        parcel.writeInt(this.f5296y ? 1 : 0);
    }
}
