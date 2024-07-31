.class public Lq3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq3/b0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/j<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lq3/q;

.field private final b:Lk3/b;


# direct methods
.method public constructor <init>(Lq3/q;Lk3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/b0;->a:Lq3/q;

    iput-object p2, p0, Lq3/b0;->b:Lk3/b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh3/h;)Z
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lq3/b0;->d(Ljava/io/InputStream;Lh3/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh3/h;)Lj3/v;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Lq3/b0;->c(Ljava/io/InputStream;IILh3/h;)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/InputStream;IILh3/h;)Lj3/v;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Lq3/z;

    if-eqz v0, :cond_0

    check-cast p1, Lq3/z;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lq3/z;

    iget-object v1, p0, Lq3/b0;->b:Lk3/b;

    invoke-direct {v0, p1, v1}, Lq3/z;-><init>(Ljava/io/InputStream;Lk3/b;)V

    const/4 p1, 0x1

    move-object v8, v0

    move v0, p1

    move-object p1, v8

    :goto_0
    invoke-static {p1}, Lc4/d;->b(Ljava/io/InputStream;)Lc4/d;

    move-result-object v1

    new-instance v3, Lc4/i;

    invoke-direct {v3, v1}, Lc4/i;-><init>(Ljava/io/InputStream;)V

    new-instance v7, Lq3/b0$a;

    invoke-direct {v7, p1, v1}, Lq3/b0$a;-><init>(Lq3/z;Lc4/d;)V

    :try_start_0
    iget-object v2, p0, Lq3/b0;->a:Lq3/q;

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lq3/q;->e(Ljava/io/InputStream;IILh3/h;Lq3/q$b;)Lj3/v;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lc4/d;->e()V

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lq3/z;->e()V

    :cond_1
    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {v1}, Lc4/d;->e()V

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lq3/z;->e()V

    :cond_2
    throw p2
.end method

.method public d(Ljava/io/InputStream;Lh3/h;)Z
    .locals 0

    iget-object p2, p0, Lq3/b0;->a:Lq3/q;

    invoke-virtual {p2, p1}, Lq3/q;->p(Ljava/io/InputStream;)Z

    move-result p1

    return p1
.end method
