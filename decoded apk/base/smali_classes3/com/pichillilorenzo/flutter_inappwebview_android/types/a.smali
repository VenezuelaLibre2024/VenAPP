.class public final synthetic Lcom/pichillilorenzo/flutter_inappwebview_android/types/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/net/http/SslCertificate;)Ljava/security/cert/X509Certificate;
    .locals 0

    invoke-virtual {p0}, Landroid/net/http/SslCertificate;->getX509Certificate()Ljava/security/cert/X509Certificate;

    move-result-object p0

    return-object p0
.end method
