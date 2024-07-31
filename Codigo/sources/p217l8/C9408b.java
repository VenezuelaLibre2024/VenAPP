package p217l8;

import android.text.TextUtils;
import p082eb.C7147c;
import p363t8.C11137a;

/* renamed from: l8.b */
/* loaded from: classes.dex */
final class C9408b {

    /* renamed from: a */
    public final int f22824a;

    /* renamed from: b */
    public final int f22825b;

    /* renamed from: c */
    public final int f22826c;

    /* renamed from: d */
    public final int f22827d;

    /* renamed from: e */
    public final int f22828e;

    private C9408b(int i10, int i11, int i12, int i13, int i14) {
        this.f22824a = i10;
        this.f22825b = i11;
        this.f22826c = i12;
        this.f22827d = i13;
        this.f22828e = i14;
    }

    /* renamed from: a */
    public static C9408b m28028a(String str) {
        char c10;
        C11137a.m34599a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String m21253e = C7147c.m21253e(split[i14].trim());
            m21253e.hashCode();
            switch (m21253e.hashCode()) {
                case 100571:
                    if (m21253e.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (m21253e.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (m21253e.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (m21253e.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new C9408b(i10, i11, i12, i13, split.length);
    }
}
