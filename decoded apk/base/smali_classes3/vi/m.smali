.class public final Lvi/m;
.super Lvi/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/m$a;
    }
.end annotation


# instance fields
.field private final a:Lvi/b;

.field private final b:Lvi/b;


# direct methods
.method public constructor <init>(Lvi/b;Lvi/b;)V
    .locals 1

    invoke-direct {p0}, Lvi/b;-><init>()V

    const-string v0, "creds1"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/b;

    iput-object p1, p0, Lvi/m;->a:Lvi/b;

    const-string p1, "creds2"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/b;

    iput-object p1, p0, Lvi/m;->b:Lvi/b;

    return-void
.end method


# virtual methods
.method public a(Lvi/b$b;Ljava/util/concurrent/Executor;Lvi/b$a;)V
    .locals 8

    iget-object v0, p0, Lvi/m;->a:Lvi/b;

    new-instance v7, Lvi/m$a;

    invoke-static {}, Lvi/r;->e()Lvi/r;

    move-result-object v6

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lvi/m$a;-><init>(Lvi/m;Lvi/b$b;Ljava/util/concurrent/Executor;Lvi/b$a;Lvi/r;)V

    invoke-virtual {v0, p1, p2, v7}, Lvi/b;->a(Lvi/b$b;Ljava/util/concurrent/Executor;Lvi/b$a;)V

    return-void
.end method
