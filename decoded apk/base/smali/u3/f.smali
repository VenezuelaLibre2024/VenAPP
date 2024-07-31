.class public Lu3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/l<",
        "Lu3/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Lh3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/l<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh3/l<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh3/l;

    iput-object p1, p0, Lu3/f;->b:Lh3/l;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lj3/v;II)Lj3/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj3/v<",
            "Lu3/c;",
            ">;II)",
            "Lj3/v<",
            "Lu3/c;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/c;

    invoke-static {p1}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/b;->g()Lk3/d;

    move-result-object v1

    invoke-virtual {v0}, Lu3/c;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Lq3/f;

    invoke-direct {v3, v2, v1}, Lq3/f;-><init>(Landroid/graphics/Bitmap;Lk3/d;)V

    iget-object v1, p0, Lu3/f;->b:Lh3/l;

    invoke-interface {v1, p1, v3, p3, p4}, Lh3/l;->a(Landroid/content/Context;Lj3/v;II)Lj3/v;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-interface {v3}, Lj3/v;->q()V

    :cond_0
    invoke-interface {p1}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p3, p0, Lu3/f;->b:Lh3/l;

    invoke-virtual {v0, p3, p1}, Lu3/c;->m(Lh3/l;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public b(Ljava/security/MessageDigest;)V
    .locals 1

    iget-object v0, p0, Lu3/f;->b:Lh3/l;

    invoke-interface {v0, p1}, Lh3/f;->b(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lu3/f;

    if-eqz v0, :cond_0

    check-cast p1, Lu3/f;

    iget-object v0, p0, Lu3/f;->b:Lh3/l;

    iget-object p1, p1, Lu3/f;->b:Lh3/l;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lu3/f;->b:Lh3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
