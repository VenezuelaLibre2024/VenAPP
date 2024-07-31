.class public final Lu3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/j<",
        "Lg3/a;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lk3/d;


# direct methods
.method public constructor <init>(Lk3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/h;->a:Lk3/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh3/h;)Z
    .locals 0

    check-cast p1, Lg3/a;

    invoke-virtual {p0, p1, p2}, Lu3/h;->d(Lg3/a;Lh3/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh3/h;)Lj3/v;
    .locals 0

    check-cast p1, Lg3/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lu3/h;->c(Lg3/a;IILh3/h;)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method public c(Lg3/a;IILh3/h;)Lj3/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg3/a;",
            "II",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lg3/a;->a()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Lu3/h;->a:Lk3/d;

    invoke-static {p1, p2}, Lq3/f;->b(Landroid/graphics/Bitmap;Lk3/d;)Lq3/f;

    move-result-object p1

    return-object p1
.end method

.method public d(Lg3/a;Lh3/h;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
