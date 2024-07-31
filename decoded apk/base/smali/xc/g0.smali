.class public abstract Lxc/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxc/g0$b;,
        Lxc/g0$c;,
        Lxc/g0$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lxc/g0$a;Lxc/g0$c;Lxc/g0$b;)Lxc/g0;
    .locals 1

    new-instance v0, Lxc/b0;

    invoke-direct {v0, p0, p1, p2}, Lxc/b0;-><init>(Lxc/g0$a;Lxc/g0$c;Lxc/g0$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lxc/g0$a;
.end method

.method public abstract c()Lxc/g0$b;
.end method

.method public abstract d()Lxc/g0$c;
.end method
