.class Lx6/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Looper;Lu6/m3;)V
    .locals 0

    return-void
.end method

.method public c(Lx6/u$a;Lt6/u1;)Lx6/n;
    .locals 2

    iget-object p1, p2, Lt6/u1;->z:Lx6/m;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lx6/a0;

    new-instance p2, Lx6/n$a;

    new-instance v0, Lx6/n0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx6/n0;-><init>(I)V

    const/16 v1, 0x1771

    invoke-direct {p2, v0, v1}, Lx6/n$a;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p1, p2}, Lx6/a0;-><init>(Lx6/n$a;)V

    return-object p1
.end method

.method public d(Lt6/u1;)I
    .locals 0

    iget-object p1, p1, Lt6/u1;->z:Lx6/m;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
