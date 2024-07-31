.class public abstract Lq8/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/a0$a;
    }
.end annotation


# instance fields
.field private a:Lq8/a0$a;

.field private b:Ls8/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Ls8/e;
    .locals 1

    iget-object v0, p0, Lq8/a0;->b:Ls8/e;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls8/e;

    return-object v0
.end method

.method public b(Lq8/a0$a;Ls8/e;)V
    .locals 0

    iput-object p1, p0, Lq8/a0;->a:Lq8/a0$a;

    iput-object p2, p0, Lq8/a0;->b:Ls8/e;

    return-void
.end method

.method protected final c()V
    .locals 1

    iget-object v0, p0, Lq8/a0;->a:Lq8/a0$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lq8/a0$a;->b()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract e(Ljava/lang/Object;)V
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lq8/a0;->a:Lq8/a0$a;

    iput-object v0, p0, Lq8/a0;->b:Ls8/e;

    return-void
.end method

.method public abstract g([Lt6/r3;Lv7/f1;Lv7/a0$b;Lt6/d4;)Lq8/b0;
.end method

.method public h(Lv6/e;)V
    .locals 0

    return-void
.end method
