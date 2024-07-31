.class public final Lv3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv3/e<",
        "Landroid/graphics/drawable/Drawable;",
        "[B>;"
    }
.end annotation


# instance fields
.field private final a:Lk3/d;

.field private final b:Lv3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/e<",
            "Landroid/graphics/Bitmap;",
            "[B>;"
        }
    .end annotation
.end field

.field private final c:Lv3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/e<",
            "Lu3/c;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk3/d;Lv3/e;Lv3/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            "Lv3/e<",
            "Landroid/graphics/Bitmap;",
            "[B>;",
            "Lv3/e<",
            "Lu3/c;",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/c;->a:Lk3/d;

    iput-object p2, p0, Lv3/c;->b:Lv3/e;

    iput-object p3, p0, Lv3/c;->c:Lv3/e;

    return-void
.end method

.method private static b(Lj3/v;)Lj3/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Lj3/v<",
            "Lu3/c;",
            ">;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method public a(Lj3/v;Lh3/h;)Lj3/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "[B>;"
        }
    .end annotation

    invoke-interface {p1}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lv3/c;->b:Lv3/e;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lv3/c;->a:Lk3/d;

    invoke-static {v0, v1}, Lq3/f;->b(Landroid/graphics/Bitmap;Lk3/d;)Lq3/f;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lv3/e;->a(Lj3/v;Lh3/h;)Lj3/v;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lu3/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv3/c;->c:Lv3/e;

    invoke-static {p1}, Lv3/c;->b(Lj3/v;)Lj3/v;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lv3/e;->a(Lj3/v;Lh3/h;)Lj3/v;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
