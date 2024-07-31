.class Lk3/o$c;
.super Lk3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk3/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk3/c<",
        "Lk3/o$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk3/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a()Lk3/m;
    .locals 1

    invoke-virtual {p0}, Lk3/o$c;->d()Lk3/o$b;

    move-result-object v0

    return-object v0
.end method

.method protected d()Lk3/o$b;
    .locals 1

    new-instance v0, Lk3/o$b;

    invoke-direct {v0, p0}, Lk3/o$b;-><init>(Lk3/o$c;)V

    return-object v0
.end method

.method public e(ILandroid/graphics/Bitmap$Config;)Lk3/o$b;
    .locals 1

    invoke-virtual {p0}, Lk3/c;->b()Lk3/m;

    move-result-object v0

    check-cast v0, Lk3/o$b;

    invoke-virtual {v0, p1, p2}, Lk3/o$b;->b(ILandroid/graphics/Bitmap$Config;)V

    return-object v0
.end method
