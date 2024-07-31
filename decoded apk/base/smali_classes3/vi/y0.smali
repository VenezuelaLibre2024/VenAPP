.class public abstract Lvi/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/y0$c;,
        Lvi/y0$g;,
        Lvi/y0$h;,
        Lvi/y0$b;,
        Lvi/y0$e;,
        Lvi/y0$f;,
        Lvi/y0$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public abstract c()V
.end method

.method public d(Lvi/y0$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvi/y0;->e(Lvi/y0$f;)V

    return-void
.end method

.method public e(Lvi/y0$f;)V
    .locals 1

    instance-of v0, p1, Lvi/y0$e;

    if-eqz v0, :cond_0

    check-cast p1, Lvi/y0$e;

    invoke-virtual {p0, p1}, Lvi/y0;->d(Lvi/y0$e;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lvi/y0$a;

    invoke-direct {v0, p0, p1}, Lvi/y0$a;-><init>(Lvi/y0;Lvi/y0$f;)V

    invoke-virtual {p0, v0}, Lvi/y0;->d(Lvi/y0$e;)V

    :goto_0
    return-void
.end method
