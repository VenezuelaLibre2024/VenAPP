package p328r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.AbstractC5891o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p082eb.C7155k;
import p216l7.C9400a;
import p328r7.C10633c;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: r7.c */
/* loaded from: classes.dex */
public final class C10633c implements C9400a.b {
    public static final Parcelable.Creator<C10633c> CREATOR = new a();

    /* renamed from: a */
    public final List<b> f26868a;

    /* renamed from: r7.c$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10633c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10633c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new C10633c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10633c[] newArray(int i10) {
            return new C10633c[i10];
        }
    }

    /* renamed from: r7.c$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {

        /* renamed from: a */
        public final long f26870a;

        /* renamed from: b */
        public final long f26871b;

        /* renamed from: c */
        public final int f26872c;

        /* renamed from: d */
        public static final Comparator<b> f26869d = new Comparator() { // from class: r7.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m32404b;
                m32404b = C10633c.b.m32404b((C10633c.b) obj, (C10633c.b) obj2);
                return m32404b;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: r7.c$b$a */
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
            C11137a.m34599a(j10 < j11);
            this.f26870a = j10;
            this.f26871b = j11;
            this.f26872c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ int m32404b(b bVar, b bVar2) {
            return AbstractC5891o.m15018j().mo15020e(bVar.f26870a, bVar2.f26870a).mo15020e(bVar.f26871b, bVar2.f26871b).mo15019d(bVar.f26872c, bVar2.f26872c).mo15024i();
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
            return this.f26870a == bVar.f26870a && this.f26871b == bVar.f26871b && this.f26872c == bVar.f26872c;
        }

        public int hashCode() {
            return C7155k.m21290b(Long.valueOf(this.f26870a), Long.valueOf(this.f26871b), Integer.valueOf(this.f26872c));
        }

        public String toString() {
            return C11172r0.m34860C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f26870a), Long.valueOf(this.f26871b), Integer.valueOf(this.f26872c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f26870a);
            parcel.writeLong(this.f26871b);
            parcel.writeInt(this.f26872c);
        }
    }

    public C10633c(List<b> list) {
        this.f26868a = list;
        C11137a.m34599a(!m32400a(list));
    }

    /* renamed from: a */
    private static boolean m32400a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f26871b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f26870a < j10) {
                return true;
            }
            j10 = list.get(i10).f26871b;
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
        if (obj == null || C10633c.class != obj.getClass()) {
            return false;
        }
        return this.f26868a.equals(((C10633c) obj).f26868a);
    }

    public int hashCode() {
        return this.f26868a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f26868a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f26868a);
    }
}
