package p350s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p363t8.C11146e0;
import p363t8.C11164n0;

/* renamed from: s7.d */
/* loaded from: classes.dex */
public final class C10805d extends AbstractC10803b {
    public static final Parcelable.Creator<C10805d> CREATOR = new a();

    /* renamed from: a */
    public final long f27272a;

    /* renamed from: b */
    public final boolean f27273b;

    /* renamed from: c */
    public final boolean f27274c;

    /* renamed from: d */
    public final boolean f27275d;

    /* renamed from: e */
    public final boolean f27276e;

    /* renamed from: f */
    public final long f27277f;

    /* renamed from: r */
    public final long f27278r;

    /* renamed from: s */
    public final List<b> f27279s;

    /* renamed from: t */
    public final boolean f27280t;

    /* renamed from: u */
    public final long f27281u;

    /* renamed from: v */
    public final int f27282v;

    /* renamed from: w */
    public final int f27283w;

    /* renamed from: x */
    public final int f27284x;

    /* renamed from: s7.d$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10805d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10805d createFromParcel(Parcel parcel) {
            return new C10805d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10805d[] newArray(int i10) {
            return new C10805d[i10];
        }
    }

    /* renamed from: s7.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f27285a;

        /* renamed from: b */
        public final long f27286b;

        /* renamed from: c */
        public final long f27287c;

        private b(int i10, long j10, long j11) {
            this.f27285a = i10;
            this.f27286b = j10;
            this.f27287c = j11;
        }

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        /* renamed from: a */
        public static b m32920a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m32921b(Parcel parcel) {
            parcel.writeInt(this.f27285a);
            parcel.writeLong(this.f27286b);
            parcel.writeLong(this.f27287c);
        }
    }

    private C10805d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f27272a = j10;
        this.f27273b = z10;
        this.f27274c = z11;
        this.f27275d = z12;
        this.f27276e = z13;
        this.f27277f = j11;
        this.f27278r = j12;
        this.f27279s = Collections.unmodifiableList(list);
        this.f27280t = z14;
        this.f27281u = j13;
        this.f27282v = i10;
        this.f27283w = i11;
        this.f27284x = i12;
    }

    private C10805d(Parcel parcel) {
        this.f27272a = parcel.readLong();
        this.f27273b = parcel.readByte() == 1;
        this.f27274c = parcel.readByte() == 1;
        this.f27275d = parcel.readByte() == 1;
        this.f27276e = parcel.readByte() == 1;
        this.f27277f = parcel.readLong();
        this.f27278r = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.m32920a(parcel));
        }
        this.f27279s = Collections.unmodifiableList(arrayList);
        this.f27280t = parcel.readByte() == 1;
        this.f27281u = parcel.readLong();
        this.f27282v = parcel.readInt();
        this.f27283w = parcel.readInt();
        this.f27284x = parcel.readInt();
    }

    /* synthetic */ C10805d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10805d m32917a(C11146e0 c11146e0, long j10, C11164n0 c11164n0) {
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
        long m34666J = c11146e0.m34666J();
        boolean z15 = (c11146e0.m34664H() & RecognitionOptions.ITF) != 0;
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
            int m34664H = c11146e0.m34664H();
            boolean z16 = (m34664H & RecognitionOptions.ITF) != 0;
            boolean z17 = (m34664H & 64) != 0;
            boolean z18 = (m34664H & 32) != 0;
            boolean z19 = (m34664H & 16) != 0;
            long m32938b = (!z17 || z19) ? -9223372036854775807L : C10808g.m32938b(c11146e0, j10);
            if (!z17) {
                int m34664H2 = c11146e0.m34664H();
                ArrayList arrayList = new ArrayList(m34664H2);
                for (int i13 = 0; i13 < m34664H2; i13++) {
                    int m34664H3 = c11146e0.m34664H();
                    long m32938b2 = !z19 ? C10808g.m32938b(c11146e0, j10) : -9223372036854775807L;
                    arrayList.add(new b(m34664H3, m32938b2, c11164n0.m34825b(m32938b2), null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long m34664H4 = c11146e0.m34664H();
                boolean z20 = (128 & m34664H4) != 0;
                j13 = ((((m34664H4 & 1) << 32) | c11146e0.m34666J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i10 = c11146e0.m34670N();
            z13 = z17;
            i11 = c11146e0.m34664H();
            i12 = c11146e0.m34664H();
            list = emptyList;
            long j14 = m32938b;
            z12 = z14;
            j12 = j13;
            z11 = z19;
            z10 = z16;
            j11 = j14;
        }
        return new C10805d(m34666J, z15, z10, z13, z11, j11, c11164n0.m34825b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27272a);
        parcel.writeByte(this.f27273b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27274c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27275d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27276e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27277f);
        parcel.writeLong(this.f27278r);
        int size = this.f27279s.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f27279s.get(i11).m32921b(parcel);
        }
        parcel.writeByte(this.f27280t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27281u);
        parcel.writeInt(this.f27282v);
        parcel.writeInt(this.f27283w);
        parcel.writeInt(this.f27284x);
    }
}
