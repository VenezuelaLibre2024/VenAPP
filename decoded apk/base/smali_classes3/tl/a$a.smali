.class public final Ltl/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltl/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Ltl/a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ltl/a$a;Lql/t;Lql/t;)Lql/t;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltl/a$a;->c(Lql/t;Lql/t;)Lql/t;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ltl/a$a;Lql/c0;)Lql/c0;
    .locals 0

    invoke-direct {p0, p1}, Ltl/a$a;->f(Lql/c0;)Lql/c0;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lql/t;Lql/t;)Lql/t;
    .locals 9

    new-instance v0, Lql/t$a;

    invoke-direct {v0}, Lql/t$a;-><init>()V

    invoke-virtual {p1}, Lql/t;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {p1, v3}, Lql/t;->d(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v3}, Lql/t;->l(I)Ljava/lang/String;

    move-result-object v3

    const-string v6, "Warning"

    const/4 v7, 0x1

    invoke-static {v6, v5, v7}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v8, "1"

    invoke-static {v3, v8, v2, v6, v7}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0, v5}, Ltl/a$a;->d(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-direct {p0, v5}, Ltl/a$a;->e(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p2, v5}, Lql/t;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    :cond_1
    invoke-virtual {v0, v5, v3}, Lql/t$a;->c(Ljava/lang/String;Ljava/lang/String;)Lql/t$a;

    :cond_2
    :goto_1
    move v3, v4

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lql/t;->size()I

    move-result p1

    :goto_2
    if-ge v2, p1, :cond_5

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {p2, v2}, Lql/t;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Ltl/a$a;->d(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-direct {p0, v3}, Ltl/a$a;->e(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p2, v2}, Lql/t;->l(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lql/t$a;->c(Ljava/lang/String;Ljava/lang/String;)Lql/t$a;

    :cond_4
    move v2, v1

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lql/t$a;->e()Lql/t;

    move-result-object p1

    return-object p1
.end method

.method private final d(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "Content-Length"

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Encoding"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Type"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private final e(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "Connection"

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-static {v0, p1, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private final f(Lql/c0;)Lql/c0;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lql/c0;->B()Lql/c0$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lql/c0$a;->b(Lql/d0;)Lql/c0$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/c0$a;->c()Lql/c0;

    move-result-object p1

    :cond_1
    return-object p1
.end method
