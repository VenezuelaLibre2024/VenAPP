package s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t8.e0;
import t8.n0;

/* loaded from: classes.dex */
public final class d extends s7.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f25153a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25154b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25155c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25156d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25157e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25158f;

    /* renamed from: r, reason: collision with root package name */
    public final long f25159r;

    /* renamed from: s, reason: collision with root package name */
    public final List<b> f25160s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f25161t;

    /* renamed from: u, reason: collision with root package name */
    public final long f25162u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25163v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25164w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25165x;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f25166a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25167b;

        /* renamed from: c, reason: collision with root package name */
        public final long f25168c;

        private b(int i10, long j10, long j11) {
            this.f25166a = i10;
            this.f25167b = j10;
            this.f25168c = j11;
        }

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f25166a);
            parcel.writeLong(this.f25167b);
            parcel.writeLong(this.f25168c);
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f25153a = j10;
        this.f25154b = z10;
        this.f25155c = z11;
        this.f25156d = z12;
        this.f25157e = z13;
        this.f25158f = j11;
        this.f25159r = j12;
        this.f25160s = Collections.unmodifiableList(list);
        this.f25161t = z14;
        this.f25162u = j13;
        this.f25163v = i10;
        this.f25164w = i11;
        this.f25165x = i12;
    }

    private d(Parcel parcel) {
        this.f25153a = parcel.readLong();
        this.f25154b = parcel.readByte() == 1;
        this.f25155c = parcel.readByte() == 1;
        this.f25156d = parcel.readByte() == 1;
        this.f25157e = parcel.readByte() == 1;
        this.f25158f = parcel.readLong();
        this.f25159r = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f25160s = Collections.unmodifiableList(arrayList);
        this.f25161t = parcel.readByte() == 1;
        this.f25162u = parcel.readLong();
        this.f25163v = parcel.readInt();
        this.f25164w = parcel.readInt();
        this.f25165x = parcel.readInt();
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(e0 e0Var, long j10, n0 n0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        long j13;
        long J = e0Var.J();
        boolean z15 = (e0Var.H() & RecognitionOptions.ITF) != 0;
        List emptyList = Collections.emptyList();
        if (z15) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int H = e0Var.H();
            boolean z16 = (H & RecognitionOptions.ITF) != 0;
            boolean z17 = (H & 64) != 0;
            boolean z18 = (H & 32) != 0;
            boolean z19 = (H & 16) != 0;
            long b10 = (!z17 || z19) ? -9223372036854775807L : g.b(e0Var, j10);
            if (!z17) {
                int H2 = e0Var.H();
                ArrayList arrayList = new ArrayList(H2);
                for (int i13 = 0; i13 < H2; i13++) {
                    int H3 = e0Var.H();
                    long b11 = !z19 ? g.b(e0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(H3, b11, n0Var.b(b11), null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long H4 = e0Var.H();
                boolean z20 = (128 & H4) != 0;
                j13 = ((((H4 & 1) << 32) | e0Var.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i10 = e0Var.N();
            z13 = z17;
            i11 = e0Var.H();
            i12 = e0Var.H();
            list = emptyList;
            long j14 = b10;
            z12 = z14;
            j12 = j13;
            z11 = z19;
            z10 = z16;
            j11 = j14;
        }
        return new d(J, z15, z10, z13, z11, j11, n0Var.b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f25153a);
        parcel.writeByte(this.f25154b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25155c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25156d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25157e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f25158f);
        parcel.writeLong(this.f25159r);
        int size = this.f25160s.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f25160s.get(i11).b(parcel);
        }
        parcel.writeByte(this.f25161t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f25162u);
        parcel.writeInt(this.f25163v);
        parcel.writeInt(this.f25164w);
        parcel.writeInt(this.f25165x);
    }
}
