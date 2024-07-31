package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;

/* renamed from: com.it_nomads.fluttersecurestorage.ciphers.l */
/* loaded from: classes.dex */
enum EnumC6646l {
    AES_CBC_PKCS7Padding(new InterfaceC6648n() { // from class: com.it_nomads.fluttersecurestorage.ciphers.j
        @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6648n
        /* renamed from: a */
        public final InterfaceC6643i mo19379a(Context context, InterfaceC6635a interfaceC6635a) {
            return new C6642h(context, interfaceC6635a);
        }
    }, 1),
    AES_GCM_NoPadding(new InterfaceC6648n() { // from class: com.it_nomads.fluttersecurestorage.ciphers.k
        @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6648n
        /* renamed from: a */
        public final InterfaceC6643i mo19379a(Context context, InterfaceC6635a interfaceC6635a) {
            return new C6649o(context, interfaceC6635a);
        }
    }, 23);

    final int minVersionCode;
    final InterfaceC6648n storageCipher;

    EnumC6646l(InterfaceC6648n interfaceC6648n, int i10) {
        this.storageCipher = interfaceC6648n;
        this.minVersionCode = i10;
    }
}
