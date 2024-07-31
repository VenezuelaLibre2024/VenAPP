.class public Lq3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/v;
.implements Lj3/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj3/v<",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lj3/r;"
    }
.end annotation


# instance fields
.field private final a:Landroid/graphics/Bitmap;

.field private final b:Lk3/d;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lk3/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Bitmap must not be null"

    invoke-static {p1, v0}, Lc4/k;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, Lq3/f;->a:Landroid/graphics/Bitmap;

    const-string p1, "BitmapPool must not be null"

    invoke-static {p2, p1}, Lc4/k;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk3/d;

    iput-object p1, p0, Lq3/f;->b:Lk3/d;

    return-void
.end method

.method public static b(Landroid/graphics/Bitmap;Lk3/d;)Lq3/f;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lq3/f;

    invoke-direct {v0, p0, p1}, Lq3/f;-><init>(Landroid/graphics/Bitmap;Lk3/d;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lq3/f;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq3/f;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public initialize()V
    .locals 1

    iget-object v0, p0, Lq3/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Lq3/f;->a:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lc4/l;->h(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Lq3/f;->b:Lk3/d;

    iget-object v1, p0, Lq3/f;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lk3/d;->c(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public r()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/Bitmap;

    return-object v0
.end method
