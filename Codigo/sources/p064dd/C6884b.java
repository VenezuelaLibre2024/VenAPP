package p064dd;

/* renamed from: dd.b */
/* loaded from: classes.dex */
public class C6884b implements InterfaceC6886d {

    /* renamed from: a */
    private final int f15234a;

    public C6884b(int i10) {
        this.f15234a = i10;
    }

    @Override // p064dd.InterfaceC6886d
    /* renamed from: a */
    public StackTraceElement[] mo19866a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f15234a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
