package p473yl;

import dm.InterfaceC7060d;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: yl.l */
/* loaded from: classes3.dex */
public interface InterfaceC12744l {

    /* renamed from: a */
    public static final a f34754a = a.f34756a;

    /* renamed from: b */
    public static final InterfaceC12744l f34755b = new a.C13291a();

    /* renamed from: yl.l$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f34756a = new a();

        /* renamed from: yl.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C13291a implements InterfaceC12744l {
            @Override // p473yl.InterfaceC12744l
            /* renamed from: a */
            public boolean mo42267a(int i10, InterfaceC7060d source, int i11, boolean z10) {
                C9322n.m27781e(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // p473yl.InterfaceC12744l
            /* renamed from: b */
            public void mo42268b(int i10, EnumC12734b errorCode) {
                C9322n.m27781e(errorCode, "errorCode");
            }

            @Override // p473yl.InterfaceC12744l
            /* renamed from: c */
            public boolean mo42269c(int i10, List<C12735c> requestHeaders) {
                C9322n.m27781e(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p473yl.InterfaceC12744l
            /* renamed from: d */
            public boolean mo42270d(int i10, List<C12735c> responseHeaders, boolean z10) {
                C9322n.m27781e(responseHeaders, "responseHeaders");
                return true;
            }
        }

        private a() {
        }
    }

    /* renamed from: a */
    boolean mo42267a(int i10, InterfaceC7060d interfaceC7060d, int i11, boolean z10);

    /* renamed from: b */
    void mo42268b(int i10, EnumC12734b enumC12734b);

    /* renamed from: c */
    boolean mo42269c(int i10, List<C12735c> list);

    /* renamed from: d */
    boolean mo42270d(int i10, List<C12735c> list, boolean z10);
}
