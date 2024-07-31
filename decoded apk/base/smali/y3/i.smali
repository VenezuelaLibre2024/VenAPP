.class public Ly3/i;
.super Ly3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ly3/a<",
        "Ly3/i;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly3/a;-><init>()V

    return-void
.end method

.method public static f0(Ljava/lang/Class;)Ly3/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ly3/i;"
        }
    .end annotation

    new-instance v0, Ly3/i;

    invoke-direct {v0}, Ly3/i;-><init>()V

    invoke-virtual {v0, p0}, Ly3/a;->d(Ljava/lang/Class;)Ly3/a;

    move-result-object p0

    check-cast p0, Ly3/i;

    return-object p0
.end method

.method public static g0(Lj3/j;)Ly3/i;
    .locals 1

    new-instance v0, Ly3/i;

    invoke-direct {v0}, Ly3/i;-><init>()V

    invoke-virtual {v0, p0}, Ly3/a;->e(Lj3/j;)Ly3/a;

    move-result-object p0

    check-cast p0, Ly3/i;

    return-object p0
.end method

.method public static h0(Lh3/f;)Ly3/i;
    .locals 1

    new-instance v0, Ly3/i;

    invoke-direct {v0}, Ly3/i;-><init>()V

    invoke-virtual {v0, p0}, Ly3/a;->V(Lh3/f;)Ly3/a;

    move-result-object p0

    check-cast p0, Ly3/i;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ly3/i;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Ly3/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ly3/a;->hashCode()I

    move-result v0

    return v0
.end method
