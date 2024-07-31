.class final synthetic Ldm/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "okio.Okio"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ldm/m;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public static final synthetic a()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Ldm/m;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static final b(Ljava/lang/AssertionError;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x2

    const/4 v2, 0x0

    const-string v3, "getsockname failed"

    invoke-static {p0, v3, v1, v0, v2}, Lxk/g;->J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v1

    :goto_0
    if-eqz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public static final c(Ljava/io/OutputStream;)Ldm/v;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/p;

    new-instance v1, Ldm/y;

    invoke-direct {v1}, Ldm/y;-><init>()V

    invoke-direct {v0, p0, v1}, Ldm/p;-><init>(Ljava/io/OutputStream;Ldm/y;)V

    return-object v0
.end method

.method public static final d(Ljava/net/Socket;)Ldm/v;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/w;

    invoke-direct {v0, p0}, Ldm/w;-><init>(Ljava/net/Socket;)V

    new-instance v1, Ldm/p;

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    const-string v2, "getOutputStream()"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, Ldm/p;-><init>(Ljava/io/OutputStream;Ldm/y;)V

    invoke-virtual {v0, v1}, Ldm/a;->x(Ldm/v;)Ldm/v;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/io/File;)Ldm/x;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/k;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object p0, Ldm/y;->e:Ldm/y;

    invoke-direct {v0, v1, p0}, Ldm/k;-><init>(Ljava/io/InputStream;Ldm/y;)V

    return-object v0
.end method

.method public static final f(Ljava/io/InputStream;)Ldm/x;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/k;

    new-instance v1, Ldm/y;

    invoke-direct {v1}, Ldm/y;-><init>()V

    invoke-direct {v0, p0, v1}, Ldm/k;-><init>(Ljava/io/InputStream;Ldm/y;)V

    return-object v0
.end method

.method public static final g(Ljava/net/Socket;)Ldm/x;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/w;

    invoke-direct {v0, p0}, Ldm/w;-><init>(Ljava/net/Socket;)V

    new-instance v1, Ldm/k;

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    const-string v2, "getInputStream()"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, Ldm/k;-><init>(Ljava/io/InputStream;Ldm/y;)V

    invoke-virtual {v0, v1}, Ldm/a;->y(Ldm/x;)Ldm/x;

    move-result-object p0

    return-object p0
.end method
