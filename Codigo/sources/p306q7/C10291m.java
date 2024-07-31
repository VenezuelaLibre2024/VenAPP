package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.List;
import p361t6.C11040h2;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: q7.m */
/* loaded from: classes.dex */
public final class C10291m extends AbstractC10287i {
    public static final Parcelable.Creator<C10291m> CREATOR = new a();

    /* renamed from: b */
    public final String f25562b;

    /* renamed from: c */
    @Deprecated
    public final String f25563c;

    /* renamed from: d */
    public final AbstractC5907w<String> f25564d;

    /* renamed from: q7.m$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10291m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10291m createFromParcel(Parcel parcel) {
            return new C10291m(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10291m[] newArray(int i10) {
            return new C10291m[i10];
        }
    }

    private C10291m(Parcel parcel) {
        this((String) C11137a.m34603e(parcel.readString()), parcel.readString(), AbstractC5907w.m15080s((String[]) C11137a.m34603e(parcel.createStringArray())));
    }

    /* synthetic */ C10291m(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C10291m(String str, String str2, List<String> list) {
        super(str);
        C11137a.m34599a(!list.isEmpty());
        this.f25562b = str2;
        AbstractC5907w<String> m15079r = AbstractC5907w.m15079r(list);
        this.f25564d = m15079r;
        this.f25563c = m15079r.get(0);
    }

    /* renamed from: a */
    private static List<Integer> m30842a(String str) {
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

    @Override // p216l7.C9400a.b
    /* renamed from: O */
    public void mo28003O(C11040h2.b bVar) {
        String str = this.f25551a;
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
                    bVar.m34101N(this.f25564d.get(0));
                    return;
                case 1:
                case 11:
                    bVar.m34106S(this.f25564d.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = this.f25564d.get(0);
                    bVar.m34119f0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).m34118e0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.m34102O(this.f25564d.get(0));
                    return;
                case 4:
                case 18:
                    bVar.m34100M(this.f25564d.get(0));
                    return;
                case 5:
                case 19:
                    bVar.m34107T(this.f25564d.get(0));
                    return;
                case 6:
                case 20:
                    String[] m34891R0 = C11172r0.m34891R0(this.f25564d.get(0), "/");
                    bVar.m34129p0(Integer.valueOf(Integer.parseInt(m34891R0[0]))).m34128o0(m34891R0.length > 1 ? Integer.valueOf(Integer.parseInt(m34891R0[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.m34126m0(this.f25564d.get(0));
                    return;
                case '\b':
                case 15:
                    bVar.m34131r0(this.f25564d.get(0));
                    return;
                case '\t':
                case 21:
                    bVar.m34120g0(Integer.valueOf(Integer.parseInt(this.f25564d.get(0))));
                    return;
                case '\r':
                    List<Integer> m30842a = m30842a(this.f25564d.get(0));
                    int size = m30842a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                bVar.m34118e0(m30842a.get(2));
                            }
                        }
                        bVar.m34119f0(m30842a.get(1));
                    }
                    bVar.m34120g0(m30842a.get(0));
                    return;
                case 14:
                    List<Integer> m30842a2 = m30842a(this.f25564d.get(0));
                    int size2 = m30842a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                bVar.m34121h0(m30842a2.get(2));
                            }
                        }
                        bVar.m34122i0(m30842a2.get(1));
                    }
                    bVar.m34123j0(m30842a2.get(0));
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
        if (obj == null || C10291m.class != obj.getClass()) {
            return false;
        }
        C10291m c10291m = (C10291m) obj;
        return C11172r0.m34914c(this.f25551a, c10291m.f25551a) && C11172r0.m34914c(this.f25562b, c10291m.f25562b) && this.f25564d.equals(c10291m.f25564d);
    }

    public int hashCode() {
        int hashCode = (527 + this.f25551a.hashCode()) * 31;
        String str = this.f25562b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f25564d.hashCode();
    }

    @Override // p306q7.AbstractC10287i
    public String toString() {
        return this.f25551a + ": description=" + this.f25562b + ": values=" + this.f25564d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25551a);
        parcel.writeString(this.f25562b);
        parcel.writeStringArray((String[]) this.f25564d.toArray(new String[0]));
    }
}
