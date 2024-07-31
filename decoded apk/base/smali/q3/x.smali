.class public final Lq3/x;
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
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;",
        "Lj3/r;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lj3/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/res/Resources;Lj3/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Lq3/x;->a:Landroid/content/res/Resources;

    invoke-static {p2}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj3/v;

    iput-object p1, p0, Lq3/x;->b:Lj3/v;

    return-void
.end method

.method public static b(Landroid/content/res/Resources;Lj3/v;)Lj3/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lj3/v<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lq3/x;

    invoke-direct {v0, p0, p1}, Lq3/x;-><init>(Landroid/content/res/Resources;Lj3/v;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/graphics/drawable/BitmapDrawable;
    .locals 3

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Lq3/x;->a:Landroid/content/res/Resources;

    iget-object v2, p0, Lq3/x;->b:Lj3/v;

    invoke-interface {v2}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq3/x;->a()Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    return-object v0
.end method

.method public initialize()V
    .locals 2

    iget-object v0, p0, Lq3/x;->b:Lj3/v;

    instance-of v1, v0, Lj3/r;

    if-eqz v1, :cond_0

    check-cast v0, Lj3/r;

    invoke-interface {v0}, Lj3/r;->initialize()V

    :cond_0
    return-void
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Lq3/x;->b:Lj3/v;

    invoke-interface {v0}, Lj3/v;->p()I

    move-result v0

    return v0
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lq3/x;->b:Lj3/v;

    invoke-interface {v0}, Lj3/v;->q()V

    return-void
.end method

.method public r()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/drawable/BitmapDrawable;

    return-object v0
.end method
