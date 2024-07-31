.class public final La6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La6/a;

    invoke-direct {v0}, La6/a;-><init>()V

    sput-object v0, La6/a;->a:La6/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/b;->b()V

    return-void
.end method

.method public final b(Landroid/content/Context;Lv5/a;IILandroid/graphics/Bitmap$CompressFormat;IJLb6/e;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->u(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/k;->k()Lcom/bumptech/glide/j;

    move-result-object p1

    new-instance v0, Ly3/i;

    invoke-direct {v0}, Ly3/i;-><init>()V

    invoke-virtual {v0, p7, p8}, Ly3/a;->h(J)Ly3/a;

    move-result-object p7

    check-cast p7, Ly3/i;

    sget-object p8, Lcom/bumptech/glide/g;->IMMEDIATE:Lcom/bumptech/glide/g;

    invoke-virtual {p7, p8}, Ly3/a;->P(Lcom/bumptech/glide/g;)Ly3/a;

    move-result-object p7

    invoke-virtual {p1, p7}, Lcom/bumptech/glide/j;->g0(Ly3/a;)Lcom/bumptech/glide/j;

    move-result-object p1

    invoke-virtual {p2}, Lv5/a;->n()Landroid/net/Uri;

    move-result-object p7

    invoke-virtual {p1, p7}, Lcom/bumptech/glide/j;->s0(Landroid/net/Uri;)Lcom/bumptech/glide/j;

    move-result-object p1

    new-instance p7, Lb4/d;

    invoke-virtual {p2}, Lv5/a;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p7, p2}, Lb4/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p7}, Ly3/a;->V(Lh3/f;)Ly3/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    invoke-virtual {p1, p3, p4}, Lcom/bumptech/glide/j;->y0(II)Ly3/d;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {p1, p5, p6, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    invoke-virtual {p9, p1}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p3, "Thumbnail request error"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 p5, 0x0

    const/4 p6, 0x4

    const/4 p7, 0x0

    move-object p2, p9

    invoke-static/range {p2 .. p7}, Lb6/e;->j(Lb6/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final c(Landroid/content/Context;Ljava/lang/String;Lv5/d;)Ly3/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lv5/d;",
            ")",
            "Ly3/d<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "thumbLoadOption"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/bumptech/glide/b;->u(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/k;->k()Lcom/bumptech/glide/j;

    move-result-object p1

    new-instance v0, Ly3/i;

    invoke-direct {v0}, Ly3/i;-><init>()V

    invoke-virtual {p3}, Lv5/d;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly3/a;->h(J)Ly3/a;

    move-result-object v0

    check-cast v0, Ly3/i;

    sget-object v1, Lcom/bumptech/glide/g;->LOW:Lcom/bumptech/glide/g;

    invoke-virtual {v0, v1}, Ly3/a;->P(Lcom/bumptech/glide/g;)Ly3/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->g0(Ly3/a;)Lcom/bumptech/glide/j;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/j;->u0(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object p1

    invoke-virtual {p3}, Lv5/d;->e()I

    move-result p2

    invoke-virtual {p3}, Lv5/d;->c()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/bumptech/glide/j;->y0(II)Ly3/d;

    move-result-object p1

    const-string p2, "submit(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
