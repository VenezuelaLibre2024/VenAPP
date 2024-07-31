.class public final Lr1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/j;
.implements Lr1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr1/d$a;,
        Lr1/d$c;,
        Lr1/d$b;
    }
.end annotation


# instance fields
.field private final a:Lv1/j;

.field public final b:Lr1/c;

.field private final c:Lr1/d$a;


# direct methods
.method public constructor <init>(Lv1/j;Lr1/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/d;->a:Lv1/j;

    iput-object p2, p0, Lr1/d;->b:Lr1/c;

    invoke-virtual {p0}, Lr1/d;->a()Lv1/j;

    move-result-object p1

    invoke-virtual {p2, p1}, Lr1/c;->k(Lv1/j;)V

    new-instance p1, Lr1/d$a;

    invoke-direct {p1, p2}, Lr1/d$a;-><init>(Lr1/c;)V

    iput-object p1, p0, Lr1/d;->c:Lr1/d$a;

    return-void
.end method


# virtual methods
.method public Q0()Lv1/i;
    .locals 1

    iget-object v0, p0, Lr1/d;->c:Lr1/d$a;

    invoke-virtual {v0}, Lr1/d$a;->a()V

    iget-object v0, p0, Lr1/d;->c:Lr1/d$a;

    return-object v0
.end method

.method public a()Lv1/j;
    .locals 1

    iget-object v0, p0, Lr1/d;->a:Lv1/j;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lr1/d;->c:Lr1/d$a;

    invoke-virtual {v0}, Lr1/d$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr1/d;->a:Lv1/j;

    invoke-interface {v0}, Lv1/j;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lr1/d;->a:Lv1/j;

    invoke-interface {v0, p1}, Lv1/j;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
