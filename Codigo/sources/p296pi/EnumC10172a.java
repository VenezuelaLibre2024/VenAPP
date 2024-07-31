package p296pi;

import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.C9315g;
import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pi.a */
/* loaded from: classes3.dex */
public final class EnumC10172a {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC10172a[] $VALUES;
    public static final a Companion;
    private final int intValue;
    public static final EnumC10172a UNKNOWN = new EnumC10172a("UNKNOWN", 0, -1);
    public static final EnumC10172a ALL_FORMATS = new EnumC10172a("ALL_FORMATS", 1, 0);
    public static final EnumC10172a CODE_128 = new EnumC10172a("CODE_128", 2, 1);
    public static final EnumC10172a CODE_39 = new EnumC10172a("CODE_39", 3, 2);
    public static final EnumC10172a CODE_93 = new EnumC10172a("CODE_93", 4, 4);
    public static final EnumC10172a CODABAR = new EnumC10172a("CODABAR", 5, 8);
    public static final EnumC10172a DATA_MATRIX = new EnumC10172a("DATA_MATRIX", 6, 16);
    public static final EnumC10172a EAN_13 = new EnumC10172a("EAN_13", 7, 32);
    public static final EnumC10172a EAN_8 = new EnumC10172a("EAN_8", 8, 64);
    public static final EnumC10172a ITF = new EnumC10172a("ITF", 9, RecognitionOptions.ITF);
    public static final EnumC10172a QR_CODE = new EnumC10172a("QR_CODE", 10, RecognitionOptions.QR_CODE);
    public static final EnumC10172a UPC_A = new EnumC10172a("UPC_A", 11, RecognitionOptions.UPC_A);
    public static final EnumC10172a UPC_E = new EnumC10172a("UPC_E", 12, RecognitionOptions.UPC_E);
    public static final EnumC10172a PDF417 = new EnumC10172a("PDF417", 13, RecognitionOptions.PDF417);
    public static final EnumC10172a AZTEC = new EnumC10172a("AZTEC", 14, RecognitionOptions.AZTEC);

    /* renamed from: pi.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC10172a m30448a(int i10) {
            if (i10 != -1) {
                if (i10 == 0) {
                    return EnumC10172a.ALL_FORMATS;
                }
                if (i10 == 1) {
                    return EnumC10172a.CODE_128;
                }
                if (i10 == 2) {
                    return EnumC10172a.CODE_39;
                }
                switch (i10) {
                    case 4:
                        return EnumC10172a.CODE_93;
                    case 8:
                        return EnumC10172a.CODABAR;
                    case 16:
                        return EnumC10172a.DATA_MATRIX;
                    case 32:
                        return EnumC10172a.EAN_13;
                    case 64:
                        return EnumC10172a.EAN_8;
                    case RecognitionOptions.ITF /* 128 */:
                        return EnumC10172a.ITF;
                    case RecognitionOptions.QR_CODE /* 256 */:
                        return EnumC10172a.QR_CODE;
                    case RecognitionOptions.UPC_A /* 512 */:
                        return EnumC10172a.UPC_A;
                    case RecognitionOptions.UPC_E /* 1024 */:
                        return EnumC10172a.UPC_E;
                    case RecognitionOptions.PDF417 /* 2048 */:
                        return EnumC10172a.PDF417;
                    case RecognitionOptions.AZTEC /* 4096 */:
                        return EnumC10172a.AZTEC;
                }
            }
            return EnumC10172a.UNKNOWN;
        }
    }

    static {
        EnumC10172a[] m30446b = m30446b();
        $VALUES = m30446b;
        $ENTRIES = C8005b.m24582a(m30446b);
        Companion = new a(null);
    }

    private EnumC10172a(String str, int i10, int i11) {
        this.intValue = i11;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC10172a[] m30446b() {
        return new EnumC10172a[]{UNKNOWN, ALL_FORMATS, CODE_128, CODE_39, CODE_93, CODABAR, DATA_MATRIX, EAN_13, EAN_8, ITF, QR_CODE, UPC_A, UPC_E, PDF417, AZTEC};
    }

    public static EnumC10172a valueOf(String str) {
        return (EnumC10172a) Enum.valueOf(EnumC10172a.class, str);
    }

    public static EnumC10172a[] values() {
        return (EnumC10172a[]) $VALUES.clone();
    }

    /* renamed from: h */
    public final int m30447h() {
        return this.intValue;
    }
}
