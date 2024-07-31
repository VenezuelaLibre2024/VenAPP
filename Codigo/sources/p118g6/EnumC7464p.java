package p118g6;

import android.util.SparseArray;

/* renamed from: g6.p */
/* loaded from: classes.dex */
public enum EnumC7464p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<EnumC7464p> valueMap;
    private final int value;

    static {
        EnumC7464p enumC7464p = DEFAULT;
        EnumC7464p enumC7464p2 = UNMETERED_ONLY;
        EnumC7464p enumC7464p3 = UNMETERED_OR_DAILY;
        EnumC7464p enumC7464p4 = FAST_IF_RADIO_AWAKE;
        EnumC7464p enumC7464p5 = NEVER;
        EnumC7464p enumC7464p6 = UNRECOGNIZED;
        SparseArray<EnumC7464p> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, enumC7464p);
        sparseArray.put(1, enumC7464p2);
        sparseArray.put(2, enumC7464p3);
        sparseArray.put(3, enumC7464p4);
        sparseArray.put(4, enumC7464p5);
        sparseArray.put(-1, enumC7464p6);
    }

    EnumC7464p(int i10) {
        this.value = i10;
    }
}
