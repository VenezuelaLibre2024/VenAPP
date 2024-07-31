.class public Lq3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/j<",
        "Landroid/net/Uri;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ls3/j;

.field private final b:Lk3/d;


# direct methods
.method public constructor <init>(Ls3/j;Lk3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/a0;->a:Ls3/j;

    iput-object p2, p0, Lq3/a0;->b:Lk3/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh3/h;)Z
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, Lq3/a0;->d(Landroid/net/Uri;Lh3/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh3/h;)Lj3/v;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Lq3/a0;->c(Landroid/net/Uri;IILh3/h;)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;IILh3/h;)Lj3/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq3/a0;->a:Ls3/j;

    invoke-virtual {v0, p1, p2, p3, p4}, Ls3/j;->c(Landroid/net/Uri;IILh3/h;)Lj3/v;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;

    iget-object p4, p0, Lq3/a0;->b:Lk3/d;

    invoke-static {p4, p1, p2, p3}, Lq3/r;->a(Lk3/d;Landroid/graphics/drawable/Drawable;II)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/net/Uri;Lh3/h;)Z
    .locals 0

    const-string p2, "android.resource"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
