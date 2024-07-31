package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.o;
import eb.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l7.a;
import r7.c;
import t8.r0;

/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f24754a;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public final long f24756a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24757b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24758c;

        /* renamed from: d, reason: collision with root package name */
        public static final Comparator<b> f24755d = new Comparator() { // from class: r7.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b10;
                b10 = c.b.b((c.b) obj, (c.b) obj2);
                return b10;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            t8.a.a(j10 < j11);
            this.f24756a = j10;
            this.f24757b = j11;
            this.f24758c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(b bVar, b bVar2) {
            return o.j().e(bVar.f24756a, bVar2.f24756a).e(bVar.f24757b, bVar2.f24757b).d(bVar.f24758c, bVar2.f24758c).i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f24756a == bVar.f24756a && this.f24757b == bVar.f24757b && this.f24758c == bVar.f24758c;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f24756a), Long.valueOf(this.f24757b), Integer.valueOf(this.f24758c));
        }

        public String toString() {
            return r0.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f24756a), Long.valueOf(this.f24757b), Integer.valueOf(this.f24758c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f24756a);
            parcel.writeLong(this.f24757b);
            parcel.writeInt(this.f24758c);
        }
    }

    public c(List<b> list) {
        this.f24754a = list;
        t8.a.a(!a(list));
    }

    private static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f24757b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f24756a < j10) {
                return true;
            }
            j10 = list.get(i10).f24757b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f24754a.equals(((c) obj).f24754a);
    }

    public int hashCode() {
        return this.f24754a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f24754a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f24754a);
    }
}
