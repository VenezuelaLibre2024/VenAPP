package q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.List;
import t6.h2;
import t8.r0;

/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b */
    public final String f23594b;

    /* renamed from: c */
    @Deprecated
    public final String f23595c;

    /* renamed from: d */
    public final w<String> f23596d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Parcel parcel) {
        this((String) t8.a.e(parcel.readString()), parcel.readString(), w.s((String[]) t8.a.e(parcel.createStringArray())));
    }

    /* synthetic */ m(Parcel parcel, a aVar) {
        this(parcel);
    }

    public m(String str, String str2, List<String> list) {
        super(str);
        t8.a.a(!list.isEmpty());
        this.f23594b = str2;
        w<String> r10 = w.r(list);
        this.f23596d = r10;
        this.f23595c = r10.get(0);
    }

    private static List<Integer> a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        parseInt = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // l7.a.b
    public void O(h2.b bVar) {
        String str = this.f23583a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.N(this.f23596d.get(0));
                    return;
                case 1:
                case 11:
                    bVar.S(this.f23596d.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = this.f23596d.get(0);
                    bVar.f0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).e0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.O(this.f23596d.get(0));
                    return;
                case 4:
                case 18:
                    bVar.M(this.f23596d.get(0));
                    return;
                case 5:
                case 19:
                    bVar.T(this.f23596d.get(0));
                    return;
                case 6:
                case 20:
                    String[] R0 = r0.R0(this.f23596d.get(0), "/");
                    bVar.p0(Integer.valueOf(Integer.parseInt(R0[0]))).o0(R0.length > 1 ? Integer.valueOf(Integer.parseInt(R0[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.m0(this.f23596d.get(0));
                    return;
                case '\b':
                case 15:
                    bVar.r0(this.f23596d.get(0));
                    return;
                case '\t':
                case 21:
                    bVar.g0(Integer.valueOf(Integer.parseInt(this.f23596d.get(0))));
                    return;
                case '\r':
                    List<Integer> a10 = a(this.f23596d.get(0));
                    int size = a10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                bVar.e0(a10.get(2));
                            }
                        }
                        bVar.f0(a10.get(1));
                    }
                    bVar.g0(a10.get(0));
                    return;
                case 14:
                    List<Integer> a11 = a(this.f23596d.get(0));
                    int size2 = a11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                bVar.h0(a11.get(2));
                            }
                        }
                        bVar.i0(a11.get(1));
                    }
                    bVar.j0(a11.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return r0.c(this.f23583a, mVar.f23583a) && r0.c(this.f23594b, mVar.f23594b) && this.f23596d.equals(mVar.f23596d);
    }

    public int hashCode() {
        int hashCode = (527 + this.f23583a.hashCode()) * 31;
        String str = this.f23594b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f23596d.hashCode();
    }

    @Override // q7.i
    public String toString() {
        return this.f23583a + ": description=" + this.f23594b + ": values=" + this.f23596d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23583a);
        parcel.writeString(this.f23594b);
        parcel.writeStringArray((String[]) this.f23596d.toArray(new String[0]));
    }
}
