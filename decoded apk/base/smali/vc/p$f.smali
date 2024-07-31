.class Lvc/p$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/p;->d0(Ljava/lang/Thread;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Ljava/lang/Thread;

.field final synthetic d:Lvc/p;


# direct methods
.method constructor <init>(Lvc/p;JLjava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 0

    iput-object p1, p0, Lvc/p$f;->d:Lvc/p;

    iput-wide p2, p0, Lvc/p$f;->a:J

    iput-object p4, p0, Lvc/p$f;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lvc/p$f;->c:Ljava/lang/Thread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lvc/p$f;->d:Lvc/p;

    invoke-virtual {v0}, Lvc/p;->L()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Lvc/p$f;->a:J

    invoke-static {v0, v1}, Lvc/p;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Lvc/p$f;->d:Lvc/p;

    invoke-static {v0}, Lvc/p;->c(Lvc/p;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v1, "Tried to write a non-fatal exception while no session was open."

    invoke-virtual {v0, v1}, Lsc/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lvc/p$f;->d:Lvc/p;

    invoke-static {v0}, Lvc/p;->h(Lvc/p;)Lvc/q0;

    move-result-object v2

    iget-object v3, p0, Lvc/p$f;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Lvc/p$f;->c:Ljava/lang/Thread;

    invoke-virtual/range {v2 .. v7}, Lvc/q0;->u(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    :cond_1
    return-void
.end method
