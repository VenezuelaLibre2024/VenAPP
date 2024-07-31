.class public Lq3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/k<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lk3/d;

.field private final b:Lh3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/k<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk3/d;Lh3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            "Lh3/k<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/b;->a:Lk3/d;

    iput-object p2, p0, Lq3/b;->b:Lh3/k;

    return-void
.end method


# virtual methods
.method public a(Lh3/h;)Lh3/c;
    .locals 1

    iget-object v0, p0, Lq3/b;->b:Lh3/k;

    invoke-interface {v0, p1}, Lh3/k;->a(Lh3/h;)Lh3/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/io/File;Lh3/h;)Z
    .locals 0

    check-cast p1, Lj3/v;

    invoke-virtual {p0, p1, p2, p3}, Lq3/b;->c(Lj3/v;Ljava/io/File;Lh3/h;)Z

    move-result p1

    return p1
.end method

.method public c(Lj3/v;Ljava/io/File;Lh3/h;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;",
            "Ljava/io/File;",
            "Lh3/h;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lq3/b;->b:Lh3/k;

    new-instance v1, Lq3/f;

    invoke-interface {p1}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v2, p0, Lq3/b;->a:Lk3/d;

    invoke-direct {v1, p1, v2}, Lq3/f;-><init>(Landroid/graphics/Bitmap;Lk3/d;)V

    invoke-interface {v0, v1, p2, p3}, Lh3/d;->b(Ljava/lang/Object;Ljava/io/File;Lh3/h;)Z

    move-result p1

    return p1
.end method
