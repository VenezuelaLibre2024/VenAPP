.class public Le2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/webkit/WebResourceRequest;)Landroidx/webkit/internal/h1;
    .locals 1

    invoke-static {}, Landroidx/webkit/internal/k1;->c()Landroidx/webkit/internal/r1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/webkit/internal/r1;->k(Landroid/webkit/WebResourceRequest;)Landroidx/webkit/internal/h1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->u:Landroidx/webkit/internal/a$c;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/webkit/internal/d;->j(Landroid/webkit/WebResourceRequest;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Le2/p;->a(Landroid/webkit/WebResourceRequest;)Landroidx/webkit/internal/h1;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/webkit/internal/h1;->a()Z

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method
