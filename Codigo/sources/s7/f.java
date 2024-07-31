package s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t8.e0;

/* loaded from: classes.dex */
public final class f extends s7.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f25169a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f25170a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25171b;

        private b(int i10, long j10) {
            this.f25170a = i10;
            this.f25171b = j10;
        }

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f25170a);
            parcel.writeLong(this.f25171b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f25172a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f25173b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f25174c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f25175d;

        /* renamed from: e, reason: collision with root package name */
        public final long f25176e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f25177f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f25178g;

        /* renamed from: h, reason: collision with root package name */
        public final long f25179h;

        /* renamed from: i, reason: collision with root package name */
        public final int f25180i;

        /* renamed from: j, reason: collision with root package name */
        public final int f25181j;

        /* renamed from: k, reason: collision with root package name */
        public final int f25182k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f25172a = j10;
            this.f25173b = z10;
            this.f25174c = z11;
            this.f25175d = z12;
            this.f25177f = Collections.unmodifiableList(list);
            this.f25176e = j11;
            this.f25178g = z13;
            this.f25179h = j12;
            this.f25180i = i10;
            this.f25181j = i11;
            this.f25182k = i12;
        }

        private c(Parcel parcel) {
            this.f25172a = parcel.readLong();
            this.f25173b = parcel.readByte() == 1;
            this.f25174c = parcel.readByte() == 1;
            this.f25175d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f25177f = Collections.unmodifiableList(arrayList);
            this.f25176e = parcel.readLong();
            this.f25178g = parcel.readByte() == 1;
            this.f25179h = parcel.readLong();
            this.f25180i = parcel.readInt();
            this.f25181j = parcel.readInt();
            this.f25182k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(e0 e0Var) {
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
            long J = e0Var.J();
            boolean z14 = (e0Var.H() & RecognitionOptions.ITF) != 0;
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
                int H = e0Var.H();
                boolean z15 = (H & RecognitionOptions.ITF) != 0;
                boolean z16 = (H & 64) != 0;
                boolean z17 = (H & 32) != 0;
                long J2 = z16 ? e0Var.J() : -9223372036854775807L;
                if (!z16) {
                    int H2 = e0Var.H();
                    ArrayList arrayList3 = new ArrayList(H2);
                    for (int i13 = 0; i13 < H2; i13++) {
                        arrayList3.add(new b(e0Var.H(), e0Var.J(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long H3 = e0Var.H();
                    boolean z18 = (128 & H3) != 0;
                    j12 = ((((H3 & 1) << 32) | e0Var.J()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int N = e0Var.N();
                int H4 = e0Var.H();
                z12 = z16;
                i12 = e0Var.H();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = J2;
                i10 = N;
                i11 = H4;
                j10 = j13;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(J, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f25172a);
            parcel.writeByte(this.f25173b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f25174c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f25175d ? (byte) 1 : (byte) 0);
            int size = this.f25177f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f25177f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f25176e);
            parcel.writeByte(this.f25178g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f25179h);
            parcel.writeInt(this.f25180i);
            parcel.writeInt(this.f25181j);
            parcel.writeInt(this.f25182k);
        }
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f25169a = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    private f(List<c> list) {
        this.f25169a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(e0 e0Var) {
        int H = e0Var.H();
        ArrayList arrayList = new ArrayList(H);
        for (int i10 = 0; i10 < H; i10++) {
            arrayList.add(c.e(e0Var));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f25169a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f25169a.get(i11).f(parcel);
        }
    }
}
