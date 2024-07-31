.class Lbj/e$h;
.super Lvi/p0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj/e$h$a;,
        Lbj/e$h$b;
    }
.end annotation


# instance fields
.field private final a:Lvi/p0$i;

.field final synthetic b:Lbj/e;


# direct methods
.method constructor <init>(Lbj/e;Lvi/p0$i;)V
    .locals 0

    iput-object p1, p0, Lbj/e$h;->b:Lbj/e;

    invoke-direct {p0}, Lvi/p0$i;-><init>()V

    iput-object p2, p0, Lbj/e$h;->a:Lvi/p0$i;

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$f;)Lvi/p0$e;
    .locals 3

    iget-object v0, p0, Lbj/e$h;->a:Lvi/p0$i;

    invoke-virtual {v0, p1}, Lvi/p0$i;->a(Lvi/p0$f;)Lvi/p0$e;

    move-result-object p1

    invoke-virtual {p1}, Lvi/p0$e;->c()Lvi/p0$h;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Lbj/e$h$b;

    invoke-virtual {v0}, Lvi/p0$h;->c()Lvi/a;

    move-result-object v1

    invoke-static {}, Lbj/e;->j()Lvi/a$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvi/a;->b(Lvi/a$c;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbj/e$b;

    invoke-direct {p1, p0, v1}, Lbj/e$h$b;-><init>(Lbj/e$h;Lbj/e$b;)V

    invoke-static {v0, p1}, Lvi/p0$e;->i(Lvi/p0$h;Lvi/k$a;)Lvi/p0$e;

    move-result-object p1

    :cond_0
    return-object p1
.end method
