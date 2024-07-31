package p350s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p363t8.C11146e0;

/* renamed from: s7.f */
/* loaded from: classes.dex */
public final class C10807f extends AbstractC10803b {
    public static final Parcelable.Creator<C10807f> CREATOR = new a();

    /* renamed from: a */
    public final List<c> f27288a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s7.f$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C10807f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10807f createFromParcel(Parcel parcel) {
            return new C10807f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10807f[] newArray(int i10) {
            return new C10807f[i10];
        }
    }

    /* renamed from: s7.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f27289a;

        /* renamed from: b */
        public final long f27290b;

        private b(int i10, long j10) {
            this.f27289a = i10;
            this.f27290b = j10;
        }

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static b m32929c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m32930d(Parcel parcel) {
            parcel.writeInt(this.f27289a);
            parcel.writeLong(this.f27290b);
        }
    }

    /* renamed from: s7.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final long f27291a;

        /* renamed from: b */
        public final boolean f27292b;

        /* renamed from: c */
        public final boolean f27293c;

        /* renamed from: d */
        public final boolean f27294d;

        /* renamed from: e */
        public final long f27295e;

        /* renamed from: f */
        public final List<b> f27296f;

        /* renamed from: g */
        public final boolean f27297g;

        /* renamed from: h */
        public final long f27298h;

        /* renamed from: i */
        public final int f27299i;

        /* renamed from: j */
        public final int f27300j;

        /* renamed from: k */
        public final int f27301k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f27291a = j10;
            this.f27292b = z10;
            this.f27293c = z11;
            this.f27294d = z12;
            this.f27296f = Collections.unmodifiableList(list);
            this.f27295e = j11;
            this.f27297g = z13;
            this.f27298h = j12;
            this.f27299i = i10;
            this.f27300j = i11;
            this.f27301k = i12;
        }

        private c(Parcel parcel) {
            this.f27291a = parcel.readLong();
            this.f27292b = parcel.readByte() == 1;
            this.f27293c = parcel.readByte() == 1;
            this.f27294d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.m32929c(parcel));
            }
            this.f27296f = Collections.unmodifiableList(arrayList);
            this.f27295e = parcel.readLong();
            this.f27297g = parcel.readByte() == 1;
            this.f27298h = parcel.readLong();
            this.f27299i = parcel.readInt();
            this.f27300j = parcel.readInt();
            this.f27301k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static c m32934d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static c m32935e(C11146e0 c11146e0) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j12;
            long m34666J = c11146e0.m34666J();
            boolean z14 = (c11146e0.m34664H() & RecognitionOptions.ITF) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int m34664H = c11146e0.m34664H();
                boolean z15 = (m34664H & RecognitionOptions.ITF) != 0;
                boolean z16 = (m34664H & 64) != 0;
                boolean z17 = (m34664H & 32) != 0;
                long m34666J2 = z16 ? c11146e0.m34666J() : -9223372036854775807L;
                if (!z16) {
                    int m34664H2 = c11146e0.m34664H();
                    ArrayList arrayList3 = new ArrayList(m34664H2);
                    for (int i13 = 0; i13 < m34664H2; i13++) {
                        arrayList3.add(new b(c11146e0.m34664H(), c11146e0.m34666J(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long m34664H3 = c11146e0.m34664H();
                    boolean z18 = (128 & m34664H3) != 0;
                    j12 = ((((m34664H3 & 1) << 32) | c11146e0.m34666J()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int m34670N = c11146e0.m34670N();
                int m34664H4 = c11146e0.m34664H();
                z12 = z16;
                i12 = c11146e0.m34664H();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = m34666J2;
                i10 = m34670N;
                i11 = m34664H4;
                j10 = j13;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(m34666J, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m32936f(Parcel parcel) {
            parcel.writeLong(this.f27291a);
            parcel.writeByte(this.f27292b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f27293c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f27294d ? (byte) 1 : (byte) 0);
            int size = this.f27296f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f27296f.get(i10).m32930d(parcel);
            }
            parcel.writeLong(this.f27295e);
            parcel.writeByte(this.f27297g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f27298h);
            parcel.writeInt(this.f27299i);
            parcel.writeInt(this.f27300j);
            parcel.writeInt(this.f27301k);
        }
    }

    private C10807f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.m32934d(parcel));
        }
        this.f27288a = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ C10807f(Parcel parcel, a aVar) {
        this(parcel);
    }

    private C10807f(List<c> list) {
        this.f27288a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10807f m32924a(C11146e0 c11146e0) {
        int m34664H = c11146e0.m34664H();
        ArrayList arrayList = new ArrayList(m34664H);
        for (int i10 = 0; i10 < m34664H; i10++) {
            arrayList.add(c.m32935e(c11146e0));
        }
        return new C10807f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f27288a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f27288a.get(i11).m32936f(parcel);
        }
    }
}
