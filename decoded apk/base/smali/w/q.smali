.class public abstract Lw/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/q$b;,
        Lw/q$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lw/q$b;)Lw/q;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lw/q;->b(Lw/q$b;Lw/q$a;)Lw/q;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lw/q$b;Lw/q$a;)Lw/q;
    .locals 1

    new-instance v0, Lw/b;

    invoke-direct {v0, p0, p1}, Lw/b;-><init>(Lw/q$b;Lw/q$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Lw/q$a;
.end method

.method public abstract d()Lw/q$b;
.end method
